import java.awt.Color;
import java.awt.Container;
import javax.swing.*;

class MyFrames extends JFrame {
    Container c;

    public MyFrames() {
        setSize(500, 700);
        setLocationRelativeTo(null);
        setTitle("Luna");
        c = getContentPane();
        c.setBackground(Color.PINK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrames();
    }
}
