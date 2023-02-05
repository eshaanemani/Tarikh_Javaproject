import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Arrays;

public class SignIn extends JFrame implements ActionListener {
    JFrame f2;
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b;
    SignIn()
    {
        f2= new JFrame("Sign Up");
        l1= new JLabel("Enter your Email ID");
        l1.setBounds(30,30,150,50);
        f2.add(l1);
        t1= new JTextField();
        t1.setBounds(200,40,80,30);
        f2.add(t1);

        l2= new JLabel("Enter your Password");
        l2.setBounds(30,110,150,50);
        f2.add(l2);
        t2= new JPasswordField();
        t2.setBounds(200,120,100,30);

        b= new JButton("Next");
        b.setBounds(200,250,80,30);
        f2.add(b);
        b.addActionListener(this);


        f2.add(t2);
        f2.setLayout(null);
        f2.setSize(350,400);
        f2.setVisible(true);
        f2.setLocationRelativeTo(null);
        f2.getContentPane().setBackground(Color.pink);
        f2.setDefaultCloseOperation(f2.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        String email="email-id: " +t1.getText() +"\n";
        String password= "password:" + Arrays.toString(t2.getPassword()) +"\n";

        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tareek","root","Esha19");
            PreparedStatement st = connection
                    .prepareStatement("Select email_id, password from login where email_id=? and password=?");

            st.setString(1, email);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(b, "You have successfully logged in");
                Page11 j= new Page11();
                j.setvisible(true);
            } else {
                JOptionPane.showMessageDialog(b, "Wrong Username & Password");
            }

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        
    }
    public static void main(String[] args)
    {
        new SignIn();
    }
}
