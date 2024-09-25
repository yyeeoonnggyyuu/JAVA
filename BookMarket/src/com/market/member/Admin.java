package com.market.member;

public class Admin extends Person{
	
//	setter를 넣으면 값으 바꿀 수 있으니 getter만 넣을 것
	private String id = "1234";
	private String password = "1234";

	public Admin(String name, int phone) {
		super(name, phone);
	}
	
	public String getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
}
