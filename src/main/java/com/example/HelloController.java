package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hai")
	public String getHai()
	{
		return "hai  springBoot";
	}
	
}
