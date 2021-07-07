import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class squareWindow implements ActionListener {

    JTextField radius;
    JButton area;
    JButton perimeter;
    JTextField areaT;
    JTextField perimeterT;
    JButton solution;
    JButton clear;

    double s;

    squareWindow()
    {
        ImageIcon i=new ImageIcon("calcificIcon.png");

        JLabel label1=new JLabel();
        label1.setText("Side~");
        label1.setBounds(10,10,200,70);
        label1.setFont(new Font("Agency Fb",Font.BOLD,50));
        label1.setForeground(Color.BLACK);

        radius=new JTextField();
        radius.setPreferredSize(new Dimension(250,40));
        radius.setBounds(200,27,320,40);
        radius.setFont(new Font("Veranda",Font.BOLD,30));
        radius.setForeground(Color.black);
        radius.setBackground(Color.white);
        radius.setCaretColor( Color.black);

        area=new JButton();
        area.setBounds(45,100,170,40);
        area.addActionListener(this);
        area.setText("AREA");
        area.setFocusable(false);
        area.setFont(new Font("Agency Fb",Font.BOLD,30));
        area.setForeground(Color.black);
        area.setBackground(Color.white);

        perimeter=new JButton();
        perimeter.setBounds(310,100,170,40);
        perimeter.addActionListener(this);
        perimeter.setText("PERIMETER");
        perimeter.setFocusable(false);
        perimeter.setFont(new Font("Agency Fb",Font.BOLD,30));
        perimeter.setForeground(Color.black);
        perimeter.setBackground(Color.white);

        JLabel areaLabel=new JLabel();
        areaLabel.setText("Area~");
        areaLabel.setBounds(10,180,200,70);
        areaLabel.setFont(new Font("Agency Fb",Font.BOLD,50));
        areaLabel.setForeground(Color.BLACK);

        areaT=new JTextField();
        areaT.setPreferredSize(new Dimension(250,40));
        areaT.setBounds(250,197,270,40);
        areaT.setFont(new Font("Veranda",Font.BOLD,30));
        areaT.setForeground(Color.black);
        areaT.setBackground(Color.white);
        areaT.setCaretColor( Color.black);
        areaT.setEditable(false);

        JLabel perimeterLabel=new JLabel();
        perimeterLabel.setText("Perimeter~");
        perimeterLabel.setBounds(10,250,220,70);
        perimeterLabel.setFont(new Font("Agency Fb",Font.BOLD,50));
        perimeterLabel.setForeground(Color.BLACK);

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
        frame.setTitle("Square");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setVisible(true);
        frame.setIconImage(i.getImage());
        frame.getContentPane().setBackground(new Color(191, 255, 119));

        frame.add(label1);
        frame.add(radius);
        frame.add(area);
        frame.add(perimeter);
        frame.add(areaT);
        frame.add(perimeterT);
        frame.add(areaLabel);
        frame.add(perimeterLabel);
        frame.add(solution);
        frame.add(clear);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==area)
        {
            s=Double.parseDouble(radius.getText());
            double ssquare=Math.pow(s,2);
            areaT.setText(String.valueOf(ssquare));
        }
        if (e.getSource()==perimeter)
        {
            s=Double.parseDouble(radius.getText());
            double perimeterAns=s*4;
            perimeterT.setText(String.valueOf(perimeterAns));
        }
        if (e.getSource()==clear)
        {
            areaT.setText("");
            perimeterT.setText("");
            radius.setText("");
        }
        if (e.getSource()==solution)
        {
            new SquareSolution();
        }
    }
}
