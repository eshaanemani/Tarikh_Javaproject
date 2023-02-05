import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Calendar;

public class Page5 extends JFrame implements ActionListener {
    JLabel l1,l2;
    private  JLabel hyperlink= new JLabel("VISIT OUR WEBSITE");
    Calendar calendar;
    JButton b1, b2;
    JTextArea area1;

    Page5() {
        JFrame f5 = new JFrame("TARIKH FORM");
        f5.setSize(400, 500);
        f5.setLayout(null);
        f5.setVisible(true);

        hyperlink.setForeground(Color.BLUE.darker());
        hyperlink.setCursor(new Cursor(Cursor.HAND_CURSOR));

        hyperlink.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("http://www.sitemodify.com/preview/c0be576d"));
                } catch (IOException | URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }
            @Override
            public void mouseExited(MouseEvent e) {
                hyperlink.setText("VISIT US");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                hyperlink.setText("<html><a href=''>" + "VISIT US" + "</a></html>");
            }

        });

        l1 = new JLabel("Click submit to get next prediction");
        area1 = new JTextArea();
        area1.setEditable(false);
        area1.setLineWrap(true);


        l2 = new JLabel("CONTACT US");
        l2.setBounds(60, 250, 150, 30);
        f5.add(l2);

        b2 = new JButton("submit");
        b2.setBounds(150, 200, 75, 20);
        l1.setBounds(60, 30, 300, 30);
        hyperlink.setBounds(60, 300, 200, 30);
        area1.setBounds(50, 90, 300, 50);

        f5.add(l1);
        f5.add(hyperlink);
        f5.add(b2);
        f5.add(area1);
        b2.addActionListener(this);

        f5.setLayout(null);
        f5.setSize(400,500);
        f5.setVisible(true);
        f5.setLocationRelativeTo(null);
        f5.getContentPane().setBackground(Color.pink);
        f5.setDefaultCloseOperation(f5.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String Calendar;
        if (e.getSource() == b2) {
            {
                Calendar calendar = java.util.Calendar.getInstance();
                calendar.add(java.util.Calendar.DATE, +28);
                System.out.println("28 days hence: " + calendar.getTime());
                area1.setText("\n" + "YOUR NEXT PERIODS WILL BE ON" +  calendar.getTime()+ "\n");
            }
        }
    }
    public static void main(String[] args) {
        new Page5();
    }
}
