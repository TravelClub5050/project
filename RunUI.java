import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class RunUI implements ActionListener 
{

	public static void main(String[] args) 
   {
		new RunUI();
	}
	
	private JFrame frame;
   private JLabel aLabel,bLabel,cLabel,dLabel, eLabel, fLabel, descriptionLabel, fullnameLabel, passwordLabel;
	private JButton aboutButton, newButton, helpButton, registerButton, loginButton, exitButton;
   private JTextField aField, bField, cField, dField, eField, fField, fullnameField, passwordField;
   private JCheckBox male, female;
   
		

   
   
	public RunUI()
	{
      exitButton = new JButton("Exit");
		aboutButton = new JButton("About");
      registerButton = new JButton("Register");
		helpButton = new JButton("Help");
      newButton = new JButton("New User");
      loginButton = new JButton("Login");
      aLabel = new JLabel("     First Name:");
      bLabel = new JLabel("     Last Name:");
      cLabel = new JLabel("     Email address:");
      dLabel = new JLabel("     Credit card number:              ");
      eLabel = new JLabel("     Nationality:              ");
      fLabel = new JLabel("     Gender:              ");
      fullnameLabel = new JLabel("Username:");
      passwordLabel = new JLabel("Password:");
      descriptionLabel = new JLabel("Welcome to Travel 5050. The best travel agency with a number in it's name");
      male = new JCheckBox("Male");
      female = new JCheckBox("Female");
      aField = new JTextField(2);
      bField = new JTextField(2);
      cField = new JTextField(2);
      dField = new JTextField(2);
      eField = new JTextField(2);
      fField = new JTextField(2);
      fullnameField = new JTextField(10);
      //passwordField = new JTextField(10);
      JPasswordField passwordField = new JPasswordField(10);
      passwordField.setEchoChar('*');
      
		aboutButton.addActionListener(this); // add actionListener
		helpButton.addActionListener(this);
      newButton.addActionListener(this);
      registerButton.addActionListener(this);
      loginButton.addActionListener(this);
      exitButton.addActionListener(this);
      passwordField.addActionListener(this);	
      

      
      JPanel buttons = new JPanel();		
      buttons.add(newButton);
      buttons.add(aboutButton);
		buttons.add(helpButton);
      buttons.add(exitButton);
      JPanel descriptionPanel = new JPanel();
      descriptionPanel.add(descriptionLabel);
      JPanel loginPanel = new JPanel();
      JPanel loginPanel1 = new JPanel();
      JPanel loginPanel2 = new JPanel();
      loginPanel1.add(fullnameLabel);
      loginPanel2.add(passwordLabel);
      loginPanel1.add(fullnameField);
      loginPanel2.add(passwordField);
      loginPanel.add(loginPanel1);
      loginPanel.add(loginPanel2);
      loginPanel.add(loginButton);
      
		
		final JFrame frame = new JFrame("TRAVEL 5050");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLayout(new BorderLayout()); //Border layout on frame.
      frame.add(buttons, BorderLayout.SOUTH);
      frame.add(loginPanel, BorderLayout.CENTER);
      frame.add(descriptionPanel, BorderLayout.NORTH);
		frame.pack(); //sets frames size depending on components in it.
      frame.setSize(1000, 200); // sets frame size
      frame.setLocationRelativeTo(null); //centers on screen
		frame.setVisible(true); //make frame visible.
      }
   
  	public void actionPerformed(ActionEvent event){
   		
		if (event.getSource() == aboutButton)
		{
			JOptionPane.showMessageDialog(null, "We are the company that will ROCK YOUR SOCKS OFF");         
		}
      
      if (event.getSource() == helpButton)
		{
			JOptionPane.showMessageDialog(null, "Welcome to the Help screen.\nWe currently don't offer any help.\nBecause we hate you.\n:)");
		}
      
      if (event.getSource() == exitButton)
		{
			System.exit(0);
		}
      
      if (event.getSource() == newButton)
		{
	   JFrame newframe = new JFrame();
      newframe.setLayout(new BorderLayout());
      JPanel left = new JPanel();
      left.setLayout(new GridLayout(10,1));
      left.add(aLabel);
      left.add(bLabel);
      left.add(cLabel);
      left.add(dLabel);
      left.add(eLabel);
      left.add(fLabel);     
      newframe.add(left, BorderLayout.WEST);
      JPanel right = new JPanel();
      right.setLayout(new GridLayout(10,1));
      right.add(aField);
      right.add(bField);
      right.add(cField);
      right.add(dField);
      right.add(eField); 
      //right.add(fField);
      JPanel genderPanel = new JPanel ();
      genderPanel.add(male);
      genderPanel.add(female);
      right.add(genderPanel);    
      newframe.add(right, BorderLayout.CENTER);
      JPanel bottom = new JPanel ();
      bottom.setLayout (new FlowLayout());
      bottom.add(registerButton);
      newframe.add(bottom, BorderLayout.SOUTH);
      
      newframe.pack(); //sets frames size depending on components in it.
      newframe.setSize(600, 400); // sets frame size
      newframe.setLocationRelativeTo(null); //centers on screen
      newframe.setVisible(true);
      }
      
      if (event.getSource() == registerButton) {
		JOptionPane.showMessageDialog(null, "Thank you for registering"); 
      }
      
      if (event.getSource() == loginButton) 
      {
		JFrame newframe = new JFrame();
      newframe.setLayout(new BorderLayout());
      JPanel left = new JPanel();
      left.setLayout(new GridLayout(10,1));
      left.add(aLabel);
      left.add(bLabel);
      left.add(cLabel);
      left.add(dLabel);     
      newframe.add(left, BorderLayout.WEST);
      JPanel right = new JPanel();
      right.setLayout(new GridLayout(10,1));
      right.add(aField);
      right.add(bField);
      right.add(cField);
      right.add(dField);     
      newframe.add(right, BorderLayout.CENTER);
      JPanel bottom = new JPanel ();
      bottom.setLayout (new FlowLayout());
      bottom.add(registerButton);
      newframe.add(bottom, BorderLayout.SOUTH);
      
      newframe.pack(); //sets frames size depending on components in it.
      newframe.setSize(600, 400); // sets frame size
      newframe.setLocationRelativeTo(null); //centers on screen
      newframe.setVisible(true); 
      
      }
      
            

      
 }     
}

