package com.techzone.render.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class PageController {

	@GetMapping("/first")
	public String LoginPage() {
		return "index";
	}
}
