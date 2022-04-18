import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicBorders;

public class GUI {
    



    public static void main(String[] args) {
        
     JFrame frame=new JFrame("Assignment 2");
     JLabel label=new JLabel();
     JButton button1=new JButton("Take-Away");
     JButton button2=new JButton("Eat in");
     JButton button3=new JButton("Delivery");
     //BorderFactory bord=new BasicBorders();

     frame.setSize(400, 400);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setVisible(true);
     frame.add(label);
     frame.setResizable(false);

     button1.setBounds(40, 200, 100, 40);
     button2.setBounds(140, 200, 100, 40);
     button3.setBounds(240, 200, 100, 40);
     button1.setBackground(Color.GRAY);
     button2.setBackground(Color.LIGHT_GRAY);
     button3.setBackground(Color.gray);


     
     label.setText("Restaurant");     
     label.add(button1);
     label.add(button2);
     label.add(button3);
   //  label.setBorder(border);



    
    }
}
