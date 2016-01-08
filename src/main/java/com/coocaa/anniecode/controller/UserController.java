package com.coocaa.anniecode.controller;

import com.coocaa.anniecode.pojo.User;
import com.coocaa.anniecode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by keaxiang on 2015/12/29.
 */

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/Userquery.action")
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        List<User> arrayList = new ArrayList();
        /*User user1 = new User("xiaoming","1234");
        User user2 = new User("xiaowei","1222");
        User user3 = new User("xiaohong","3344");
        arrayList.add(user1);
        arrayList.add(user2);
        arrayList.add(user3);*/

       arrayList = userService.findAll();

        User user = userService.selectByPrimaryKey();
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("arraylist",arrayList);

        modelAndView.setViewName("user");

        return modelAndView;
    }
}
