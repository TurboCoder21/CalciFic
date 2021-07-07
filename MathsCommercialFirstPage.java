import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MathsCommercialFirstPage implements ActionListener
{
    JFrame frame;
    JButton simpleInterest;
    JButton recuringDeposit;
    JButton compundIntrest;

    MathsCommercialFirstPage()
    {
        ImageIcon i=new ImageIcon("calcificIcon.png");

        JLabel label=new JLabel();
        label.setText("COMMERCIAL MATHEMATICS");
        label.setBounds(160,25,500,70);
        label.setFont(new Font("Agency Fb",Font.BOLD,50));
        label.setForeground(Color.BLACK);

        JLabel label1=new JLabel();
        label1.setText("SELECT ONE OF THE FOLLOWING");
        label1.setBounds(215,80,500,70);
        label1.setFont(new Font("Agency Fb",Font.BOLD,35));
        label1.setForeground(Color.BLACK);

        simpleInterest=new JButton();
        simpleInterest.setBounds(15,250,240,40);
        simpleInterest.addActionListener(this);
        simpleInterest.setText("SIMPLE INTEREST");
        simpleInterest.setFocusable(false);
        simpleInterest.setFont(new Font("Agency Fb",Font.BOLD,30));
        simpleInterest.setForeground(Color.black);
        simpleInterest.setBackground(Color.white);

        recuringDeposit=new JButton();
        recuringDeposit.setBounds(268,250,250,40);
        recuringDeposit.addActionListener(this);
        recuringDeposit.setText("RECURRING DEPOSIT");
        recuringDeposit.setFocusable(false);
        recuringDeposit.setFont(new Font("Agency Fb",Font.BOLD,30));
        recuringDeposit.setForeground(Color.black);
        recuringDeposit.setBackground(Color.white);

        compundIntrest=new JButton();
        compundIntrest.setBounds(530,250,240,40);
        compundIntrest.addActionListener(this);
        compundIntrest.setText("COMPOUND INTEREST");
        compundIntrest.setFocusable(false);
        compundIntrest.setFont(new Font("Agency Fb",Font.BOLD,30));
        compundIntrest.setForeground(Color.black);
        compundIntrest.setBackground(Color.white);

        frame=new JFrame();
        frame.setLayout(null);
        frame.setSize(800,370);
        frame.setTitle("Commercial Mathematics");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setVisible(true);
        frame.setIconImage(i.getImage());
        frame.getContentPane().setBackground(new Color(191, 255, 119));

        frame.add(label);
        frame.add(label1);
        frame.add(simpleInterest);
        frame.add(recuringDeposit);
        frame.add(compundIntrest);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==simpleInterest)
        {
            new simpleIntrestWindow();
            frame.setVisible(false);
        }
        if (e.getSource()==compundIntrest)
        {
            new compoundintrestWindow();
            frame.setVisible(false);
        }
        if (e.getSource()==recuringDeposit)
        {
            new reccuringDepositWindow();
            frame.setVisible(false);
        }

    }
}
