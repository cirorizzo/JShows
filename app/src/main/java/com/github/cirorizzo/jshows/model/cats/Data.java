package com.github.cirorizzo.jshows.model.cats;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "data")
public class Data {
    @ElementList(name = "images")
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
