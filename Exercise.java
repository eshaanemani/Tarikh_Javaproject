import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Exercise extends JFrame implements ActionListener
{
    JTextArea l1,l2,l3,l4,l5;

    JButton b1;

    Exercise()
    {
        JFrame f7=new JFrame("EXERCISE/YOGA RECOMMANDATION FOR PCOD/PCOS");

        l1=new JTextArea("CARDIO:Good for reducing insulin resistance, boosting fertility, stabilising mood Moderate exercise like brisk walking, jogging, cycling or swimming are all great activities that can help with PCOS. This type of exercise increases your bodies sensitivity to insulin, which reduces your risk of cardiovascular disease and type 2 diabetes. Doing 30 minutes or more a day can also help with weight management, symptoms of depression and anxiety, as well as improving frequency of menstrual cycles and ovulation. And if you’re about to start IVF, regular light exercise can boost your reproductive success. Not sure how to start running, easy download the free Nike Run Club app that provides your with guided runs to help you begin your running journey!");
        l2=new JTextArea("STRENGTH TRAINING :Good for reducing insulin resistance, increasing metabolic rate, improving body composition (more muscle and less fat tissue)Bodyweight exercises like squats, push-ups, or tricep dips improve the function of insulin in your body, but can also boost your metabolism by building more muscle mass. Don’t worry though; you won’t bulk up unless you’re taking steroids! More muscle simply means burning more calories while exercising, but also throughout the day even at rest. Combining resistance moves with cardio exercise is the best way to ensure you’re building a lean body, achieving a healthy BMI, and reducing your risk of chronic diseases like type 2 diabetes.");
        l3=new JTextArea("HIGH INTENSITY INTERVAL TRAINING :Good for increasing cardiovascular fitness and decreasing waist circumference Intervals involve swapping between short bouts of high intensity work and lower intensity recovery. It’s a time efficient way of boosting your cardiovascular fitness, with extra benefits for PCOS. Going hard on the spin bike burns bucket-loads of calories, and reduces abdominal fat more effectively then say, a brisk walk. This can help you achieve a 5 – 10% weight loss, which studies show can decrease PCOS symptoms by reducing excess testosterone and improving insulin resistance.");
        l4=new JTextArea("CORE STRENGTH Good for general well-being and injury prevention, preparing your body for pregnancy. Being above your ideal weight can cause lower back pain and poor posture, so including core training in your program is essential. These muscles support the spine and learning how to switch them on ensures you don’t injure yourself during exercise. Also if you’re trying to conceive, start training your pelvic floor muscles! These muscles are also part of your core and help prevent incontinence, boost sexual health, and improve pelvic stability to help support a healthy pregnancy.");
        l5=new JTextArea("The most effective exercise is the one you keep up with, so choose something you enjoy! Seeking help from an Accredited Exercise Physiologist is a great way to guarantee you’re exercising right for your condition. They can provide a tailored exercise program as well as lifestyle advice and support to help you reach your health and well-being goals. ");
                b1=new JButton("okay");




        l1.setBounds(20, 20, 400, 160);
        l2.setBounds(20, 200, 400, 160);
        l3.setBounds(20, 370, 400, 140);
        l4.setBounds(20, 530, 400, 140);
        l5.setBounds(20, 690, 400, 80);

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


        f7.add(l1);
        f7.add(l2);
        f7.add(l3);
        f7.add(l4);
        f7.add(l5);
        f7.add(b1);



        b1.addActionListener(this);
        f7.setSize(500,900);
        f7.setLayout(null);
        f7.setVisible(true);
        f7.setLocationRelativeTo(null);
        f7.getContentPane().setBackground(Color.pink);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
        }
    }
        public static void main (String[]args)
        {
            new Exercise();
        }
        public void setvisible ( boolean b)
        {
        }
}
