import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class pythagorasTheoremWindow implements ActionListener {

    JTextField ab;
    JTextField bc;
    JTextField ac;

    JButton findAb;
    JButton findAc;
    JButton findBc;
    JButton solution;
    JButton reset;

    JTextField answer;

    double abv;
    double bcv;
    double acv;

    pythagorasTheoremWindow()
    {

        ImageIcon i=new ImageIcon("calcificIcon.png");
        ImageIcon a=new ImageIcon("RATImage.png");

        JLabel image=new JLabel();
        image.setIcon(a);
        image.setBounds(0,0,600,300);

        JLabel AB=new JLabel();
        AB.setText("AB~");
        AB.setBounds(370,20,90,60);
        AB.setFont(new Font("Agency Fb",Font.BOLD,50));
        AB.setForeground(Color.BLACK);

        ab=new JTextField();
        ab.setPreferredSize(new Dimension(250,40));
        ab.setBounds(455,31,318,40);
        ab.setFont(new Font("Veranda",Font.BOLD,30));
        ab.setForeground(Color.black);
        ab.setBackground(Color.white);
        ab.setCaretColor( Color.black);

        JLabel BC=new JLabel();
        BC.setText("BC~");
        BC.setBounds(370,120,90,60);
        BC.setFont(new Font("Agency Fb",Font.BOLD,50));
        BC.setForeground(Color.BLACK);

        bc=new JTextField();
        bc.setPreferredSize(new Dimension(250,40));
        bc.setBounds(455,131,318,40);
        bc.setFont(new Font("Veranda",Font.BOLD,30));
        bc.setForeground(Color.black);
        bc.setBackground(Color.white);
        bc.setCaretColor( Color.black);

        JLabel AC=new JLabel();
        AC.setText("AC~");
        AC.setBounds(370,220,90,60);
        AC.setFont(new Font("Agency Fb",Font.BOLD,50));
        AC.setForeground(Color.BLACK);

        ac=new JTextField();
        ac.setPreferredSize(new Dimension(250,40));
        ac.setBounds(455,231,318,40);
        ac.setFont(new Font("Veranda",Font.BOLD,30));
        ac.setForeground(Color.black);
        ac.setBackground(Color.white);
        ac.setCaretColor( Color.black);

        findAb=new JButton();
        findAb.setBounds(370,310,120,40);
        findAb.addActionListener(this);
        findAb.setText("Find AB");
        findAb.setFocusable(false);
        findAb.setFont(new Font("Agency Fb",Font.BOLD,35));
        findAb.setForeground(Color.black);
        findAb.setBackground(Color.white);

        findBc=new JButton();
        findBc.setBounds(510,310,120,40);
        findBc.addActionListener(this);
        findBc.setText("Find BC");
        findBc.setFocusable(false);
        findBc.setFont(new Font("Agency Fb",Font.BOLD,35));
        findBc.setForeground(Color.black);
        findBc.setBackground(Color.white);

        findAc=new JButton();
        findAc.setBounds(650,310,120,40);
        findAc.addActionListener(this);
        findAc.setText("Find AC");
        findAc.setFocusable(false);
        findAc.setFont(new Font("Agency Fb",Font.BOLD,35));
        findAc.setForeground(Color.black);
        findAc.setBackground(Color.white);

        answer=new JTextField();
        answer.setPreferredSize(new Dimension(250,40));
        answer.setBounds(415,370,318,40);
        answer.setFont(new Font("Veranda",Font.BOLD,30));
        answer.setForeground(Color.black);
        answer.setBackground(Color.white);
        answer.setCaretColor( Color.black);
        answer.setEditable(false);

        solution=new JButton();
        solution.setBounds(92,310,160,40);
        solution.addActionListener(this);
        solution.setText("SOLUTION");
        solution.setFocusable(false);
        solution.setFont(new Font("Agency Fb",Font.BOLD,35));
        solution.setForeground(Color.black);
        solution.setBackground(Color.white);

        reset=new JButton();
        reset.setBounds(95,370,150,40);
        reset.addActionListener(this);
        reset.setText("RESET");
        reset.setFocusable(false);
        reset.setFont(new Font("Agency Fb",Font.BOLD,35));
        reset.setForeground(Color.black);
        reset.setBackground(Color.white);

        JFrame frame=new JFrame();
        frame.setSize(800,480);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setTitle("Pyhtagoras Theorem");
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(191, 255, 119));

        frame.setIconImage(i.getImage());

        frame.add(image);
        frame.add(AB);
        frame.add(ab);
        frame.add(BC);
        frame.add(bc);
        frame.add(AC);
        frame.add(ac);
        frame.add(findAb);
        frame.add(findBc);
        frame.add(findAc);
        frame.add(answer);
        frame.add(solution);
        frame.add(reset);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==reset)
        {
            bc.setText("");
            ac.setText("");
            ab.setText("");
            answer.setText("");
        }

        if (e.getSource()==findAb)
        {
            bcv=Double.parseDouble(bc.getText());
            acv=Double.parseDouble(ac.getText());

            double bcsq=Math.pow(bcv,2);
            double acq=Math.pow(acv,2);
            double st=acq-bcsq;

            double finalAnswer=Math.sqrt(st);

            ab.setText(String.valueOf(finalAnswer));
            answer.setText(String.valueOf(finalAnswer));
        }
        if (e.getSource()==findBc)
        {
            abv=Double.parseDouble(ab.getText());
            acv=Double.parseDouble(ac.getText());

            double absq=Math.pow(abv,2);
            double acq=Math.pow(acv,2);
            double st=acq-absq;

            double finalAnswer=Math.sqrt(st);

            bc.setText(String.valueOf(finalAnswer));
            answer.setText(String.valueOf(finalAnswer));
        }
        if (e.getSource()==findAc)
        {
            abv=Double.parseDouble(ab.getText());
            bcv=Double.parseDouble(bc.getText());

            double absqr=Math.pow(abv,2);
            double bcsqr=Math.pow(bcv,2);
            double st=absqr+bcsqr;

            double finalAnswer=Math.sqrt(st);

            ac.setText(String.valueOf(finalAnswer));
            answer.setText(String.valueOf(finalAnswer));
        }
        if (e.getSource()==solution)
        {
            new pythagorasSolution();
        }
    }
}
