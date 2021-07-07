import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class powerWindow implements ActionListener {

    JTextField number;
    JTextField powerInput;
    JTextField output;

    JButton find;
    JButton reset;

    powerWindow()
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

        JLabel label2=new JLabel();
        label2.setText("Power~");
        label2.setBounds(10,95,200,70);
        label2.setFont(new Font("Agency Fb",Font.BOLD,50));
        label2.setForeground(Color.BLACK);

        powerInput=new JTextField();
        powerInput.setPreferredSize(new Dimension(250,40));
        powerInput.setBounds(200,112,300,40);
        powerInput.setFont(new Font("Veranda",Font.BOLD,30));
        powerInput.setForeground(Color.black);
        powerInput.setBackground(Color.white);
        powerInput.setCaretColor( Color.black);

        JLabel dash=new JLabel();
        dash.setText("---------------------------");
        dash.setBounds(40,160,500,70);
        dash.setFont(new Font("Agency Fb",Font.BOLD,50));
        dash.setForeground(Color.BLACK);

        find=new JButton();
        find.setBounds(50,330,150,40);
        find.addActionListener(this);
        find.setText("RESULT");
        find.setFocusable(false);
        find.setFont(new Font("Agency Fb",Font.BOLD,30));
        find.setForeground(Color.black);
        find.setBackground(Color.white);

        JLabel label3=new JLabel();
        label3.setText("Result~");
        label3.setBounds(10,220,200,70);
        label3.setFont(new Font("Agency Fb",Font.BOLD,50));
        label3.setForeground(Color.BLACK);

        output=new JTextField();
        output.setPreferredSize(new Dimension(250,40));
        output.setBounds(200,237,300,40);
        output.setFont(new Font("Veranda",Font.BOLD,30));
        output.setForeground(Color.black);
        output.setBackground(Color.white);
        output.setCaretColor( Color.black);
        output.setEditable(false);

        reset=new JButton();
        reset.setBounds(300,330,150,40);
        reset.addActionListener(this);
        reset.setText("RESET");
        reset.setFocusable(false);
        reset.setFont(new Font("Agency Fb",Font.BOLD,30));
        reset.setForeground(Color.black);
        reset.setBackground(Color.white);

        JFrame frame=new JFrame();
        frame.setSize(550,430);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setTitle("Power");
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(191, 255, 119));

        frame.setIconImage(i.getImage());

        frame.add(label1);
        frame.add(label2);
        frame.add(number);
        frame.add(powerInput);
        frame.add(find);
        frame.add(label3);
        frame.add(dash);
        frame.add(output);
        frame.add(reset);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==reset)
        {
            number.setText("");
            powerInput.setText("");
            output.setText("");
        }
        if (e.getSource()==find)
        {
            double numberInput=Double.parseDouble(number.getText());
            double powerVar=Double.parseDouble(powerInput.getText());

            double ans=Math.pow(numberInput,powerVar);

            output.setText(String.valueOf(ans));
        }
    }
}
