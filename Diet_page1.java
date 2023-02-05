import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Diet extends JFrame implements ActionListener {
    JTextArea l1, l2, l3, l4, l5;

    JButton b1;


    Diet() {
        JFrame f6 = new JFrame("TARIKH DIET RECOMMENDATION IN PCOD/PCOS");
        f6.setSize(400, 500);
        f6.setLayout(null);
        f6.setVisible(true);
        f6.getContentPane().setBackground(Color.pink);

        l1 = new JTextArea("Choose High Quality, High Fiber Carbohydrates .Women with PCOS are more likely to be diagnosed with type 2 diabetes than women who do not have PCOS. Similar to a diabetic diet, it is important for women with PCOS to consume high quality, high fiber carbohydrates. This will aid in stabilizing your blood sugar levels.");
        l2 = new JTextArea("Eat a Balanced Diet Consuming a well balanced PCOS Diet will help to keep your body in a neutral, homeostatic state. A balanced PCOS Diet allows insulin to function properly by bringing glucose to your cells for energy. This process results in less insulin in your bloodstream, ultimately decreasing androgen production and alleviating your PCOS symptoms.");
        l3 = new JTextArea("Do not skip meals. Skipping meals can crash your blood sugar levels,leading to food cravings and overindulgence. Keeping a routine will allow your sugar levels to stabilize. Stable blood sugar aids in the proper androgen production in your body. Proper androgen production = less severe PCOS symptoms. Some doctors recommendeating smaller, more frequent meals to better regulate blood sugar and establish better habits.");
        l4 = new JTextArea("Studies show consuming foods high in Vitamin D, Vitamin B, Iodine, Selenium, and Magnesium will greatly aid in improving insulin resistance,and decrease the severity of symptoms associated with PCOS.");
        l5 = new JTextArea("Tuna, almonds, eggplant, strawberries, corn, oranges, beans ,Iodine,salmon, eggs, mushrooms, fortified milk, turkey breast, himalayan salt, salmon, yogurt");


        b1 = new JButton("okay");


        l1.setBounds(20, 20, 400, 120);
        l2.setBounds(20, 170, 400, 120);
        l3.setBounds(20, 320, 400, 120);
        l4.setBounds(20, 470, 400, 120);
        l1.setLineWrap(true);
        l2.setLineWrap(true);
        l3.setLineWrap(true);
        l4.setLineWrap(true);
        l5.setLineWrap(true);


        l1.setEditable(false);
        l2.setEditable(false);
        l3.setEditable(false);
        l4.setEditable(false);
        l5.setEditable(false);


        l5.setBounds(20, 620, 400, 150);


        b1.setBounds(140, 810, 75, 30);


        f6.add(l1);
        f6.add(l2);
        f6.add(l3);
        f6.add(l4);
        f6.add(l5);


        f6.add(b1);
        b1.addActionListener(this);

        f6.setSize(500,900);
        f6.setVisible(true);
        f6.getContentPane().setBackground(Color.pink);
        f6.setLocationRelativeTo(null);
        f6.setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
        }
    }
        public static void main(String[] args)
        {
            new Diet();
        }

    public void setvisible(boolean b) {
    }
}
