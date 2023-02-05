import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Diet1 extends JFrame implements ActionListener {
    JTextArea l1, l2, l3, l4, l5;

    JButton b1;

    Diet1() {
        JFrame f5 = new JFrame("TARIKH DIET RECOMMENDATION DURING MENSTRUATION");

        l1 = new JTextArea("consume leafy green vegetable,bananas,yogurt It’s common to experience a dip in your iron levels during your period,particularly if your menstrual flow is heavy. This can lead to fatigue, bodily pain, and dizziness.Leafy green vegetables such as kale and spinach can boost your iron levels. Spinach is also rich in magnesium.");
        l2 = new JTextArea("Dark chocolate");
        l3 = new JTextArea("consume Iron,vitamin B12,magnesium,zinc,calcium,omega 3 Fatty acid ,fibre for eg  nuts,pumpkin seeds,grains,beans,channa,fish,flaxseed,etc");
        l4 = new JTextArea("water-rich fruits, such as watermelon and cucumber, are great for staying hydrated.Sweet fruits can help you curb your sugar cravings without eating a lot of refined sugars,which can cause your glucose levels to spike and then crash.");
        l5 = new JTextArea("A warm mug of ginger tea can improve certain symptoms of menstruation. Ginger has anti-inflammatory effect which can soothe achy muscles.Ginger may also reduce nausea. Few studies confirm this, but a 2018 study found that ginger effectively reduced nausea and vomiting during the first trimester of pregnancy.Since it’s safe and relatively cheap, it’s worth trying.Don’t consume too much ginger,though: Consuming more than 4 grams in one day could cause heartburn and stomachaches. ");


        b1 = new JButton("okay");


        l1.setBounds(20, 20, 400, 120);
        l2.setBounds(20, 170, 400, 120);
        l3.setBounds(20, 320, 400, 120);
        l4.setBounds(20, 470, 400, 120);
        l5.setBounds(20, 620, 400, 150);

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


        b1.setBounds(140, 810, 75, 30);


        f5.add(l1);
        f5.add(l2);
        f5.add(l3);
        f5.add(l4);
        f5.add(l5);
        f5.add(b1);


        b1.addActionListener(this);
        f5.setSize(500,900);
        f5.setLayout(null);
        f5.setVisible(true);
        f5.setLocationRelativeTo(null);
        f5.getContentPane().setBackground(Color.pink);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
        }
    }

    public static void main(String[] args) {
        new Diet1();
    }

    public void setvisible(boolean b) {
    }
}
