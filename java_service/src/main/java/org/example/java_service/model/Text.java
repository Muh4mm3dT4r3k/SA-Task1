package org.example.java_service.model;

public class Text {
    private String text;
    private String te = "";
    public Text() {
    }

    public Text(String text) {
        this.text = text;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String replaceSpecialChars(){

        for (int i = 0; i < text.length(); i++) {
            if ((text.charAt(i) >= 'A' && text.charAt(i) <= 'Z')
                || (text.charAt(i) >= 'a' && text.charAt(i) <= 'z')
                || (text.charAt(i) >= '0' && text.charAt(i) <= '9')){
                te += text.charAt(i);
            }else {
                te += "_";
            }
        }
        return this.te;
    }

    public String getTe() {
        replaceSpecialChars();
        return te;
    }
}
