package com.github.cirorizzo.jshows.model.cats;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "data")
public class Data {
    @Element(name = "images")
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
