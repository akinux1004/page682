package org.zerock.controller;

import org.springframework.security.access.prepost.PreAuthorize;
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
	
	@PreAuthorize("hasAnyRole('ROLE_MEMBER', ROLE_ADMIN)")
	@GetMapping("/annoMember")
	public void doMember() {
		
	}
	
	@PreAuthorize("hasAnyRole('ROLE_ADMIN')")
	@GetMapping("/annoAdmin")
	public void doAdmin() {
		
	}
	
}
