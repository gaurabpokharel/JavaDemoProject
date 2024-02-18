package com.CrudExample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PatientController {

	@RequestMapping("/")
    @ResponseBody
    String home() {
      return "Hello World!";
    }

	@GetMapping("/data")
	public String display()
	{
		return "Hello World!!";
	}
	}
