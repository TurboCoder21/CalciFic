import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class physicsFirstPage implements ActionListener {

    JButton torque;
    JButton acceleration;
    JButton temperature;

    JFrame frame;

    physicsFirstPage()
    {
        ImageIcon i=new ImageIcon("calcificIcon.png");

        JLabel label=new JLabel();
        label.setText("PHYSICS STANDARD");
        label.setBounds(218,25,500,70);
        label.setFont(new Font("Agency Fb",Font.BOLD,50));
        label.setForeground(Color.BLACK);

        JLabel label1=new JLabel();
        label1.setText("SELECT ONE OF THE FOLLOWING");
        label1.setBounds(215,80,500,70);
        label1.setFont(new Font("Agency Fb",Font.BOLD,35));
        label1.setForeground(Color.BLACK);

        torque=new JButton();
        torque.setBounds(35,250,170,40);
        torque.addActionListener(this);
        torque.setText("TORQUE");
        torque.setFocusable(false);
        torque.setFont(new Font("Agency Fb",Font.BOLD,30));
        torque.setForeground(Color.black);
        torque.setBackground(Color.white);

        acceleration=new JButton();
        acceleration.setBounds(290,250,170,40);
        acceleration.addActionListener(this);
        acceleration.setText("ACCELERATION");
        acceleration.setFocusable(false);
        acceleration.setFont(new Font("Agency Fb",Font.BOLD,30));
        acceleration.setForeground(Color.black);
        acceleration.setBackground(Color.white);

        temperature=new JButton();
        temperature.setBounds(550,250,170,40);
        temperature.addActionListener(this);
        temperature.setText("TEMPERATURE");
        temperature.setFocusable(false);
        temperature.setFont(new Font("Agency Fb",Font.BOLD,30));
        temperature.setForeground(Color.black);
        temperature.setBackground(Color.white);

        frame=new JFrame();
        frame.setLayout(null);
        frame.setSize(800,370);
        frame.setTitle("Physics");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setVisible(true);
        frame.setIconImage(i.getImage());
        frame.getContentPane().setBackground(new Color(191, 255, 119));

        frame.add(label);
        frame.add(label1);
        frame.add(temperature);
        frame.add(torque);
        frame.add(acceleration);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==torque)
        {
            new TorqueWindow();
            frame.setVisible(false);
        }
        if (e.getSource()==acceleration)
        {
            new accelerationWindow();
            frame.setVisible(false);
        }
        if (e.getSource()==temperature)
        {
            new tempratureWindow();
            frame.setVisible(false);
        }
    }
}
