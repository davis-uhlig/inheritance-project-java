package com.theironyard.davisUhlig;

/**
 * Created by duhlig on 7/19/17.
 */
public class TextNotification extends Notification {
    private String recipient;
    private String smsProvider;

    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
        someText();
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }

    @Override
    public void transport() {
        System.out.println(getRecipient());
        System.out.println(getSmsProvider());
        System.out.println(getCreatedAt());
        System.out.println(getSubject());
        System.out.println(getBody());
    }
}
