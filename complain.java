import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
class frontend extends JFrame implements ActionListener
	{
 String foo="",str;
 JButton b1=new JButton("SUBMIT");
 JButton b2=new JButton("CANCEL");
 JButton b3=new JButton("RESET");
 JLabel l1=new JLabel("NAME");
 JLabel l2=new JLabel("ADDRESS");
 JLabel l3=new JLabel("LANDMARK");
 JLabel l4=new JLabel("AADHAR NO.");
 JLabel l5=new JLabel("COMPLAINT");
  JLabel l8=new JLabel("WELCOME TO M.U.N");
 JTextField t1=new JTextField();
 JTextField t2=new JTextField();
 JTextField t3=new JTextField();
 JTextField t4=new JTextField();
 JTextField t5=new JTextField();
//JTextField t6=new JTextField();

public void actionPerformed(ActionEvent ae)
	{ 
		if(ae.getSource()==b1)
			{
		 if((t1.getText().equals(foo))||(t2.getText().equals(foo))||(t3.getText().equals(foo))||(t4.getText().equals(foo))||(t5.getText().equals(foo)))
			{ JOptionPane.showMessageDialog(null,"PLEASE FILL THE MANDATORY FIELDS!");
}		   else
{ 
try{	Socket s=new Socket("192.168.27.151",3333);
DataInputStream din=new DataInputStream(s.getInputStream());
	DataOutputStream dout=new DataOutputStream(s.getOutputStream());
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	String str1="",str2="";

		 str1=t1.getText();
		 str2=t2.getText();
		//String str3=t3.getText();
		String str4=t4.getText();
		//String str5=t5.getText();
		dout.writeUTF(str1);
dout.flush();

		dout.writeUTF(str2);

dout.flush();		//dout.writeUTF(str3);
		dout.writeUTF(str4);
	dout.flush();
	//java dout.writeUTF(str5);
//		dout.flush();
		str=din.readUTF();
		//System.out.println("Server says: "+str);
//		}

	dout.close();
	s.close();
	}catch(Exception e){}
	if(str.equals(foo)) 
	{}
	else
	{
		String text="ABCDEFGHabcdefgh0123456";
                  		   Random r=new Random();
		   String pwd="";
		   for(int i=1;i<=5;i++){
                   		   int index=r.nextInt(text.length());
                 		   pwd=pwd+text.charAt(index);
                   		  	  }
                                                    JOptionPane.showMessageDialog(null,"Thank you! Mr."+t1.getText()+" Your complain ID is  ' "+pwd+" ' Please note this ID for further references.");
			}	
	
	                              //  this.setVisible(false);	 		
		







	

}}
if(ae.getSource()==b2)
{
this.setVisible(false);	
}
if(ae.getSource()==b3)
{
t1.setText(null);
t2.setText(null);
t3.setText(null);
t4.setText(null);
t5.setText(null);
//t6.setText(null);
}
//if(ae.getSource()==b4)
{

}


	}
 frontend()
{ setLayout(null);

  l1.setBounds(50,100,100,50);
  l2.setBounds(50,150,100,50);
  l3.setBounds(50,200,100,50);
  l4.setBounds(50,250,100,50);
  l5.setBounds(50,300,100,50);
  //l6.setBounds(535,100,150,50);
  //l7.setBounds(500,140,100,50);
  l8.setBounds(350,5,350,100);
  t1.setBounds(150,100,150,35); 
  t2.setBounds(150,150,150,35);
  t3.setBounds(150,200,150,35);
  t4.setBounds(150,250,150,35);
  t5.setBounds(150,300,400,58);
  //t6.setBounds(600,150,80,30);
  b1.setBounds(100,400,100,50);
  b3.setBounds(220,400,100,50);
  b2.setBounds(350,400,100,50);
 // b4.setBounds(525,200,150,50);

 add(l1);
 add(l2);
 add(l3);
 add(l4);
 add(l5);
 //add(l6);
 //add(l7);
 add(l8);
 add(t1);
 add(t2);
 add(t3);
 add(t4);
 add(t5);
 //add(t6);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
//b4.addActionListener(this);
 add(b1);
 add(b2);
 add(b3);
 //add(b4);
}

}
public class complain{
public static void main(String arg[])
{
frontend fe=new frontend();
fe.setSize(800,650);
fe.setVisible(true);
fe.setTitle("Muncipal Utility Network");
fe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}