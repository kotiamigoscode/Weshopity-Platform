package com.weshopify.platform.features.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Controller
public class HomeController {

	@RequestMapping(value = {"","/","home"})
	public String renderHomePage() {
		System.out.println("i am in home controller");
		return "home.html";
	}
}
