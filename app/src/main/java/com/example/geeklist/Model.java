package com.example.geeklist;

public class Model {
    private String heading, description;
    private long data;

    public Model(String heading, String description, long data){
        this.heading = heading;
        this.description = description;
        this.data = data;
    }
    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getData() {
        return data;
    }

    public void setData(long data) {
        this.data = data;
    }
}