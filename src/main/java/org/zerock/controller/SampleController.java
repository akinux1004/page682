package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {
	
	@GetMapping("/all")
	public void all() {
		log.info("all page!!");
	}
	
	@GetMapping("/member")
	public void member() {
		
	}
	
	@GetMapping("/admin")
	public void admin() {
		
	}
	
}
