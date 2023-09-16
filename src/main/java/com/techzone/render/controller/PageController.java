package com.techzone.render.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	@GetMapping("/log")
	public String LoginPage() {
		return "index";
	}
}
