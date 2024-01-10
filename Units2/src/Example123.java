
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class Example123 extends JFrame implements ItemListener;
{
    JComboBox cb;
    JTextArea ta;
    Container c;
    public Example123()
    {
       setTitle("ItemListener") ;
       setSize(500,500);
       setLocationRelativeTo(null);
       c=this.getContentPane();
       setLayout(null);
       String country[]={"Nepal","India","China","USA"};
       cb= new JComboBox(country);
       cb.setBounds(50,50,100,30);
       c.add(cb);
       
       ta = new JTextArea();
       ta.setBounds(150,50,200,200);
       c.add(ta);
       
       setVisible(true);
         
    }
    
    public void itemStateChanged(ItemEvent e)
    {
        String str = cb.getSelectedItem().toString();
        ta.setText(null);
    }
    public static void main(String args[])
    {
        new Example123();
    }
}
