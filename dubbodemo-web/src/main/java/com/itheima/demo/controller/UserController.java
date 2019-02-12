package com.itheima.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.demo.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Reference
	private UserService service; 
	
	@RequestMapping("/showName")
	@ResponseBody
	public String showName() {
		return service.getName();
	}

	public static void main(String[] args) {
		System.out.println("第三次修改");
	}
}
