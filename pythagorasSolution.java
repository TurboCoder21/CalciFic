import javax.swing.*;
import java.awt.*;

public class pythagorasSolution {
    pythagorasSolution()
    {
        ImageIcon i=new ImageIcon("calcificIcon.png");
        ImageIcon a=new ImageIcon("PythagorasTheoremFormula.png");

        JLabel image=new JLabel();
        image.setIcon(a);
        image.setBounds(50,0,520,440);

        JFrame frame=new JFrame();
        frame.setSize(620,480);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setTitle("Pyhtagoras Theorem Solution");
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(191, 255, 119));

        frame.setIconImage(i.getImage());

        frame.add(image);
    }
}
