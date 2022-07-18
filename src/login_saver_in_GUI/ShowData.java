package login_saver_in_GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;


//MAIN SHOW DATA JPANEL CLASS
public class ShowData extends JPanel {
	
	//CREATING OBJECT OF COMPONENTS OF JPANEL
	private JLabel LDescription = new JLabel("Enter Platform Name to get your saved Login Information");
	private JLabel LPlatform = new JLabel("Platform");
	public JLabel LUsername  = new JLabel();
	public JLabel LPassword = new JLabel();
	public JTextField TPlatform = new JTextField();
	private JButton BShow = new JButton("Show Data");
	
	
	/* INITIALIZING VARIABLE
	 * THESE VARIABLES ARE USED IN ACTION LISTENER OF SHOW BUTTON
	 */
	String Platform;
	String FolderName;
	
	
	//METHOD FOR SETTING DESCRIPTION LABEL
	public void setDescriptionLabel() {
		LDescription.setForeground(Color.black);
		LDescription.setBounds(90, 40, 320, 20);
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
		LUsername.setBounds(40, 190, 460, 20);
		add(LUsername);
	}
	
	
	//METHOD FOR SETTING PASSWORD LABEL
	public void setPasswordLabel() {
		LPassword.setForeground(Color.black);
		LPassword.setBounds(40, 213, 460, 20);
		add(LPassword);
	}
	
	
	//METHOD FOR SETTING PLATFORM TEXTFIELD
	public void setPlatformTextField() {
		TPlatform.setForeground(Color.black);
		TPlatform.setBounds(210, 110, 230, 20);
		add(TPlatform);
	}
	
	
	//METHOD FOR SETTING SHOW BUTTON
	public void setShowButton() {
		BShow.setForeground(Color.black);
		BShow.setBounds(200, 290, 100, 20);
		setActionOnShow();
		add(BShow);
	}
	
	
	//METHOD FOR SETTING ACTION ON SAVE BUTTON
	public void setActionOnShow() {
		BShow.addActionListener(new ActionListener() {
			
			//PRMITIVE METHOD FOR ACTION PERFORMED
			public void actionPerformed(ActionEvent e) {
				Platform = TPlatform.getText();
				
				//IF PLATFORM TEXTFIELD IS EMPTY THEN THIS ERROR WILL PRINTED
				if(Platform.equals("")) {
					showDialog();
				}
				
				//IF PLATFORM TEXTFIELD IS NOT EMPTY THEN THIS PIECE OF CODE WILL RUN
				else {
					//THIS PIECE OF CODE WILL READ DATA FROM FILE
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
		
		/* THIS TRY-CATCH BLOCK IS FOR FILE NOT FOUND EXCEPTION
		 * 
		 * IF FILE IS FOUND THEN TRY BLOCK WILL RUN AND DISPLAY DESIRED OUTPUT
		 * IF FILE IS NOT FOUND THEN CATCH BLOCK WILL RUN AND DISPLAY AN ERROR
		 */
		try {
			FileReader FR = new FileReader("./Account Users/"+FolderName+"/"+Platform+".txt");
			BufferedReader BFReader = new BufferedReader(FR);
			String str;
			str = BFReader.readLine();
			LUsername.setText(str);
			str = BFReader.readLine();
			LPassword.setText(str);
			
		
		} catch(FileNotFoundException e) {
			JOptionPane.showMessageDialog(this, "File doesn't exist or Invalid Platform Name ! ! !", "ERROR !", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	//METHOD FOR SHOWING ERROR DIALOG BOX INSIDE ANONYMOUS ACTION LISTENER CLASS
	public void showDialog() {
		JOptionPane.showMessageDialog(this, "Please, enter Platform name ! ! !", "ERROR !", JOptionPane.ERROR_MESSAGE);
	}
	
	
	//METHOD FOR SETTING ALL COMPONENTS
	public void setComponents() {
		setDescriptionLabel();
		setPlatformLabel();
		setPlatformTextField();
		setUsernameLabel();
		setPasswordLabel();
		setShowButton();
	}
}