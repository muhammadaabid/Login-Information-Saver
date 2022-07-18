package login_saver_in_GUI;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;



public class LoginAccount extends JPanel {
	
	//CREATING OBJECT OF COMPONENTS OF JPANEL
	private JLabel LDescription = new JLabel("Login to your Login Information Saver Account");
	private JLabel LName = new JLabel("Account Name");
	private JLabel LPassword = new JLabel("Password");
	public JLabel LMessage = new JLabel();
	public JTextField TName= new JTextField();
	public JPasswordField PPassword = new JPasswordField();
	public JButton BForgot = new JButton("Forgot Password");
	public JButton BLogin = new JButton("Login Account");
	
	
	
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
    	LPassword.setBounds(40, 180, 100, 20);
    	add(LPassword);
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
    
    
  //METHOD FOR SETTING PASSWORD PASSWORDFIELD
    public void setPasswordField() {
    	PPassword.setForeground(Color.black);
    	PPassword.setBounds(210, 180, 230, 20);
    	add(PPassword);
	}
    
    
    //METHOD FOR SETTING FORGOT BUTTON
    public void setForgotButton() {
    	BForgot.setForeground(Color.black);
    	BForgot.setBounds(60, 290, 150, 20);
    	add(BForgot);
	}
    
    
    //METHOD FOR SETTING LOGIN BUTTON
    public void setLoginButton() {
    	BLogin.setForeground(Color.black);
    	BLogin.setBounds(270, 290, 150, 20);
    	add(BLogin);
	}
    
    
    //METHOD FOR SETTING ALL COMPONENTS
    public void setComponents() {
    	setDescriptionLabel();
    	setNameLabel();
    	setMessageLabel();
    	setNameTextField();
    	setPasswordLabel();
    	setPasswordField();
    	setForgotButton();
    	setLoginButton();
    }
}