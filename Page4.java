import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Page4 extends JFrame implements ActionListener {
    JLabel l1,l2;

    JComboBox cb1,cb2;
    JButton b1,b2;
    JTextArea area;



    Page4() {
        JFrame f4 = new JFrame("TARIKH FORM");


        l1 = new JLabel("LAST PERIOD DATE");
        l2 = new JLabel("LAST PERIOD MONTH");


        String days[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28", "29", "30", "31"};
        cb1 = new JComboBox(days);
        String month[] = {"1","2","3","4","5","6","7","8","9","10","11","12"};
        cb2 = new JComboBox(month);

        b1 = new JButton("show");
        b2 = new JButton("submit");

        area = new JTextArea();
        area.setEditable(false);

        l1.setBounds(20, 20, 150, 30);
        l2.setBounds(20, 60, 150, 30);
        cb1.setBounds(200, 20, 80, 30);
        cb2.setBounds(200, 60, 100, 30);
        b1.setBounds(140, 120, 75, 20);
        b2.setBounds(200, 320, 75, 20);

        area.setBounds(30, 170, 320, 100);

        f4.add(l1);

        f4.add(cb1);
        f4.add(cb2);
        f4.add(b1);
        f4.add(l2);
        f4.add(b2);

        f4.add(area);



        b1.addActionListener(this);
        b2.addActionListener(this);
        f4.setSize(400, 500);
        f4.setLayout(null);
        f4.setVisible(true);
        f4.setLocationRelativeTo(null);
        f4.getContentPane().setBackground(Color.pink);
        f4.setDefaultCloseOperation(EXIT_ON_CLOSE);


    }


    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == b1)
        {
            String p_day = cb1.getItemAt(cb1.getSelectedIndex()).toString();
             String month = cb2.getItemAt(cb2.getSelectedIndex()).toString();


             area.setText("\n" + "Your last period date:" + p_day + "\n" + "period month:" + month + "\n");
            try
            {

                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tareek", "root", "Esha19");
                PreparedStatement ps = connection.prepareStatement("insert into pdata values(?,?)");
                ps.setString(1, p_day);
                ps.setString(2, month);

                int x = 0;
                x++;
                if (x > 0) {
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(b1, "Data Saved Successfully");

                }
            }
                catch (Exception ex) {
                System.out.println(ex);
            }
         }
        else if(e.getSource() == b2)
        {
            Page5 j= new Page5();
            j.setVisible(true);
        }
    }


    public static void main(String[] args) {
        new Page4();

    }

    public void setvisible(boolean b){}
}
