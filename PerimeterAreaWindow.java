import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PerimeterAreaWindow implements ActionListener {

    JButton circle;
    JButton square;
    JButton rectangle;
    JButton trapezium;
    JButton parallelogram;
    JButton rhombus;
    JButton triangle;

    PerimeterAreaWindow()
    {
        ImageIcon i=new ImageIcon("calcificIcon.png");

        JLabel label1=new JLabel();
        label1.setText("SELECT ONE OF THE FOLLOWING");
        label1.setBounds(25,10,500,70);
        label1.setFont(new Font("Agency Fb",Font.BOLD,45));
        label1.setForeground(Color.BLACK);

        circle=new JButton();
        circle.setBounds(10,90,150,40);
        circle.addActionListener(this);
        circle.setText("CIRCLE");
        circle.setFocusable(false);
        circle.setFont(new Font("Agency Fb",Font.BOLD,35));
        circle.setForeground(Color.black);
        circle.setBackground(Color.white);

        square=new JButton();
        square.setBounds(350,90,150,40);
        square.addActionListener(this);
        square.setText("SQUARE");
        square.setFocusable(false);
        square.setFont(new Font("Agency Fb",Font.BOLD,35));
        square.setForeground(Color.black);
        square.setBackground(Color.white);

        rectangle=new JButton();
        rectangle.setBounds(170,90,170,40);
        rectangle.addActionListener(this);
        rectangle.setText("RECTANGLE");
        rectangle.setFocusable(false);
        rectangle.setFont(new Font("Agency Fb",Font.BOLD,35));
        rectangle.setForeground(Color.black);
        rectangle.setBackground(Color.white);

        trapezium=new JButton();
        trapezium.setBounds(170,210,170,40);
        trapezium.addActionListener(this);
        trapezium.setText("TRAPEZIUM");
        trapezium.setFocusable(false);
        trapezium.setFont(new Font("Agency Fb",Font.BOLD,35));
        trapezium.setForeground(Color.black);
        trapezium.setBackground(Color.white);

        rhombus=new JButton();
        rhombus.setBounds(10,210,150,40);
        rhombus.addActionListener(this);
        rhombus.setText("RHOMBUS");
        rhombus.setFocusable(false);
        rhombus.setFont(new Font("Agency Fb",Font.BOLD,35));
        rhombus.setForeground(Color.black);
        rhombus.setBackground(Color.white);

        triangle=new JButton();
        triangle.setBounds(350,210,150,40);
        triangle.addActionListener(this);
        triangle.setText("TRIANGLE");
        triangle.setFocusable(false);
        triangle.setFont(new Font("Agency Fb",Font.BOLD,35));
        triangle.setForeground(Color.black);
        triangle.setBackground(Color.white);

        parallelogram=new JButton();
        parallelogram.setBounds(130,150,250,40);
        parallelogram.addActionListener(this);
        parallelogram.setText("PARALLELOGRAM");
        parallelogram.setFocusable(false);
        parallelogram.setFont(new Font("Agency Fb",Font.BOLD,35));
        parallelogram.setForeground(Color.black);
        parallelogram.setBackground(Color.white);

        JFrame frame=new JFrame();
        frame.setSize(527,325);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setTitle("Area and Perimeter");
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(191, 255, 119));

        frame.setIconImage(i.getImage());

        frame.add(circle);
        frame.add(square);
        frame.add(rectangle);
        frame.add(trapezium);
        frame.add(parallelogram);
        frame.add(rhombus);
        frame.add(triangle);
        frame.add(label1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==circle)
        {
            new circle();
        }
        if (e.getSource()==rectangle)
        {
            new rectangleWindow();
        }
        if (e.getSource()==square)
        {
            new squareWindow();
        }
        if (e.getSource()==rhombus)
        {
            new RhombusWindow();
        }
        if (e.getSource()==trapezium)
        {
            new trapezium();
        }
        if (e.getSource()==triangle)
        {
            new triangleFirstPage();
        }
        if (e.getSource()==parallelogram)
        {
            new parallelogramWindow();
        }
    }
}
