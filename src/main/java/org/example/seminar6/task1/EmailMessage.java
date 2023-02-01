package org.example.seminar6.task1;

public class EmailMessage implements IMessage{
    @Override
    public void secondMessage (String typeMessage, String message) {
        if (typeMessage.equals("e-mail")) {
            //e-mail
            //use JAVA mail sender API
        }
    }
}
