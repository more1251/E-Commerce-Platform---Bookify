import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
import javax.swing.JFrame; 
import javax.swing.JScrollPane; 
import javax.swing.JTable;  
public class Sem1CChem extends JFrame implements ActionListener{    
    JTable j; 
	JLabel lb;
	JButton bt;
    Sem1CChem() 
	{   
	    lb =new JLabel(" ");
	    lb.setBounds(50,400, 100,30);
		
		
		bt=new JButton("Back");  
	    bt.setBounds(650,400, 100,30);
	
	
	
    	setTitle("Engineering Chemistry-1"); 
        
        String[] columnNames = {"Sr. NO", "Author", "Publication", "Price" }; 
        
        String[][] data = { {"   1", "   S. S. Dara", "   S. Chand & Co ", "Rs 180" },
        		{"   2", "   Jain and Jain", "   Dhanpat Rai Publishing ", "Rs 525" }
        }; 
         
        j = new JTable(data, columnNames); 
        j.setBounds(30, 40, 200, 300);  
        
        JScrollPane sp = new JScrollPane(j);
        sp.setBounds(0, 0, 1366,55);		
        
		add(sp);
		add(lb);
	    lb.add(bt);
		bt.addActionListener(this);
        
        setSize(1366, 768); 
        setVisible(true); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }

public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==bt)
{
	 setVisible(false);
     Cosem1 obj6 = new Cosem1();
     obj6.setVisible(true); 

}

}	


public static void main(String[] args) 
    { 
        new Sem1CChem(); 
    } 
}