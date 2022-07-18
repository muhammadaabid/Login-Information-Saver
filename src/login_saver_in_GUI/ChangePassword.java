package login_saver_in_GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


//MAIN CHANGE PASSWORD JPANEL CLASS
public class ChangePassword extends JPanel {
	
	//CREATING OBJECT OF COMPONENTS OF JPANEL
	private JLabel LDescription = new JLabel("Enter details to Change Password of your Login Information Saver Account");
	private JLabel LOldPassword = new JLabel("Old Password");
	private JLabel LNewPassword = new JLabel("New Password");
	private JLabel LRetypePassword = new JLabel("Re-Type Password");
	public JLabel LMessage = new JLabel();
	public JPasswordField POldPassword = new JPasswordField();
	public JPasswordField PNewPassword = new JPasswordField();
	public JPasswordField PRetypePassword = new JPasswordField();
	private JButton BChange = new JButton("Change Password");
	
	
	/* INITIALIZING VARIABLE
	 * THESE VARIABLES ARE USED IN ACTION LISTENER OF CHANGE PASSWORD BUTTON
	 */
	String OldPassword;
	String NewPassword;
	String RetypePassword;
	String FolderName;
	String readPassword;
	String readEmail;
	
	
	//METHOD FOR SETTING DESCRIPTION LABEL
	public void setDescriptionLabel() {
		LDescription.setForeground(Color.black);
		LDescription.setBounds(25, 40, 450, 20);
		add(LDescription);
	}
	
	
	//METHOD FOR SETTING OLD PASSWORD LABEL
    public void setOldPasswordLabel() {
    	LOldPassword.setForeground(Color.black);
    	LOldPassword.setBounds(40, 110, 100, 20);
    	add(LOldPassword);
	}
    
    
    //METHOD FOR SETTING NEW PASSWORD LABEL
    public void setNewPasswordLabel() {
    	LNewPassword.setForeground(Color.black);
    	LNewPassword.setBounds(40, 160, 100, 20);
    	add(LNewPassword);
	}
    
    
    //METHOD FOR SETTING RE-TYPE PASSWORD LABEL
    public void setRetypePasswordLabel() {
    	LRetypePassword.setForeground(Color.black);
    	LRetypePassword.setBounds(40, 210, 150, 20);
    	add(LRetypePassword);
	}
    
    
    //METHOD FOR SETTING MESSAGE LABEL
    public void setMessageLabel() {
    	LMessage.setForeground(Color.red);
    	LMessage.setBounds(40, 250, 300, 20);
    	add(LMessage);
	}
    
    
    //METHOD FOR SETTING OLD PASSWORD PASSWPRDFIELD
    public void setOldPasswordField() {
    	POldPassword.setForeground(Color.black);
    	POldPassword.setBounds(210, 110, 230, 20);
    	add(POldPassword);
	}
    
    
    //METHOD FOR SETTING NEW PASSWORD PASSWORDFIELD
    public void setNewPasswordField() {
    	PNewPassword.setForeground(Color.black);
    	PNewPassword.setBounds(210, 160, 230, 20);
    	add(PNewPassword);
	}
    
    
    //METHOD FOR SETTING RE-TYPE PASSWORD PASSWORDFIELD
    public void setRetypePasswordField() {
    	PRetypePassword.setForeground(Color.black);
    	PRetypePassword.setBounds(210, 210, 230, 20);
    	add(PRetypePassword);
	}
    
    
    //METHOD FOR SETTING CHANGE PASSWORD BUTTON
    public void setChangeButton() {
    	BChange.setForeground(Color.black);
    	BChange.setBounds(175, 290, 150, 20);
    	setActionOnChange();
    	add(BChange);
	}
    
    
    //METHOD FOR SETTING ACTION ON CHANGE PASSWORD BUTTON
    public void setActionOnChange() {
    	BChange.addActionListener(new ActionListener() {
    		
    		//PRMITIVE METHOD FOR ACTION PERFORMED
    		public void actionPerformed(ActionEvent e) {
    			
    			//DECLARING VALUES TO VARIABLES
    			OldPassword = new String(POldPassword.getPassword());
    			NewPassword = new String(PNewPassword.getPassword());
    			RetypePassword = new String(PRetypePassword.getPassword());
    			
    			//IF ANY TEXTFIELD IS EMPTY THEN THIS PIECE OF CODE WILL RUN
    			if(OldPassword.equals("") || NewPassword.equals("") || RetypePassword.equals("")) {
    				LMessage.setForeground(Color.red);
    				LMessage.setText("Plaese fill all fields ! ! !");
    			}
    			
    			//IF NO TEXTFIELD IS EMPTY THEN THIS PIECE OF CODE WILL RUN
    			else {
    				try {
						readData();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
    			}
    		}
    	});
    }
    
    
	//METHOD FOR RADING DATA FROM FILE
	public void readData() throws IOException {
		
		//SETTING PATH FOR READING DATA FROM THE FILE
		FileReader fr = new FileReader("./Account Users/"+FolderName+"/.txt");
		BufferedReader BF = new BufferedReader(fr);
		
		//READING EMAIL FROM FILE
		String Line;
		while((Line = BF.readLine())!= null) {
			readEmail = Line;
		}
		BF.close();
		
		//SETTING PATH FOR READING DATA FROM THE FILE
		FileReader FR = new FileReader("./Account Users/"+FolderName+"/.txt");
		BufferedReader BFReader = new BufferedReader(FR);
		
		//READ THE DATA FROM A FILE AND STORE IN A VARIABLE
		readPassword = BFReader.readLine();
		
		//IF OLD PASSWORD DOES MATCH THEN THIS PIECE OF CODE WILL RUN
		if(OldPassword.equals(readPassword)) {
			
			//IF NEW AND RE-TYPE PASSWORDS DOES MATCH THEN NEW PASSWORD WILL WRITE TO THE FILE
			if(NewPassword.equals(RetypePassword)) {
				
				//METHOD FOR WRITTING DATA TO THE FILE
				writeData();
				
				//PRINTING A MESSAGE FOR SUCCESSFULL PASSWORD CHANGE
				LMessage.setText("");
				JOptionPane.showMessageDialog(this, "Password has Successfully been changed !", "Information Message", JOptionPane.INFORMATION_MESSAGE);
			}
			
			//IF NEW AND RE-TYPE PASSWORDS DOES NOT MATCH THEN THIS ERROR WILL BE PRINTED
			else {
				LMessage.setText("");
				JOptionPane.showMessageDialog(this, "Re-Type Password doesn't match ! ! !", "ERROR !", JOptionPane.ERROR_MESSAGE);
			}
		}
		
		//IF OLD PASSWORD DOES NOT MATCH THEN THIS PIECE OF CODE WILL RUN
		else {
			LMessage.setText("");
			JOptionPane.showMessageDialog(this, "Invalid or Incorrect Old Password ! ! !", "ERROR !", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	//METHOD FOR WRITING DATA TO THE FILE
    public void writeData() throws IOException {
    	
		//SETTING PATH FOR WRITTING DATA TO THE FILE
		FileWriter FW = new FileWriter("./Account Users/"+FolderName+"/.txt");
		BufferedWriter BFWriter = new BufferedWriter(FW);
		
		//WRITTING DATA TO THE FILE
		BFWriter.write(NewPassword);
		BFWriter.newLine();
		BFWriter.write(readEmail);
		BFWriter.close();
    }
    
    
    //METHOD FOR SETTING ALL COMPONENTS
    public void setComponents() {
    	setDescriptionLabel();
    	setOldPasswordLabel();
    	setOldPasswordField();
    	setNewPasswordLabel();
    	setNewPasswordField();
    	setRetypePasswordLabel();
    	setRetypePasswordField();
    	setMessageLabel();
    	setChangeButton();
    }
}
