package com.github.cirorizzo.jshows.model.cats;


import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;

@Root(name = "data")
public class Data {
    @ElementList(name= "images")
    private ArrayList<Image> images;

    public ArrayList<Image> getImages() {
        return images;
    }

    public void setImages(ArrayList<Image> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "ClassPojo [images = "+ images.toArray().toString()+"]";
    }

    public Data() {}
}
