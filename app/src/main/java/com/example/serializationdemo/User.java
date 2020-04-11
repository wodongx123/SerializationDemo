package com.example.serializationdemo;

import java.io.Serializable;

public class User implements Serializable {


    private static final long serialVersionUID = -1418746155475547469L;

    private String id;
    private String name;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
