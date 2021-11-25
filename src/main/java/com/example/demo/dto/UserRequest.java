package com.example.demo.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserRequest implements Serializable {

    private String name;

    private String address;

    private String phone;

	
	public String getName() {
		return name;
	}
	public String getAddress() {
		// TODO Auto-generated method stub
		return address;
	}
	public String getPhone() {
		// TODO Auto-generated method stub
		return phone;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}