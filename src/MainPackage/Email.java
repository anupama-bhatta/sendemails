package MainPackage;

/**
* Author: Anupama Bhatta
* Date:   02/25/2019
* Description: A Java application that allows sending e-mails.
*/

public class Email extends Document
{   
    private String recipients;
    private String subject;
    private String message;
    private String status;
    private int id;
    
    static int objectCounter = 0;

    public Email(String recipients, String subject, String message) 
    {
        super(message);
        this.recipients = recipients;
        this.subject = subject;
        this.message = message;
        
        objectCounter++;
        this.id = objectCounter;
    }

    public String getRecipients() 
    {
        return recipients;
    }

    public void setRecipients(String recipients) 
    {
        this.recipients = recipients;
    }

    public String getSubject() 
    {
        return subject;
    }

    public void setSubject(String subject) 
    {
        this.subject = subject;
    }

    public String getMessage() 
    {
        return message;
    }

    public void setMessage(String message) 
    {
        this.message = message;
    }

    public String getStatus() 
    {
        return status;
    }

    public void setStatus(String status) 
    {
        this.status = status;
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }
    
    @Override
    public String toString() 
    {     
        return "\n" + id + "."
                + "\n   Status: " + status
                + "\n   Subject: "+ subject
                + "\n   Recipient(s): " + recipients
                + "\n*  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *\n"; 
    }
}
