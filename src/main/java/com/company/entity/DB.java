package com.company.entity;

public enum DB {
    USER1("pass1");
    private String pass;

    DB(String type) {
        this.pass = type;
    }

    public String toString() {
        return pass;
    }

}
