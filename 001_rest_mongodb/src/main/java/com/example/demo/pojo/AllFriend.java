package com.example.demo.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class AllFriend {


	@Id
	private String id;
	private String name;
	private String location;
	private int duration;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public AllFriend(String id, String name, String location, int duration) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.duration = duration;
	}
	public AllFriend() {
		super();
	}
	
	
	
	
}
