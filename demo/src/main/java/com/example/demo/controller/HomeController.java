package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String login()
	{
//		Msg msg=new Msg("测试标题","测试内容","额外信息,只对管理员显示");
//	    model.addAttribute("msg",msg);
	    return "login";
	}
	
}
