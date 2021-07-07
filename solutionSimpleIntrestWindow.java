import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class solutionSimpleIntrestWindow
{

    JFrame frame;

    solutionSimpleIntrestWindow()
    {
        ImageIcon i=new ImageIcon("calcificIcon.png");
        ImageIcon a=new ImageIcon("simpleIntrestFormula.png");

        JLabel label1=new JLabel();
        label1.setText("Let Principal be P");
        label1.setBounds(20,5,400,70);
        label1.setFont(new Font("Agency Fb",Font.BOLD,50));
        label1.setForeground(Color.BLACK);

        JLabel label2=new JLabel();
        label2.setText("Let Rate be R");
        label2.setBounds(20,70,300,70);
        label2.setFont(new Font("Agency Fb",Font.BOLD,50));
        label2.setForeground(Color.BLACK);

        JLabel label3=new JLabel();
        label3.setText("Let Time be T");
        label3.setBounds(20,130,300,70);
        label3.setFont(new Font("Agency Fb",Font.BOLD,50));
        label3.setForeground(Color.BLACK);

        JLabel label4=new JLabel();
        label4.setText("Amount A=P+i");
        label4.setBounds(20,235,300,70);
        label4.setFont(new Font("Agency Fb",Font.BOLD,60));
        label4.setForeground(Color.BLACK);

        JLabel label5=new JLabel();
        label5.setText("Interest 'i' ");
        label5.setBounds(480,10,300,70);
        label5.setFont(new Font("Agency Fb",Font.BOLD,60));
        label5.setForeground(Color.BLACK);

        JLabel image=new JLabel();
        image.setIcon(a);
        image.setBounds(425,40,400,300);

        frame=new JFrame();
        frame.setSize(800,370);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setTitle("Simple Interest Solution");
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(191, 255, 119));

        frame.setIconImage(i.getImage());

        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(image);
    }
}
