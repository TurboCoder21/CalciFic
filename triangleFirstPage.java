import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class triangleFirstPage implements ActionListener {

    JButton scaleneTriangle;
    JButton equilateralTriangle;
    JButton isoscelesTriangle;

    JFrame frame;

    triangleFirstPage()
    {
        ImageIcon i=new ImageIcon("calcificIcon.png");

        JLabel label=new JLabel();
        label.setText("TRIANGLE");
        label.setBounds(320,5,200,70);
        label.setFont(new Font("Agency Fb",Font.BOLD,50));
        label.setForeground(Color.BLACK);

        JLabel label1=new JLabel();
        label1.setText("SELECT ONE OF THE FOLLOWING");
        label1.setBounds(175,70,500,70);
        label1.setFont(new Font("Agency Fb",Font.BOLD,45));
        label1.setForeground(Color.BLACK);

        scaleneTriangle=new JButton();
        scaleneTriangle.setBounds(278,200,250,40);
        scaleneTriangle.addActionListener(this);
        scaleneTriangle.setText("SCALENE TRIANGLE");
        scaleneTriangle.setFocusable(false);
        scaleneTriangle.setFont(new Font("Agency Fb",Font.BOLD,30));
        scaleneTriangle.setForeground(Color.black);
        scaleneTriangle.setBackground(Color.white);

        equilateralTriangle=new JButton();
        equilateralTriangle.setBounds(15,200,250,40);
        equilateralTriangle.addActionListener(this);
        equilateralTriangle.setText("EQUILATERAL TRIANGLE");
        equilateralTriangle.setFocusable(false);
        equilateralTriangle.setFont(new Font("Agency Fb",Font.BOLD,30));
        equilateralTriangle.setForeground(Color.black);
        equilateralTriangle.setBackground(Color.white);

        isoscelesTriangle=new JButton();
        isoscelesTriangle.setBounds(540,200,240,40);
        isoscelesTriangle.addActionListener(this);
        isoscelesTriangle.setText("ISOSCELES TRIANGLE");
        isoscelesTriangle.setFocusable(false);
        isoscelesTriangle.setFont(new Font("Agency Fb",Font.BOLD,30));
        isoscelesTriangle.setForeground(Color.black);
        isoscelesTriangle.setBackground(Color.white);

        frame=new JFrame();
        frame.setLayout(null);
        frame.setSize(811,300);
        frame.setTitle("Triangle");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setVisible(true);
        frame.setIconImage(i.getImage());
        frame.getContentPane().setBackground(new Color(191, 255, 119));

        frame.add(label);
        frame.add(label1);
        frame.add(scaleneTriangle);
        frame.add(equilateralTriangle);
        frame.add(isoscelesTriangle);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==equilateralTriangle)
        {
            new equilateralTriangleWindow();
            frame.setVisible(false);
        }
        if (e.getSource()==isoscelesTriangle)
        {
            new isoscelesTriangleWindow();
            frame.setVisible(false);
        }
        if (e.getSource()==scaleneTriangle)
        {
            new scaleneTriangleWindow();
            frame.setVisible(false);
        }
    }
}
