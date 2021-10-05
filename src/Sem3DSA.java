import java.awt.*;
import java.awt.event.*;
import javax.swing.*;   
import javax.swing.JFrame; 
import javax.swing.JScrollPane; 
import javax.swing.JTable;  
public class Sem3DSA extends JFrame implements ActionListener {    
    JTable j; 
    JLabel lb;
    JButton bt;
    Sem3DSA() 
    {   
	    lb =new JLabel(" ");
	    lb.setBounds(50,400, 100,30);
		
		
		bt=new JButton("Back");  
	    bt.setBounds(650,400, 100,30);
	
	
        setTitle("Data Structures and Analysis"); 
        
        String[] columnNames = {"Sr. NO", "Author", "Publication", "Price" }; 
        
        String[][] data = { {"   1 ", "   Rajesh K. Shukla", "   Wiley India ", "   Rs 594 " },
        	    { "   2 ","   S. K Srivastava - Deepali Srivastava ", "   BPB Publications ", "   Rs 680 " }
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
     ITsem3 obj8 = new ITsem3();
     obj8.setVisible(true); 
}
}


	
    public static void main(String[] args) 
    { 
        new Sem3DSA(); 
    } 
}