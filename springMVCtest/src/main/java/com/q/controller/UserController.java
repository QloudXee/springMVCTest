package com.q.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.q.model.User;
import com.q.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UserService UserService;
	
	//定义URL访问映射路径
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String userInfo(Model model) {
    	User user = UserService.init();
    	model.addAttribute("user",user);
        return "userInfo";
    }
}
