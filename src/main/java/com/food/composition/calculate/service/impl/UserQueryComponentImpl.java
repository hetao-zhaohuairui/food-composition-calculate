package com.food.composition.calculate.service.impl;

import com.food.composition.calculate.mapper.UserMapper;
import com.food.composition.calculate.model.User;
import com.food.composition.calculate.service.UserQueryComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户查询组件实现类
 *
 * @author H.R.ZHAO
 */
@Service
public class UserQueryComponentImpl implements UserQueryComponent {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getById(Integer id) {
        return userMapper.selectById(id);
    }

    @Override
    public User getByLoginNamePassword(String loginName, String password) {
        return userMapper.selectByLoginNameAndPassword(loginName, password);
    }
}
