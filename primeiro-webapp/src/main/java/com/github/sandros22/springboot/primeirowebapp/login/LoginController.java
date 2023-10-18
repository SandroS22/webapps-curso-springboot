package com.github.sandros22.springboot.primeirowebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("login")
	public String goToLoginPage() {

		return "login";
	}
}
