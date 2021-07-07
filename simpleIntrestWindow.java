import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class simpleIntrestWindow implements ActionListener {

    JFrame frame;
    JTextField principalInput;
    JTextField rateInput;
    JTextField timeInput;
    JTextField iotf;
    JTextField aotf;
    JButton output;
    JButton reset;
    JButton solution;

    double p;
    double r;
    double t;
    double prt;
    double i;
    double a;

    simpleIntrestWindow()
    {
        ImageIcon i=new ImageIcon("calcificIcon.png");

        JLabel plabel=new JLabel();
        plabel.setText("PRINCIPAL~");
        plabel.setBounds(20,20,300,60);
        plabel.setFont(new Font("Agency Fb",Font.BOLD,50));
        plabel.setForeground(Color.BLACK);

        JLabel rlabel=new JLabel();
        rlabel.setText("Rate~");
        rlabel.setBounds(20,100,300,60);
        rlabel.setFont(new Font("Agency Fb",Font.BOLD,50));
        rlabel.setForeground(Color.BLACK);

        JLabel tlabel=new JLabel();
        tlabel.setText("Time~");
        tlabel.setBounds(20,180,300,60);
        tlabel.setFont(new Font("Agency Fb",Font.BOLD,50));
        tlabel.setForeground(Color.BLACK);


        principalInput=new JTextField();
        principalInput.setPreferredSize(new Dimension(250,40));
        principalInput.setBounds(235,30,500,40);
        principalInput.setFont(new Font("Veranda",Font.BOLD,30));
        principalInput.setForeground(Color.black);
        principalInput.setBackground(Color.white);
        principalInput.setCaretColor( Color.black);

        rateInput=new JTextField();
        rateInput.setPreferredSize(new Dimension(250,40));
        rateInput.setBounds(235,110,500,40);
        rateInput.setFont(new Font("Veranda",Font.BOLD,30));
        rateInput.setForeground(Color.black);
        rateInput.setBackground(Color.white);
        rateInput.setCaretColor( Color.black);

        timeInput=new JTextField();
        timeInput.setPreferredSize(new Dimension(250,40));
        timeInput.setBounds(235,190,500,40);
        timeInput.setFont(new Font("Veranda",Font.BOLD,30));
        timeInput.setForeground(Color.black);
        timeInput.setBackground(Color.white);
        timeInput.setCaretColor( Color.black);

        output=new JButton();
        output.setBounds(290,270,200,40);
        output.addActionListener(this);
        output.setText("RESULT");
        output.setFocusable(false);
        output.setFont(new Font("Agency Fb",Font.BOLD,30));
        output.setForeground(Color.black);
        output.setBackground(Color.white);

        reset=new JButton();
        reset.setBounds(615,270,150,40);
        reset.addActionListener(this);
        reset.setText("RESET");
        reset.setFocusable(false);
        reset.setFont(new Font("Agency Fb",Font.BOLD,30));
        reset.setForeground(Color.black);
        reset.setBackground(Color.white);

        JLabel oilabel=new JLabel();
        oilabel.setText("INTEREST");
        oilabel.setBounds(90,365,300,60);
        oilabel.setFont(new Font("Agency Fb",Font.BOLD,50));
        oilabel.setForeground(Color.BLACK);

        JLabel oalabel=new JLabel();
        oalabel.setText("AMOUNT");
        oalabel.setBounds(555,365,300,60);
        oalabel.setFont(new Font("Agency Fb",Font.BOLD,50));
        oalabel.setForeground(Color.BLACK);

        iotf=new JTextField();
        iotf.setPreferredSize(new Dimension(250,40));
        iotf.setBounds(15,425,300,40);
        iotf.setFont(new Font("Veranda",Font.BOLD,30));
        iotf.setForeground(Color.black);
        iotf.setBackground(Color.white);
        iotf.setCaretColor( Color.black);

        aotf=new JTextField();
        aotf.setPreferredSize(new Dimension(250,40));
        aotf.setBounds(470,425,300,40);
        aotf.setFont(new Font("Veranda",Font.BOLD,30));
        aotf.setForeground(Color.black);
        aotf.setBackground(Color.white);
        aotf.setCaretColor( Color.black);

        iotf.setEditable(false);
        aotf.setEditable(false);

        solution=new JButton();
        solution.setBounds(20,270,150,40);
        solution.addActionListener(this);
        solution.setText("SOLUTION");
        solution.setFocusable(false);
        solution.setFont(new Font("Agency Fb",Font.BOLD,30));
        solution.setForeground(Color.black);
        solution.setBackground(Color.white);

        frame=new JFrame();
        frame.setSize(800,550);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setTitle("Simple Interest");
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(191, 255, 119));

        frame.setIconImage(i.getImage());

        frame.add(principalInput);
        frame.add(rateInput);
        frame.add(timeInput);
        frame.add(plabel);
        frame.add(rlabel);
        frame.add(tlabel);
        frame.add(output);
        frame.add(reset);
        frame.add(oilabel);
        frame.add(oalabel);
        frame.add(iotf);
        frame.add(aotf);
        frame.add(solution);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==output)
        {
            p=Double.parseDouble(principalInput.getText());
            r=Double.parseDouble(rateInput.getText());
            t=Double.parseDouble(timeInput.getText());

            prt=p*r*t;
            i=prt/100;
            a=p+i;



            iotf.setText(String.valueOf(i));
            aotf.setText(String.valueOf(a));
        }

        if(e.getSource()==reset)
        {
            principalInput.setText("");
            rateInput.setText("");
            timeInput.setText("");
            iotf.setText("");
            aotf.setText("");
        }

        if (e.getSource()==solution)
        {
            new solutionSimpleIntrestWindow();
        }
    }
}
