package com.github.cirorizzo.jshows.model.cats;

public class Data {
    private Images images;

    public Images getImages () {
        return images;
    }

    public void setImages (Images images) {
        this.images = images;
    }

    @Override
    public String toString()  {
        return "ClassPojo [images = "+images+"]";
    }
}
