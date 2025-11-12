import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JLabel label1 ,label2,label3;
    JTextField text1;
    JPasswordField pass;
    JButton button1,button2,button3;

    public Login() {
        super("Bank Management System - Login");
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 20, 100, 100);
        add(image);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(620,344,100,100);
        add(iimage);

        label1 = new JLabel("WELLCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGrade", Font.BOLD,38));
        label1.setBounds(210,100,400,100);
        add(label1);

        label2 = new JLabel("CARD :");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Ralway",Font.BOLD,22));
        label2.setBounds(150,150,100,100);
        add(label2);

        text1 = new JTextField(15);
        text1.setBounds(250,190,200,25);
        text1.setFont(new Font("Arial",Font.BOLD,15));
        add(text1);

        label3 = new JLabel("PIN:");
        label3.setFont(new Font("Ralway",Font.BOLD,22));
        label3.setForeground(Color.WHITE);
        label3.setBounds(150,200,100,100);
        add(label3);

        pass = new JPasswordField(15);
        pass.setBounds(250,235,200,25);
        pass.setFont(new Font("Arial",Font.BOLD,15));
        add(pass);

        button1 = new JButton("SING IN");
        button1.setFont(new Font("Arial",Font.BOLD,15));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.GREEN);
        button1.setBounds(250,300,100,30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,15));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.GREEN);
        button2.setBounds(360,300,100,30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("SING UP");
        button3.setFont(new Font("Arial",Font.BOLD,15));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.GREEN);
        button3.setBounds(250,350,210,30);
        button3.addActionListener(this);
        add(button3);


        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);

        setSize(850, 480);
        setLocation(450, 200);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
            try{
                if(e.getSource() == button1){

                } else if (e.getSource() == button2) {
                    pass.setText("");
                    text1.setText("");

                } else if (e.getSource() == button3) {

                }
            }
            catch (Exception e1){
               e1.printStackTrace();
            }
    }
    public static void main(String[] args) {
        new Login();
    }


}
