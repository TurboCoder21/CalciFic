import javax.swing.*;
import java.awt.*;

public class parallelogramSolutionWindow {
    parallelogramSolutionWindow()
    {
        ImageIcon i=new ImageIcon("calcificIcon.png");
        ImageIcon a=new ImageIcon("parallelogramSolution.png");

        JLabel image=new JLabel();
        image.setIcon(a);
        image.setBounds(0,0,600,500);

        JFrame frame=new JFrame();
        frame.setLayout(null);
        frame.setSize(616,539);
        frame.setTitle("Parallelogram Solution");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setVisible(true);
        frame.setIconImage(i.getImage());
        frame.getContentPane().setBackground(new Color(191, 255, 119));

        frame.add(image);
    }
}
