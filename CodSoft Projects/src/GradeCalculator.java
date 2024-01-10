/*TASK 2
                         STUDENT GRADE CALCULATOR

Input: Take marks obtained (out of 100) in each subject.
Calculate Total Marks: Sum up the marks obtained in all subjects.
Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
average percentage.
Grade Calculation: Assign grades based on the average percentage achieved.
Display Results: Show the total marks, average percentage, and the corresponding grade to the user

*/

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class GradeCalculator {
    JPanel p1,p2,p3,p4,pa1;
    JLabel l1,l2,l3,l4;
    
   
   
    public GradeCalculator(){
        JFrame jf = new JFrame("Student Grade Calculator"); 
        jf.setLayout(null);
        jf.setSize(1000,1000);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        JPanel p1 = new JPanel();
        p1.setBounds(250,0,400,80);
        p1.setBackground(Color.PINK);
        jf.add(p1);
        
        JPanel p2 = new JPanel();
        p2.setBounds(20,130,450,600);
        p2.setBackground(Color.GREEN);
        jf.add(p2);
        
        JPanel p3 = new JPanel();
        p3.setBounds(500,130,450,600);
        p3.setBackground(Color.YELLOW);
        jf.add(p3);
        
        JPanel p4 = new JPanel();
        p4.setBounds(70,830,100,80);
        p4.setBackground(Color.PINK);
        jf.add(p4);
        
        JLabel l1 = new JLabel("Student's MarksSheet");
        l1.setBounds(250,0,400,80);
        l1.setFont(new Font("Serif",Font.BOLD, 35));
        p1.add(l1);
        
        JLabel l2 = new JLabel("Student's Detail");
       // l2.setBounds(null);
        l2.setFont(new Font("Serif",Font.ITALIC,30));
        p2.add(l2);
        l2.setVerticalAlignment(JLabel.TOP);
        l2.setHorizontalAlignment(JLabel.CENTER);
        
        JLabel l3 = new JLabel("Student's Obtained Marks");
        l3.setFont(new Font("Serif",Font.ITALIC,30));
        p3.add(l3);
        l3.setVerticalAlignment(JLabel.TOP);
        l3.setHorizontalAlignment(JLabel.CENTER);
         
        l4.setText("Name:");
        l4.setBounds(22,140,80,30);
        p2.add(l4);
        
        jf.setVisible(true);
        
        
        
        
    }
public static void main(String args[]){
    new GradeCalculator();
    }
}