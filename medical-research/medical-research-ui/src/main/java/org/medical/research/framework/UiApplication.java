package org.medical.research.framework;

import java.security.Principal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableZuulProxy
public class UiApplication {

	@RequestMapping("/user")
	public Principal user(Principal user) {
		return user;
	}
	
	// Match everything without a suffix (so not a static resource)
	/*
	@RequestMapping(value = "/{path:[^\\.]*}")
	public String redirect() {
		// Forward to home page so that route is preserved.
		return "forward:/";
	}
	*/
	public static void main(String[] args) {
		SpringApplication.run(UiApplication.class, args);
	}

}
