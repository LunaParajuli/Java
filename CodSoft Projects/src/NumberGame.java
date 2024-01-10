
/*        Task1: NumberGame

1. Generate a random number within a specified range, such as 1 to 100.
2. Prompt the user to enter their guess for the generated number.
3. Compare the user's guess with the generated number and provide feedback on whether the guess
   is correct, too high, or too low.
4. Repeat steps 2 and 3 until the user guesses the correct number.
   You can incorporate additional details as follows:
5. Limit the number of attempts the user has to guess the number.
6. Add the option for multiple rounds, allowing the user to play again.
7. Display the user's score, which can be based on the number of attempts taken or rounds won 

*/

import java.awt.Color;
import javax.swing.*;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NumberGame  extends JFrame implements ActionListener{
    JTextField t2;
    JLabel g,l1, l2,note,score;
    JButton b,reset;
    Container c;
    
    public NumberGame()
    {
        setTitle("Number Game");
        setSize(600,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        g= new JLabel("Guess the Number");
        g.setBounds(100,30,300,60);
        g.setFont(new Font("Serif",Font.BOLD, 35));
        c.add(g);
        
        l1= new JLabel("The guessed number is:");
        l1.setBounds(30,100,200,80);
        l1.setFont(new Font("Serif",Font.PLAIN, 20));
        c.add(l1);
        
        t2=new JTextField();
        t2.setBounds(225,125,50,30);
        t2.setFont(new Font("Serif",Font.BOLD, 25));
        c.add(t2);
        
        note = new JLabel ("(Note:Enter the number between 1 to 100 only.)");
        note.setBounds(30,130,400,80);
        c.add(note);
        
        b=new JButton("Click");
        b.setBounds(250,210,80,30);
        b.setFont(new Font("Serif",Font.BOLD, 20));
        c.add(b);
        b.addActionListener(this);
        
        
        reset=new JButton("START AGAIN");
        reset.setBounds(180,430,190,30);
        reset.setFont(new Font("Serif",Font.BOLD, 18));
        c.add(reset);
        reset.addActionListener(this);
        
        l2= new JLabel();
        l2.setBounds(50,240,390,80);
        l2.setFont(new Font("Plain",Font.BOLD, 15));
        c.add(l2);
        
        
        score=new JLabel();
        score.setBounds(80,330,100,30);
        c.add(score);
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e)
    {
       try{
       int rn = (int)(Math.random()*100)+1;    
       int a = Integer.parseInt(t2.getText());
       int count =0;
        count++;
              
       if(e.getSource() == b){
          
           
        if(a<=0||a>100){
               JOptionPane.showMessageDialog(null,"Your guess is invalid"
                   ,"Warning",JOptionPane.WARNING_MESSAGE);
           }       
     else if(a == rn){
           l2.setText("Yahooo!!!You have guessed the correct number.");
           JOptionPane.showMessageDialog(null,"Yahoo!!!you got the correct answer...."
                   + "And To restart game press START AGAIN.","Information",JOptionPane.INFORMATION_MESSAGE);
           
       }
     else if(a>rn){
          l2.setText("You have guessed the large number than expected.");
     }
     else if(a<rn){
           l2.setText("You have guessed the less number than expected.");
           }  
     
       }   
       }    
       catch(NumberFormatException e1){
           l2.setText("Input integer only");            
       }
       
        if(e.getSource()==reset){
           t2.setText("");
           l2.setText("");
           score.setText("");
           
        
       } 
    }
    public static void main(String args[]) {
      new NumberGame();
    }
}
 


