/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Email;

import java.util.Properties;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Lakshmi
 */
public class EmailSender {
    public static boolean sendMail(String from, String password, String message, String to){
        String host = "smtp.gmail.com";
        Properties props = System.getProperties();
        props.put("mail.smtp.starttls.enable","true");
        props.put("mail.smtp.host",host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password",password);
        props.put("mail.smtp.port",587);
        props.put("mail.smtp.auth", "true");
        //Session session = Session.getDefaultInstance(props,null);
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });
        MimeMessage mimeMessage = new MimeMessage(session);
        try {
            System.out.println("entered in try");
            mimeMessage.setFrom(new InternetAddress(from));
            System.out.println("from"+from);
            InternetAddress toAddress = new InternetAddress(to);
            System.out.println("to"+toAddress);
            mimeMessage.addRecipient(RecipientType.TO, toAddress);
            System.out.println("after recipient");
            mimeMessage.setSubject("Registration mail");
            mimeMessage.setText(message);
            System.out.println("message"+message);
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, password);
            transport.sendMessage(mimeMessage, mimeMessage.getRecipients(RecipientType.TO));
            System.out.println("Sent message successfully....");
            transport.close();
            return true;
        }
        catch(MessagingException me){
            me.printStackTrace();
        }
        return false;
        
    }
}
