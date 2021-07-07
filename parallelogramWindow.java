import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class parallelogramWindow implements ActionListener {

    JTextField sideA;
    JTextField sideB;
    JTextField AreaInput;


    JButton area;
    JButton clear;
    JButton solution;

    parallelogramWindow()
    {
        ImageIcon i=new ImageIcon("calcificIcon.png");
        ImageIcon a=new ImageIcon("parallelogramImage.png");

        JLabel image=new JLabel();
        image.setIcon(a);
        image.setBounds(484,0,450,250);

        JLabel label1=new JLabel();
        label1.setText("Base~");
        label1.setBounds(10,10,200,70);
        label1.setFont(new Font("Agency Fb",Font.BOLD,50));
        label1.setForeground(Color.BLACK);

        sideA=new JTextField();
        sideA.setPreferredSize(new Dimension(250,40));
        sideA.setBounds(170,27,270,40);
        sideA.setFont(new Font("Veranda",Font.BOLD,30));
        sideA.setForeground(Color.black);
        sideA.setBackground(Color.white);
        sideA.setCaretColor( Color.black);

        JLabel label2=new JLabel();
        label2.setText("Height~");
        label2.setBounds(10,90,200,70);
        label2.setFont(new Font("Agency Fb",Font.BOLD,50));
        label2.setForeground(Color.BLACK);

        sideB=new JTextField();
        sideB.setPreferredSize(new Dimension(250,40));
        sideB.setBounds(170,107,270,40);
        sideB.setFont(new Font("Veranda",Font.BOLD,30));
        sideB.setForeground(Color.black);
        sideB.setBackground(Color.white);
        sideB.setCaretColor( Color.black);

        area=new JButton();
        area.setBounds(225,190,170,40);
        area.addActionListener(this);
        area.setText("AREA");
        area.setFocusable(false);
        area.setFont(new Font("Agency Fb",Font.BOLD,30));
        area.setForeground(Color.black);
        area.setBackground(Color.white);


        JLabel label3=new JLabel();
        label3.setText("Area~");
        label3.setBounds(10,260,200,70);
        label3.setFont(new Font("Agency Fb",Font.BOLD,50));
        label3.setForeground(Color.BLACK);

        AreaInput=new JTextField();
        AreaInput.setPreferredSize(new Dimension(250,40));
        AreaInput.setBounds(170,277,270,40);
        AreaInput.setFont(new Font("Veranda",Font.BOLD,30));
        AreaInput.setForeground(Color.black);
        AreaInput.setBackground(Color.white);
        AreaInput.setCaretColor( Color.black);
        AreaInput.setEditable(false);

        clear=new JButton();
        clear.setBounds(550,277,150,40);
        clear.addActionListener(this);
        clear.setText("RESET");
        clear.setFocusable(false);
        clear.setFont(new Font("Agency Fb",Font.BOLD,30));
        clear.setForeground(Color.black);
        clear.setBackground(Color.white);

        solution=new JButton();
        solution.setBounds(740,277,170,40);
        solution.addActionListener(this);
        solution.setText("SOLUTION");
        solution.setFocusable(false);
        solution.setFont(new Font("Agency Fb",Font.BOLD,30));
        solution.setForeground(Color.black);
        solution.setBackground(Color.white);

        JFrame frame=new JFrame();
        frame.setLayout(null);
        frame.setSize(950,380);
        frame.setTitle("Parallelogram");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setVisible(true);
        frame.setIconImage(i.getImage());
        frame.getContentPane().setBackground(new Color(191, 255, 119));

        frame.add(image);
        frame.add(label1);
        frame.add(sideA);
        frame.add(label2);
        frame.add(sideB);
        frame.add(area);
        frame.add(label3);
        frame.add(AreaInput);
        frame.add(clear);
        frame.add(solution);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==clear)
        {
            AreaInput.setText("");
            sideA.setText("");
            sideB.setText("");
        }
        if (e.getSource()==solution)
        {
            new parallelogramSolutionWindow();
        }
        if (e.getSource()==area)
        {
            double varSideA=Double.parseDouble(sideA.getText());
            double varSideB=Double.parseDouble(sideB.getText());


            double ans=varSideA*varSideB;

            AreaInput.setText(String.valueOf(ans));
        }
    }
}
