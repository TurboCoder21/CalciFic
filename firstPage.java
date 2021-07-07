import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class firstPage implements ActionListener
{
    JButton commercial;
    JButton physics;
    JFrame frame;
    JButton geometry;
    JButton about;
    JButton calci;
    JButton advance;

    firstPage()
    {
        ImageIcon i=new ImageIcon("calcificIcon.png");

        JLabel label=new JLabel();
        label.setText("WELCOME TO");
        label.setBounds(230,5,370,70);
        label.setFont(new Font("Palatino Linotype",Font.BOLD,50));
        label.setForeground(Color.BLACK);

        JLabel label1=new JLabel();
        label1.setText("CalciFic");
        label1.setBounds(310,60,300,70);
        label1.setFont(new Font("Palatino Linotype",Font.BOLD,50));
        label1.setForeground(Color.BLACK);

        JLabel image=new JLabel();
        image.setIcon(i);
        image.setBounds(250,130,400,400);

        JLabel label2=new JLabel();
        label2.setText("MATHS");
        label2.setBounds(55,420,300,70);
        label2.setFont(new Font("Agency Fb",Font.BOLD,50));
        label2.setForeground(Color.BLACK);

        JLabel label3=new JLabel();
        label3.setText("MATHS");
        label3.setBounds(645,420,300,70);
        label3.setFont(new Font("Agency Fb",Font.BOLD,50));
        label3.setForeground(Color.BLACK);

        JLabel label4=new JLabel();
        label4.setText("PHYSICS");
        label4.setBounds(40,545,300,70);
        label4.setFont(new Font("Agency Fb",Font.BOLD,50));
        label4.setForeground(Color.BLACK);

        JLabel label5=new JLabel();
        label5.setText("MATHS");
        label5.setBounds(645,545,300,70);
        label5.setFont(new Font("Agency Fb",Font.BOLD,50));
        label5.setForeground(Color.BLACK);


        commercial=new JButton();
        commercial.setBounds(15,485,200,40);
        commercial.addActionListener(this);
        commercial.setText("COMMERCIAL");
        commercial.setFocusable(false);
        commercial.setFont(new Font("Agency Fb",Font.BOLD,30));
        commercial.setForeground(Color.black);
        commercial.setBackground(Color.white);

        physics=new JButton();
        physics.setBounds(15,610,200,40);
        physics.addActionListener(this);
        physics.setText("STANDARD");
        physics.setFocusable(false);
        physics.setFont(new Font("Agency Fb",Font.BOLD,30));
        physics.setForeground(Color.black);
        physics.setBackground(Color.white);

        advance=new JButton();
        advance.setBounds(600,610,200,40);
        advance.addActionListener(this);
        advance.setText("ADVANCE");
        advance.setFocusable(false);
        advance.setFont(new Font("Agency Fb",Font.BOLD,30));
        advance.setForeground(Color.black);
        advance.setBackground(Color.white);

        geometry=new JButton();
        geometry.setBounds(600,485,200,40);
        geometry.addActionListener(this);
        geometry.setText("GEOMETRY");
        geometry.setFocusable(false);
        geometry.setFont(new Font("Agency Fb",Font.BOLD,30));
        geometry.setForeground(Color.black);
        geometry.setBackground(Color.white);

        about=new JButton();
        about.setBounds(320,610,170,40);
        about.addActionListener(this);
        about.setText("ABOUT");
        about.setFocusable(false);
        about.setFont(new Font("Agency Fb",Font.BOLD,30));
        about.setForeground(Color.black);
        about.setBackground(Color.white);

        calci=new JButton();
        calci.setBounds(275,455,128,40);
        calci.addActionListener(this);
        calci.setText("Calculator");
        calci.setFocusable(false);
        calci.setFont(new Font("Agency Fb",Font.BOLD,30));
        calci.setForeground(Color.black);
        calci.setBackground(Color.white);

        frame=new JFrame();
        frame.setSize(830,700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("CalciFic");
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(191, 255, 119));

        frame.setIconImage(i.getImage());

        frame.add(calci);
        frame.add(label);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(image);
        frame.add(commercial);
        frame.add(geometry);
        frame.add(about);
        frame.add(physics);
        frame.add(label5);
        frame.add(advance);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==about)
        {
            new aboutMaker();
        }

        if (e.getSource()==commercial)
        {
            new MathsCommercialFirstPage();
        }

        if (e.getSource()==calci)
        {
            new simpleCalculator();
        }

        if (e.getSource()==geometry)
        {
            new MathsGeometryFirstPage();
        }
        if (e.getSource()==advance)
        {
            new MathsAdvanceFirstPage();
        }
        if (e.getSource()==physics)
        {
            new physicsFirstPage();
        }
    }
}
