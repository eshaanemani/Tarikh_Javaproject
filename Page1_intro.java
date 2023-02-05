import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Page11 extends JFrame implements ActionListener
{
    JRadioButton rb1,rb2,rb3,rb4,rb5;
    JButton b1;
    JFrame f1;
    ButtonGroup bg;


    Page11()
    {
        f1=new JFrame("TARIKH FORM");

        rb1 = new JRadioButton("Track my cycle");
        rb2 = new JRadioButton("Track Pregnancy");
        rb3 = new JRadioButton("Diet recommendation during menstruation");
        rb4= new JRadioButton("Diet recommendation in PCOD/PCOS");
        rb5= new JRadioButton("Exercise/Yoga recommendation");
        b1=new JButton("next");
        bg= new ButtonGroup();


        rb1.setBounds(20,30,270,30);
        rb2.setBounds(20,90,270,30);
        rb3.setBounds(20,150,270,30);
        rb4.setBounds(20,210,270,30);

        rb5.setBounds(20,270,270,30);

        b1.setBounds(100,320,75,30);
        f1.add(rb3);
        f1.add(rb4);
        f1.add(rb5);


        f1.add(rb1);
        f1.add(rb2);
        f1.add(b1);
        bg.add(rb1);
        bg.add(rb2);



        b1.addActionListener(this);

        rb2.addActionListener(this);
        rb3.addActionListener(this);
        rb4.addActionListener(this);
        rb5.addActionListener(this);




        f1.setSize(350,400);
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
        f1.getContentPane().setBackground(Color.pink);
        f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == rb2) {
            JOptionPane.showMessageDialog(f1, "update will be soon available");

        }
        if (e.getSource() == rb3) {
            Diet1 d=new Diet1();
            d.setvisible(true);
        }
        if (e.getSource() == rb4) {
            Diet d2=new Diet();
            d2.setvisible(true);
        }
        if (e.getSource() == rb5) {
            Exercise e1=new Exercise();
            e1.setvisible(true);

        }

        else if (e.getSource() == b1) {
            Page2 j = new Page2();
            j.setvisible(true);

        }
    }
    public static void main(String[] args)
    {
        new Page11();
    }

    public void setvisible(boolean b) {
    }
}
