package com.theironyard.davisUhlig;

import java.time.LocalDateTime;

/**
 * Created by duhlig on 7/19/17.
 */
public class Notification {
    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status;

    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
        createdAt = LocalDateTime.now();
        status = "Chillin";
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public void showStatus(){
        System.out.println(status);
    }

    protected void someText() {
        System.out.println("print out some text");
    }

    public void transport() {
        throw new NoTransportException();
    }
}
