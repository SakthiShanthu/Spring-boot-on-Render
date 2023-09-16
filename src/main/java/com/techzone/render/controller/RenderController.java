package com.techzone.render.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/render")
public class RenderController {

	@GetMapping("/get")
	String response() {
		return "server is up";
	}

}
