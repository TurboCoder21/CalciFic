import javax.swing.*;
import java.awt.*;

public class solutionCompoundIntrestWindow {

    JFrame frame;

    solutionCompoundIntrestWindow()
    {
        ImageIcon i=new ImageIcon("calcificIcon.png");
        ImageIcon a=new ImageIcon("compoundInterestFormula.png");

        JLabel label1=new JLabel();
        label1.setText("----------AMOUNT----------");
        label1.setBounds(150,5,500,70);
        label1.setFont(new Font("Agency Fb",Font.BOLD,50));
        label1.setForeground(Color.BLACK);

        JLabel image=new JLabel();
        image.setIcon(a);
        image.setBounds(80,80,600,300);

        JLabel label2=new JLabel();
        label2.setText("----------INTEREST----------");
        label2.setBounds(140,390,500,70);
        label2.setFont(new Font("Agency Fb",Font.BOLD,50));
        label2.setForeground(Color.BLACK);

        JLabel label3=new JLabel();
        label3.setText("INTEREST = AMOUNT-PRINCIPAL");
        label3.setBounds(110,465,600,70);
        label3.setFont(new Font("Agency Fb",Font.BOLD,50));
        label3.setForeground(Color.BLACK);

        frame=new JFrame();
        frame.setSize(800,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setTitle("Compound Interest Solution");
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(191, 255, 119));

        frame.setIconImage(i.getImage());

        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(image);
    }
}
