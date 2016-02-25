package com.github.cirorizzo.jshows.model.cats;

//@Root(name = "data")
public class Data {
//    @Element(name = "images")
    public Images images;

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
