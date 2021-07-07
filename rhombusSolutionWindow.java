import javax.swing.*;
import java.awt.*;

public class rhombusSolutionWindow {
    rhombusSolutionWindow()
    {
        ImageIcon i=new ImageIcon("calcificIcon.png");
        ImageIcon a=new ImageIcon("rhombusSolution.png");

        JLabel image=new JLabel();
        image.setIcon(a);
        image.setBounds(0,0,600,400);

        JFrame frame=new JFrame();
        frame.setLayout(null);
        frame.setSize(616,439);
        frame.setTitle("Square Solution");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setVisible(true);
        frame.setIconImage(i.getImage());
        frame.getContentPane().setBackground(new Color(191, 255, 119));

        frame.add(image);
    }
}
