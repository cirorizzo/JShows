package com.github.cirorizzo.jshows.model.cats;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "images")
public class Images {
    @ElementList(name = "image")
    private Image[] image;

    public Image[] getImage () {
        return image;
    }

    public void setImage (Image[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "ClassPojo [image = "+image+"]";
    }
}
