import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.*;

 class MyFrame extends JFrame
 {
     Container c;
     JTextField t1;
     JLabel l1;
    public MyFrame()
    {
      
        setSize(600,600);
        setTitle("Luna");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        
        //setResizable(true);
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        l1 = new JLabel("Name:");
        l1.setBounds(100,150,80,30);
        
        Font f= new Font("Arial",Font.ITALIC,18);
        l1.setFont(f);
        c.add(l1);
        
        t1=new JTextField();
        t1.setBounds(190,150,80,30);
        t1.setEditable(false);
        c.add(t1);
        
         setVisible(true); 
    }
}

public class Example{
    public static void main(String []args)
    {
       
        new MyFrame();
    }
}
