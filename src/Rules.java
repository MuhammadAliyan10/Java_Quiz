import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Rules extends JFrame implements ActionListener {
    JButton back;

    Rules() {

        // ! GUI Edit
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);

        // ! GUI Display
        setVisible(true);
        setSize(1200, 700);
        setLocationRelativeTo(null);

        // ! Heading
        JLabel heading = new JLabel("Quiz Rules!");
        heading.setBounds(520, 10, 900, 45);
        heading.setFont(new Font(Font.MONOSPACED, Font.LAYOUT_LEFT_TO_RIGHT, 29));
        heading.setForeground(new Color(236, 80, 227));
        add(heading);
        // ! Rules
        JLabel rules = new JLabel();
        rules.setBounds(40, 90, 900, 450);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 19));
        rules.setForeground(new Color(140, 220, 255));
        rules.setText(
                "<html>" +
                        "1. Make sure that you entered your correct name."
                        + "<br><br>" +
                        "2. This is only for learning purpose and it will help you in programing interview."
                        + "<br><br>" +
                        "3. Please do not google the answer." + "<br><br>"
                        +
                        "4. You can take the screenshot of your progress." + "<br><br>" +
                        "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                        "6. If there any error Please send an email."
                        + "<br><br>" +
                        "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                        "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
                        "<html>");
        add(rules);

        // ! Back Button
        back = new JButton("Back");
        back.setBounds(850, 500, 100, 30);
        back.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 13));
        back.setBackground(Color.BLACK);
        back.setBorder(BorderFactory.createLineBorder(new Color(236, 80, 227), 1));
        back.setForeground(new Color(140, 220, 255));
        back.addActionListener(this);
        add(back);

    }

    // ! Button Event handler

    public void actionPerformed(ActionEvent ac) {
        if (ac.getSource() == back) {
            new Login();
            setVisible(false);
        }

    }

    public static void main(String[] args) {

        new Rules();

    }

}
