package login_saver_in_GUI;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;


//MAIN SAVE DATA JPANEL CLASS
public class SaveData extends JPanel {
	
	//CREATING OBJECT OF COMPONENTS OF JPANEL
	private JLabel LDescription = new JLabel("Enter details to save into your Saver Account");
	private JLabel LPlatform = new JLabel("Platform");;
	private JLabel LUsername = new JLabel("Email/Username");
	private JLabel LPassword = new JLabel("Password");;
	public JLabel LMessage = new JLabel();
	public JTextField TPlatform = new JTextField();
	public JTextField TUsername = new JTextField();
	public JPasswordField PPassword = new JPasswordField();
	public JButton BSave = new JButton("Save Data");
	
	
	//METHOD FOR SETTING DESCRIPTION LABEL
	public void setDescriptionLabel() {
		LDescription.setForeground(Color.black);
		LDescription.setBounds(115, 40, 270, 20);
		add(LDescription);
	}
	
	
	//METHOD FOR SETTING PLATFORM LABEL
    public void setPlatformLabel() {
    	LPlatform.setForeground(Color.black);
    	LPlatform.setBounds(40, 110, 100, 20);
    	add(LPlatform);
	}
    
    
    //METHOD FOR SETTING USERNAME LABEL
    public void setUsernameLabel() {
    	LUsername.setForeground(Color.black);
    	LUsername.setBounds(40, 160, 100, 20);
    	add(LUsername);
	}
    
    
    //METHOD FOR SETTING PASSWORD LABEL
    public void setPasswordLabel() {
    	LPassword.setForeground(Color.black);
    	LPassword.setBounds(40, 210, 100, 20);
    	add(LPassword);
	}
    
    
    //METHOD FOR SETTING MESSAGE LABEL
    public void setMessageLabel() {
    	LMessage.setForeground(Color.red);
    	LMessage.setBounds(40, 250, 300, 20);
    	add(LMessage);
	}
    
    
    //METHOD FOR SETTING PLATFORM TEXTFIELD
    public void setPlatformTextField() {
    	TPlatform.setForeground(Color.black);
    	TPlatform.setBounds(210, 110, 230, 20);
    	add(TPlatform);
	}
    
    
    //METHOD FOR SETTING USERNAME TEXTFIELD
    public void setUsernameTextField() {
    	TUsername.setForeground(Color.black);
    	TUsername.setBounds(210, 160, 230, 20);
    	add(TUsername);
	}
    
    
    //METHOD FOR SETTING PASSWORD PASSWORDFIELD
    public void setPasswordField() {
    	PPassword.setForeground(Color.black);
    	PPassword.setBounds(210, 210, 230, 20);
    	add(PPassword);
	}
    
    
    //METHOD FOR SETTING SAVE BUTTON
    public void setSaveButton() {
    	BSave.setForeground(Color.black);
    	BSave.setBounds(200, 290, 100, 20);
    	add(BSave);
	}
    
    
    //METHOD FOR SETTING ALL COMPONENTS
    public void setComponents() {
    	setDescriptionLabel();
    	setPlatformLabel();
    	setPlatformTextField();
    	setUsernameLabel();
    	setUsernameTextField();
    	setPasswordLabel();
    	setPasswordField();
    	setMessageLabel();
    	setSaveButton();
    }
}