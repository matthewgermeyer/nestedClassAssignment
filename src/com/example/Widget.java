package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MattyG on 5/1/17.
 */
public class Widget {
    private static int counter;
    private int id;
    private String name;
    private String type;
    private List<Attachment> attachments = new ArrayList<>();

    public Widget(String name, String type) {

        this.id = ++counter;
        this.name = name;
        this.type = type;
    }

    public void addAttachment(String name, String type) {
        Attachment attachment = new Attachment();
        attachment.setName(name);
        attachment.setType(type);
        attachments.add(attachment);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    @Override
    public String toString() {
        return "Widget{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", attachments=" + attachments +
                '}';
    }

    static class Attachment {
        private String name;
        private String type;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "Attachement{" +
                    "name='" + name + '\'' +
                    ", type='" + type + '\'' +
                    '}';
        }
    }
}
