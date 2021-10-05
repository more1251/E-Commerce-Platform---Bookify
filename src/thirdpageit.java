import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*; 

class thirdpageit extends JFrame implements ActionListener
{

  JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,background1;

  JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10;

  ImageIcon i;

  Font f1,f2;

  thirdpageit(){

  setTitle("Mumbai University-IT"); 

  i = new ImageIcon("Images/BG2.jpg");

  background1 = new JLabel("",i,JLabel.CENTER);
  background1.setBounds(0,0,1366,768);
  
  f1=new Font("Centeria Script",Font.BOLD,30);
  f2=new Font("Times New Roman",Font.BOLD,20); 


  lb1 = new JLabel("INFORMATION TECHNOLOGY ENGINEERING",JLabel.CENTER);
  lb1.setBounds(280,50,800,40);
  lb1.setFont(f1);  
  lb1.setForeground(Color.white);

  lb2 = new JLabel("SEMESTER-I",JLabel.LEFT);
  lb2.setBounds(290,160,400,30);
  lb2.setFont(f2);
  
  lb3 = new JLabel("SEMESTER-II",JLabel.LEFT);
  lb3.setBounds(740,160,420,30); 
  lb3.setFont(f2);
 
  lb4 = new JLabel("SEMESTER-III",JLabel.LEFT);
  lb4.setBounds(278,250,400,30);
  lb4.setFont(f2);

  lb5 = new JLabel("SEMESTER-IV",JLabel.LEFT);
  lb5.setBounds(740,250,440,30);
  lb5.setFont(f2);
  
  lb6 = new JLabel("SEMESTER-V",JLabel.LEFT);
  lb6.setBounds(285,340,440,30);
  lb6.setFont(f2);

  lb7 = new JLabel("SEMESTER-VI",JLabel.LEFT);
  lb7.setBounds(740,340,440,30);
  lb7.setFont(f2);

  lb8 = new JLabel("SEMESTER-VII",JLabel.LEFT);
  lb8.setBounds(275,430,440,30);
  lb8.setFont(f2);

  lb9 = new JLabel("SEMESTER-VIII",JLabel.LEFT);
  lb9.setBounds(730,430,440,30);
  lb9.setFont(f2);


  bt1 = new JButton("Click Here");
  bt1.setBounds(455,160,120,30);

  bt2 = new JButton("Click Here");
  bt2.setBounds(910,160,120,30);

  bt3 = new JButton("Click Here");
  bt3.setBounds(455,250,120,30);

  bt4 = new JButton("Click Here");
  bt4.setBounds(910,250,120,30);
  
  bt5 = new JButton("Click Here");
  bt5.setBounds(455,340,120,30);

  bt6 = new JButton("Click Here");
  bt6.setBounds(910,340,120,30);

  bt7 = new JButton("Click Here");
  bt7.setBounds(455,430,120,30);

  bt8 = new JButton("Click Here");
  bt8.setBounds(910,430,120,30);
  
  bt9 = new JButton("Back");
  bt9.setBounds(510,530,100,35);

  bt10 = new JButton("Cart List");
  bt10.setBounds(710,530,100,35);


  add(background1);

  background1.add(lb1);
  background1.add(lb2);
  background1.add(lb3);
  background1.add(lb4);
  background1.add(lb5);
  background1.add(lb6);
  background1.add(lb7);
  background1.add(lb8);
  background1.add(lb9);
  
  background1.add(bt1);
  background1.add(bt2);
  background1.add(bt3);
  background1.add(bt4);
  background1.add(bt5);
  background1.add(bt6);
  background1.add(bt7);
  background1.add(bt8);
  background1.add(bt9);
  background1.add(bt10);

 bt1.addActionListener(this);
 bt2.addActionListener(this);
 bt3.addActionListener(this);
 bt4.addActionListener(this);
 bt5.addActionListener(this);
 bt6.addActionListener(this);
 bt7.addActionListener(this);
 bt8.addActionListener(this);
 bt9.addActionListener(this);
 bt10.addActionListener(this);

        setLayout(null);   
        setVisible(true);  
        setSize(1366, 768);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
}


public void actionPerformed(ActionEvent ae)
{

  if(ae.getSource()==bt1)
{
  setVisible(false);
  ITsem1 obj5 = new ITsem1();
  obj5.setVisible(true);
}
  
if(ae.getSource()==bt2)
{
  setVisible(false);
  ITsem2 obj6 = new ITsem2();
  obj6.setVisible(true);
}

if(ae.getSource()==bt3)
{
  setVisible(false);
  ITsem3 obj7 = new ITsem3();
  obj7.setVisible(true);
}

if(ae.getSource()==bt4)
{
  setVisible(false);
  ITsem4 obj8 = new ITsem4();
  obj8.setVisible(true);
}

if(ae.getSource()==bt5)
{
   
}

if(ae.getSource()==bt6)
{
  
}

if(ae.getSource()==bt7)
{
   
}

if(ae.getSource()==bt8)
{
  
}

if(ae.getSource()==bt9)
{
    setVisible(false);
	secondpage obj2 = new secondpage();
    obj2.setVisible(true); 
}

if(ae.getSource()==bt10)
{
    setVisible(false);
	cartit objx = new cartit();
    objx.setVisible(true);  
}

}

public static void main(String s[])  
    {  
       new thirdpageit();
    }  
}