package com.jwt.controller;

import java.time.LocalTime;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sun.util.calendar.BaseCalendar.Date;

@RestController
@CrossOrigin()
public class HelloWorldController {

	@RequestMapping({ "/hello" })
	public String hello() {
		//Getting the current time value
	      LocalTime time = LocalTime.now();
		return "Hello CurrentTime in you location is ::"+time;
	}

}
