import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class trapezium implements ActionListener {

    JTextField parallel1;
    JTextField parallel2;
    JTextField heightInput;
    JTextField answerOutput;

    JButton area;
    JButton solution;
    JButton clear;

    double side1;
    double side2;
    double heightGet;

    trapezium()
    {
        ImageIcon i=new ImageIcon("calcificIcon.png");

        JLabel parallelSide1=new JLabel();
        parallelSide1.setText("1st PARALLEL SIDE~");
        parallelSide1.setBounds(45,10,350,70);
        parallelSide1.setFont(new Font("Agency Fb",Font.BOLD,50));
        parallelSide1.setForeground(Color.BLACK);

        parallel1=new JTextField();
        parallel1.setPreferredSize(new Dimension(250,40));
        parallel1.setBounds(400,23,300,45);
        parallel1.setFont(new Font("Veranda",Font.BOLD,30));
        parallel1.setForeground(Color.black);
        parallel1.setBackground(Color.white);
        parallel1.setCaretColor( Color.black);

        JLabel parallelSide2=new JLabel();
        parallelSide2.setText("2nd PARALLEL SIDE~");
        parallelSide2.setBounds(45,100,350,70);
        parallelSide2.setFont(new Font("Agency Fb",Font.BOLD,50));
        parallelSide2.setForeground(Color.BLACK);

        parallel2=new JTextField();
        parallel2.setPreferredSize(new Dimension(250,40));
        parallel2.setBounds(400,113,300,45);
        parallel2.setFont(new Font("Veranda",Font.BOLD,30));
        parallel2.setForeground(Color.black);
        parallel2.setBackground(Color.white);
        parallel2.setCaretColor( Color.black);

        JLabel heightLabel=new JLabel();
        heightLabel.setText("--DISTANCE BETWEEN PARALLEL SIDES--");
        heightLabel.setBounds(25,200,690,70);
        heightLabel.setFont(new Font("Agency Fb",Font.BOLD,50));
        heightLabel.setForeground(Color.BLACK);

        heightInput=new JTextField();
        heightInput.setPreferredSize(new Dimension(250,40));
        heightInput.setBounds(220,280,300,45);
        heightInput.setFont(new Font("Veranda",Font.BOLD,30));
        heightInput.setForeground(Color.black);
        heightInput.setBackground(Color.white);
        heightInput.setCaretColor( Color.black);

        area=new JButton();
        area.setBounds(30,380,150,40);
        area.addActionListener(this);
        area.setText("AREA");
        area.setFocusable(false);
        area.setFont(new Font("Agency Fb",Font.BOLD,37));
        area.setForeground(Color.black);
        area.setBackground(Color.white);

        JLabel areaLabel=new JLabel();
        areaLabel.setText("AREA~");
        areaLabel.setBounds(220,364,150,70);
        areaLabel.setFont(new Font("Agency Fb",Font.BOLD,50));
        areaLabel.setForeground(Color.BLACK);

        answerOutput=new JTextField();
        answerOutput.setPreferredSize(new Dimension(250,40));
        answerOutput.setBounds(350,377,350,45);
        answerOutput.setFont(new Font("Veranda",Font.BOLD,30));
        answerOutput.setForeground(Color.black);
        answerOutput.setBackground(Color.white);
        answerOutput.setCaretColor( Color.black);
        answerOutput.setEditable(false);

        solution=new JButton();
        solution.setBounds(120,460,170,40);
        solution.addActionListener(this);
        solution.setText("SOLUTION");
        solution.setFocusable(false);
        solution.setFont(new Font("Agency Fb",Font.BOLD,37));
        solution.setForeground(Color.black);
        solution.setBackground(Color.white);

        clear=new JButton();
        clear.setBounds(440,460,170,40);
        clear.addActionListener(this);
        clear.setText("RESET");
        clear.setFocusable(false);
        clear.setFont(new Font("Agency Fb",Font.BOLD,37));
        clear.setForeground(Color.black);
        clear.setBackground(Color.white);

        JFrame frame=new JFrame();
        frame.setLayout(null);
        frame.setSize(760,565);
        frame.setTitle("Trapezium");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setVisible(true);
        frame.setIconImage(i.getImage());
        frame.getContentPane().setBackground(new Color(191, 255, 119));

        frame.add(parallelSide1);
        frame.add(parallelSide2);
        frame.add(parallel1);
        frame.add(parallel2);
        frame.add(heightLabel);
        frame.add(heightInput);
        frame.add(area);
        frame.add(areaLabel);
        frame.add(answerOutput);
        frame.add(solution);
        frame.add(clear);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==clear)
        {
            parallel1.setText("");
            parallel2.setText("");
            heightInput.setText("");
            answerOutput.setText("");
        }
        if (e.getSource()==area)
        {
            side1=Double.parseDouble(parallel1.getText());
            side2=Double.parseDouble(parallel2.getText());
            heightGet=Double.parseDouble(heightInput.getText());

            double sumOfParallelSides = side1 + side2;

            double finalAnswerArea =0.5 * sumOfParallelSides * heightGet;

            answerOutput.setText(String.valueOf(finalAnswerArea));
        }
        if (e.getSource()==solution)
        {
            new trapeziumSolution();
        }
    }
}
