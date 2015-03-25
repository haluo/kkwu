package com.szc;

import com.szc.service.domain.User;
import com.szc.service.service.IUserService;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by zhufeng on 15-3-25.
 */
public class UserTest extends BaseTest {
    @Resource
    private IUserService userService;


    @Test
    public void testget(){
        User u = userService.getById(1L);
        System.out.println("===="+u.getPhone());
    }
}
