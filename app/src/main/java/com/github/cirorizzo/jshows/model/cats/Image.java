package com.github.cirorizzo.jshows.model.cats;

//@Root(name = "image")
public class Image {
//    @Element(name = "id")
    public String id;
//    @Element(name = "source_url")
    public String source_url;
//    @Element(name = "url")
    public String url;

    public String getId () {
        return id;
    }

    public void setId (String id) {
        this.id = id;
    }

    public String getSource_url () {
        return source_url;
    }

    public void setSource_url (String source_url) {
        this.source_url = source_url;
    }

    public String getUrl () {
        return url;
    }

    public void setUrl (String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "ClassPojo [id = "+id+", source_url = "+source_url+", url = "+url+"]";
    }
}
