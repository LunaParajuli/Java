import java.awt.Container;
import java.awt.Color;
import javax.swing.*;

 class MyFrame2 extends JFrame {
    Container c;
    public MyFrame2()
    {
    setSize(500,700);
    setLocationRelativeTo(null);
    setTitle("Luna Parajuli");
    c=this.getContentPane();
    c.setBackground(Color.blue);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
}
    public static void main(String []args){
      
        new MyFrame2();
    }
}
