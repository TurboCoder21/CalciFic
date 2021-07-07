import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class distanceFormulaWindow implements ActionListener
{
    JFrame frame;
    JTextField Ax1;
    JTextField Ay;
    JTextField Bx;
    JTextField By;
    JButton output;
    JTextField distance;
    JButton solution;
    JButton reset;

    double ax;
    double ay;
    double bx;
    double by;
    double distanceFinalAnswer;
    
    distanceFormulaWindow()
    {
        ImageIcon i=new ImageIcon("calcificIcon.png");

        JLabel pointA=new JLabel();
        pointA.setText("------------ POINT 'A' ------------");
        pointA.setBounds(95,10,600,60);
        pointA.setFont(new Font("Agency Fb",Font.BOLD,50));
        pointA.setForeground(Color.BLACK);

        JLabel pointB=new JLabel();
        pointB.setText("------------ POINT 'B' ------------");
        pointB.setBounds(95,200,600,60);
        pointB.setFont(new Font("Agency Fb",Font.BOLD,50));
        pointB.setForeground(Color.BLACK);

        JLabel AX1Label=new JLabel();
        AX1Label.setText("X Coordinate");
        AX1Label.setBounds(50,70,300,60);
        AX1Label.setFont(new Font("Agency Fb",Font.BOLD,50));
        AX1Label.setForeground(Color.BLACK);

        JLabel AX2Label=new JLabel();
        AX2Label.setText("Y Coordinate");
        AX2Label.setBounds(470,70,300,60);
        AX2Label.setFont(new Font("Agency Fb",Font.BOLD,50));
        AX2Label.setForeground(Color.BLACK);

        Ax1=new JTextField();
        Ax1.setPreferredSize(new Dimension(250,40));
        Ax1.setBounds(60,140,200,40);
        Ax1.setFont(new Font("Veranda",Font.BOLD,30));
        Ax1.setForeground(Color.black);
        Ax1.setBackground(Color.white);
        Ax1.setCaretColor( Color.black);

        Ay=new JTextField();
        Ay.setPreferredSize(new Dimension(250,40));
        Ay.setBounds(485,140,200,40);
        Ay.setFont(new Font("Veranda",Font.BOLD,30));
        Ay.setForeground(Color.black);
        Ay.setBackground(Color.white);
        Ay.setCaretColor( Color.black);

        JLabel BXL=new JLabel();
        BXL.setText("X Coordinate");
        BXL.setBounds(50,260,300,60);
        BXL.setFont(new Font("Agency Fb",Font.BOLD,50));
        BXL.setForeground(Color.BLACK);

        JLabel BYL=new JLabel();
        BYL.setText("Y Coordinate");
        BYL.setBounds(470,260,300,60);
        BYL.setFont(new Font("Agency Fb",Font.BOLD,50));
        BYL.setForeground(Color.BLACK);

        Bx=new JTextField();
        Bx.setPreferredSize(new Dimension(250,40));
        Bx.setBounds(60,330,200,40);
        Bx.setFont(new Font("Veranda",Font.BOLD,30));
        Bx.setForeground(Color.black);
        Bx.setBackground(Color.white);
        Bx.setCaretColor( Color.black);

        By=new JTextField();
        By.setPreferredSize(new Dimension(250,40));
        By.setBounds(485,330,200,40);
        By.setFont(new Font("Veranda",Font.BOLD,30));
        By.setForeground(Color.black);
        By.setBackground(Color.white);
        By.setCaretColor( Color.black);

        output=new JButton();
        output.setBounds(298,500,150,40);
        output.addActionListener(this);
        output.setText("RESULT");
        output.setFocusable(false);
        output.setFont(new Font("Agency Fb",Font.BOLD,30));
        output.setForeground(Color.black);
        output.setBackground(Color.white);

        JLabel Dis=new JLabel();
        Dis.setText("Distance between A and B~");
        Dis.setBounds(10,410,500,60);
        Dis.setFont(new Font("Agency Fb",Font.BOLD,50));
        Dis.setForeground(Color.BLACK);

        distance=new JTextField();
        distance.setPreferredSize(new Dimension(250,40));
        distance.setBounds(485,421,200,40);
        distance.setFont(new Font("Veranda",Font.BOLD,30));
        distance.setForeground(Color.black);
        distance.setBackground(Color.white);
        distance.setCaretColor( Color.black);
        distance.setEditable(false);

        solution=new JButton();
        solution.setBounds(60,500,150,40);
        solution.addActionListener(this);
        solution.setText("SOLUTION");
        solution.setFocusable(false);
        solution.setFont(new Font("Agency Fb",Font.BOLD,30));
        solution.setForeground(Color.black);
        solution.setBackground(Color.white);

        reset=new JButton();
        reset.setBounds(532,500,150,40);
        reset.addActionListener(this);
        reset.setText("RESET");
        reset.setFocusable(false);
        reset.setFont(new Font("Agency Fb",Font.BOLD,30));
        reset.setForeground(Color.black);
        reset.setBackground(Color.white);

        frame=new JFrame();
        frame.setSize(760,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setTitle("Distance Formula");
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(191, 255, 119));

        frame.setIconImage(i.getImage());

        frame.add(pointA);
        frame.add(pointB);
        frame.add(Ax1);
        frame.add(AX1Label);
        frame.add(AX2Label);
        frame.add(BXL);
        frame.add(BYL);
        frame.add(Ay);
        frame.add(Bx);
        frame.add(By);
        frame.add(output);
        frame.add(Dis);
        frame.add(distance);
        frame.add(solution);
        frame.add(reset);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==output)
        {
            ax=Double.parseDouble(Ax1.getText());
            ay=Double.parseDouble(Ay.getText());
            bx=Double.parseDouble(Bx.getText());
            by=Double.parseDouble(By.getText());

            double x2minusx1=bx-ax;
            double y2minusy1=by-ay;

            double x2minusx1TheWholeSquare=Math.pow(x2minusx1,2);
            double y2minusy1TheWholeSquare=Math.pow(y2minusy1,2);

            double addition= x2minusx1TheWholeSquare + y2minusy1TheWholeSquare;

            distanceFinalAnswer=Math.sqrt(addition);

            distance.setText(String.valueOf(distanceFinalAnswer));
        }
        if (e.getSource()==solution)
        {
            new distanceFormulaSolution();
        }
        if(e.getSource()==reset)
        {
            Ay.setText("");
            Ax1.setText("");
            By.setText("");
            Bx.setText("");
            distance.setText("");
        }
    }
}
