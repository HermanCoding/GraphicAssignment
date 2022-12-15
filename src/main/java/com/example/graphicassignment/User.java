package com.example.graphicassignment;

public class User {
    private String name;
    private String lastName;
    private String song;

    public User(String name, String lastName, String song) {
        this.name = name;
        this.lastName = lastName;
        this.song = song;
    }

    public User() {
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }
}
