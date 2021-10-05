import java.awt.*;          //In-Built Packages and sub-packages
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;
import java.io.FileWriter;


class pageone extends JFrame implements ActionListener 
 {
	
    JLabel l1, l2, l3, l4, l5,l6, bg;
    
	Font fn, fn1,fn2;
	
    JTextField tf1, tf2, tf3, tf4;
	
	JPasswordField password;
	
	JButton b1,b2;
    
	ImageIcon img;
	
	JCheckBox cb;
	
    pageone()                                          // Constructor
	{
        setTitle("BOOKIFY");                               // set Title
		
        img = new ImageIcon("Images/Mainbg.jpg");       //background-image

        bg = new JLabel("", img, JLabel.CENTER);        //BG-image set size
        bg.setBounds(0, 0, 1366, 768);

        
        fn = new Font("Times New Roman", Font.PLAIN, 20);   //font styles
        fn1 = new Font("Centeria Script", Font.BOLD, 45);
        fn2 = new Font("Times New Roman", Font.PLAIN, 17);
		
		l1 = new JLabel();
        l1.setText("Name :");
        l1.setBounds(860, 170, 250, 40);
        l1.setFont(fn);
        		
		l2 = new JLabel();
        l2.setText("Email :");
        l2.setBounds(860, 240, 250, 40);
        l2.setFont(fn);
		
		l3 = new JLabel();
        l3.setText("Username :");
        l3.setBounds(830, 310, 250, 40);
        l3.setFont(fn);
		
		l4 = new JLabel();
        l4.setText("Password :");
        l4.setBounds(830, 380, 250, 40);
        l4.setFont(fn);
		
		l5 = new JLabel();
        l5.setText("Confirm Password :");
        l5.setBounds(760, 445,250, 40);
        l5.setFont(fn);
				
	    l6 = new JLabel();
        l6.setText(" WELCOME TO BOOKIFY ");
        l6.setBounds(750, 20, 900, 100);
        l6.setFont(fn1);
		
        tf1 = new JTextField();
        tf1.setBounds(950, 170, 250, 35);
        tf1.setFont(fn);
		
		tf2 = new JTextField();
        tf2.setBounds(950, 240, 250, 35);
        tf2.setFont(fn);
		
		tf3 = new JTextField();
        tf3.setBounds(950, 310, 250, 35);
        tf3.setFont(fn);
		
		tf4 = new JTextField();
        tf4.setBounds(950,450, 250, 35);
        tf4.setFont(fn);
		
		b1 = new JButton("Login");
        b1.setBounds(850,540,120,30);
        b1.setFont(fn2);
		
        b2 = new JButton("Exit");
        b2.setBounds(1050,540,120,30);
		b2.setFont(fn2);
		
		cb=new JCheckBox("show password");
		cb.setBounds(950,490,200,30);
		cb.setFont(fn2);
		
		password =new JPasswordField();
		password.setBounds(950, 380, 250, 35);
		password.setFont(fn);
		
		bg.add(l1);
        bg.add(l2);
        bg.add(l3);
        bg.add(l4);
        bg.add(l5);
		bg.add(l6);
        
        bg.add(tf1);
        bg.add(tf2);
        bg.add(tf3);
		bg.add(tf4);
        
		add(bg);
		
		bg.add(b1);
		bg.add(b2);
		
		bg.add(cb);
		
		bg.add(password);
		
 		b1.addActionListener(this);
        b2.addActionListener(this);
        	
		cb.addActionListener(this);
        
		setSize(1366, 768);
        setLayout(null);
        setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

    }// end of pageone constructor 
    
	public void actionPerformed(ActionEvent e)          //Action-Listener
{    
                String s1 = tf1.getText(); 
                String s2 = tf2.getText(); 
                String s3 = tf3.getText();
                String s4 = tf4.getText();
				char[] input = password.getPassword();
				String s = String.valueOf(input);
		 

if(e.getSource()==b1)
    
{           
   if (((tf1.getText().length() <= 0) && (tf2.getText().length() <= 0) && (tf3.getText().length() <= 0) && (s.length()<=0) && (tf4.getText().length() <= 0)))
{
            JOptionPane.showMessageDialog(bg," Please Fill All the Fields !! ");
            
}

else if(!(s4.equals(s)))                      // To check Password 
{
            JOptionPane.showMessageDialog(bg,"Your passwords do not match !!");
            
}

else{

     try { 
  
                        // Creating a file and 
                        // writing the data 
                        // into a Text-file. 
                        FileWriter  w = new FileWriter("data.txt",true); 
  
                        w.write("Name: " +s1 + "\n"); 
                        w.write("Email: " +s2 + "\n"); 
                        w.write("Username: "+s3 + "\n"); 
                        w.write("Password: "+s + "\n");
						w.write("Confirmed Password: "+s4 + "\n");
                        w.write("\n");						
                        w.close(); 
                } 
                    catch (Exception ae) { 
                        System.out.println(ae); 
                    } 
                 
           
			JOptionPane.showMessageDialog(bg,"Successfully Saved The Details !!!!"); 
            
	 setVisible(false);
     secondpage obj2 = new secondpage();
     obj2.setVisible(true); 
}

}//close of main if


if(e.getSource()==b2)                           //EXIT- Button logic
{
 System.exit(0);

}

if(cb.isSelected())                             // To hide password data
{
  password.setEchoChar((char)0);
}else 
{
	password.setEchoChar('*');
}

} // end of actionperformed 
} // end of pageone class

class mainpage
{
    public static void main(String args[])
	{
        new pageone();
    } //end of main
} //end of miniprojectjava class