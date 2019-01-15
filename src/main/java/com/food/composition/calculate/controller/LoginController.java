package com.food.composition.calculate.controller;

import com.food.composition.calculate.model.User;
import com.food.composition.calculate.service.UserQueryComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * 登录控制器
 *
 * @author H.R.ZHAO
 */
@Controller
public class LoginController {

    @Autowired
    private UserQueryComponent userQueryComponent;

    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
    public String login(ModelMap modelMap,
                        @RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session){
        // 参数及用户判断
        if(StringUtils.isEmpty(username) || StringUtils.isEmpty(password)){
            modelMap.addAttribute("msg","用户名密码不能为空");
            return  "login";
        }
        User user = userQueryComponent.getByLoginNamePassword(username, password);
        if (user == null) {
            modelMap.addAttribute("msg","用户不存在");
            return  "login";
        }
        //登陆成功，防止表单重复提交，可以重定向到主页
        session.setAttribute("loginUser", user);
        return "redirect:/main.html";
    }
}