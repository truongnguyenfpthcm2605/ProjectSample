/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.AddressException;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import java.awt.Component;
import java.util.Properties;

/**
 *
 * @author truong
 */
public class Email {
    MessageNotifycation mess = new MessageNotifycation();

    public  void sendEmail(String content,Component a,String title) throws AddressException {
        try {
            String user = "truongnvps24083@fpt.edu.vn";
        String pass = "dkfkilftpeszjupq";
        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); // TLS
        Session session = Session.getInstance(prop, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, pass);
            }
        });
        // ------------
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(user));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("truongnguenlqm@gmail.com"));
        message.setSubject(title);
        message.setText(content);
        Transport.send(message);
        mess.messageNotify(a, title+ "Succsesfull", title);
        
        } catch (Exception e) {
            mess.messageNotify(a, title+"Fail", "Fail");
        }

    }


}
