package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.pojo.AllFriend;

public interface FriendRepository  extends MongoRepository<AllFriend, String>{
	
	

}
