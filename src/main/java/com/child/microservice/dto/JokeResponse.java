package com.child.microservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class JokeResponse {
	
	@JsonProperty("type")
	private String type;
	
	@JsonProperty("setup")
	private String setup;
	
	@JsonProperty("punchline")
	private String punchline;
	
	@JsonProperty("id")
	private int id;

}
