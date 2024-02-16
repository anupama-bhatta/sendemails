package MainPackage;

import java.util.regex.Pattern;

/**
 * Author: Anupama Bhatta 
 * Date: 02/25/2019 
 * Description: A Java application that allows sending e-mails.
 */

public class UI_SendEmail extends UI_Base 
{
    public UI_SendEmail() 
    {
        super("email_bg_trans.jpg", 1000, 1000);

        initComponents();
        setDefaults();
        lblLoader.setVisible(false);
        lblError.setVisible(false);
        
    }

    private void setDefaults() 
    {
        lblSend.setSize(199, 55);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLoader = new javax.swing.JLabel();
        lblSend = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblRecipients = new javax.swing.JLabel();
        lblSubject = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        lblLog = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        areaRecipient = new javax.swing.JTextArea();
        areaSubject = new javax.swing.JTextArea();
        scrollPaneLog = new javax.swing.JScrollPane();
        areaLog = new javax.swing.JTextArea();
        scrollPaneMessage = new javax.swing.JScrollPane();
        areaMessage = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLoader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/load.gif"))); // NOI18N
        lblLoader.setOpaque(true);
        getContentPane().add(lblLoader, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 60, 60));

        lblSend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/send_off.jpg"))); // NOI18N
        lblSend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSendMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSendMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSendMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSendMouseEntered(evt);
            }
        });
        lblSend.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblSendKeyPressed(evt);
            }
        });
        getContentPane().add(lblSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, 60));

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 102));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Email Form");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 790, 50));

        lblRecipients.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblRecipients.setForeground(new java.awt.Color(0, 0, 102));
        lblRecipients.setText("Recipient(s):");
        getContentPane().add(lblRecipients, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 90, 36));

        lblSubject.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblSubject.setForeground(new java.awt.Color(0, 0, 102));
        lblSubject.setText("Subject:");
        getContentPane().add(lblSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 60, 27));

        lblMessage.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(0, 0, 102));
        lblMessage.setText("Message:");
        getContentPane().add(lblMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 83, 26));

        lblLog.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblLog.setForeground(new java.awt.Color(0, 0, 102));
        lblLog.setText("Log");
        getContentPane().add(lblLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 50, 50));

        lblError.setBackground(new java.awt.Color(255, 204, 204));
        lblError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblError.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblError.setOpaque(true);
        getContentPane().add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 440, 50));

        areaRecipient.setBackground(new java.awt.Color(255, 255, 204));
        areaRecipient.setColumns(20);
        areaRecipient.setRows(5);
        areaRecipient.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        areaRecipient.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                areaRecipientKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                areaRecipientKeyReleased(evt);
            }
        });
        getContentPane().add(areaRecipient, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 360, 40));

        areaSubject.setBackground(new java.awt.Color(255, 255, 204));
        areaSubject.setColumns(20);
        areaSubject.setRows(5);
        areaSubject.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        areaSubject.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                areaSubjectKeyPressed(evt);
            }
        });
        getContentPane().add(areaSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 360, 40));

        areaLog.setEditable(false);
        areaLog.setBackground(new java.awt.Color(255, 255, 204));
        areaLog.setColumns(20);
        areaLog.setRows(5);
        scrollPaneLog.setViewportView(areaLog);

        getContentPane().add(scrollPaneLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 730, 200));

        areaMessage.setBackground(new java.awt.Color(255, 255, 204));
        areaMessage.setColumns(20);
        areaMessage.setRows(5);
        scrollPaneMessage.setViewportView(areaMessage);

        getContentPane().add(scrollPaneMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 270, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblSendMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSendMouseEntered
        sendButtonToggle();
    }//GEN-LAST:event_lblSendMouseEntered

    private void lblSendMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSendMouseExited
        sendButtonToggle();
    }//GEN-LAST:event_lblSendMouseExited

    private void lblSendMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSendMousePressed
        if (lblLoader.isVisible()) 
        {
            return;
        }
        if (validateForm() && validateEmail(areaRecipient.getText())) 
        {
            lblError.setVisible(false);
            new Thread(() -> {
                lblLoader.setVisible(true);
                sendEmail();
                lblLoader.setVisible(false);
                lblSend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sent.jpg")));
                areaRecipient.setText("");
                areaSubject.setText("");
                areaMessage.setText("");
            }).start();
        }
    }//GEN-LAST:event_lblSendMousePressed

    // Method that validates the form
    private boolean validateForm() 
    {
        // For recipient
        if ((areaRecipient.getText() == null) || (areaRecipient.getText().equals(""))) 
        {
            lblError.setVisible(true);
            lblError.setText("Recipient(s) field cannot be blank.");
            areaRecipient.setBackground(new java.awt.Color(255, 204, 204));
            lblSend.setEnabled(false);
            return false;
        }
        else 
        {
            lblError.setVisible(false);
            areaRecipient.setBackground(new java.awt.Color(255, 255, 204));
            lblSend.setEnabled(true);
        }
        
        // For subject
        if ((areaSubject.getText() == null) || (areaSubject.getText().equals(""))) 
        {
            lblError.setVisible(true);
            lblError.setText("Subject field cannot be blank.");
            areaSubject.setBackground(new java.awt.Color(255, 204, 204));
            lblSend.setEnabled(false);
            return false;
        }
        else 
        {
            lblError.setVisible(false);
            areaSubject.setBackground(new java.awt.Color(255, 255, 204));
            lblSend.setEnabled(true);
        }
        
        // For message
        if ((areaMessage.getText() == null) || (areaMessage.getText().equals(""))) 
        {
            lblError.setVisible(true);
            lblError.setText("Message field cannot be blank.");
            areaMessage.setBackground(new java.awt.Color(255, 204, 204));
            lblSend.setEnabled(false);
            return false;
        }
        else 
        {
            lblError.setVisible(false);
            areaMessage.setBackground(new java.awt.Color(255, 255, 204));
            lblSend.setEnabled(true);
        }
        
        return true;
    }
    
    // Method that validates email
    public boolean validateEmail(String email) 
    {   
        String emailRegex = "^\\s*[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}[^\\S]+$"; 
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        
        lblError.setVisible(true);
        lblError.setText(areaRecipient.getText() + " is not valid.");
        return pat.matcher(email).matches(); 
    } 
        
    private void areaRecipientKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areaRecipientKeyReleased
        validateEmail(areaRecipient.getText());
        lblError.setVisible(false);
        areaRecipient.setBackground(new java.awt.Color(255, 255, 204));
        lblSend.setEnabled(true);
    }//GEN-LAST:event_areaRecipientKeyReleased

    private void lblSendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSendMouseClicked

    }//GEN-LAST:event_lblSendMouseClicked

    private void lblSendKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblSendKeyPressed

    }//GEN-LAST:event_lblSendKeyPressed

    private void areaRecipientKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areaRecipientKeyPressed
        lblError.setVisible(false);
        areaRecipient.setBackground(new java.awt.Color(255, 255, 204));
        lblSend.setEnabled(true);
    }//GEN-LAST:event_areaRecipientKeyPressed

    private void areaSubjectKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areaSubjectKeyPressed
        lblError.setVisible(false);
        areaSubject.setBackground(new java.awt.Color(255, 255, 204));
        lblSend.setEnabled(true);
    }//GEN-LAST:event_areaSubjectKeyPressed

    private void sendEmail() 
    {
        Email sendEmail = new Email(areaRecipient.getText(), areaSubject.getText(), areaMessage.getText()); // Instantiation of Email class object
        EmailSender emailSender = new EmailSender(sendEmail); // Instantiation of EmailSender class object
        emailSender.send();
        sendEmail.setStatus(emailSender.getStatusMessage());
        areaLog.append(sendEmail.toString());
    }

    private void sendButtonToggle() 
    {
        String sFile = "/images/send_off.jpg";
        String currentFile = lblSend.getIcon().toString();
        if (currentFile.contains("_off")) {
            sFile = "/images/send.jpg";
        } else {
            sFile = "/images/send_off.jpg";
        }
        lblSend.setIcon(new javax.swing.ImageIcon(getClass().getResource(sFile)));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaLog;
    private javax.swing.JTextArea areaMessage;
    private javax.swing.JTextArea areaRecipient;
    private javax.swing.JTextArea areaSubject;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblLoader;
    private javax.swing.JLabel lblLog;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblRecipients;
    private javax.swing.JLabel lblSend;
    private javax.swing.JLabel lblSubject;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane scrollPaneLog;
    private javax.swing.JScrollPane scrollPaneMessage;
    // End of variables declaration//GEN-END:variables
}
