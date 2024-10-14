import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
 class frontendcheck extends JFrame implements ActionListener
	{
	
 
  JButton b2=new JButton("CANCEL");
  JButton b3=new JButton("RESET");
  JButton b4=new JButton("CHECK STATUS");
 
  JLabel l6=new JLabel("COMPLAIN ENQUIRY");
  JLabel l7=new  JLabel("COMPLAIN I.D");
  JLabel l8=new JLabel("WELCOME TO M.U.N");
  JTextField t6=new JTextField();

public void actionPerformed(ActionEvent ae)
	{ 
		if(ae.getSource()==b4)
		{
                   		  }
if(ae.getSource()==b2)
{
this.setVisible(false);	
}
if(ae.getSource()==b3)
{
t6.setText(null);
}
}
 frontendcheck()
{ setLayout(null);
  l6.setBounds(230,35,150,50);
  l7.setBounds(95,120,100,50);
  l8.setBounds(250,5,350,100);
  t6.setBounds(200,126,80,30);
  b4.setBounds(78,200,135,50);
  b3.setBounds(220,200,100,50);
  b2.setBounds(325,200,100,50);

 add(l6);
 add(l7);
 //add(l8);
 add(t6);

b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
 add(b2);
 add(b3);
 add(b4);
}

}
class check{
public static void main(String arg[])
{
frontendcheck fe=new frontendcheck();
fe.setSize(600,400);
fe.setVisible(true);
fe.setTitle("Muncipal Utility Network");
fe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}