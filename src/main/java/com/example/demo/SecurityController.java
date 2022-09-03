package com.example.demo;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
	
	@GetMapping("/group1")
	@PreAuthorize("hasRole('ROLE_group1')")
	public String group1() {
		return "Srirama";
	}
	
	
	@GetMapping("/group2")
	@PreAuthorize("hasRole('ROLE_group2')")
	public String group2() {
		return "Srirama";
	}
}
