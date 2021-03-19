package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Shout;

public interface ShoutRepository extends MongoRepository<Shout, String> {

	public List<Shout> findByUsername(String username);
}
