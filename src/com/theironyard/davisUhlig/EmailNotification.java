package com.theironyard.davisUhlig;

/**
 * Created by duhlig on 7/19/17.
 */
public class EmailNotification extends Notification {
    private String recipient;
    private String smtpProvider;

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
        status = "This is an email status";
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }


    @Override
    public void transport() {
        System.out.println(getRecipient());
        System.out.println(getSmtpProvider());
        System.out.println(getCreatedAt());
        System.out.println(getSubject());
        System.out.println(getBody());
        System.out.println(getStatus());
    }

    @Override
    public void someText(){
        super.someText();
        System.out.println("This is overwriting the other someText function");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmailNotification)) return false;

        EmailNotification that = (EmailNotification) o;

        if (getRecipient() != null ? !getRecipient().equals(that.getRecipient()) : that.getRecipient() != null)
            return false;
        return getSmtpProvider() != null ? getSmtpProvider().equals(that.getSmtpProvider()) : that.getSmtpProvider() == null;
    }

    @Override
    public int hashCode() {
        int result = getRecipient() != null ? getRecipient().hashCode() : 0;
        result = 31 * result + (getSmtpProvider() != null ? getSmtpProvider().hashCode() : 0);
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new EmailNotification(super.getSubject(), super.getBody(), this.getRecipient(), this.getSmtpProvider());
    }
}
