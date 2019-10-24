package com.example.FeignParent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign-parent")
public class TestController {
	
	@Autowired
	private FeignProxy proxy;
	
	@GetMapping("/get-hello/{name}")
	public String getHello(@PathVariable String name) {
		return proxy.sayHelloUser(name);
	}

}
