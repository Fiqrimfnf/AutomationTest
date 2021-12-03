package com.fiqri.jemberfix;

import com.google.gson.annotations.SerializedName;

public class Data{

	@SerializedName("user_id")
	private String userId;

	@SerializedName("nama_depan")
	private String nama_depan;

	@SerializedName("username")
	private String username;

	public void setUserId(String userId){
		this.userId = userId;
	}

	public String getUserId(){
		return userId;
	}

	public void setName(String nama_depan){
		this.nama_depan = nama_depan;
	}

	public String getName(){
		return nama_depan;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}
}