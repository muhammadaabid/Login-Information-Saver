package login_saver_in_GUI;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

public class PasswordForgotten extends JPanel {
	
	//CREATING OBJECT OF COMPONENTS OF JPANEL
	private JLabel LDescription = new JLabel("Enter New Password to Forgot your Password");
	private JLabel LNewPassword = new JLabel("New Password");
	public JLabel LMessage = new JLabel();
	public JPasswordField PNewPassword = new JPasswordField();
	public JButton BChange = new JButton("Change Password");
	
	
	//METHOD FOR SETTING DESCRIPTION LABEL
	public void setDescriptionLabel() {
		LDescription.setForeground(Color.black);
		LDescription.setBounds(90, 40, 320, 20);
		add(LDescription);
	}
	
	
	//METHOD FOR SETTING PLATFORM LABEL
	public void setNewPasswordLabel() {
		LNewPassword.setForeground(Color.black);
		LNewPassword.setBounds(40, 110, 100, 20);
		add(LNewPassword);
	}
	
	
	//METHOD FOR SETTING PLATFORM TEXTFIELD
	public void setNewPasswordField() {
		PNewPassword.setForeground(Color.black);
		PNewPassword.setBounds(210, 110, 230, 20);
		add(PNewPassword);
	}
	
	
    //METHOD FOR SETTING MESSAGE LABEL
    public void setMessageLabel() {
    	LMessage.setForeground(Color.red);
    	LMessage.setBounds(40, 220, 300, 20);
    	add(LMessage);
	}
	
	
	//METHOD FOR SETTING SHOW BUTTON
	public void setChangeButton() {
		BChange.setForeground(Color.black);
		BChange.setBounds(175, 290, 150, 20);
		add(BChange);
	}
	
	
	//METHOD FOR SETTING ALL COMPONENTS
	public void setComponents() {
		setDescriptionLabel();
		setNewPasswordLabel();
		setMessageLabel();
		setNewPasswordField();
		setChangeButton();
	}
}
