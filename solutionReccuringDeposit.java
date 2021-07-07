import javax.swing.*;
import java.awt.*;

public class solutionReccuringDeposit {

    JFrame frame;

    solutionReccuringDeposit()
    {
        ImageIcon i=new ImageIcon("calcificIcon.png");
        ImageIcon a=new ImageIcon("reccuringDepositFormula.png");

        JLabel label1=new JLabel();
        label1.setText("----------INTEREST----------");
        label1.setBounds(140,5,580,70);
        label1.setFont(new Font("Agency Fb",Font.BOLD,60));
        label1.setForeground(Color.BLACK);

        JLabel image=new JLabel();
        image.setIcon(a);
        image.setBounds(65,80,800,400);

        JLabel label2=new JLabel();
        label2.setText("----------MATURITY VALUE----------");
        label2.setBounds(65,510,700,70);
        label2.setFont(new Font("Agency Fb",Font.BOLD,60));
        label2.setForeground(Color.BLACK);

        JLabel label3=new JLabel();
        label3.setText("MATURITY VALUE = PRINCIPAL*TIME + INTEREST");
        label3.setBounds(18,565,1500,100);
        label3.setFont(new Font("Agency Fb",Font.BOLD,50));
        label3.setForeground(Color.BLACK);

        frame=new JFrame();
        frame.setSize(850,700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setTitle("Recurring Deposit Solution");
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
