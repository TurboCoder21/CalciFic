import javax.swing.*;
import java.awt.*;

public class aboutMaker
{
    JFrame frame;

    aboutMaker()
    {
        ImageIcon i=new ImageIcon("calcificIcon.png");

        JLabel label1 =new JLabel();
        label1.setText("WELCOME TO CALCIFIC");
        label1.setBounds(200,50,900,45);
        label1.setFont(new Font("Agency Fb",Font.BOLD,35));
        label1.setForeground(Color.black);

        JLabel label2 =new JLabel();
        label2.setText("THIS IS A SCIENTIFIC CALCULATOR SPECIALLY DESIGNED");
        label2.setBounds(20,100,2500,40);
        label2.setFont(new Font("Agency Fb",Font.BOLD,35));
        label2.setForeground(Color.black);

        JLabel label2b =new JLabel();
        label2b.setText("TO SOLVE PHYSICS AND MATHEMATICAL PROBLEMS");
        label2b.setBounds(45,150,2500,40);
        label2b.setFont(new Font("Agency Fb",Font.BOLD,35));
        label2b.setForeground(Color.black);

        JLabel label3 =new JLabel();
        label3.setText("Created By~");
        label3.setBounds(100,255,2500,40);
        label3.setFont(new Font("Agency Fb",Font.BOLD,35));
        label3.setForeground(Color.black);

        JLabel label4 =new JLabel();
        label4.setText("Harshil Parikh");
        label4.setBounds(260,250,2500,40);
        label4.setFont(new Font("Tahoma",Font.BOLD,45));
        label4.setForeground(Color.black);

        JLabel label5 =new JLabel();
        label5.setText("Version~ 1.9");
        label5.setBounds(530,327,150,40);
        label5.setFont(new Font("Consolas",Font.PLAIN,22));
        label5.setForeground(Color.black);

        frame=new JFrame();
        frame.setLayout(null);
        frame.setSize(700,400);
        frame.setTitle("Harshil Parikh");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setVisible(true);
        frame.setIconImage(i.getImage());
        frame.getContentPane().setBackground(new Color(191, 255, 119));

        frame.add(label1);
        frame.add(label2);
        frame.add(label2b);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
    }
}