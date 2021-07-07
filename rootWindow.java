import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class rootWindow implements ActionListener
{

    JTextField number;
    JTextField sqrtT;
    JTextField cbrtT;

    JButton sqrt;
    JButton cbrt;
    JButton reset;

    rootWindow()
    {
        ImageIcon i=new ImageIcon("calcificIcon.png");

        JLabel label1=new JLabel();
        label1.setText("Number~");
        label1.setBounds(10,10,200,70);
        label1.setFont(new Font("Agency Fb",Font.BOLD,50));
        label1.setForeground(Color.BLACK);

        number=new JTextField();
        number.setPreferredSize(new Dimension(250,40));
        number.setBounds(200,27,300,40);
        number.setFont(new Font("Veranda",Font.BOLD,30));
        number.setForeground(Color.black);
        number.setBackground(Color.white);
        number.setCaretColor( Color.black);

        sqrt=new JButton();
        sqrt.setBounds(45,110,170,40);
        sqrt.addActionListener(this);
        sqrt.setText("SQUARE ROOT");
        sqrt.setFocusable(false);
        sqrt.setFont(new Font("Agency Fb",Font.BOLD,30));
        sqrt.setForeground(Color.black);
        sqrt.setBackground(Color.white);

        cbrt=new JButton();
        cbrt.setBounds(310,110,170,40);
        cbrt.addActionListener(this);
        cbrt.setText("CUBE ROOT");
        cbrt.setFocusable(false);
        cbrt.setFont(new Font("Agency Fb",Font.BOLD,30));
        cbrt.setForeground(Color.black);
        cbrt.setBackground(Color.white);

        JLabel SqrtLabel=new JLabel();
        SqrtLabel.setText("Square Root~");
        SqrtLabel.setBounds(10,180,300,70);
        SqrtLabel.setFont(new Font("Agency Fb",Font.BOLD,50));
        SqrtLabel.setForeground(Color.BLACK);

        sqrtT=new JTextField();
        sqrtT.setPreferredSize(new Dimension(250,40));
        sqrtT.setBounds(280,197,270,40);
        sqrtT.setFont(new Font("Veranda",Font.BOLD,30));
        sqrtT.setForeground(Color.black);
        sqrtT.setBackground(Color.white);
        sqrtT.setCaretColor( Color.black);
        sqrtT.setEditable(false);

        JLabel cbrtLabel=new JLabel();
        cbrtLabel.setText("Cube Root~");
        cbrtLabel.setBounds(10,250,220,70);
        cbrtLabel.setFont(new Font("Agency Fb",Font.BOLD,50));
        cbrtLabel.setForeground(Color.BLACK);

        cbrtT=new JTextField();
        cbrtT.setPreferredSize(new Dimension(250,40));
        cbrtT.setBounds(280,261,270,40);
        cbrtT.setFont(new Font("Veranda",Font.BOLD,30));
        cbrtT.setForeground(Color.black);
        cbrtT.setBackground(Color.white);
        cbrtT.setCaretColor( Color.black);
        cbrtT.setEditable(false);

        reset=new JButton();
        reset.setBounds(200,340,150,40);
        reset.addActionListener(this);
        reset.setText("RESET");
        reset.setFocusable(false);
        reset.setFont(new Font("Agency Fb",Font.BOLD,30));
        reset.setForeground(Color.black);
        reset.setBackground(Color.white);

        JFrame frame=new JFrame();
        frame.setLayout(null);
        frame.setSize(600,440);
        frame.setTitle("Root");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setVisible(true);
        frame.setIconImage(i.getImage());
        frame.getContentPane().setBackground(new Color(191, 255, 119));

        frame.add(label1);
        frame.add(number);
        frame.add(sqrt);
        frame.add(cbrt);
        frame.add(SqrtLabel);
        frame.add(cbrtLabel);
        frame.add(cbrtT);
        frame.add(sqrtT);
        frame.add(reset);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==sqrt)
        {
            double num=Double.parseDouble(number.getText());
            double ans=Math.sqrt(num);
            sqrtT.setText(String.valueOf(ans));
        }
        if (e.getSource()==reset)
        {
            sqrtT.setText("");
            cbrtT.setText("");
            number.setText("");
        }
        if (e.getSource()==cbrt)
        {
            double num=Double.parseDouble(number.getText());
            double ans=Math.cbrt(num);
            cbrtT.setText(String.valueOf(ans));
        }
    }
}
