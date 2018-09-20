package com.liwen.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 交给spring管理
public class HelloController {
	@ResponseBody // 返回json字符串
	@RequestMapping("/hello")
	public String hello() {
		return "hello springboot";
	}
	
	@RequestMapping("/success")
	public String success(Map<String,Object> map) {
		map.put("hello","Jim");
		return "success";
	}
}
