import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {
    JButton rules, start, exit;
    JTextField inputNameBox;

    Login() {
        // ! GUI Edit
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);

        // !Image
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("images/login.jpg"));
        JLabel image = new JLabel(icon);
        image.setBounds(0, 0, 600, 700);
        add(image);

        // ! GUI Display
        setVisible(true);
        setSize(1200, 700);
        setLocationRelativeTo(null);

        // ! Heading
        JLabel heading = new JLabel("READY FOR A QUIZ!");
        heading.setBounds(600, 140, 300, 45);
        heading.setFont(new Font(Font.MONOSPACED, Font.LAYOUT_LEFT_TO_RIGHT, 29));
        heading.setForeground(new Color(236, 80, 227));
        add(heading);

        // ! Input Label
        JLabel name = new JLabel("Enter your name : ");
        name.setBounds(600, 280, 300, 45);
        name.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 17));
        name.setForeground(new Color(140, 220, 255));
        add(name);

        // ! Input Box
        inputNameBox = new JTextField();
        inputNameBox.setBounds(600, 325, 500, 30);
        inputNameBox.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 15));
        inputNameBox.setForeground(new Color(140, 220, 255));
        inputNameBox.setBackground(Color.BLACK);
        inputNameBox.setCaretColor(new Color(140, 220, 255));
        inputNameBox.setBorder(BorderFactory.createLineBorder(new Color(236, 80, 227), 1));
        add(inputNameBox);

        // ! Start Button
        start = new JButton("Start");
        start.setBounds(1000, 450, 100, 30);
        start.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 13));
        start.setBackground(Color.BLACK);
        start.setBorder(BorderFactory.createLineBorder(new Color(236, 80, 227), 1));
        start.setForeground(new Color(140, 220, 255));
        start.addActionListener(this);
        add(start);

        // ! Rules Button
        rules = new JButton("Rules");
        rules.setBounds(1000, 500, 100, 30);
        rules.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 13));
        rules.setBackground(Color.BLACK);
        rules.setBorder(BorderFactory.createLineBorder(new Color(236, 80, 227), 1));
        rules.setForeground(new Color(140, 220, 255));
        rules.addActionListener(this);
        add(rules);

        // ! Exit Button

        exit = new JButton("Exit");
        exit.setBounds(1000, 550, 100, 30);
        exit.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 13));
        exit.setBackground(Color.BLACK);
        exit.setBorder(BorderFactory.createLineBorder(new Color(236, 80, 227), 1));
        exit.setForeground(new Color(140, 220, 255));
        exit.addActionListener(this);
        add(exit);

    }

    // ! Button event handler
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            setVisible(false);
            new Rules();

        } else if (ae.getSource() == start) {
            String userName = inputNameBox.getText();
            new Quiz(userName);
            setVisible(false);

        } else if (ae.getSource() == exit) {
            setVisible(false);

        }

    }

    public static void main(String[] args) {

        new Login();

    }
}
