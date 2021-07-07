import javax.swing.*;
import java.awt.*;

public class accelerationFormulaWindow {
    accelerationFormulaWindow()
    {
        ImageIcon i=new ImageIcon("calcificIcon.png");
        ImageIcon a=new ImageIcon("accelerationFormula.png");

        JLabel image=new JLabel();
        image.setIcon(a);
        image.setBounds(0,0,716,239);

        JFrame frame=new JFrame();
        frame.setLayout(null);
        frame.setSize(730,278);
        frame.setTitle("Acceleration Solution");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setVisible(true);
        frame.setIconImage(i.getImage());
        frame.getContentPane().setBackground(new Color(191, 255, 119));

        frame.add(image);
    }
}
