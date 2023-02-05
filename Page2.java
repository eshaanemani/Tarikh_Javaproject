import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Page2 extends JFrame implements ActionListener
{
    JLabel l1,l2;
    JTextField tx1;
    JComboBox cb1,cb2;

    JButton b1,b2;
    JTextArea area;

    Page2()
    {
        JFrame f2=new JFrame("TARIKH FORM");


        l1=new JLabel("How many days does your CYCLE last on average?");
        l2=new JLabel("How long does you PERIODS usually last?");


        tx1=new JTextField();



        String days[]={"28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","more than 45(plss visit doctor)"};
        cb1 = new JComboBox(days);
        cb1.setBounds(320,25,40,30);
        f2.add(cb1);


        String day[]={"1","2","3","4","5","6","7"};
        cb2 = new JComboBox(day);
        cb2.setBounds(320,75,40,30);
        f2.add(cb2);

        b1=new JButton("next");
        b2=new JButton("submit");
        area=new JTextArea();

        l1.setBounds(20,20,350,30);
        l2.setBounds(20,70,350,30);


        b1.setBounds(140,165,80,30);
        b2.setBounds(250,250,95,30);
        area.setBounds(30,300,320,50);
        area.setEditable(false);

        f2.add(l1);
        f2.add(l2);



        f2.add(b1);
        f2.add(b2);
        f2.add(area);


        b1.addActionListener(this);
        b2.addActionListener(this);


        f2.setSize(380,400);
        f2.setLayout(null);
        f2.setVisible(true);
        f2.setLocationRelativeTo(null);
        f2.getContentPane().setBackground(Color.pink);
        f2.setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

    public void actionPerformed(ActionEvent e)
    {

        if(e.getSource()==b1) {
            String cycle = cb2.getItemAt(cb2.getSelectedIndex()).toString();
            String days = cb1.getItemAt(cb1.getSelectedIndex()).toString();

            area.setText("how long does your period usually last:" + cycle + "\n" + "how long cycle is:" + days + "\n");
            try {

                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tareek", "root", "Esha19");
                PreparedStatement ps = connection.prepareStatement("insert into info values(?,?)");
                ps.setString(1, cycle);
                ps.setString(2, days);
                int x = 0;
                x++;
                if (x > 0) {
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(b1, "Data Saved Successfully");
                }

            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        if(e.getSource()==b2){
                Page3 j= new Page3();
                j.setvisible(true);
        }




    }
    public static void main(String[] args)
    {
        new Page2();

    }

    public void setvisible(boolean b) {
    }
}
