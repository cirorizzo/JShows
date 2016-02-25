package com.github.cirorizzo.jshows.model.cats;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "response")
public class Cats {
    @Element(name = "data")
    private Data data;

    public Data getData ()  {
        return data;
    }

    public void setData (Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ClassPojo [data = "+data+"]";
    }
}
