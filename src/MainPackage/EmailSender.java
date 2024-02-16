package MainPackage;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class EmailSender {

    private boolean status;
    private String statusMessage;
    private Email email ;

    public EmailSender(Email email) {
        this.email = email;
    }
   
/***
 * 
 * @param email - Email object 
 * @return String boolean status: true if the send was successful and false if the send was not successful
 */
    public boolean send() 
    {
        String recipients = email.getRecipients();
        String subject = email.getSubject();
        String message = email.getMessage();
        
        return send(recipients, subject, message) ;
    }

    /***
     * Private method to be used as the helper within EmailSender class. This method uses g-mail service to send email
     * @param emailTO   - recipient email address
     * @param subject   - subject of the email message
     * @param emailBody - email text
     * @return 
     */

    private  boolean send(String emailTO, String subject, String emailBody) 
    {

        final String username = Configs.EMAIL_ACCOUNT;
        final String password = Configs.EMAIL_ACCOUNT_PASS;
        
        Properties props = new Properties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        //create session object required to send email. Pass username and password of the gmail account to be used as sender
        Session session = Session.getInstance(props,
          new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
          });

        try 
        {
            Message message = new MimeMessage(session);
           
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailTO));
            message.setSubject(subject);
            message.setText(emailBody);
              
            Transport.send(message); //send email
            
            status = true;
            statusMessage = "OK";    
        }
        catch (MessagingException ex) {
            status = false;
            statusMessage = ex.getMessage();                      
        }
        
        return status;
    }

    public boolean getStatus() {
        return status;
    }

    public String getStatusMessage() {
        return statusMessage;
    } 
    
}