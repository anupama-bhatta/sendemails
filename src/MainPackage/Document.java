package MainPackage;

/**
* Author: Anupama Bhatta
* Date:   02/25/2019
* Description: A Java application that allows sending e-mails.
*/

public class Document 
{
    private String text;

    public Document(String text) 
    {
        this.text = text;
    }

    @Override
    public String toString() 
    {
        return text;
    }
    
    public void setText(String text) 
    {
        this.text = text;
    }
}
