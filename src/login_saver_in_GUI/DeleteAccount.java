package login_saver_in_GUI;

import java.awt.Color;

import javax.swing.*;

public class DeleteAccount extends JPanel{
	
	//CREATING OBJECT OF COMPONENTS OF JPANEL
	private JLabel LDescription = new JLabel("Create an Account for Login Information Saver");
	private JLabel LName = new JLabel("Account Name");
	private JLabel LPassword = new JLabel("Password");
	private JLabel LEmail = new JLabel("Email");
	public JLabel LMessage  = new JLabel();
	public JTextField TName = new JTextField();
	public JTextField TEmail = new JTextField();
	public JPasswordField PPassword = new JPasswordField();
	public JButton BDelete = new JButton("Delete Account");
	
	
	//METHOD FOR SETTING DESCRIPTION LABEL
	public void setDescriptionLabel() {
		LDescription.setForeground(Color.black);
		LDescription.setBounds(115, 40, 270, 20);
		add(LDescription);
	}
	
	
	//METHOD FOR SETTING NAME LABEL
    public void setNameLabel() {
    	LName.setForeground(Color.black);
    	LName.setBounds(40, 110, 100, 20);
    	add(LName);
	}
    
    
    //METHOD FOR SETTING PASSWORD LABEL
    public void setPasswordLabel() {
    	LPassword.setForeground(Color.black);
    	LPassword.setBounds(40, 160, 100, 20);
    	add(LPassword);
	}
    
    
    //METHOD FOR SETTING EMAIL LABEL
    public void setEmailLabel() {
    	LEmail.setForeground(Color.black);
    	LEmail.setBounds(40, 210, 150, 20);
    	add(LEmail);
	}
    
    
    //METHOD FOR SETTING MESSAGE LABEL
    public void setMessageLabel() {
    	LMessage.setForeground(Color.red);
    	LMessage.setBounds(40, 250, 300, 20);
    	add(LMessage);
	}
    
    
    //METHOD FOR SETTING NAME TEXTFIELD
    public void setNameTextField() {
    	TName.setForeground(Color.black);
    	TName.setBounds(210, 110, 230, 20);
    	add(TName);
	}
    
    
  //METHOD FOR SETTING PASSWORD PASSWORDFIELD
    public void setPasswordField() {
    	PPassword.setForeground(Color.black);
    	PPassword.setBounds(210, 160, 230, 20);
    	add(PPassword);
	}
    
    
    //METHOD FOR SETTING EMAIL TEXTFIELD
    public void setEmailTexrField() {
    	TEmail.setForeground(Color.black);
    	TEmail.setBounds(210, 210, 230, 20);
    	add(TEmail);
	}
    
    
    //METHOD FOR SETTING CREATE BUTTON
    public void setDeleteButton() {
    	BDelete.setForeground(Color.black);
    	BDelete.setBounds(185, 290, 130, 20);
    	add(BDelete);
	}
    
    
    //METHOD FOR SETTING ALL COMPONENTS
    public void setComponents() {
    	setDescriptionLabel();
    	setNameLabel();
    	setNameTextField();
    	setPasswordLabel();
    	setPasswordField();
    	setEmailLabel();
    	setEmailTexrField();
    	setMessageLabel();
    	setDeleteButton();
    }
}
