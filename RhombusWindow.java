import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RhombusWindow implements ActionListener {

    JTextField length;
    JTextField breadth;
    JTextField areaT;
    JTextField perimeterT;
    JTextField diagonalBInput;

    JButton area;
    JButton perimeter;
    JButton solution;
    JButton clear;

    double l;
    double b;

    RhombusWindow()
    {
        ImageIcon i=new ImageIcon("calcificIcon.png");

        JLabel lengthLabel=new JLabel();
        lengthLabel.setText("Side~");
        lengthLabel.setBounds(10,10,150,70);
        lengthLabel.setFont(new Font("Agency Fb",Font.BOLD,50));
        lengthLabel.setForeground(Color.BLACK);

        length=new JTextField();
        length.setPreferredSize(new Dimension(250,40));
        length.setBounds(230,27,320,40);
        length.setFont(new Font("Veranda",Font.BOLD,30));
        length.setForeground(Color.black);
        length.setBackground(Color.white);
        length.setCaretColor( Color.black);

        perimeter=new JButton();
        perimeter.setBounds(10,100,150,40);
        perimeter.addActionListener(this);
        perimeter.setText("PERIMETER");
        perimeter.setFocusable(false);
        perimeter.setFont(new Font("Agency Fb",Font.BOLD,30));
        perimeter.setForeground(Color.black);
        perimeter.setBackground(Color.white);

        perimeterT=new JTextField();
        perimeterT.setPreferredSize(new Dimension(250,40));
        perimeterT.setBounds(230,101,320,40);
        perimeterT.setFont(new Font("Veranda",Font.BOLD,30));
        perimeterT.setForeground(Color.black);
        perimeterT.setBackground(Color.white);
        perimeterT.setCaretColor( Color.black);
        perimeterT.setEditable(false);

        JLabel breadthLabel=new JLabel();
        breadthLabel.setText("Diagonal A~");
        breadthLabel.setBounds(12,165,210,70);
        breadthLabel.setFont(new Font("Agency Fb",Font.BOLD,50));
        breadthLabel.setForeground(Color.BLACK);

        breadth=new JTextField();
        breadth.setPreferredSize(new Dimension(250,40));
        breadth.setBounds(230,185,320,40);
        breadth.setFont(new Font("Veranda",Font.BOLD,30));
        breadth.setForeground(Color.black);
        breadth.setBackground(Color.white);
        breadth.setCaretColor( Color.black);

        JLabel diagonalBl=new JLabel();
        diagonalBl.setText("Diagonal B~");
        diagonalBl.setBounds(12,245,210,70);
        diagonalBl.setFont(new Font("Agency Fb",Font.BOLD,50));
        diagonalBl.setForeground(Color.BLACK);

        diagonalBInput=new JTextField();
        diagonalBInput.setPreferredSize(new Dimension(250,40));
        diagonalBInput.setBounds(230,262,320,40);
        diagonalBInput.setFont(new Font("Veranda",Font.BOLD,30));
        diagonalBInput.setForeground(Color.black);
        diagonalBInput.setBackground(Color.white);
        diagonalBInput.setCaretColor( Color.black);

        area=new JButton();
        area.setBounds(10,336,150,40);
        area.addActionListener(this);
        area.setText("AREA");
        area.setFocusable(false);
        area.setFont(new Font("Agency Fb",Font.BOLD,30));
        area.setForeground(Color.black);
        area.setBackground(Color.white);


        areaT=new JTextField();
        areaT.setPreferredSize(new Dimension(250,40));
        areaT.setBounds(230,335,320,40);
        areaT.setFont(new Font("Veranda",Font.BOLD,30));
        areaT.setForeground(Color.black);
        areaT.setBackground(Color.white);
        areaT.setCaretColor( Color.black);
        areaT.setEditable(false);





        solution=new JButton();
        solution.setBounds(160,400,170,40);
        solution.addActionListener(this);
        solution.setText("SOLUTION");
        solution.setFocusable(false);
        solution.setFont(new Font("Agency Fb",Font.BOLD,30));
        solution.setForeground(Color.black);
        solution.setBackground(Color.white);

        clear=new JButton();
        clear.setBounds(415,400,100,40);
        clear.addActionListener(this);
        clear.setText("RESET");
        clear.setFocusable(false);
        clear.setFont(new Font("Agency Fb",Font.BOLD,30));
        clear.setForeground(Color.black);
        clear.setBackground(Color.white);

        JFrame frame=new JFrame();
        frame.setLayout(null);
        frame.setSize(600,500);
        frame.setTitle("Rhombus");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setVisible(true);
        frame.setIconImage(i.getImage());
        frame.getContentPane().setBackground(new Color(191, 255, 119));

        frame.add(lengthLabel);
        frame.add(breadthLabel);
        frame.add(breadth);
        frame.add(length);
        frame.add(clear);
        frame.add(solution);
        frame.add(perimeter);
        frame.add(area);
        frame.add(areaT);
        frame.add(perimeterT);
        frame.add(diagonalBl);
        frame.add(diagonalBInput);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==clear)
        {
            areaT.setText("");
            perimeterT.setText("");
            length.setText("");
            breadth.setText("");
            diagonalBInput.setText("");
        }
        if (e.getSource()==area)
        {
            double db=Double.parseDouble(diagonalBInput.getText());
            b=Double.parseDouble(breadth.getText());

            double proOfDi=db*b;
            double areaAnswer=0.5*proOfDi;

            areaT.setText(String.valueOf(areaAnswer));
        }
        if (e.getSource()==perimeter)
        {
            l=Double.parseDouble(length.getText());
            double perimeterAnswer=l*4;

            perimeterT.setText(String.valueOf(perimeterAnswer));
        }
        if (e.getSource()==solution)
        {
            new rhombusSolutionWindow();
        }
    }
}
