package com.pwn.student.controllers;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.websocket.Session;

public class MailController {
    private static final String HOST = "smtp.gmail.com";
    private static final int PORT = 465;
    private static final String FROM = "reaktor_kontakt@wp.pl";
    private static final String PASS = "ReaktorPWN@";
    private static final String SUBJECT = "Message received";
    private static final String TO = "michal_kruczkowski@o2.pl";

    public void autoMail() {
        try{
        //Auto mailing
        Properties props = new Properties();
        props.put("mail.transport.protocol", "smtps");
        props.put("mail.smtps.auth", "true");

        // inicjalizacja sesji
        javax.websocket.Session mailSession = Session.getDefaultInstance(props);
        // ustawienie debugowania połączenia
        mailSession.setDebug(true);

        // Tworzenie wiadomości
        MimeMessage message = new MimeMessage(mailSession);
            message.setSubject("...");

        message.setContent("...", "text/plain; charset=ISO-8859-2");
        //String to = tf_mail.getText();
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(TO));

        // ustawienie połączenia
        Transport t = mailSession.getTransport();
        t.connect(HOST, PORT, FROM, PASS);

        // Wysłanie wiadomości
        t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
        t.close();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

}
