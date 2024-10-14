import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class head extends JFrame
{	private JPanel p1,p2,p3;
	private JButton b1,b2,b3;
	private JLabel l1,l2,l3;
	private JRadioButton r1,r2;
	private JTabbedPane tb;
                private JTable jc,js;
	String coms=" ",cid=" ",add=" ";

try
	{
Connection con=DriverManager.getConnection("jdbc:mysql://xxxx.xxxx.xxxx.xxxx/comp");
String query=" ";
PreparedStatement pstm=con.prepareStatement(query);
ResultSet rs = pstm.executeQuery();
	while(rs.next())
		{
		 com[i]=rs.getString("comp");
		 cid=rs.getString("cid");
		add=rs.getstring("ad");
		}
 
	}
catch(exception ea){}



head()
	{ 
	setSize(800,700);
	setTitle("Local Head");
		JPanel topPanel = new JPanel();
		topPanel.setLayout( new BorderLayout() );
		getContentPane().add( topPanel );
		home();
		pending();
		solved();
		tb = new JTabbedPane();
		tb.addTab( "Home", p1 );
		tb.addTab( "Pending", p2 );
		tb.addTab( "Solved", p3 );
		topPanel.add( tb, BorderLayout.CENTER );
	}
public void home()
	{	p1 = new JPanel();
		p1.setLayout(new BorderLayout());
               
	}
public void pending()
	{	p2 = new JPanel();
		p2.setLayout(new BorderLayout());
                JPanel bt=new JPanel();
                String column[]={"Complaints","C-id","solved","Details"};
                String data[][]= { {com,cid,"ek_raoio_button",ad}};
                jc=new JTable(data,column);  
                jc.setBounds(30,40,200,300);  
                JScrollPane sp=new JScrollPane(jc);  
                p2.add(sp);  
                b1= new JButton("save");
                b2= new JButton("print");
                b1.setBounds(750,650, 50, 50);
                b2.setBounds(760,660, 50, 50);
                p2.add(bt,BorderLayout.AFTER_LAST_LINE);
                
                bt.add(b2);
                bt.add(b1);
	}
public void solved()
	{	p3 = new JPanel();
		p3.setLayout(new BorderLayout());
                JPanel bp=new JPanel();
                String column[]={"Complaints","C-id","date","details"};
                String data[][]= { {"asdx","c-123","23-07-16","bla bla bla"}};
                js=new JTable(data,column);  
                js.setBounds(30,40,200,300);  
                JScrollPane ss=new JScrollPane(js);  
                p3.add(ss);
                b3=new JButton("print");
                b3.setBounds(750,650,50,50);
                p3.add(bp,BorderLayout.AFTER_LAST_LINE);
                bp.add(b3);
	}

public static void main(String arg[])
	{ head h=new head();
	  h.setVisible( true );
h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

} 