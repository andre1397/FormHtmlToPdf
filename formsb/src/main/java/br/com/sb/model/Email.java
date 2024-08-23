package br.com.sb.model;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Email {
	
	private String emailOrigem = "enviaformulariosb@gmail.com";
	private String senhaEmailOrigem = "abvsykookjboohql";
	private String emailDestino;
	private String PdfName;
	
	public String getEmailOrigem() {
		return emailOrigem;
	}
	
	public void setEmailOrigem(String emailOrigem) {
		this.emailOrigem = emailOrigem;
	}
	
	public String getSenhaEmailOrigem() {
		return senhaEmailOrigem;
	}
	
	public void setSenhaEmailOrigem(String senhaEmailOrigem) {
		this.senhaEmailOrigem = senhaEmailOrigem;
	}
	
	public String getEmailDestino() {
		return emailDestino;
	}
	
	public void setEmailDestino(String emailDestino) {
		this.emailDestino = emailDestino;
	}
	
	public void setPdfName (String PdfName) {
		this.PdfName = PdfName;
	}
	
	public void enviaEmail() {
		String emailOrigem = this.emailOrigem;
		String senhaEmailOrigem = this.senhaEmailOrigem;
		String emailDestino = this.emailDestino;
		
		 System.out.println("TLSEmail Start");
	     Properties props = new Properties();
	     props.put("mail.smtp.host", "smtp.gmail.com");
	     props.put("mail.smtp.port", "587");
	     props.put("mail.smtp.auth", "true");
	     props.put("mail.smtp.starttls.enable", "true");

	     Session session = Session.getDefaultInstance(props, new Authenticator() {
	    	 protected PasswordAuthentication getPasswordAuthentication() {

	    		 return new PasswordAuthentication(emailOrigem, senhaEmailOrigem);

	         }
	     });

	        try{
	            MimeMessage message = new MimeMessage(session);
	            message.addRecipient(Message.RecipientType.TO, new InternetAddress(emailDestino, true));
	            message.setSubject("PDF Formulário Fibra Ótica");
	            FileDataSource fds = new FileDataSource("C:\\FormularioPdf\\" + this.PdfName + ".pdf");
	            message.setDataHandler(new DataHandler(fds));
	            message.setFileName(fds.getName());
	            System.out.println("sending...");
	            Transport.send(message);
	            System.out.println("Sent message successfully....");

	        }catch (MessagingException me){
	        	me.printStackTrace();
	            System.out.println("Exception: "+me);

	        }
	}
	
}
