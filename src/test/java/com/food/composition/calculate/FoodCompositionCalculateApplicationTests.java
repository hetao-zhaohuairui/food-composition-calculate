package com.food.composition.calculate;

import com.food.composition.calculate.service.UserQueryComponent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FoodCompositionCalculateApplicationTests {

    @Autowired
    private UserQueryComponent userQueryComponent;

    @Test
    public void testGetById() {
        System.out.println(userQueryComponent.getById(1));
    }

    @Test
    public void testGetByLoginNamePassword() {
        System.out.println(userQueryComponent.getByLoginNamePassword("admin", "123456"));
    }

}
