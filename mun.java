import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class choice extends JFrame implements ActionListener
{
	
 
  JButton b2=new JButton("REGISTER COMPLAIN");
  JButton b3=new JButton("CHECK STATUS");
  JLabel l8=new JLabel("WELCOME TO M.U.N");
  public void actionPerformed(ActionEvent ae)
	{ 
		if(ae.getSource()==b2)
		{
	frontend ob=new frontend();
	ob.setSize(800,650);
 	ob.setVisible(true);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
if(ae.getSource()==b3)
{
	frontendcheck ob=new frontendcheck();
	ob.setSize(600,400);
 	ob.setVisible(true);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
choice()
{ setLayout(null);
  l8.setBounds(210,5,350,100);
  b2.setBounds(100,130,170,50);
  b3.setBounds(295,130,130,50);
 add(l8);
b2.addActionListener(this);
b3.addActionListener(this);
add(b2);
add(b3);
}
}
class mun{
public static void main(String arg[])
{
choice fe=new choice();
fe.setSize(600,300);
fe.setVisible(true);
fe.setTitle("Muncipal Utility Network");
fe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}