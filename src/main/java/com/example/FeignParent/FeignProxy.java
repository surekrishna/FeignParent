package com.example.FeignParent;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="feign-test", url="${url}")
@RequestMapping("/feign")
public interface FeignProxy {
	
	@GetMapping("/hello/{name}")
	public String sayHelloUser(@PathVariable String name);

}
