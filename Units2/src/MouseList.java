
import java.awt.Container;
import java.awt.event.MouseListener;
import javax.swing.*;




public class MouseList extends JFrame implements MouseListener
{
    Container c;
    
    JLabel l1;
    JTextArea ta;
    public MouseList()
    {
        
        setTitle("MouseList");
        setSize(500,500);
        c=this.getContentPane();
        c.setLayout(null);
        l1=new JLabel("MouseList");
        l1.setBounds(20,20,80,30);
        c.add(l1);
        l1.addMouseListener(this);
        
        ta=new JTextArea();
        ta.setBounds(100,20,300,300);
        c.add(ta);
        
        setVisible(true);
        
    }
    
    
}
