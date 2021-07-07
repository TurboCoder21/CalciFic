import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tempratureWindow implements ActionListener {

    JTextField celsius;
    JTextField fahrenheit;
    JTextField kelvin;

    JButton ctof;
    JButton ctok;

    JButton solution;
    JButton reset;

    tempratureWindow()
    {
        ImageIcon i=new ImageIcon("calcificIcon.png");

        JLabel c=new JLabel();
        c.setText("Celsius~");
        c.setBounds(10,20,200,60);
        c.setFont(new Font("Agency Fb",Font.BOLD,50));
        c.setForeground(Color.BLACK);

        celsius=new JTextField();
        celsius.setPreferredSize(new Dimension(250,40));
        celsius.setBounds(285,35,370,40);
        celsius.setFont(new Font("Veranda",Font.BOLD,30));
        celsius.setForeground(Color.black);
        celsius.setBackground(Color.white);
        celsius.setCaretColor( Color.black);

        ctof=new JButton();
        ctof.setBounds(286,100,170,40);
        ctof.addActionListener(this);
        ctof.setText("FAHRENHEIT");
        ctof.setFocusable(false);
        ctof.setFont(new Font("Agency Fb",Font.BOLD,35));
        ctof.setForeground(Color.black);
        ctof.setBackground(Color.white);

        ctok=new JButton();
        ctok.setBounds(483,100,170,40);
        ctok.addActionListener(this);
        ctok.setText("KELVIN");
        ctok.setFocusable(false);
        ctok.setFont(new Font("Agency Fb",Font.BOLD,35));
        ctok.setForeground(Color.black);
        ctok.setBackground(Color.white);

        JLabel dash=new JLabel();
        dash.setText("------------------------------------------");
        dash.setBounds(5,130,700,60);
        dash.setFont(new Font("Agency Fb",Font.BOLD,50));
        dash.setForeground(Color.BLACK);

        JLabel f=new JLabel();
        f.setText("Fahrenheit~");
        f.setBounds(10,205,250,60);
        f.setFont(new Font("Agency Fb",Font.BOLD,50));
        f.setForeground(Color.BLACK);

        fahrenheit=new JTextField();
        fahrenheit.setPreferredSize(new Dimension(250,40));
        fahrenheit.setBounds(285,220,370,40);
        fahrenheit.setFont(new Font("Veranda",Font.BOLD,30));
        fahrenheit.setForeground(Color.black);
        fahrenheit.setBackground(Color.white);
        fahrenheit.setCaretColor( Color.black);
        fahrenheit.setEditable(false);

        JLabel k=new JLabel();
        k.setText("Kelvin~");
        k.setBounds(10,275,200,60);
        k.setFont(new Font("Agency Fb",Font.BOLD,50));
        k.setForeground(Color.BLACK);

        kelvin=new JTextField();
        kelvin.setPreferredSize(new Dimension(250,40));
        kelvin.setBounds(285,290,370,40);
        kelvin.setFont(new Font("Veranda",Font.BOLD,30));
        kelvin.setForeground(Color.black);
        kelvin.setBackground(Color.white);
        kelvin.setCaretColor( Color.black);
        kelvin.setEditable(false);

        reset=new JButton();
        reset.setBounds(400,400,170,40);
        reset.addActionListener(this);
        reset.setText("RESET");
        reset.setFocusable(false);
        reset.setFont(new Font("Agency Fb",Font.BOLD,35));
        reset.setForeground(Color.black);
        reset.setBackground(Color.white);

        solution=new JButton();
        solution.setBounds(110,400,170,40);
        solution.addActionListener(this);
        solution.setText("SOLUTION");
        solution.setFocusable(false);
        solution.setFont(new Font("Agency Fb",Font.BOLD,35));
        solution.setForeground(Color.black);
        solution.setBackground(Color.white);

        JFrame frame=new JFrame();
        frame.setLayout(null);
        frame.setSize(700,500);
        frame.setTitle("Temperature");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setVisible(true);
        frame.setIconImage(i.getImage());
        frame.getContentPane().setBackground(new Color(191, 255, 119));

        frame.add(c);
        frame.add(f);
        frame.add(k);
        frame.add(celsius);
        frame.add(fahrenheit);
        frame.add(kelvin);
        frame.add(ctof);
        frame.add(ctok);
        frame.add(dash);
        frame.add(reset);
        frame.add(solution);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==ctof)
        {
            double t=Double.parseDouble(celsius.getText());
            double a=t*1.8;
            double ans=a+32;

            fahrenheit.setText(String.valueOf(ans));
        }
        if (e.getSource()==ctok)
        {
            double t=Double.parseDouble(celsius.getText());
            double ans=t+273.15;

            kelvin.setText(String.valueOf(ans));
        }
        if (e.getSource()==reset)
        {
            celsius.setText("");
            fahrenheit.setText("");
            kelvin.setText("");
        }
        if (e.getSource()==solution)
        {
            new tempratureSolutionWindow();
        }
    }
}
