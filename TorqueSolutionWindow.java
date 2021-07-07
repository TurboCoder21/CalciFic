import javax.swing.*;
import java.awt.*;

public class TorqueSolutionWindow {
    TorqueSolutionWindow()
    {
        ImageIcon i=new ImageIcon("calcificIcon.png");
        ImageIcon a=new ImageIcon("TorqueSolution.png");

        JLabel image=new JLabel();
        image.setIcon(a);
        image.setBounds(0,0,600,100);

        JFrame frame=new JFrame();
        frame.setLayout(null);
        frame.setSize(616,139);
        frame.setTitle("Torque Solution");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setVisible(true);
        frame.setIconImage(i.getImage());
        frame.getContentPane().setBackground(new Color(191, 255, 119));

        frame.add(image);
    }
}
