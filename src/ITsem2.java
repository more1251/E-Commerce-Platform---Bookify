import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*; 

class ITsem2 extends JFrame implements ActionListener
{

  JLabel lb1,lb2,lb3,lb4,lb5,lb6,background1;

  JButton bt1,bt2,bt3,bt4,bt5,bt6;

  ImageIcon i;

  Font f1,f2;

  ITsem2(){

  super("Sem2-IT"); 


  i = new ImageIcon("Images/BG2.jpg");
  background1 = new JLabel("",i,JLabel.CENTER);
  background1.setBounds(0,0,1366, 768);
 
  f1=new Font("Centeria Script",Font.BOLD,33);
  f2=new Font("Times New Roman",Font.BOLD,20); 


  lb1 = new JLabel("INFORMATION TECHNOLOGY ENGINEERING SEM-2",JLabel.CENTER);
  lb1.setBounds(250,50,900,50);
  lb1.setFont(f1);  
  lb1.setForeground(Color.white);
  
  lb2 = new JLabel("Engineering-Physics 2 ",JLabel.LEFT);
  lb2.setBounds(440,150,250,40);
  lb2.setFont(f2);
  
  lb3 = new JLabel("Engineering-Chemistry 2",JLabel.LEFT);
  lb3.setBounds(440,240,250,40); 
  lb3.setFont(f2);
 
  lb4 = new JLabel("Engineering-Mathematics 2",JLabel.LEFT);
  lb4.setBounds(440,330,250,40);
  lb4.setFont(f2);

  lb5 = new JLabel("Engineering Graphics",JLabel.LEFT);
  lb5.setBounds(440,420,250,40);
  lb5.setFont(f2);
  
  lb6 = new JLabel("C Programming",JLabel.LEFT);
  lb6.setBounds(440,510,250,40);
  lb6.setFont(f2);
  


  bt1 = new JButton("Click Here");
  bt1.setBounds(710,150,120,30);

  bt2 = new JButton("Click Here");
  bt2.setBounds(710,240,120,30);

  bt3 = new JButton("Click Here");
  bt3.setBounds(710,330,120,30);

  bt4 = new JButton("Click Here");
  bt4.setBounds(710,420,120,30);
  
  bt5 = new JButton("Click Here");
  bt5.setBounds(710,510,120,30);

  bt6 = new JButton("Back");
  bt6.setBounds(580,600,100,35);
  
  add(background1);

  background1.add(lb1);
  background1.add(lb2);
  background1.add(lb3);
  background1.add(lb4);
  background1.add(lb5);
  background1.add(lb6);
  
  background1.add(bt1);
  background1.add(bt2);
  background1.add(bt3);
  background1.add(bt4);
  background1.add(bt5);
  background1.add(bt6);
 

 bt1.addActionListener(this);
 bt2.addActionListener(this);
 bt3.addActionListener(this);
 bt4.addActionListener(this);
 bt5.addActionListener(this);
 bt6.addActionListener(this);
 
        setLayout(null);    
        setVisible(true);  
        setSize(1366, 768);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  

}


public void actionPerformed(ActionEvent ae){

	if(ae.getSource()==bt1)
	{
		 setVisible(false);
		 Sem2Phy b1 = new Sem2Phy();
		 b1.setVisible(true);   

	}


	if(ae.getSource()==bt2)
	{
		 setVisible(false);
	     Sem2Chem b2 = new Sem2Chem();
	     b2.setVisible(true);   
	}


	if(ae.getSource()==bt3)
	{
		 setVisible(false);
	     Sem2Maths b3 = new Sem2Maths();
	     b3.setVisible(true);   
	}


	if(ae.getSource()==bt4)
	{
		 setVisible(false);
	     Sem2Graphics b4 = new Sem2Graphics();
	     b4.setVisible(true);   
	}


	if(ae.getSource()==bt5)
	{
		 setVisible(false);
	     Sem2CP b5 = new Sem2CP();
	     b5.setVisible(true); 
	}


	if(ae.getSource()==bt6)
	{
	  setVisible(false);
	  thirdpageit obj3 =new thirdpageit();
	  obj3.setVisible(true);
	}


}


public static void main(String s[])  
    {  
       new ITsem2();
    }  
}