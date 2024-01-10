
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


class RegForm extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,dob,l4,l5;
    JTextField t1,t2;
    JTextArea t3,t4;
    JRadioButton b1,b2;
    JComboBox day,month,year;
    JCheckBox c1;
    JButton b3;
    
    Container c;
    public RegForm()
    {
        setSize(700,700);
        setTitle("Registration Form");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.lightGray);
        
        l1= new JLabel("Name:");
        l1.setBounds(20,50,80,30);
        c.add(l1);
        
        t1= new JTextField();
        t1.setBounds(100,50,80,30);
        c.add(t1);
        
        l2= new JLabel("MobileNo:");
        l2.setBounds(20,100,100,30);
        c.add(l2);
        
        t2= new JTextField();
        t2.setBounds(100,100,80,30);
        c.add(t2);
        
        l3=new JLabel("Gender:");
        l3.setBounds(20,150,80,30);
        c.add(l3);
        
        b1=new JRadioButton("Male");
        b2=new JRadioButton("Female");
        b1.setBounds(100,150,90,30);
        b2.setBounds(200,150,90,30);
        c.add(b1);
        c.add(b2);
        b1.setSelected(true);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(b1);
        bg.add(b2);
        
        dob= new JLabel("Date Of Birth:");
        dob.setBounds(20,200,80,30);
        c.add(dob);
        
       String Day[]= {"1","2","3","4","5","6","7","8","9","10"};
       day=new JComboBox(Day);
       day.setBounds(110,200,50,30);
       c.add(day);
        
       String Month[]={"Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec"}; 
       month=new JComboBox(Month);
       month.setBounds(170,200,50,30);
       c.add(month);
       
       String Year[]={"1998","1999","2000","2001","2002","2003","2004"};
       year=new JComboBox(Year);
       year.setBounds(230,200,60,30);
       c.add(year);
      
        l4=new JLabel("Address:");
        l4.setBounds(20,270,80,30);
        c.add(l4);
        
        t3= new JTextArea();
        t3.setBounds(100,270,80,30);
        t3.setLineWrap(true);
        c.add(t3);
        
        c1=new JCheckBox("I accept the terms and conditions.");
        c1.setBounds(20,320,230,30);
        c.add(c1);
        
        b3=new JButton("Submit");
        b3.setBounds(49,400,80,30);
        c.add(b3);
        b3.addActionListener(this);
         
        t4= new JTextArea();
        t4.setBounds(400,120,200,300);
        t4.setLineWrap(true);
        c.add(t4);
        
        l5=new JLabel();
        l5.setBounds(30,430,300,30);
        c.add(l5);
        
          
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(c1.isSelected())
        {
        l5.setText("Registration Success.");
         
             String name = t1.getText();
             String mobile = t2.getText();
             String gen = "Male";
             if(b2.isSelected())
                   gen="Female";
             
             String dob = day.getSelectedItem()+"-"+month.getSelectedItem()+"-"
                     +year.getSelectedItem();
             
             String address = t3.getText();
             t4.setText("Name= "+name+"\n"+"Mobile= "+mobile+"\nGender= "+gen+
                     "\nDOB= "+dob+"\nAddress= "+address);
        }
        else{
           
             l5.setText("Please accept terms and conditions.");
        }
       
    }
    public static void main(String args[]){
        new RegForm();
    }
    
}
