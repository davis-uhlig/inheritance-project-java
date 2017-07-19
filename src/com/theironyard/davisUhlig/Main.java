package com.theironyard.davisUhlig;

import javax.xml.soap.Text;

public class Main {

    public static void main(String[] args) {
	    EmailNotification newEmail = new EmailNotification("Hello", "This is and email from Davis", "Ahmad", "gmail");
        TextNotification newText = new TextNotification("Text", "This is a text from Davis", "Charles", "Verizon");

        newEmail.transport();
        newText.transport();

        newEmail.someText();


        try {
            Object newEmailClone = newEmail.clone();

            if(newEmail.equals(newEmailClone)){
                System.out.println(true);
            } else {
                System.out.println(false);
            }

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
