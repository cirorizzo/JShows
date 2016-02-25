package com.github.cirorizzo.jshows.model.cats;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "image")
public class Image {
    @Element(name = "id")
    private String id;
    @Element(name = "source_url")
    private String source_url;
    @Element(name = "url")
    private String url;

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
