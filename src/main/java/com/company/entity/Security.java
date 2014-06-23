package com.company.entity;

public class Security {

    public boolean isUser(String pass){
        if(DB.USER1.toString().equals(pass)) return true;
        return false;
    }
}
