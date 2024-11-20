package com.gcp.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@GetMapping("/api/sample")
	public String getSample() {
		return "Success";
	}

}
