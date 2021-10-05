import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*; 
import java.lang.*;

class secondpage extends JFrame implements ActionListener
{

  JLabel l1,l2,l3,l4,background;

  JButton b1,b2,b3,b4,b5;

  ImageIcon img;

  Font fn,fn1;

  secondpage()
  {

  setTitle("Second Page"); 


  img = new ImageIcon("Images/BG2.jpg");

  background = new JLabel("",img,JLabel.CENTER);
  background.setBounds(0,0,1366,768);
  
  fn=new Font("Centeria Script",Font.BOLD,30);
  fn1=new Font("Times New Roman",Font.BOLD,22); 


  l1 = new JLabel("SELECT YOUR BRANCH");
  l1.setBounds(490,70,500,50);
  l1.setFont(fn);  
  l1.setForeground(Color.white);

  l2 = new JLabel("For  Information  Technology  Engineering");
  l2.setBounds(300,250,600,40);
  l2.setFont(fn1);
  
  l3 = new JLabel("For  Computer  Engineering");
  l3.setBounds(300,350,600,40); 
  l3.setFont(fn1);
  
  l4 = new JLabel("For  Electronics And Telicommunication Engineering");
  l4.setBounds(300,450,700,40);
  l4.setFont(fn1);  

  b1 = new JButton("Click Here:-  IT");
  b1.setBounds(900,250,150,35);

  b2 = new JButton("Click Here:-  Comps");
  b2.setBounds(900,350,150,35);

  b3 = new JButton("Click Here:-  EXTC");
  b3.setBounds(900,450,150,35);
  
  b4 = new JButton("Back");
  b4.setBounds(630,560,100,35);
  
  
  add(background);

  background.add(l1);
  background.add(l2);
  background.add(l3);
  background.add(l4);
  
  background.add(b1);
  background.add(b2);
  background.add(b3);
  background.add(b4);

 b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);
 b4.addActionListener(this);
        
		setLayout(null);  
		setVisible(true);  
        setSize(1366,768);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  

}


public void actionPerformed(ActionEvent e)
{

if(e.getSource()==b1)
{
  setVisible(false);
  thirdpageit obj3 =new thirdpageit();
  obj3.setVisible(true);
}


if(e.getSource()==b2)
{
  setVisible(false);
  thirdpageco obj4 =new thirdpageco();
  obj4.setVisible(true);
}

if(e.getSource()==b3)
{
  

}

if(e.getSource()==b4)
{
	 setVisible(false);
     pageone obj1 = new pageone();
     obj1.setVisible(true); 

}

} // actionperformed close


public static void main(String args[])  
    {  
        new secondpage();  
    }  // end of main
	
}  // end of secondpage class 







// Second Page code //