package com.google.layoutapplication;

/**
 * Created by TimotiusEk on 3/13/2017.
 */

public class Recipe {
    private int image;
    private int profile_pic;
    private String name;
    private String type;
    private int likes;
    private String duration;
    private int chats;
    private String username;
    private String description;

    public Recipe(int image, String name, String type, String description, int profile_pic, String username, int likes, int chats) {
        this.image = image;
        this.name = name;
        this.type = type;
        this.likes = likes;
        this.chats = chats;

        this.description = description;
        this.profile_pic = profile_pic;
        this.username = username;
    }

    public Recipe(int image, int profile_pic, String name, String type, int likes) {
        this.image = image;
        this.profile_pic = profile_pic;
        this.name = name;
        this.type = type;
        this.likes = likes;
    }

    public Recipe(int image, String name, String duration) {
        this.image = image;
        this.name = name;
        this.duration = duration;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getChats() {
        return chats;
    }

    public void setChats(int chats) {
        this.chats = chats;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getProfile_pic() {
        return profile_pic;
    }

    public void setProfile_pic(int profile_pic) {
        this.profile_pic = profile_pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

}
