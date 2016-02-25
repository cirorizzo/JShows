package com.github.cirorizzo.jshows.model.cats;

//@Root(name = "images")
public class Images {
//    @ElementList(name = "image")
    public Image[] image;

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
