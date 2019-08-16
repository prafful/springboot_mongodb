package com.example.demo.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.AllFriend;
import com.example.demo.service.FriendService;

@RestController
public class MongRestController {
	
	@Autowired
	private FriendService friendService;

	@RequestMapping("/")
	public String welcome() {
		return "Hello from spring boot!!!!";
	}
	
	@RequestMapping("/friends")
	public List getAllFriends() {
		List friends = new ArrayList();
		
		AllFriend f1 = new AllFriend("1","OBB", "Chennai", 4);
		AllFriend f2 = new AllFriend("2","BNP", "Pune", 5);
		AllFriend f3 = new AllFriend("3","OWIOH", "Ahmedabad", 8);
		AllFriend f4 = new AllFriend("4","DDD", "Jodhpur", 17);
		
		friends.add(f1);
		friends.add(f2);
		friends.add(f3);
		friends.add(f4);
		
		
		return friends;
	}
	
	@RequestMapping("/all")
	public List getAllFriendsMongoDB() {
		return friendService.getAllFriendsMongoDB();
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public AllFriend insertFriend(@RequestBody AllFriend friend) {
		System.out.println(friend.getName() + " " +  friend.getLocation());
		return friendService.insertFriend(friend);
		
	}
	
	
	
}
