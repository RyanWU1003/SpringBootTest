package com.iii.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController		//包含了@Controller跟@ResponseBody
public class SpringBootTest {
	//@ResponseBody
	@RequestMapping("/")
	public String hello() {
		return "Hi,Welcome use Spring Boot";
	}
}
