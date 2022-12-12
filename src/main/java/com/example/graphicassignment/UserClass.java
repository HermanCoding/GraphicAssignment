package com.example.graphicassignment;

public class UserClass {
    private String name;
    private String nickName;
    private String song;

    public UserClass(String name, String nickName, String song) {
        this.name = name;
        this.nickName = nickName;
        this.song = song;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }
}
