import javax.swing.*;
import java.awt.*;

public class distanceFormulaSolution {

    distanceFormulaSolution()
    {
        ImageIcon i=new ImageIcon("calcificIcon.png");
        ImageIcon a=new ImageIcon("distanceFormula.png");

        JLabel image=new JLabel();
        image.setIcon(a);
        image.setBounds(10,12,700,300);

        JFrame frame=new JFrame();
        frame.setSize(740,365);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setTitle("Distance Formula Solution");
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(191, 255, 119));

        frame.add(image);

        frame.setIconImage(i.getImage());
    }
}
