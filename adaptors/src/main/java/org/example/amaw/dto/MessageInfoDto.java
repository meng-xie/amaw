package org.example.amaw.dto;

public class MessageInfoDto {

    private String email;
    private String text;
    private String subject;

    public String getEmail() {
        return email;
    }

    public String getText() {
        return text;
    }



    public void setEmail(String email) {
        this.email = email;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
