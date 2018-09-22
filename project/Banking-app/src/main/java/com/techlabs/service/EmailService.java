package com.techlabs.service;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;

@Service("emailservice")
public class EmailService {

	public void sendmail(String from, String to, String password, String body,
			String subject,long account_no) {
		Properties properties = new Properties();

		properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");

		Session session = Session.getInstance(properties,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(from, password);
					}
				});
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(to));
			message.setSubject(subject);
			message.setText(body);
			message.setContent("<html>\n" +
                    "<body>\n" +
                    "\n" +"<h1>\n"+"This is the activation link"+"</h1>\n"+
                    "<img src=\"https://user-images.githubusercontent.com/40757690/45858895-33a7d980-bd7d-11e8-8e7d-734e57bbf0be.png\">\n"+
                   "<br>\n"+"<br>\n"+
                    "<a href=\"http://localhost:8080/Banking-app/activate?acc_no="+account_no+"\">\n" +
                    "Click here to activate your account</a>\n" +
                    "\n" +
                    "</body>\n" +
                    "</html>", "text/html");
			Transport.send(message);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
