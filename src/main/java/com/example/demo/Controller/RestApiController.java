package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class RestApiController {

	 @GetMapping("/hello/{name}")
	    public String sayHelloParam(@PathVariable String name){
	        return  "Hello "+name;
	    }

}
