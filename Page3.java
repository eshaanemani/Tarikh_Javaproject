import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Page3 extends JFrame implements ActionListener
{
    JLabel l1;

    JRadioButton rb1,rb2,rb3,rb4;


    JButton b;
    JTextArea area;

    Page3()
    {
        JFrame f3=new JFrame("TARIKH FORM");
        JLabel l1;
        JButton b;

        JRadioButton rb1,rb2,rb3,rb4;
        l1=new JLabel("IS YOUR CYCLE REGULAR?");


        rb1=new JRadioButton("It varies by fewer than 5 days[regular cycle]");
        rb2=new JRadioButton("5-15 days[irregular cycle]");
        rb3=new JRadioButton("It varies by more than 15 days[very irregular cycle]");
        rb4=new JRadioButton("I don't know");
        ButtonGroup bg= new ButtonGroup();






        b=new JButton("done");



        l1.setBounds(20,20,300,30);



        rb1.setBounds(20,100,300,30);
        rb2.setBounds(20,130,300,30);
        rb3.setBounds(20,160,350,30);
        rb4.setBounds(20,190,200,30);




        b.setBounds(60,280,75,20);



        f3.add(l1);

        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb4);
        bg.add(rb3);
        f3.add(rb1);
        f3.add(rb2);

        f3.add(rb3);
        f3.add(rb4);

        f3.add(b);
        f3.setSize(350,400);
        f3.setLayout(null);
        f3.setVisible(true);
        f3.setLocationRelativeTo(null);
        f3.getContentPane().setBackground(Color.pink);
        f3.setDefaultCloseOperation(EXIT_ON_CLOSE);
        b.addActionListener(this);


    }
    public void actionPerformed(ActionEvent e)
    {
            Page4 j= new Page4();
            j.setvisible(true);
    }






    public static void main(String[] args)
    {
        new Page3();
    }

    public void setvisible(boolean b)
    {
}
}
