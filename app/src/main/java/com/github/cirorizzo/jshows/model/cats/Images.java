package com.github.cirorizzo.jshows.model.cats;

public class Images {
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
