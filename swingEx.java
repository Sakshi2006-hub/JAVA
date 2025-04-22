import javax.swing.*;

public class swingEx 
{
    public static void main(String args[])
     {
        JFrame f1 = new JFrame("Login Form");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setSize(400, 300); 
        f1.setLayout(null);
        JLabel l1 = new JLabel("Username:");
        l1.setBounds(50, 50, 100, 30);
        JTextField t1 = new JTextField();
        t1.setBounds(150, 50, 150, 30);
        JLabel l2 = new JLabel("Password:");
        l2.setBounds(50, 100, 100, 30);
        JPasswordField f2 = new JPasswordField();
        f2.setBounds(150, 100, 150, 30);
        JButton b = new JButton("Login");
        b.setBounds(150, 150, 100, 30);
        f1.add(l1);
        f1.add(t1);
        f1.add(l2);
        f1.add(f2);
        f1.add(b);
        f1.setVisible(true);
    }
}

