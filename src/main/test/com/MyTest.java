package com;

import com.service.DogService;
import com.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MyTest {
    UserService userService=new UserService ();
    @Test
    public void test(){
        System.out.println (userService.getUser ("admin","admin"));
    }
}
