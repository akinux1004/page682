package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonController {
	
	@GetMapping("/customLogin")
	public void login() {
		
	}
	
	@GetMapping("/customLogout")
	public void logout() {
		
	}
	
}
