package com.example.demo.model;

import org.springframework.data.annotation.Id;

public class Role {
	@Id
	private String id;

	private ERole name;

	public Role(ERole name) {
		super();
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ERole getName() {
		return name;
	}

	public void setName(ERole name) {
		this.name = name;
	}

}
