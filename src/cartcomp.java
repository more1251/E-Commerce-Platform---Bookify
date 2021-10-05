import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
/*import javax.swing.JFrame; 
import javax.swing.JScrollPane; 
import javax.swing.JTable;  */
//import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
public class cartcomp extends JFrame implements ActionListener{

    final JTable j;
	final DefaultTableModel model;
    JLabel lb;                                                     
	JButton bt,bt1,bt2,bt3,bt4;
	final JTextField t1;
	final JTextField t2;
	final JTextField t3;
	
  cartcomp()
    {        
		
		lb =new JLabel(" ");
	    lb.setBounds(50,700,200,60);
		
		bt=new JButton("Add");  
	    bt.setBounds(420, 430, 120, 40);
				
		bt1=new JButton("Delete");  
	    bt1.setBounds(620, 430, 120, 40);
				
		bt2=new JButton("Update");  
	    bt2.setBounds(820, 430, 120, 39);
		
		bt3=new JButton(" Order Now ? ");
		bt3.setBounds(470,550, 150,40);
		
		bt4=new JButton("Back");
		bt4.setBounds(730,550, 150,40);

		
		 t1 = new JTextField(); 
         t1.setBounds(300, 300, 160, 45);		 

         t2 = new JTextField();
		 t2.setBounds(600, 300, 160, 45);
		 
         t3 = new JTextField();
		 t3.setBounds(900, 300, 160, 45);
		 
         
        setTitle("Comps Book Cart"); 
        
        Object[] columnNames = {"Author", "Publication"," Quantity "}; 
		
		j = new JTable();
		
		model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);
		
		j.setModel(model);
		
		j.setRowHeight(30);
		
		JScrollPane sp = new JScrollPane(j);
        sp.setBounds(0, 0, 1366, 200);
		
		add(sp);
		add(lb);
		lb.add(t1);
		lb.add(bt);
		lb.add(t2);
		lb.add(bt1);
		lb.add(t3);
		lb.add(bt2);
		lb.add(bt3);
		lb.add(bt4);
	
		
		bt.addActionListener(this);
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		
		
		setSize(1366, 768);
		setVisible(true); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
		

j.addMouseListener(new MouseAdapter() {

public void mouseClicked(MouseEvent e) {

int i = j.getSelectedRow();

t1.setText(model.getValueAt(i, 0).toString());
t2.setText(model.getValueAt(i, 1).toString());
t3.setText(model.getValueAt(i, 2).toString());
}
  
});
		
		
}		
	
public void actionPerformed(ActionEvent e){
	
    final Object[] row = new Object[3];
	int i = j.getSelectedRow();
	String s="COMPUTER ENGINEERING BOOKS ";
	String s1=t1.getText();
	String s2=t2.getText();
	String s3=t3.getText();

if(e.getSource()==bt)               //for adding the items in the list
{
	
	row[0] = t1.getText();
    row[1] = t2.getText();
    row[2] = t3.getText();
    
    model.addRow(row);
}

if(e.getSource()==bt1)             //for deleting the items int list
{

if(i >= 0) 
{
    model.removeRow(i);
   
        
}
else 
{
    JOptionPane.showMessageDialog(lb," Please select the item to be deleted ");
}

}

if(e.getSource()==bt2)          // for updating the items from the list
{
	
if (i >= 0) 
{
   model.setValueAt(t1.getText(), i, 0);
   model.setValueAt(t2.getText(), i, 1);
   model.setValueAt(t3.getText(), i, 2);
  
} 
else 
{
   JOptionPane.showMessageDialog(lb," Please select the item to be updated ");
}

}


if(e.getSource()==bt3)
{
	if ( ((t1.getText().length() <= 0) && (t2.getText().length() <= 0) && (t3.getText().length() <= 0)) )
	{
	            JOptionPane.showMessageDialog(lb," Your Cart is Empty !! ");
	            
	}
	
else {
	
	try { 
  
                        FileWriter  w = new FileWriter("data.txt",true); 
  
                        w.write(""+s+"\n");
                        w.write("Author: " +s1 + "\n"); 
                        w.write("Publication: " +s2 + "\n"); 
                        w.write("Quantity: "+s3 + "\n"); 
                        w.write("\n");						
                        w.close(); 
                } 
                catch(Exception ae){ 
                        System.out.println(ae); 
                   
				}
	
           JOptionPane.showMessageDialog(lb," Your products are added to cart !");
}

}

if(e.getSource()==bt4)
{
	 setVisible(false);
     thirdpageco ct1 = new thirdpageco();
     ct1.setVisible(true);
}


} // end of void actionPerformed
 

public static void main(String[] args) 
    { 
        new cartcomp(); 
	}
}