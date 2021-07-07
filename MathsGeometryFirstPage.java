import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MathsGeometryFirstPage implements ActionListener
{
    JFrame frame;
    JButton pythagoras;
    JButton distance;
    JButton aandp;

    MathsGeometryFirstPage()
    {
        ImageIcon i=new ImageIcon("calcificIcon.png");

        JLabel label=new JLabel();
        label.setText("GEOMETRICAL MATHEMATICS");
        label.setBounds(175,25,500,70);
        label.setFont(new Font("Agency Fb",Font.BOLD,50));
        label.setForeground(Color.BLACK);

        JLabel label1=new JLabel();
        label1.setText("SELECT ONE OF THE FOLLOWING");
        label1.setBounds(230,80,500,70);
        label1.setFont(new Font("Agency Fb",Font.BOLD,35));
        label1.setForeground(Color.BLACK);

        pythagoras=new JButton();
        pythagoras.setBounds(278,250,250,40);
        pythagoras.addActionListener(this);
        pythagoras.setText("PYTHAGORAS THEOREM");
        pythagoras.setFocusable(false);
        pythagoras.setFont(new Font("Agency Fb",Font.BOLD,30));
        pythagoras.setForeground(Color.black);
        pythagoras.setBackground(Color.white);

        distance=new JButton();
        distance.setBounds(15,250,250,40);
        distance.addActionListener(this);
        distance.setText("DISTANCE FORMULA");
        distance.setFocusable(false);
        distance.setFont(new Font("Agency Fb",Font.BOLD,30));
        distance.setForeground(Color.black);
        distance.setBackground(Color.white);

        aandp=new JButton();
        aandp.setBounds(540,250,240,40);
        aandp.addActionListener(this);
        aandp.setText("AREA AND PERIMETER");
        aandp.setFocusable(false);
        aandp.setFont(new Font("Agency Fb",Font.BOLD,30));
        aandp.setForeground(Color.black);
        aandp.setBackground(Color.white);

        frame=new JFrame();
        frame.setLayout(null);
        frame.setSize(820,370);
        frame.setTitle("Geometrical Mathematics");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setVisible(true);
        frame.setIconImage(i.getImage());
        frame.getContentPane().setBackground(new Color(191, 255, 119));

        frame.add(label);
        frame.add(label1);
        frame.add(pythagoras);
        frame.add(distance);
        frame.add(aandp);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==pythagoras)
        {
            new pythagorasTheoremWindow();
            frame.setVisible(false);
        }
        if (e.getSource()==aandp)
        {
            new PerimeterAreaWindow();
            frame.setVisible(false);
        }
        if (e.getSource()==distance)
        {
            new distanceFormulaWindow();
            frame.setVisible(false);
        }

    }
}
