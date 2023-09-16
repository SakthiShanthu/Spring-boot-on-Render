package com.techzone.render.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/render")
public class RenderController {

	@GetMapping("/get")
	String response() {
		return "server is up";
	}

	@PostMapping("/operation/{operation}")
	double mathamaticsOperattion(@PathVariable(value = "operation") String operation,
			@RequestParam(value = "value1") double value1, @RequestParam(value = "value2") double value2) {
		double respone = 0;
		switch (operation) {
		case "add":
			respone = value1 + value2;
			break;
		case "sub":
			respone = value1 - value2;
			break;
		case "multiply":
			respone = value1 * value2;
			break;
		case "divide":
			respone = value1 / value2;
			break;

		default:
			respone = 0;
			break;

		}
		return respone;
	}
}
