package com.toportyu.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Created by csaba.juhasz on 21/04/2016.
 */
public class Document {

    private long id;

    private String title;

    private String body;

    @JsonIgnore
    private String internalMessage;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getInternalMessage() {
        return internalMessage;
    }

    public void setInternalMessage(String internalMessage) {
        this.internalMessage = internalMessage;
    }
}
