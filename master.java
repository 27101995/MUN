import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.sql.*;
import java.net.*;
import java.io.*;
 class masterframe extends JFrame implements ActionListener
	{
	String name,add,com,land,cid,status,adhar,nm,adh,ad,foo="null";
 
  JButton b1=new JButton("allow");
  
  JLabel l=new JLabel("MASTER SERVER");
  
public void actionPerformed(ActionEvent ae)
	{ 
		
if(ae.getSource()==b1)
{
try
	{
	ServerSocket ss=new ServerSocket(3333);
	Socket s=ss.accept();
	DataInputStream din=new DataInputStream(s.getInputStream());
	DataOutputStream dout=new DataOutputStream(s.getOutputStream());
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	
	nm=din.readUTF();
	ad=din.readUTF();
	land=din.readUTF();
	adh=din.readUTF();

	com=din.readUTF();
	status=din.readUTF();
	
	
	
	System.out.println("client says:" +name +"<=naam"+add +"<=address"+adhar);
	
	String str="i124Q";
	dout.writeUTF(str);
	dout.flush();
	cid=din.readUTF();	
	dout.flush();	
	din.close();
	s.close();
	ss.close();

	}
catch(Exception e){}
try	
	{
	Connection mm= DriverManager.getConnection("jdbc:mysql://192.168.27.24:3306/gov");
	String queryy="select NAME from user where NAME="+nm+" and AADHAR="+adh;
	PreparedStatement stmt=mm.prepareStatement(queryy);
	ResultSet rs = stmt.executeQuery();
	while(rs.next())
		{
		nm=rs.getString("name");
	        }
	mm.close();
	}
	catch(Exception e){}

if(nm.equals(foo))
	{
	JOptionPane.showMessageDialog(null,"request could not be completed");
	}
else
{

try
	{
	Class.forName("com.mysql.jdbc.driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://192.168.26.186:3307/complaint");
	String query="insert into complaint values (?,?,?,?,?,?)";
	PreparedStatement ob=con.prepareStatement(query);
	ob.setString(1,name);
	ob.setString(2,add);
	ob.setString(3,land);
	ob.setString(4,adh);
	ob.setString(5,com);
	ob.setString(6,status);
	int rs=ob.executeUpdate();
		if(rs!=0)
			{
			System.out.print("success");
			}
		else
			{
			System.out.print("error");
			}
	con.close();
	}
	catch(Exception eu){}
}
}
}

 masterframe()
	{ 
	setLayout(null);
 	l.setBounds(230,35,150,50);
 	b1.setBounds(325,200,100,50);
 	add(l);
 
	b1.addActionListener(this);
 	add(b1);
	}
}


class master
{
	public static void main(String arg[])
	{
	masterframe fe=new masterframe();
	fe.setSize(600,400);
	fe.setVisible(true);
	fe.setTitle("Muncipal Utility Network");
	fe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}