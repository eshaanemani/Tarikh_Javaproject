import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Arrays;

public class Login extends JFrame implements ActionListener
{
    JFrame f1;
    JLabel link;
    JButton b;
    JTextField t1,t2,t3;
    JPasswordField t4;
    JLabel l1,l2,l3,l4,res;
    JCheckBox term;
    Login()
    {
        f1= new JFrame("Login");
        l1= new JLabel("First Name");
        l1.setBounds(20,20,100,20);
        f1.add(l1);
        t1=new JTextField();
        t1.setBounds(130,20,150,20);
        f1.add(t1);



        l2= new JLabel("Last Name");
        l2.setBounds(20,50,100,20);
        f1.add(l2);
        t2= new JTextField();
        t2.setBounds(130,50,100,20);
        f1.add(t2);


        l3= new JLabel("Email-id");
        l3.setBounds(20,80,140,20);
        f1.add(l3);
        t3= new JTextField();
        t3.setBounds(130,80,150,20);
        f1.add(t3);


        l4=new JLabel("Passsword");
        l4.setBounds(20,110,100,20);
        f1.add(l4);

        t4= new JPasswordField();
        t4.setBounds(130,110,90,20);
        f1.add(t4);


        b = new JButton("SUBMIT");
        b.setBounds(50,250,100,20);
        b.addActionListener(this);
        f1.add(b);

        res = new JLabel("Accept Terms And Conditions.");
        res.setBounds(20,200,220,20);
        f1.add(res);
        term = new JCheckBox();
        term.setBounds(230,200,20,20);
        f1.add(term);
        term.addActionListener(this);



        f1.setLayout(null);
        f1.setSize(350,400);
        f1.setLocationRelativeTo(null);
        f1.setVisible(true);
        f1.getContentPane().setBackground(Color.pink);
        f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {

        if(e.getSource()==b)
        {
            if(term.isSelected()) {
                String fname = "First Name:" + t1.getText() + "\n";
                String lname = "Last Name:" + t2.getText() + "\n";
                String email_id = "email-id: " + t3.getText() + "\n";
                String password = "password:" + Arrays.toString(t4.getPassword()) + "\n";



                try {

                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tareek", "root", "Esha19");
                    PreparedStatement ps = connection.prepareStatement("insert into login values(?,?,?,?)");
                    ps.setString(1, fname);
                    ps.setString(2, lname);
                    ps.setString(3, email_id);
                    ps.setString(4, password);
                    int x = 0;
                    x++;
                    if (x > 0) {
                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(f1, "All your entered data will be successfully stored in system maintaining your privacy." +
                                "We assure you that your information will be kept confidential");
                        JOptionPane.showMessageDialog(b, "Data Saved Successfully");


                        //2 PAGE
                        SignIn j = new SignIn();
                        j.setVisible(true);
                    }

                } catch (Exception ex) {
                    System.out.println(ex);
                }

            }

            else
            {

                res.setText("Please accept the terms & conditions");
            }
        }
    }
    public static void main(String[] args)
    {
        new Login();
    }
}


