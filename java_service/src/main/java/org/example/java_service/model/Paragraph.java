package org.example.java_service.model;

public class Paragraph {

    private String paragraph;

    private int size;

    public Paragraph() {
    }

    public Paragraph(String paragraph) {
        this.paragraph = paragraph;
    }

    public String getParagraph() {
        return paragraph;
    }

    public void setParagraph(String paragraph) {
        this.paragraph = paragraph;
    }

    public int getSize() {
        size = this.paragraph.length();
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
