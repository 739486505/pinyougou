package com.itheima.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "String";
	}

	public static void main(String[] args) {
		System.out.println("111");
		System.out.println("222");
	}


}
