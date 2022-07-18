package login_saver_in_GUI;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

//MAIN JFRAME CLASS FOR MAIN FRAME 
class MainFrame extends JFrame {
	
	/* CREATING OBJECTS OF COMPONENTS OF JFrame
	 * ALL COMPONENTS ARE FOR MENU
	 */
	JMenuBar MenuBar = new JMenuBar();
	JMenu Menu = new JMenu("Menu");
	JMenuItem MI_Login = new JMenuItem("Login Account");
	JMenuItem MI_Create = new JMenuItem("Create Account");
	JMenuItem MI_Save = new JMenuItem("Save Data");
	JMenuItem MI_Show = new JMenuItem("Show Data");
	JMenuItem MI_ChangePassword = new JMenuItem("Change Password");
	JMenuItem MI_LogOut = new JMenuItem("Log Out"); 
	
	
	//CREATING OBJECTS OF CLASSES
	CreateAccount Create_Acc = new CreateAccount();
	LoginAccount Login_Acc = new LoginAccount();
	SaveData Save_Data = new SaveData();
	ShowData Show_Data = new ShowData();
	ChangePassword Change_Password = new ChangePassword();
	ForgotPassword Forgot_Password = new ForgotPassword();
	PasswordForgotten Password_Forgotten = new PasswordForgotten();
	
	
	//CREATING OBJECT OF DIALOG BOX FOR CREATE ACCOUNT BUTTON
	private JDialog DialogBoxForCreate = new JDialog(this, "Information Message");
	private JLabel LMessageDialogForCreate = new JLabel();
	private JButton BOKDialogForCreate = new JButton("OK");
	private JButton BLoginDialogForCreate = new JButton("Login");
	
	//CREATING OBJECT OF DIALOG BOX FOR SAVE DATA BUTTON
	private JDialog DialogBoxForSave = new JDialog(this, "Information Message");
	private JLabel LMessageDialogForSave = new JLabel();
	private JButton BOKDialogForSave = new JButton("OK");
	private JButton BShowDialogForSave = new JButton("Show");
	
	
	
	
	/* INITIALIZING VARIABLE
	 * THESE VARIABLES ARE USED IN ACTION LISTENER OF CREATE ACCOUNT BUTTON
	 */
	String CreateFolderName;
	String CreateEmail;
	String CreatePassword;
	
	
	/* INITIALIZING VARIABLE
	 * THESE VARIABLES ARE USED IN ACTION LISTENER OF LOGIN ACCOUNT BUTTON
	 */
	String LoginFolderName;
	String LoginPassword;
	String readPassword;
	
	
	/* INITIALIZING VARIABLE
	 * THESE VARIABLES ARE USED IN ACTION LISTENER OF SAVE DATA BUTTON
	 */
	String SavePlatform;
	String SaveUsername;
	String SavePassword;
	String SaveFolderName;
	
	
	/* INITIALIZING VARIABLE
	 * THESE VARIABLES ARE USED IN ACTION LISTENER OF FORGOT PASSWORD BUTTON
	 */
	String ForgotFolderName;
	String ForgotEmail;
	String readEmail;
	
	
	/* INITIALIZING VARIABLE
	 * THESE VARIABLES ARE USED IN ACTION LISTENER OF CHANGE PASSWORD BUTTON OF FORGOTTEN PASSWORD PANEL
	 */
	String ForgottenPassword;
	String readForgottenEmail;
	String readForgottenPassword;
	
	
	
	/* MAIN FRAME CONSTRUCTOR
	 * SETTING & ADDING ALL COMPONENTS AND CONTAINERS
	 */
	public MainFrame() {
		setFrame();
		setMenu();
		setAction();
	}
	
	
	//METHOD FOR SETTING MAIN FRAME
	public void setFrame() {
		
		Image Icon = Toolkit.getDefaultToolkit().getImage("./Icon/Icon Image.png");
		setIconImage(Icon);
		setTitle("Login Information Saver");
		setLayout(null);
		setSize(500, 400);
		setLocationRelativeTo(null);
		setLoginAccountPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	//METHOD FOR SETTING & ADDING MENU
	public void setMenu() {
		
		//ADDING MENU ITEMS TO MENU
		setLogedOutMenuItems();
		
		//ADDING MENU TO MENU BAR
		MenuBar.add(Menu);
				
		//SETTING MENU BAR
		setJMenuBar(MenuBar);
	}
	
	
	//METHOD FOR SETTING & ADDING LOGGED OUT ACCOUNT MENUITEMS
	public void setLogedOutMenuItems() {
		
		//ADDING MENU ITEMS TO MENU
		Menu.add(MI_Create);
		Menu.addSeparator();
		
		Menu.add(MI_Login);
	}
	
	
	//METHOD FOR SETTING & ADDING LOGGED IN ACCOUNT MENUITEMS
	public void setLogedInMenuItems() {
		Menu.add(MI_Save);
		Menu.addSeparator();
		Menu.add(MI_Show);
		Menu.addSeparator();
		Menu.add(MI_ChangePassword);
		Menu.addSeparator();
		Menu.add(MI_LogOut);
	}
	
	
	
	
	
	/* METHODS FOR SETTING JPANELS
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	//METHOD FOR SETTING CREATE ACCOUNT PANEL
	public void setCreateAccountPanel() {
		Create_Acc.setLayout(null);
		Create_Acc.setBounds(0, 0, 500, 350);
		Create_Acc.setComponents();
		setContentPane(Create_Acc);
	}
	
	
	//METHOD FOR SETTING CREATE ACCOUNT PANEL
	public void setLoginAccountPanel() {
		Login_Acc.setLayout(null);
		Login_Acc.setBounds(0, 0, 500, 350);
		Login_Acc.setComponents();
		setContentPane(Login_Acc);
	}
	
	
	//METHOD FOR SETTING SAVE DATA PANEL
	public void setSaveDataPanel() {
		Save_Data.setLayout(null);
		Save_Data.setBounds(0, 0, 500, 350);
		Save_Data.setComponents();
		setContentPane(Save_Data);
	}
	
	//METHOD FOR SETTING SHOW DATA PANEL
	public void setShowDataPanel() {
		Show_Data.setLayout(null);
		Show_Data.setBounds(0, 0, 500, 350);
		Show_Data.setComponents();
		setContentPane(Show_Data);
	}
	
	
	//METHOD FOR SETTING CHANGE PASSWORD PANEL
	public void setChangePasswordPanel() {
		Change_Password.setLayout(null);
		Change_Password.setBounds(0, 0, 500, 350);
		Change_Password.setComponents();
		setContentPane(Change_Password);
	}
	
	
	//METHOD FOR SETTING FORGOT PASSWORD PANEL
	public void setForgotPasswordPanel() {
		Forgot_Password.setLayout(null);
		Forgot_Password.setBounds(0, 0, 500, 350);
		Forgot_Password.setComponents();
		setContentPane(Forgot_Password);
	}
	
	
	//METHOD FOR SETTING FORGOT PASSWORD PANEL
	public void setPasswordForgottenPanel() {
		Password_Forgotten.setLayout(null);
		Password_Forgotten.setBounds(0, 0, 500, 350);
		Password_Forgotten.setComponents();
		setContentPane(Password_Forgotten);
	}
	
	
	
	
	
	/* METHODS FOR DIALOG BOX SETTING
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	/* METHODS FOR SETTING DIALOG BOX FOR CREATE ACCOUNT BUTTON
	 * 
	 * 
	 * 
	 */
	
	
	//METHOD FOR SETTING DIALOG BOX FOR CREATE ACCOUNT BUTTON
	public void setDialogBoxForCreate() {
		DialogBoxForCreate.setLayout(null);
		DialogBoxForCreate.setSize(300, 150);
		DialogBoxForCreate.setLocationRelativeTo(null);
		setMessageInDialogForCreate();
		setLoginInDialogForCreate();
		setOKInDialogForCreate();
		DialogBoxForCreate.setVisible(true);
	}
	
	
	//METHOD FOR SETTING MESSAGE LABEL OF DIALOG BOX FOR CREATE ACCOUNT BUTTON
	public void setMessageInDialogForCreate() {
		LMessageDialogForCreate.setForeground(Color.black);
		LMessageDialogForCreate.setBounds(20, 20, 260, 20);
		LMessageDialogForCreate.setText("Account has Successfully been created !");
		DialogBoxForCreate.add(LMessageDialogForCreate);
	}
	
	
	//METHOD FOR SETTING LOGIN BUTTON OF DIALOG BOX FOR CREATE ACCOUNT BUTTON
	public void setLoginInDialogForCreate() {
		BLoginDialogForCreate.setForeground(Color.black);
    	BLoginDialogForCreate.setBounds(30, 70, 100, 20);
    	DialogBoxForCreate.add(BLoginDialogForCreate);
	}
	
	
	//METHOD FOR SETTING OK BUTTON OF DIALOG BOX FOR CREATE ACCOUNT BUTTON
	public void setOKInDialogForCreate() {
		BOKDialogForCreate.setForeground(Color.black);
		BOKDialogForCreate.setBounds(150, 70, 100, 20);
		DialogBoxForCreate.add(BOKDialogForCreate);
	}
	
	
	
	/* METHODS FOR SETTING DIALOG BOX FOR SAVE DATA BUTTON
	 * 
	 * 
	 * 
	 */
	
	
	//METHOD FOR SETTING DIALOG BOX FOR SAVE DATA BUTTON
	public void setDialogBoxForSave() {
		DialogBoxForSave.setLayout(null);
		DialogBoxForSave.setSize(300, 150);
		DialogBoxForSave.setLocationRelativeTo(null);
		setMessageInDialogForSave();
		setShowInDialogForSave();
		setOKInDialogForSave();
		DialogBoxForSave.setVisible(true);
	}
	
	
	//METHOD FOR SETTING MESSAGE LABEL OF DIALOG BOX FOR SAVE DATA BUTTON
	public void setMessageInDialogForSave() {
		LMessageDialogForSave.setForeground(Color.black);
		LMessageDialogForSave.setBounds(20, 20, 260, 20);
		LMessageDialogForSave.setText("Your data has been successfully saved !");
		DialogBoxForSave.add(LMessageDialogForSave);
	}
		
		
	//METHOD FOR SETTING SAVE BUTTON OF DIALOG BOX FOR SAVE DATA BUTTON
	public void setShowInDialogForSave() {
		BShowDialogForSave.setForeground(Color.black);
		BShowDialogForSave.setBounds(30, 70, 100, 20);
	   	DialogBoxForSave.add(BShowDialogForSave);
	}
		
		
	//METHOD FOR SETTING OK BUTTON OF DIALOG BOX FOR SAVE DATA BUTTON
	public void setOKInDialogForSave() {
		BOKDialogForSave.setForeground(Color.black);
		BOKDialogForSave.setBounds(150, 70, 100, 20);
		DialogBoxForSave.add(BOKDialogForSave);
	}
	
	
	
	
	
	/* METHOD FOR SETTING ACTION
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	private void setAction() {
		//SETTING ACTION ON MENUITEMS
		MI_Create.addActionListener(new ActionHandler());
		MI_Login.addActionListener(new ActionHandler());
		MI_Save.addActionListener(new ActionHandler());
		MI_Show.addActionListener(new ActionHandler());
		MI_ChangePassword.addActionListener(new ActionHandler());
		MI_LogOut.addActionListener(new ActionHandler());
		
		//SETTING ACTION ON BUTTONS
		Create_Acc.BCreate.addActionListener(new ActionHandler());
		Login_Acc.BLogin.addActionListener(new ActionHandler());
		Login_Acc.BForgot.addActionListener(new ActionHandler());
		Save_Data.BSave.addActionListener(new ActionHandler());
		Forgot_Password.BForgot.addActionListener(new ActionHandler());
		Password_Forgotten.BChange.addActionListener(new ActionHandler());
		
		//SETTING ACTION ON BUTTONS WHICH OPENS DIALOG BOX
		BLoginDialogForCreate.addActionListener(new ActionHandler());
		BOKDialogForCreate.addActionListener(new ActionHandler());
		BShowDialogForSave.addActionListener(new ActionHandler());
		BOKDialogForSave.addActionListener(new ActionHandler());
	}
	
	
	
	
	
	/* NESTED CLASS TO HANDLE THE ACTION
	 * THIS CLASS HANDLES THE ACTION PERFORMED ON MEU ITEMS
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	class ActionHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			
			
			
			
			/* METHODS FOR HANDLING ACTION ON MENUITEMS
			 * 
			 * 
			 * 
			 * 
			 * 
			 */
			
			
			
			//ACTION FOR CREATE MENUITEM
			if(e.getSource() == MI_Create) {
				
				//MAKING TEXTFIELD AND PASSWORDFIELD OF CREATE ACCOUNT PANEL EMPTY
				Create_Acc.TName.setText("");
				Create_Acc.PPassword.setText("");
				Create_Acc.TEmail.setText("");
				Create_Acc.LMessage.setText("");
				
				//REMOVING AND SETTING JPANEL
				getContentPane().removeAll();
				setCreateAccountPanel();
			}
			
			//ACTION FOR LOGIN MENUITEM
			if(e.getSource() == MI_Login) {
				
				//MAKING TEXTFIELD AND PASSWORDFIELD OF LOGIN ACCOUNT PANEL EMPTY
				Login_Acc.TName.setText("");
				Login_Acc.PPassword.setText("");
				Login_Acc.LMessage.setText("");
				
				//REMOVING AND SETTING JPANEL
				getContentPane().removeAll();
				setLoginAccountPanel();
			}
			
			//ACTION FOR SAVE MENUITEM
			if(e.getSource() == MI_Save) {

				//MAKING TEXTFIELD AND PASSWORDFIELD OF SAVE DATA PANEL EMPTY
				Save_Data.TPlatform.setText("");
				Save_Data.TUsername.setText("");
				Save_Data.PPassword.setText("");
				Save_Data.LMessage.setText("");
				
				//REMOVING AND SETTING JPANEL
				getContentPane().removeAll();
				setSaveDataPanel();
			}
			
			//ACTION FOR SHOW MENUITEM
			if(e.getSource() == MI_Show) {
				
				//MAKING TEXTFIELD AND PASSWORDFIELD OF SHOW DATA PANEL EMPTY
				Show_Data.TPlatform.setText("");
				Show_Data.LUsername.setText("");
				Show_Data.LPassword.setText("");
				
				//REMOVING AND SETTING JPANEL
				getContentPane().removeAll();
				setShowDataPanel();
			}
			
			//ACTION FOR CHANGE PASSWORD MENUITEM
			if(e.getSource() == MI_ChangePassword) {
				
				//MAKING ALL PASSWORDFIELD OF CHANGE PASSWORD PANEL EMPTY
				Change_Password.POldPassword.setText("");
				Change_Password.PNewPassword.setText("");
				Change_Password.PRetypePassword.setText("");
				Change_Password.LMessage.setText("");
				
				//REMOVING AND SETTING JPANEL
				getContentPane().removeAll();
				setChangePasswordPanel();
			}
			
			if(e.getSource() == MI_LogOut) {
				
				//MAKING TEXTFIELD AND PASSWORDFIELD OF LOGIN ACCOUNT PANEL EMPTY
				Login_Acc.TName.setText("");
				Login_Acc.PPassword.setText("");
				Login_Acc.LMessage.setText("");
				
				//REMOVING MENUITEMS 
  				Menu.removeAll();
  				
  				//ADDING MENUITEMS
  				setLogedOutMenuItems();
				
				//REMOVING AND SETTING JPANEL
				getContentPane().removeAll();
				setLoginAccountPanel();
			}
			
			
			
			
			
			/* METHODS FOR HANDLING ACTION ON BUTTONS
			 * 
			 * 
			 * 
			 * 
			 * 
			 */
			
			
			
			//ACTION FOR LOGIN BUTTON OF LOGIN PANEL
			if(e.getSource() == Create_Acc.BCreate) {
				//DECLARING VALUES TO VARIABLES
				CreateFolderName = Create_Acc.TName.getText();
				CreateEmail = Create_Acc.TEmail.getText();
				CreatePassword = new String(Create_Acc.PPassword.getPassword());
    			
    			//IF ANY TEXTFIELD IS EMPTY THEN THIS PIECE OF CODE WILL RUN
    			if(CreateFolderName.equals("") || CreatePassword.equals("") || CreateEmail.equals("")) {
    				
    				//DISPLAYING UNSUCCESSFULL CREATION OF ACCOUNT IN RED TEXT
    				Create_Acc.LMessage.setText("Plaese fill all fields ! ! !");
    			}

    			/* IF NO TEXTFIELD IS EMPTY THEN THIS PIECE OF CODE WILL RUN
    			 * IT ALSO CREATE A FOLDER AND .TXT FILE INSIDE THAT FOLDER
    			 * FILE WILL STORE THE PASSWORD OF ACCOUNT
    			 */
    			else {
    				//REMOVING ERROR LABEL PLEASE, FILL ALL FIELDS ! ! !
    				Create_Acc.LMessage.setText("");
    				
    				//CREATING A FOLDER WITH METHOD MKDIR()
    				File file = new File("./Account Users/"+CreateFolderName);
    				file.mkdir();
    				
    				//WRITING PASSWORD IN FILE
    				try {
    					writeCreateData();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
    				
    				//DISPLAYING SUCCESSFULL CREATION OF ACCOUNT IN JOPTIONPANE
    				setDialogBoxForCreate();
    			}
			}
			
			
			//ACTION FOR LOGIN BUTTON OF LOGIN PANEL
			if(e.getSource() == Login_Acc.BLogin) {
				
				//DECLARING VALUES TO VARIABLES OF SAVE DATA, SHOW DATA & CHANGE PASSWORD CLASSES
				SaveFolderName = Login_Acc.TName.getText();
				Show_Data.FolderName = Login_Acc.TName.getText();
				Change_Password.FolderName = Login_Acc.TName.getText();
				
		    	//DECLARING VALUES TO VARIABLES
				LoginFolderName = Login_Acc.TName.getText();
				LoginPassword = new String(Login_Acc.PPassword.getPassword());
				
				//CHECKING ALL FIELDS ARE FILLED OR NOT
				if(LoginFolderName.equals("") || LoginPassword.equals("")) {
					
					//IF ALL FIELDS ARE NOT FILLED WIL SHOW AN ERROR
					Login_Acc.LMessage.setText("Plaese fill all fields ! ! !");
				}
				
				else {
					
					//REMOVING ERROR LABEL PLEASE, FILL ALL FIELDS ! ! !
					Login_Acc.LMessage.setText("");
					try {
						//THIS METHOD IS USED TO READ THE DATA FRIOM FILE
						readLoginData();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
			
			
			//ACTION FOR FORGOT PASSWORD BUTTON OF LOGIN ACCOUNT PANEL
			if(e.getSource() == Login_Acc.BForgot) {
				
				//MAKING TEXTFIELD AND PASSWORDFIELD OF LOGIN ACCOUNT PANEL EMPTY
				Forgot_Password.TName.setText("");
				Forgot_Password.TEmail.setText("");
				Forgot_Password.LMessage.setText("");
				
				//REMOVING AND SETTING JPANEL
				getContentPane().removeAll();
				setForgotPasswordPanel();
			}
			
			
			//ACTION FOR SAVE DATA BUTTON OF SAVE DATA PANEL
			if(e.getSource() == Save_Data.BSave) {
	    		
	    		//DECLARING VALUES TO VARIABLES
	    		SavePlatform = Save_Data.TPlatform.getText();
	    		SaveUsername = Save_Data.TUsername.getText();
	    		SavePassword = new String(Save_Data.PPassword.getPassword());
	    	
	    		//IF ANY TEXTFIELD IS EMPTY THEN THIS PIECE OF CODE WILL RUN
	    		if(SavePlatform.equals("") || SaveUsername.equals("") || SavePassword.equals("")) {
	    			Save_Data.LMessage.setText("Plaese fill all fields ! ! !");
	    		}
	    		
	    		//IF NO TEXTFIELD IS EMPTY THEN THIS PIECE OF CODE WILL RUN
	    		else {
	    			
	    			//REMOVING ERROR LABEL PLEASE, FILL ALL FIELDS ! ! !
	    			Save_Data.LMessage.setText("");
	    			
	    			try {
	    				writeSaveData();
	    			} catch (IOException e1) {
	    				// TODO Auto-generated catch block
	    				e1.printStackTrace();
	    			}
	    			setDialogBoxForSave();
	    		}
	    	}
			
			
			//ACTION FOR FORGOT PASSWORD BUTTON OF FORGOT PASSWORD PANEL
			if(e.getSource() == Forgot_Password.BForgot) {
				
				//MAKING TEXTFIELD AND PASSWORDFIELD OF LOGIN ACCOUNT PANEL EMPTY
				Password_Forgotten.PNewPassword.setText("");
  				Password_Forgotten.LMessage.setText("");
				
				//DECLARING VALUES TO VARIABLES
				ForgotFolderName = Forgot_Password.TName.getText();
				ForgotEmail = Forgot_Password.TEmail.getText();
				
				//IF ANY TEXTFIELD IS EMPTY THEN THIS PIECE OF CODE WILL RUN
				if(ForgotFolderName.equals("") || ForgotEmail.equals("") ) {
					Forgot_Password.LMessage.setText("Plaese fill all fields ! ! !");
				}
				
				else {
					
					//REMOVING ERROR LABEL PLEASE, FILL ALL FIELDS ! ! !
					Forgot_Password.LMessage.setText("");
					
					try {
						readForgotData();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
			
			
			//ACTION FOR CHANGE PASSWORD BUTTON OF PASSWORD FORGOTTEN PANEL
			if(e.getSource() == Password_Forgotten.BChange) {
				
				ForgottenPassword = new String(Password_Forgotten.PNewPassword.getPassword());
				
				//MAKING TEXTFIELD AND PASSWORDFIELD OF LOGIN ACCOUNT PANEL EMPTY
				Login_Acc.TName.setText("");
				Login_Acc.PPassword.setText("");
				Login_Acc.LMessage.setText("");
				
				if(ForgottenPassword.equals("")) {
					Password_Forgotten.LMessage.setText("Plaese fill all fields ! ! !");
				}
				
				else {
					
					//REMOVING ERROR LABEL PLEASE, FILL ALL FIELDS ! ! !
					Password_Forgotten.LMessage.setText("");
					
					try {
						readForgottenData();
						writeForgottenData();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					//DISPLAYING A INFORMATION MESSAGE ON PASSWORD CHANGE VIA FORGOT PASSWORD
					JOptionPane.showMessageDialog(Password_Forgotten, "Your Password has been Succesfully Changed !", "Information Message", JOptionPane.INFORMATION_MESSAGE);
				    
					//REMOVING AND SETTING JPANEL
					getContentPane().removeAll();
					setLoginAccountPanel();
				}
			}
			
			
			
			//ACTION FOR LOGIN BUTTON OF DIALOG BOX FOR CREATE ACCOUNT BUTTON
			if(e.getSource() == BLoginDialogForCreate) {
				
				//MAKING TEXTFIELD AND PASSWORDFIELD OF LOGIN ACCOUNT PANEL EMPTY
				Login_Acc.TName.setText("");
				Login_Acc.PPassword.setText("");
				Login_Acc.LMessage.setText("");
				
				//REMOVING AND SETTING JPANEL
				DialogBoxForCreate.setVisible(false);
				getContentPane().removeAll();
				setLoginAccountPanel();
			}
			
			
			//ACTION FOR OK BUTTON OF DIALOG BOX FOR CREATE ACCOUNT BUTTON
			if(e.getSource() == BOKDialogForCreate) {
				
				//MAKING TEXTFIELD AND PASSWORDFIELD OF CREATE ACCOUNT PANEL EMPTY
				Create_Acc.TName.setText("");
				Create_Acc.PPassword.setText("");
				Create_Acc.TEmail.setText("");
				Create_Acc.LMessage.setText("");
				
				//REMOVING AND SETTING JPANEL
				DialogBoxForCreate.setVisible(false);
				getContentPane().removeAll();
				setCreateAccountPanel();
			}
			
			
			//ACTION FOR SHOW BUTTON OF DIALOG BOX FOR SAVE DATA BUTTON
			if(e.getSource() == BShowDialogForSave) {
				
				//MAKING TEXTFIELD AND PASSWORDFIELD OF SHOW DATA PANEL EMPTY
				Show_Data.TPlatform.setText("");
				Show_Data.LUsername.setText("");
				Show_Data.LPassword.setText("");
				
				//REMOVING AND SETTING JPANEL
				DialogBoxForSave.setVisible(false);
				getContentPane().removeAll();
				setShowDataPanel();
			}
			
			
			//ACTION FOR OK BUTTON OF DIALOG BOX FOR SAVE DATA BUTTON
			if(e.getSource() == BOKDialogForSave) {
				
				//MAKING TEXTFIELD AND PASSWORDFIELD OF SAVE DATA PANEL EMPTY
				Save_Data.TPlatform.setText("");
				Save_Data.TUsername.setText("");
				Save_Data.PPassword.setText("");
				Save_Data.LMessage.setText("");
				
				//REMOVING AND SETTING JPANEL
				DialogBoxForSave.setVisible(false);
				getContentPane().removeAll();
				setSaveDataPanel();
			}
		}
	}
	
	
	
	
	
	/* METHODS FOR READING AND WRITING DATA
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	//METHOD FOR WRITING DATA TO THE FILE
    public void writeCreateData() throws IOException {
		FileWriter FW = new FileWriter("./Account Users/"+CreateFolderName+"/.txt");
		BufferedWriter BFWriter = new BufferedWriter(FW);
		BFWriter.write(CreatePassword);
		BFWriter.newLine();
		BFWriter.write(CreateEmail);
		BFWriter.close();
	}
    
    
    //METHOD FOR WRITING DATA TO THE FILE
    public void writeSaveData() throws IOException {
		FileWriter FW = new FileWriter("./Account Users/"+SaveFolderName+"/"+SavePlatform+".txt");
		BufferedWriter BFWriter = new BufferedWriter(FW);
		BFWriter.write("Email/Username: "+SaveUsername);
		BFWriter.newLine();
		BFWriter.write("Password: "+SavePassword);
		BFWriter.close();
	}
    
    
    //METHOD FOR WRITING DATA TO THE FILE
    public void writeForgottenData() throws IOException {
    	
		//SETTING PATH FOR WRITTING DATA TO THE FILE
		FileWriter FW = new FileWriter("./Account Users/"+ForgotFolderName+"/.txt");
		BufferedWriter BFWriter = new BufferedWriter(FW);
		
		//WRITTING DATA TO THE FILE
		BFWriter.write(ForgottenPassword);
		BFWriter.newLine();
		BFWriter.write(readForgottenEmail);
		BFWriter.close();
    }
	
	
	
    //METHOD FOR RADING DATA FROM FILE
  	public void readLoginData() throws IOException { 		
  		/* THIS TRY-CATCH BLOCK IS FOR FILE NOT FOUND EXCEPTION
  		 * 
  		 * IF FILE IS FOUND THEN TRY BLOCK WILL RUN AND DISPLAY DESIRED OUTPUT
  		 * IF FILE IS NOT FOUND THEN CATCH BLOCK WILL RUN AND DISPLAY AN ERROR
  		 */
  		try {
  			FileReader FR = new FileReader("./Account Users/"+LoginFolderName+"/.txt");
  			BufferedReader BFReader = new BufferedReader(FR);
  			
  			//READ THE DATA FROM A FILE AND STORE IN A VARIABLE
  			readPassword = BFReader.readLine();
  			
  			//CHECKING IF PASSWORD IS CORRECT THEN ACCOUNT WILL BE OPEN
  			if(LoginPassword.equals(readPassword)) {
  				
  				//REMOVING MENUITEMS 
  				Menu.removeAll();
  				
  				//ADDING MENUITEMS
  				setLogedInMenuItems();
  				
				//MAKING TEXTFIELD AND PASSWORDFIELD OF SAVE DATA PANEL EMPTY
				Save_Data.TPlatform.setText("");
				Save_Data.TUsername.setText("");
				Save_Data.PPassword.setText("");
				Save_Data.LMessage.setText("");
  				
  				//REMOVING AND SETTING JPANEL
  				getContentPane().removeAll();
				setSaveDataPanel();
			}
  			
  			//THIS ELSE BLOCK WILL PRINT AN ERROR IF PASSWORD IS INCORRECT
			else
				JOptionPane.showMessageDialog(this, "Incorrect or Invalid Password ! ! !", "ERROR !", JOptionPane.ERROR_MESSAGE);
  			
  		} catch(FileNotFoundException e) {
  			
  			//PRINTING AN ERROR FOR FILE NOT FOUND EXCEPTION
  			JOptionPane.showMessageDialog(this, "Account is not created or Invalid Account Name ! ! !", "ERROR !", JOptionPane.ERROR_MESSAGE);
  		}
  	}
  	
    //METHOD FOR RADING DATA FROM FILE
  	public void readForgotData() throws IOException {
  		
  		/* THIS TRY-CATCH BLOCK IS FOR FILE NOT FOUND EXCEPTION
  		 * 
  		 * IF FILE IS FOUND THEN TRY BLOCK WILL RUN AND DISPLAY DESIRED OUTPUT
  		 * IF FILE IS NOT FOUND THEN CATCH BLOCK WILL RUN AND DISPLAY AN ERROR
  		 */
  		try {
  			FileReader FR = new FileReader("./Account Users/"+ForgotFolderName+"/.txt");
  			BufferedReader BFReader = new BufferedReader(FR);
  			
  			//READING EMAIL FROM FILE
  			String Line;
  			while((Line = BFReader.readLine())!= null) {
  				readEmail = Line;
  			}
  			
  			/* CHECKING THAT ENTERED EMAIL IS CORRECT OR NOT
  			 * 
  			 * IF ENTERED EMAIL IS CORRECT THEN THIS PIECE OF CODE WILL RUN
  			 */
  			if(ForgotEmail.equals(readEmail)) {
  				
				//MAKING TEXTFIELD AND PASSWORDFIELD OF PASSWORD FORGOTTEN PANEL EMPTY
  				Password_Forgotten.PNewPassword.setText("");
  				Password_Forgotten.LMessage.setText("");
				
  				
  			    //REMOVING AND SETTING JPANEL
				getContentPane().removeAll();
				setPasswordForgottenPanel();
  			}
  			
  			//IF ENTERED EMAIL IS NOT CORRECT THEN THIS PIECE OF CODE WILL RUN
  			else {
  				JOptionPane.showMessageDialog(this, "Incorrect or Invalid Email ! ! !", "ERROR !", JOptionPane.ERROR_MESSAGE);
  			}
  				
  		} catch(FileNotFoundException e) {
  			JOptionPane.showMessageDialog(this, "Account is not created or Invalid Account Name ! ! !", "ERROR !", JOptionPane.ERROR_MESSAGE);
  		}
  		
  	}
  	
  	
    //METHOD FOR RADING DATA FROM FILE
  	public void readForgottenData() throws IOException {
  		
		//SETTING PATH FOR READING DATA FROM THE FILE
		FileReader FR = new FileReader("./Account Users/"+ForgotFolderName+"/.txt");
		BufferedReader BFReader = new BufferedReader(FR);
		
		//READING EMAIL FROM FILE
		String Line;
		while((Line = BFReader.readLine())!= null) {
			readForgottenEmail = Line;
		}
		BFReader.close();
  	}
}


//MAIN CLASS CONTANING MAIN METHOD
public class MainClass {
	public static void main(String []args) {
		new MainFrame().setVisible(true);
	}
}