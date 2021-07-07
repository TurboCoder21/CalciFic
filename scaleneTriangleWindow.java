import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class scaleneTriangleWindow implements ActionListener {

    JTextField sideA;
    JTextField sideB;
    JTextField AreaInput;
    JTextField PerimeterInput;
    JTextField sideC;

    JButton area;
    JButton perimeter;
    JButton clear;
    JButton solution;

    double a;
    double b;
    double c;

    scaleneTriangleWindow()
    {
        ImageIcon i=new ImageIcon("calcificIcon.png");
        ImageIcon a=new ImageIcon("ScaleneTriangleImage.png");

        JLabel image=new JLabel();
        image.setIcon(a);
        image.setBounds(484,0,350,200);

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

        JLabel sideClabel=new JLabel();
        sideClabel.setText("Side C~");
        sideClabel.setBounds(10,170,200,70);
        sideClabel.setFont(new Font("Agency Fb",Font.BOLD,50));
        sideClabel.setForeground(Color.BLACK);

        sideC=new JTextField();
        sideC.setPreferredSize(new Dimension(250,40));
        sideC.setBounds(170,187,270,40);
        sideC.setFont(new Font("Veranda",Font.BOLD,30));
        sideC.setForeground(Color.black);
        sideC.setBackground(Color.white);
        sideC.setCaretColor( Color.black);

        area=new JButton();
        area.setBounds(40,270,170,40);
        area.addActionListener(this);
        area.setText("AREA");
        area.setFocusable(false);
        area.setFont(new Font("Agency Fb",Font.BOLD,30));
        area.setForeground(Color.black);
        area.setBackground(Color.white);

        perimeter=new JButton();
        perimeter.setBounds(270,270,170,40);
        perimeter.addActionListener(this);
        perimeter.setText("PERIMETER");
        perimeter.setFocusable(false);
        perimeter.setFont(new Font("Agency Fb",Font.BOLD,30));
        perimeter.setForeground(Color.black);
        perimeter.setBackground(Color.white);

        JLabel label3=new JLabel();
        label3.setText("Area~");
        label3.setBounds(10,340,200,70);
        label3.setFont(new Font("Agency Fb",Font.BOLD,50));
        label3.setForeground(Color.BLACK);

        AreaInput=new JTextField();
        AreaInput.setPreferredSize(new Dimension(250,40));
        AreaInput.setBounds(240,357,270,40);
        AreaInput.setFont(new Font("Veranda",Font.BOLD,30));
        AreaInput.setForeground(Color.black);
        AreaInput.setBackground(Color.white);
        AreaInput.setCaretColor( Color.black);
        AreaInput.setEditable(false);

        JLabel label4=new JLabel();
        label4.setText("Perimeter~");
        label4.setBounds(10,400,230,70);
        label4.setFont(new Font("Agency Fb",Font.BOLD,50));
        label4.setForeground(Color.BLACK);

        PerimeterInput=new JTextField();
        PerimeterInput.setPreferredSize(new Dimension(250,40));
        PerimeterInput.setBounds(240,417,270,40);
        PerimeterInput.setFont(new Font("Veranda",Font.BOLD,30));
        PerimeterInput.setForeground(Color.black);
        PerimeterInput.setBackground(Color.white);
        PerimeterInput.setCaretColor( Color.black);
        PerimeterInput.setEditable(false);

        clear=new JButton();
        clear.setBounds(580,417,150,40);
        clear.addActionListener(this);
        clear.setText("RESET");
        clear.setFocusable(false);
        clear.setFont(new Font("Agency Fb",Font.BOLD,30));
        clear.setForeground(Color.black);
        clear.setBackground(Color.white);

        solution=new JButton();
        solution.setBounds(570,270,170,40);
        solution.addActionListener(this);
        solution.setText("SOLUTION");
        solution.setFocusable(false);
        solution.setFont(new Font("Agency Fb", Font.BOLD,30));
        solution.setForeground(Color.black);
        solution.setBackground(Color.white);

        JFrame frame=new JFrame();
        frame.setLayout(null);
        frame.setSize(850,520);
        frame.setTitle("Scalene Triangle");
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
        frame.add(sideClabel);
        frame.add(sideC);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==area)
        {
            a=Double.parseDouble(sideA.getText());
            b=Double.parseDouble(sideB.getText());
            c=Double.parseDouble(sideC.getText());

            double aplusbplusc=a+b+c;
            double s=aplusbplusc/2;

            double sminusa=s-a;
            double sminusb=s-b;
            double sminusc=s-c;

            double pro= sminusa*sminusb*sminusc;
            double sintopro=s*pro;

            double answer=Math.sqrt(sintopro);
            AreaInput.setText(String.valueOf(answer));
        }
        if (e.getSource()==clear)
        {
            sideA.setText("");
            sideB.setText("");
            sideC.setText("");
            AreaInput.setText("");
            PerimeterInput.setText("");
        }
        if (e.getSource()==perimeter)
        {
            a=Double.parseDouble(sideA.getText());
            b=Double.parseDouble(sideB.getText());
            c=Double.parseDouble(sideC.getText());

            double perimeterAns=a+b+c;

            PerimeterInput.setText(String.valueOf(perimeterAns));
        }
        if (e.getSource()==solution)
        {
            new scaleneTriangleSolution();
        }
    }
}
