import javax.swing.*;
public class Registrationform
{
	public static void main(String args[])
	{
		 JFrame f1 = new JFrame("registration Form");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setSize(800, 800); 
        f1.setLayout(null);
        JLabel l1 = new JLabel("full name");
        l1.setBounds(50, 50, 100, 30);
        JTextField t1 = new JTextField();
        t1.setBounds(200, 150, 150, 30);
        JLabel l2 = new JLabel("Collage name");
        l2.setBounds(50, 150, 100, 30);
        JTextField t2 = new JTextField();
        t2.setBounds(200, 100, 150, 30);
        JLabel l3 = new JLabel("Department name");
        l3.setBounds(50, 100, 150, 30);
        JTextField t3 = new JTextField();
        t3.setBounds(200, 50, 150, 30);
        JButton b1 = new JButton("clear");
        b1.setBounds(100, 250, 100, 30);
        JButton b2 = new JButton("Submit");
        b2.setBounds(250, 250, 100, 30);
        f1.add(l1);
        f1.add(t1);
        f1.add(l2);
        f1.add(t2);
        f1.add(l3);
        f1.add(t3);
        f1.add(b1);
        f1.add(b2);
        f1.setVisible(true);
     }
}
