package com.sumon.newspaper.models;

public class Newspaper {

    private String name;
    private int coverImage;
    private String link;

    public Newspaper(String name, int coverImage,String link) {
        this.name = name;
        this.coverImage = coverImage;
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(int coverImage) {
        this.coverImage = coverImage;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
