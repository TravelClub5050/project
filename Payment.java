import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class Payment implements ActionListener
{
   public static void main(String[] args)
   {
		new Payment();
   }
   
   JFrame frame;
	JTextField txtField;
   JTextField txt1Field;
   JTextField txt2Field;
	JButton btn;
   JButton btn1;   
	
   
   public Payment()
   {
      txtField = new JTextField(40);
		txt1Field = new JTextField(40);
      txt2Field = new JTextField(40);
		btn = new JButton("Cancel");
      btn1 = new JButton("Pay");
      
      
      btn.addActionListener(this);
      btn1.addActionListener(this);
      
      JPanel north = new JPanel(new GridLayout(3, 2)); //panel with gridlayout to go into north section of frames borderlayout.
		north.add(new JLabel("Type your credit card number:"));
		north.add(txtField);
		north.add(new JLabel("Security number:"));
		north.add(txt1Field);
      north.add(new JLabel("Owner name:"));
		north.add(txt2Field);
      
      JPanel south = new JPanel(new GridLayout(1,2));
      south.add(btn);
      south.add(btn1);
      
      frame = new JFrame("Payment");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout()); //Borderlayout on frame.
		frame.add(north, BorderLayout.NORTH); //previously built panel in north section of frames borderlayout.
      frame.add(south, BorderLayout.SOUTH); //button in south section.
		frame.pack(); //sets frames size depending on components in it.
		frame.setVisible(true); //make frame visible
   }
   
   public void actionPerformed(ActionEvent event)
   {
      if (event.getSource() == btn)
      {
         //code to return to screen 2
      }
      
      else if (event.getSource() == btn1)
      {
         JOptionPane.showMessageDialog(btn1,"Thank you for payment, you will recive message with confirmation of succesfull payment.");
      }
   }
}
