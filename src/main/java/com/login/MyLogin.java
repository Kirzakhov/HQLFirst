package com.login;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MyLogin {
	@Id
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "MyLogin [id=" + id + ", name=" + name + "]";
	}
	
}
