import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class rectangleWindow implements ActionListener {

    JTextField length;
    JTextField breadth;
    JTextField areaT;
    JTextField perimeterT;

    JButton area;
    JButton perimeter;
    JButton solution;
    JButton clear;

    double l;
    double b;

    rectangleWindow()
    {
        ImageIcon i=new ImageIcon("calcificIcon.png");

        JLabel lengthLabel=new JLabel();
        lengthLabel.setText("Length~");
        lengthLabel.setBounds(10,10,150,70);
        lengthLabel.setFont(new Font("Agency Fb",Font.BOLD,50));
        lengthLabel.setForeground(Color.BLACK);

        length=new JTextField();
        length.setPreferredSize(new Dimension(250,40));
        length.setBounds(200,27,320,40);
        length.setFont(new Font("Veranda",Font.BOLD,30));
        length.setForeground(Color.black);
        length.setBackground(Color.white);
        length.setCaretColor( Color.black);

        JLabel breadthLabel=new JLabel();
        breadthLabel.setText("Breadth~");
        breadthLabel.setBounds(10,85,180,70);
        breadthLabel.setFont(new Font("Agency Fb",Font.BOLD,50));
        breadthLabel.setForeground(Color.BLACK);

        breadth=new JTextField();
        breadth.setPreferredSize(new Dimension(250,40));
        breadth.setBounds(200,100,320,40);
        breadth.setFont(new Font("Veranda",Font.BOLD,30));
        breadth.setForeground(Color.black);
        breadth.setBackground(Color.white);
        breadth.setCaretColor( Color.black);

        area=new JButton();
        area.setBounds(10,197,170,40);
        area.addActionListener(this);
        area.setText("AREA");
        area.setFocusable(false);
        area.setFont(new Font("Agency Fb",Font.BOLD,30));
        area.setForeground(Color.black);
        area.setBackground(Color.white);

        perimeter=new JButton();
        perimeter.setBounds(10,260,170,40);
        perimeter.addActionListener(this);
        perimeter.setText("PERIMETER");
        perimeter.setFocusable(false);
        perimeter.setFont(new Font("Agency Fb",Font.BOLD,30));
        perimeter.setForeground(Color.black);
        perimeter.setBackground(Color.white);


        areaT=new JTextField();
        areaT.setPreferredSize(new Dimension(250,40));
        areaT.setBounds(250,197,270,40);
        areaT.setFont(new Font("Veranda",Font.BOLD,30));
        areaT.setForeground(Color.black);
        areaT.setBackground(Color.white);
        areaT.setCaretColor( Color.black);
        areaT.setEditable(false);



        perimeterT=new JTextField();
        perimeterT.setPreferredSize(new Dimension(250,40));
        perimeterT.setBounds(250,261,270,40);
        perimeterT.setFont(new Font("Veranda",Font.BOLD,30));
        perimeterT.setForeground(Color.black);
        perimeterT.setBackground(Color.white);
        perimeterT.setCaretColor( Color.black);
        perimeterT.setEditable(false);

        solution=new JButton();
        solution.setBounds(160,350,170,40);
        solution.addActionListener(this);
        solution.setText("SOLUTION");
        solution.setFocusable(false);
        solution.setFont(new Font("Agency Fb",Font.BOLD,30));
        solution.setForeground(Color.black);
        solution.setBackground(Color.white);

        clear=new JButton();
        clear.setBounds(415,350,100,40);
        clear.addActionListener(this);
        clear.setText("RESET");
        clear.setFocusable(false);
        clear.setFont(new Font("Agency Fb",Font.BOLD,30));
        clear.setForeground(Color.black);
        clear.setBackground(Color.white);

        JFrame frame=new JFrame();
        frame.setLayout(null);
        frame.setSize(550,450);
        frame.setTitle("Rectangle");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setVisible(true);
        frame.setIconImage(i.getImage());
        frame.getContentPane().setBackground(new Color(191, 255, 119));

        frame.add(lengthLabel);
        frame.add(breadthLabel);
        frame.add(breadth);
        frame.add(length);
        frame.add(clear);
        frame.add(solution);
        frame.add(perimeter);
        frame.add(area);
        frame.add(areaT);
        frame.add(perimeterT);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==clear)
        {
            areaT.setText("");
            perimeterT.setText("");
            length.setText("");
            breadth.setText("");
        }
        if (e.getSource()==area)
        {
            l=Double.parseDouble(length.getText());
            b=Double.parseDouble(breadth.getText());

            double areaAnswer=l*b;

            areaT.setText(String.valueOf(areaAnswer));
        }
        if (e.getSource()==perimeter)
        {
            l=Double.parseDouble(length.getText());
            b=Double.parseDouble(breadth.getText());

            double perimeterAnswer=l+b;
            double pa=2*perimeterAnswer;

            perimeterT.setText(String.valueOf(pa));
        }
        if (e.getSource()==solution)
        {
            new rectangleSolution();
        }
    }
}
