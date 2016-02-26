package com.github.cirorizzo.jshows.model.cats;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "image")
public class Image {
    @Element(name = "url", required = true)
    private String url;
    @Element(name = "id", required = false)
    private String id;
    @Element(name = "source_url", required = false)
    private String source_url;

    public String getId () {
        return id;
    }

    public void setId (String id) {
        this.id = this.id;
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
        return "ClassPojo [id = "+ id +", source_url = "+source_url+", url = "+url+"]";
    }

    public Image() {}
}