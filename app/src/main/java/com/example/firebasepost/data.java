package com.example.firebasepost;

public class data {
    String id;
    String ip;

    public data(){}

    public data(String id,String ip) {
        this.id = id;
        this.ip = ip;
    }

    public String getId() {
        return id;
    }

    public String getIp(){
        return ip;
    }
}
