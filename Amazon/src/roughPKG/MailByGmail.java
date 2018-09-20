package roughPKG;

import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailByGmail {

	public static void main(String[] args) {
		final String from = "er.rajesh6145@gmail.com";
		final String pass = "Shree@6145rama";
		Properties props = new Properties();
		props.put("mail.smtp.auth", true);
		props.put("mail.smtp.starttls.enable", true);
		String host = "smtp.gmail.com";
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "465");
		
		String to = "sam1992.123@gmail.com";

		// get Session instance
		
		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() 
		{
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, pass);
			}
		});

		// compose message
		MimeMessage message = new MimeMessage(session); 	
		try {
			message.setFrom(new InternetAddress(from));
		} catch (MessagingException e) {
			System.out.println("there must be problem in FROM type email address");
		}
		try {
			message.setRecipient(javax.mail.Message.RecipientType.TO, new InternetAddress(to));
		} catch (MessagingException e) {
			System.out.println("There must be problem in TO type email address");
		}
		try {
			message.setSubject("Hello QA");
		} catch (MessagingException e) {
			System.out.println("Problem in setting subject line");
		}
		try {
			message.setText("This mail is triggered by a tool");
		} catch (MessagingException e) {
			System.out.println("Problem in setting message body");
		}

		// send Message
		try {
			
			 Transport.send(message);
			 System.out.println("process completed, Email has been triggered");
		} catch (MessagingException e) {
			System.out.println("problem in sending message");
		}

		
	

	}

}
