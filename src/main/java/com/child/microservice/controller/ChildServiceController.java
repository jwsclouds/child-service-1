package com.child.microservice.controller;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.child.microservice.service.JokeService;

import reactor.core.publisher.Mono;

@RestController
public class ChildServiceController {
	
	@Autowired
	private JokeService jokeService;
	
	@GetMapping("/test")
	public Mono<String> test() {
		
		return Mono.just("joke");
		
	}
	
	@GetMapping("/joke")
	public Mono<String> getJoke() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return jokeService.getJoke();
		
	}

}
