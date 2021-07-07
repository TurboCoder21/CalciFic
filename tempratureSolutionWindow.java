import javax.swing.*;
import java.awt.*;

public class tempratureSolutionWindow {
    tempratureSolutionWindow()
    {
        ImageIcon i=new ImageIcon("calcificIcon.png");
        ImageIcon a=new ImageIcon("tempratureFormula.png");

        JLabel image=new JLabel();
        image.setIcon(a);
        image.setBounds(0,0,500,500);

        JFrame frame=new JFrame();
        frame.setLayout(null);
        frame.setSize(516,539);
        frame.setTitle("Temperature Solution");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setVisible(true);
        frame.setIconImage(i.getImage());
        frame.getContentPane().setBackground(new Color(191, 255, 119));

        frame.add(image);
    }
}
