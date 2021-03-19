package com.example.demo.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;

public class Shout {
	@Id
	public String id;
	
	@NotBlank
	@Size(max = 20)
	public String username;
	
	@NotBlank
	@Size(max = 300)
	public String message;
	
	public String time;

	public Shout(String username, String message, String time) {
		this.username = username;
		this.message = message;
		this.time = time;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	
	
}
