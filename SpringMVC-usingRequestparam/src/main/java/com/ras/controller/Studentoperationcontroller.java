package com.ras.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Studentoperationcontroller {
	@GetMapping("/report")
	public String showdata(@RequestParam int sno,@RequestParam(required = false,defaultValue = "rasool") String sname[],@RequestParam("sname") List<String> names) {
		System.out.println(sno+""+sname+Arrays.toString(sname));
		return"show_result";
		
	}

}
