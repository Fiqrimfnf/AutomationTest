package com.fiqri.jemberfix.model.register;

import com.google.gson.annotations.SerializedName;

public class RegisterData {

    @SerializedName("nama_depan")
    private String nama_depan;

    @SerializedName("username")
    private String username;

    public void setName(String name){
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
