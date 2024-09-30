package com.child.microservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.child.microservice.dto.JokeResponse;

import reactor.core.publisher.Mono;

@Service
public class JokeService {
	
	@Autowired
	private WebClient webclient;
	
	public Mono<String> getJoke(){
		return webclient.get().uri("/random_joke").retrieve().bodyToMono(JokeResponse.class).map(response -> {
			return response.getPunchline();
		});
		
	}
	

}
