import javax.swing.*;
import java.awt.*;

public class scaleneTriangleSolution {
    scaleneTriangleSolution()
    {
        ImageIcon i=new ImageIcon("calcificIcon.png");
        ImageIcon a=new ImageIcon("ScaleneTriangleFormula.png");

        JLabel image=new JLabel();
        image.setIcon(a);
        image.setBounds(0,0,550,450);

        JFrame frame=new JFrame();
        frame.setLayout(null);
        frame.setSize(565,489);
        frame.setTitle("Scalene Triangle Solution");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setVisible(true);
        frame.setIconImage(i.getImage());
        frame.getContentPane().setBackground(new Color(191, 255, 119));

        frame.add(image);
    }
}
