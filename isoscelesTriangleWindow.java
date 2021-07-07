import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class isoscelesTriangleWindow implements ActionListener {

    JTextField sideA;
    JTextField sideB;
    JTextField AreaInput;
    JTextField PerimeterInput;

    JButton area;
    JButton perimeter;
    JButton clear;
    JButton solution;

    double varSideA;
    double varSideB;


    isoscelesTriangleWindow()
    {
        ImageIcon i=new ImageIcon("calcificIcon.png");
        ImageIcon a=new ImageIcon("IsoscelesTriangleImage.png");

        JLabel image=new JLabel();
        image.setIcon(a);
        image.setBounds(484,0,250,250);

        JLabel label1=new JLabel();
        label1.setText("Side A~");
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
        label2.setText("Side B~");
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
        area.setBounds(40,200,170,40);
        area.addActionListener(this);
        area.setText("AREA");
        area.setFocusable(false);
        area.setFont(new Font("Agency Fb",Font.BOLD,30));
        area.setForeground(Color.black);
        area.setBackground(Color.white);

        perimeter=new JButton();
        perimeter.setBounds(270,200,170,40);
        perimeter.addActionListener(this);
        perimeter.setText("PERIMETER");
        perimeter.setFocusable(false);
        perimeter.setFont(new Font("Agency Fb",Font.BOLD,30));
        perimeter.setForeground(Color.black);
        perimeter.setBackground(Color.white);

        JLabel label3=new JLabel();
        label3.setText("Area~");
        label3.setBounds(10,270,200,70);
        label3.setFont(new Font("Agency Fb",Font.BOLD,50));
        label3.setForeground(Color.BLACK);

        AreaInput=new JTextField();
        AreaInput.setPreferredSize(new Dimension(250,40));
        AreaInput.setBounds(240,287,270,40);
        AreaInput.setFont(new Font("Veranda",Font.BOLD,30));
        AreaInput.setForeground(Color.black);
        AreaInput.setBackground(Color.white);
        AreaInput.setCaretColor( Color.black);
        AreaInput.setEditable(false);

        JLabel label4=new JLabel();
        label4.setText("Perimeter~");
        label4.setBounds(10,320,230,70);
        label4.setFont(new Font("Agency Fb",Font.BOLD,50));
        label4.setForeground(Color.BLACK);

        PerimeterInput=new JTextField();
        PerimeterInput.setPreferredSize(new Dimension(250,40));
        PerimeterInput.setBounds(240,337,270,40);
        PerimeterInput.setFont(new Font("Veranda",Font.BOLD,30));
        PerimeterInput.setForeground(Color.black);
        PerimeterInput.setBackground(Color.white);
        PerimeterInput.setCaretColor( Color.black);
        PerimeterInput.setEditable(false);

        clear=new JButton();
        clear.setBounds(570,310,100,40);
        clear.addActionListener(this);
        clear.setText("RESET");
        clear.setFocusable(false);
        clear.setFont(new Font("Agency Fb",Font.BOLD,30));
        clear.setForeground(Color.black);
        clear.setBackground(Color.white);

        solution=new JButton();
        solution.setBounds(165,407,170,40);
        solution.addActionListener(this);
        solution.setText("SOLUTION");
        solution.setFocusable(false);
        solution.setFont(new Font("Agency Fb",Font.BOLD,30));
        solution.setForeground(Color.black);
        solution.setBackground(Color.white);

        JFrame frame=new JFrame();
        frame.setLayout(null);
        frame.setSize(750,500);
        frame.setTitle("Isosceles Triangle");
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
        frame.add(perimeter);
        frame.add(label3);
        frame.add(AreaInput);
        frame.add(label4);
        frame.add(PerimeterInput);
        frame.add(clear);
        frame.add(solution);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==clear)
        {
            AreaInput.setText("");
            PerimeterInput.setText("");
            sideA.setText("");
            sideB.setText("");
        }
        if (e.getSource()==area)
        {
            varSideA=Double.parseDouble(sideA.getText());
            varSideB=Double.parseDouble(sideB.getText());

            double z=Math.pow(varSideA,2);
            double lol=4*z;
            double lolipop=Math.pow(varSideB,2);

            double asqrminusbsqr=lol-lolipop;
            double root=Math.sqrt(asqrminusbsqr);

            double zeropointtowfive=0.25;

            double ans=zeropointtowfive*varSideB*root;

            AreaInput.setText(String.valueOf(ans));
        }
        if (e.getSource()==perimeter)
        {
            varSideA=Double.parseDouble(sideA.getText());
            varSideB=Double.parseDouble(sideB.getText());

            double a2=varSideA*2;
            double answer=a2+varSideB;

            PerimeterInput.setText(String.valueOf(answer));
        }
        if (e.getSource()==solution)
        {
            new isoscelesTriangleSolutionWindow();
        }
    }
}
