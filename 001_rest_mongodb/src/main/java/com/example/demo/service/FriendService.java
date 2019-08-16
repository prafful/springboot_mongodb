package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.FriendDao;
import com.example.demo.pojo.AllFriend;


@Service("friendService")
public class FriendService {
	
	@Autowired
	private FriendDao friendDao;

	public List getAllFriendsMongoDB() {
		// TODO Auto-generated method stub
		return friendDao.getAllFriends();
	}

	public AllFriend insertFriend(AllFriend friend) {
		// TODO Auto-generated method stub
		return friendDao.insertFriend(friend);
	}

}
