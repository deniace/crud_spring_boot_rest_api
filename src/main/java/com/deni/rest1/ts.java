package com.deni.rest1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/home")
public class ts {

	@GetMapping("")
	public String a() {
		return "a";
	}

	public String b() {
		return "asdf";
	}
}
