package com.example.demo.dao;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.AllFriend;
import com.example.demo.repository.FriendRepository;

@Repository("friendDao")
public class FriendDao {
	
	@Autowired
	private FriendRepository friendRepository;
	
	
	public List getAllFriends() {
		return friendRepository.findAll();
	}


	public AllFriend insertFriend(AllFriend friend) {
		// TODO Auto-generated method stub
		return friendRepository.save(friend);
	}

}
