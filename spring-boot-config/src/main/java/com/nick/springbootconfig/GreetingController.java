package com.nick.springbootconfig;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@Value("${my.greeting: Default Greeting}")
	private String greetingMsg;
	
	@Value("static message")
	private String staticMsg;
	
	@Value("${my.list.values}")
	private List<String> list;
	
	@Value("#{${dbValues}}")
	Map<String, String> dbValues;
	
	@GetMapping("/greeting")
	public String getGreeting() {
		return greetingMsg + " " + staticMsg + " " + list + " " + dbValues;
	}
}
