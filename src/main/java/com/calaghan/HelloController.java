package com.calaghan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HelloController {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Go to URL: http://localhost:8080/greeting?name=keke";
	}
	
    @RequestMapping("/greeting")
    @ResponseBody
    public String greeting(@RequestParam(value="name", defaultValue="World!") String name) {
        return String.format("Hello %s", name);
    }

	public static void main(String[] args) throws Exception {
		SpringApplication.run(HelloController.class, args);
	}

}
