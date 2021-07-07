import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MathsAdvanceFirstPage implements ActionListener {

    JFrame frame;

    JButton power;
    JButton root;

    MathsAdvanceFirstPage()
    {
        ImageIcon i=new ImageIcon("calcificIcon.png");

        JLabel label=new JLabel();
        label.setText("ADVANCE MATHEMATICS");
        label.setBounds(140,25,500,70);
        label.setFont(new Font("Agency Fb",Font.BOLD,50));
        label.setForeground(Color.BLACK);

        JLabel label1=new JLabel();
        label1.setText("SELECT ONE OF THE FOLLOWING");
        label1.setBounds(120,90,500,70);
        label1.setFont(new Font("Agency Fb",Font.BOLD,40));
        label1.setForeground(Color.BLACK);

        power=new JButton();
        power.setBounds(130,200,150,40);
        power.addActionListener(this);
        power.setText("POWER");
        power.setFocusable(false);
        power.setFont(new Font("Agency Fb",Font.BOLD,30));
        power.setForeground(Color.black);
        power.setBackground(Color.white);

        root=new JButton();
        root.setBounds(390,200,150,40);
        root.addActionListener(this);
        root.setText("ROOT");
        root.setFocusable(false);
        root.setFont(new Font("Agency Fb",Font.BOLD,30));
        root.setForeground(Color.black);
        root.setBackground(Color.white);

        frame=new JFrame();
        frame.setLayout(null);
        frame.setSize(700,300);
        frame.setTitle("Advance Mathematics");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setVisible(true);
        frame.setIconImage(i.getImage());
        frame.getContentPane().setBackground(new Color(191, 255, 119));

        frame.add(label);
        frame.add(label1);
        frame.add(power);
        frame.add(root);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==root)
        {
            new rootWindow();
            frame.setVisible(false);
        }
        if (e.getSource()==power)
        {
            new powerWindow();
            frame.setVisible(false);
        }
    }
}
