package com.food.composition.calculate.mapper;

import com.food.composition.calculate.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 用户表Mapper，操作数据库
 *
 * @author H.R.ZHAO
 */
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM USER WHERE ID=#{id} AND ENABLED=1")
    public User selectById(Integer id);

    @Select("SELECT * FROM USER WHERE LOGIN_NAME=#{loginName} AND PASSWORD=#{password} AND ENABLED=1")
    public User selectByLoginNameAndPassword(@Param("loginName") String loginName, @Param("password") String password);

    @Select("SELECT * FROM USER ")
    public List<User> selectAll();

}
