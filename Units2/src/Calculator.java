import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,ans;
    JTextField t1,t2;
    JButton b1,b2,b3,b4,b5;
    Container c;

    public Calculator()
    {
        setTitle("Calculator");
        setSize(400,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c=this.getContentPane();
        c.setLayout(null);
       
        l1= new JLabel("First number:");
        l1.setBounds(20,50,80,30);
        c.add(l1);
       
        t1= new JTextField();
        t1.setBounds(100,50,80,30);
        c.add(t1);

        l2= new JLabel("Second number:");
        l2.setBounds(20,90,100,30);
        c.add(l2);
        
        t2= new JTextField();
        t2.setBounds(120,90,80,30);
        c.add(t2);
        
        b1=new JButton("+");
        b1.setBounds(60,130,50,30);
        c.add(b1);
        b1.addActionListener(this);

        l3=new JLabel();
        l3.setBounds(160,250,140,30);
        c.add(l3);        

        b2=new JButton("-");
        b2.setBounds(130,130,50,30);
        c.add(b2);
        b2.addActionListener(this);

        l4=new JLabel();
        l4.setBounds(160,270,80,30);
        c.add(l4);

        b3=new JButton("*");
        b3.setBounds(200,130,50,30);
        c.add(b3);
        b3.addActionListener(this);
      
        l5=new JLabel();
        l5.setBounds(160,290,80,30);
        c.add(l5);
       
        b4=new JButton("/");
        b4.setBounds(270,130,50,30);
        c.add(b4);
        b4.addActionListener(this);

        l6=new JLabel();
        l6.setBounds(160,310,80,30);
        c.add(l6);
              
        b5=new JButton("Reset");
        b5.setBounds(150,180,80,30);
        c.add(b5);
        b5.addActionListener(this);

        ans=new JLabel("Ans:");
        ans.setBounds(120,250,80,30);
        c.add(ans);

        setVisible(true);   
    }
    public void actionPerformed(ActionEvent e)
    {
     try{  
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = a+b;
        int d = a-b;
        int g = a*b;
        int f = a/b;

        if(e.getSource()==b1)
        {
           l3.setText("Sum="+c);
        }
        if(e.getSource()==b2)
        {
           l3.setText("Subtract="+d);
        }       
        if(e.getSource()==b3)
        {
           l3.setText("Multiply="+g);
        }
        if(e.getSource()==b4)
        {
           l3.setText("Divide="+f);
        }
        if(e.getSource()==b5)
        {
           t1.setText("");
           t2.setText("");
           l3.setText("");
        }
      }
      catch(NumberFormatException e1){
          l3.setText("Input integer only");
      }
      catch(ArithmeticException e2){
          l3.setText("Cannot divide by zero");
      } 
    }
    public static void main(String []args)
    {
        new Calculator();
    }
}