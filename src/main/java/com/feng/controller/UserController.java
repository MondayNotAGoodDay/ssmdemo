package com.feng.controller;


import com.feng.entity.User;
import com.feng.service.UserService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Log
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 注册用户
     * @param user 表单提交的用户
     *
     */
    @RequestMapping("/register")
    public ModelAndView registerUser(@ModelAttribute("user") User user, ModelAndView model){
        //注册的时候：
        //利用用户名查看数据库该用户是否存在
        //若已存在说明该用户名已被注册
        //若不存在说明该用户名还没被注册
        User user1 = userService.findByName(user.getUsername());
        System.out.println("user:" + user);
        System.out.println("user1:" + user1);
        if (user1 == null) {
            userService.addUser(user);
            //注册成功，跳回到登陆页面。
            model.setViewName("register_success");
        }else {
            System.out.println("该用户名已被注册");
            model.setViewName("register_failed");
        }
        return model;
    }

    @RequestMapping("/login")
    public ModelAndView login(User user, ModelAndView model) {
        User user1 = userService.findByName(user.getUsername());
        if(user1 != null){
            String pwd_user1 = user1.getPassword();
            String pwd_user = user.getPassword();
            if(pwd_user.equals(pwd_user1)){
                model.setViewName("login_success");
            }
        }else {
            model.setViewName("login_failed");
        }
        return model;
    }
}
