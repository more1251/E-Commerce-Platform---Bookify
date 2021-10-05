import java.awt.*;
import java.awt.event.*;
import javax.swing.*;    
import javax.swing.JFrame; 
import javax.swing.JScrollPane; 
import javax.swing.JTable;  
public class Sem2Maths extends JFrame implements ActionListener {    
    JTable j; 
	JLabel lb;
	JButton bt;
    Sem2Maths() 
    {   
	    lb =new JLabel(" ");
	    lb.setBounds(50,400, 100,30);
		
		
		bt=new JButton("Back");  
	    bt.setBounds(650,400, 100,30);
	
	
        setTitle("Engineering Mathematics-2"); 
        
        String[] columnNames = {"Sr. NO", "Author", "Publication", "Price" }; 
        
        String[][] data = { {"   1 ", "   G.V Kumbhojkar", "   P Jamnadas LLC ", "   Rs .520" }, 
            { "   2 ","   A.V. Dubewar", "   Oxford  Higher Education", "   Rs 430" }
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
     ITsem2 obj5 = new ITsem2();
     obj5.setVisible(true); 


}

}	

 public static void main(String[] args) 
    { 
        new Sem2Maths(); 
    } 
}