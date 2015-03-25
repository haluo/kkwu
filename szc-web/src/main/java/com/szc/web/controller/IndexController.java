package com.szc.web.controller;

import com.szc.service.domain.User;
import com.szc.service.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by shizhizhong on 15/2/10.
 */
@Controller
public class IndexController extends BaseController{


    @Resource
    private IUserService userService;

    @RequestMapping(value = "/")
    public ModelAndView getUser(){
        ModelAndView mv = new ModelAndView("/index");
        User user = userService.getById(1L);
        mv.addObject("user", user);
        return  mv;
    }
}
