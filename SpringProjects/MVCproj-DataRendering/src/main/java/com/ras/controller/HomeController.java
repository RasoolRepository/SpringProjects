package com.ras.controller;

import java.util.Date;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String showhomepage(Map<String, Object> map) {
		//put data model attributes
		
		map.put("sysdate",new Date());
		map.put("attr1","val1");
		map.put("page", new Random().nextInt(10000));
		System.out.println("map is refering to "+map.getClass());
		
		return "welcome";
	}
}
