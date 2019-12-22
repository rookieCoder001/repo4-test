package com.web.controller;

import com.domain.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findUserById.do")
    public ModelAndView findUserById(ModelAndView modelAndView ){

        User user = userService.findUserById(1);

        modelAndView.addObject("user",user);

        modelAndView.setViewName("show");

        return modelAndView;
    }
}
