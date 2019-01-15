package com.food.composition.calculate.service;

import com.food.composition.calculate.model.User;

/**
 * 用户查询组件
 *
 * @author H.R.ZHAO
 */
public interface UserQueryComponent {

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    public User getById(Integer id);

    /**
     * 根据登录名和密码查询
     *
     * @param loginName
     * @param password
     * @return
     */
    public User getByLoginNamePassword(String loginName, String password);

}
