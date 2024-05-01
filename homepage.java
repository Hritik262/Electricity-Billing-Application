package Electricity;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class homepage extends JFrame implements ActionListener
{
    JLabel l1;
    homepage()
    {
        //title set............
		super("Electricity billing system");
		setSize(1600,690);
		
		//screen background image set............
                
		ImageIcon i2=new ImageIcon("home.jpg");
		Image i3=i2.getImage().getScaledInstance(1600,690,Image.SCALE_DEFAULT);
		ImageIcon icc=new ImageIcon(i3);
		l1=new JLabel(icc);
		add(l1);

		//=====================================================================
		//first column
		JMenuBar mb=new JMenuBar();
		JMenu master=new JMenu("Master");
		JMenuItem mi1=new JMenuItem("New Customer");
		JMenuItem mi2=new JMenuItem("Customer Details");
		master.setForeground(Color.BLUE);

		//NewCustomer details............

		Font f=new Font("monospaced",Font.PLAIN,16);
		mi1.setFont(f);
		ImageIcon img_mi1=new ImageIcon("men1.png");
		Image image_mi1=img_mi1.getImage().getScaledInstance(16,20,Image.SCALE_DEFAULT);
		mi1.setIcon(new ImageIcon(image_mi1));
		mi1.setMnemonic('D');
		mi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
		mi1.setBackground(Color.WHITE);

		//Customer details............

		mi2.setFont(f);
		ImageIcon img_mi2=new ImageIcon("screen.png");
		Image image_mi2=img_mi2.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
		mi2.setIcon(new ImageIcon(image_mi2));
		mi2.setMnemonic('M');
		mi2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
		mi2.setBackground(Color.WHITE);



		mi1.addActionListener(this);
		mi2.addActionListener(this);

		//=====================================================================

		//second column

		JMenu user=new JMenu("User");
		JMenuItem ui1=new JMenuItem("Pay Bill");

		//pay bill details..............

		ui1.setFont(f);
		ImageIcon img_ui1=new ImageIcon("details.png");
		Image image_ui1=img_ui1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
		ui1.setIcon(new ImageIcon(image_ui1));
		ui1.setMnemonic('P');
		ui1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
		ui1.setBackground(Color.WHITE);



		ui1.addActionListener(this);

		//=====================================================================

		//third column

		JMenu report=new JMenu("Report");
		JMenuItem r1=new JMenuItem("Generate Bill");

		//Generate Bill Details.................

		r1.setFont(f);
		ImageIcon img_r1=new ImageIcon("generate.png");
		Image image_r1=img_r1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
		r1.setIcon(new ImageIcon(image_r1));
		r1.setMnemonic('R');
		r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,ActionEvent.CTRL_MASK));
		r1.setBackground(Color.WHITE);

		r1.addActionListener(this);



		//fifth column
		JMenu exit=new JMenu("Exit");
		JMenuItem ex=new JMenuItem("Exit");

		//exit details....................

		ex.setFont(f);
		ImageIcon img_ex=new ImageIcon("Electricity/icons/cancle.png");
		Image image_ex=img_ex.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
		ex.setIcon(new ImageIcon(image_ex));
		ex.setMnemonic('Z');
		ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,ActionEvent.CTRL_MASK));
		ex.setBackground(Color.WHITE);

		ex.addActionListener(this);

		//add menu...........

		master.add(mi1);
		master.add(mi2);
		//master.add(mi3);

		user.add(ui1);
		report.add(r1);


		exit.add(ex);

		mb.add(master);
		mb.add(user);
		mb.add(report);

		mb.add(exit);

		setJMenuBar(mb);

		setFont(new Font("Senserif",Font.BOLD,16));
		setLayout(new FlowLayout());
					setVisible(false);
    }
	public void actionPerformed(ActionEvent ev)
	{
		String msg=ev.getActionCommand();
		if(msg.equals("New Customer"))
		{
			new new_customer().setVisible(true);
		}
		else if(msg.equals("Customer Details"))
		{
			new customer_details().setVisible(true);
		}
		else if(msg.equals("Pay Bill"))
		{
			new pay_bill().setVisible(true);
		}
		else if(msg.equals("Generate Bill"))
		{
			new generate_bill().setVisible(true);
		}
		else if(msg.equals("Exit"))
		{
			System.exit(0);
		}
		else
		{
			System.out.println("wrong");
		}
	}
	public static void main(String args[])
	{
            new homepage().setVisible(true);
	}
}
