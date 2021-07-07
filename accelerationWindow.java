import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class accelerationWindow implements ActionListener {

    JTextField initialVelocity;
    JTextField finalVelocity;
    JTextField time;
    JTextField answer;

    JButton find;
    JButton solution;
    JButton reset;

    accelerationWindow()
    {
        ImageIcon i=new ImageIcon("calcificIcon.png");

        JLabel label1=new JLabel();
        label1.setText("Initial Velocity~");
        label1.setBounds(10,10,300,70);
        label1.setFont(new Font("Agency Fb",Font.BOLD,50));
        label1.setForeground(Color.BLACK);

        initialVelocity=new JTextField();
        initialVelocity.setPreferredSize(new Dimension(250,40));
        initialVelocity.setBounds(310,27,330,40);
        initialVelocity.setFont(new Font("Veranda",Font.BOLD,30));
        initialVelocity.setForeground(Color.black);
        initialVelocity.setBackground(Color.white);
        initialVelocity.setCaretColor( Color.black);

        JLabel label2=new JLabel();
        label2.setText("Final Velocity~");
        label2.setBounds(10,80,300,70);
        label2.setFont(new Font("Agency Fb",Font.BOLD,50));
        label2.setForeground(Color.BLACK);

        finalVelocity=new JTextField();
        finalVelocity.setPreferredSize(new Dimension(250,40));
        finalVelocity.setBounds(310,97,330,40);
        finalVelocity.setFont(new Font("Veranda",Font.BOLD,30));
        finalVelocity.setForeground(Color.black);
        finalVelocity.setBackground(Color.white);
        finalVelocity.setCaretColor( Color.black);

        JLabel label3=new JLabel();
        label3.setText("Time Taken~");
        label3.setBounds(10,150,300,70);
        label3.setFont(new Font("Agency Fb",Font.BOLD,50));
        label3.setForeground(Color.BLACK);

        time=new JTextField();
        time.setPreferredSize(new Dimension(250,40));
        time.setBounds(310,167,330,40);
        time.setFont(new Font("Veranda",Font.BOLD,30));
        time.setForeground(Color.black);
        time.setBackground(Color.white);
        time.setCaretColor( Color.black);

        find=new JButton();
        find.setBounds(240,255,170,40);
        find.addActionListener(this);
        find.setText("RESULT");
        find.setFocusable(false);
        find.setFont(new Font("Agency Fb",Font.BOLD,30));
        find.setForeground(Color.black);
        find.setBackground(Color.white);

        reset=new JButton();
        reset.setBounds(467,255,170,40);
        reset.addActionListener(this);
        reset.setText("RESET");
        reset.setFocusable(false);
        reset.setFont(new Font("Agency Fb",Font.BOLD,30));
        reset.setForeground(Color.black);
        reset.setBackground(Color.white);

        solution=new JButton();
        solution.setBounds(10,255,170,40);
        solution.addActionListener(this);
        solution.setText("SOLUTION");
        solution.setFocusable(false);
        solution.setFont(new Font("Agency Fb",Font.BOLD,30));
        solution.setForeground(Color.black);
        solution.setBackground(Color.white);

        JLabel labelAcceleration=new JLabel();
        labelAcceleration.setText("Acceleration~");
        labelAcceleration.setBounds(10,320,300,70);
        labelAcceleration.setFont(new Font("Agency Fb",Font.BOLD,50));
        labelAcceleration.setForeground(Color.BLACK);

        answer=new JTextField();
        answer.setPreferredSize(new Dimension(250,40));
        answer.setBounds(310,337,330,40);
        answer.setFont(new Font("Veranda",Font.BOLD,30));
        answer.setForeground(Color.black);
        answer.setBackground(Color.white);
        answer.setCaretColor( Color.black);
        answer.setEditable(false);

        JFrame frame=new JFrame();
        frame.setLayout(null);
        frame.setSize(670,450);
        frame.setTitle("Acceleration");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setVisible(true);
        frame.setIconImage(i.getImage());
        frame.getContentPane().setBackground(new Color(191, 255, 119));

        frame.add(initialVelocity);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(finalVelocity);
        frame.add(time);
        frame.add(find);
        frame.add(solution);
        frame.add(reset);
        frame.add(labelAcceleration);
        frame.add(answer);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==reset)
        {
            initialVelocity.setText("");
            finalVelocity.setText("");
            time.setText("");
            answer.setText("");
        }
        if (e.getSource()==find)
        {
            double u=Double.parseDouble(initialVelocity.getText());
            double v=Double.parseDouble(finalVelocity.getText());
            double t=Double.parseDouble(time.getText());

            double minus=v-u;

            double acc=minus/t;

            answer.setText(String.valueOf(acc));
        }
        if (e.getSource()==solution)
        {
            new accelerationFormulaWindow();
        }
    }
}
