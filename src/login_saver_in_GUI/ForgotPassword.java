package login_saver_in_GUI;

import java.awt.*;

import javax.swing.*;

public class ForgotPassword extends JPanel {
	
	//CREATING OBJECT OF COMPONENTS OF JPANEL
	private JLabel LDescription = new JLabel("Forgot Password of Account for Login Information Saver");
	private JLabel LName = new JLabel("Account Name");
	private JLabel LEmail = new JLabel("Email");
	public JLabel LMessage  = new JLabel();
	public JTextField TName = new JTextField();
	public JTextField TEmail = new JTextField();
	public JButton BForgot = new JButton("Forgot Password");
	
	
	//METHOD FOR SETTING DESCRIPTION LABEL
	public void setDescriptionLabel() {
		LDescription.setForeground(Color.black);
		LDescription.setBounds(90, 40, 320, 20);
		add(LDescription);
	}
	
	
	//METHOD FOR SETTING NAME LABEL
    public void setNameLabel() {
    	LName.setForeground(Color.black);
    	LName.setBounds(40, 110, 100, 20);
    	add(LName);
	}
    
    
    //METHOD FOR SETTING EMAIL LABEL
    public void setEmailLabel() {
    	LEmail.setForeground(Color.black);
    	LEmail.setBounds(40, 180, 100, 20);
    	add(LEmail);
	}
    
    
    //METHOD FOR SETTING MESSAGE LABEL
    public void setMessageLabel() {
    	LMessage.setForeground(Color.red);
    	LMessage.setBounds(40, 240, 300, 20);
    	add(LMessage);
	}
    
    
    //METHOD FOR SETTING NAME TEXTFIELD
    public void setNameTextField() {
    	TName.setForeground(Color.black);
    	TName.setBounds(210, 110, 230, 20);
    	add(TName);
	}
    
    
    //METHOD FOR SETTING EMAIL TEXTFIELD
    public void setEmailTexrField() {
    	TEmail.setForeground(Color.black);
    	TEmail.setBounds(210, 180, 230, 20);
    	add(TEmail);
	}
    
    
    //METHOD FOR SETTING CREATE BUTTON
    public void setDeleteButton() {
    	BForgot.setForeground(Color.black);
    	BForgot.setBounds(175, 290, 150, 20);
    	add(BForgot);
	}
    
    
    //METHOD FOR SETTING ALL COMPONENTS
    public void setComponents() {
    	setDescriptionLabel();
    	setNameLabel();
    	setNameTextField();
    	setEmailLabel();
    	setEmailTexrField();
    	setMessageLabel();
    	setDeleteButton();
    }
}