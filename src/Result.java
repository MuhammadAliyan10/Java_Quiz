import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Result extends JFrame implements ActionListener {
    String name;
    int score;
    JButton playAgain, exit;
    String result;

    Result(String name, int score) {
        this.name = name;
        this.score = score;
        // ! GUI Edit
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);

        // ! Pass or fail handler
        if (score < 60) {
            result = "You are failed. Click on try again.";
        } else {
            result = "Congratulations. You Passed.";
        }

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
        JLabel heading = new JLabel("Your Score!");
        heading.setBounds(780, 140, 300, 45);
        heading.setFont(new Font(Font.MONOSPACED, Font.LAYOUT_LEFT_TO_RIGHT, 29));
        heading.setForeground(new Color(236, 80, 227));
        add(heading);

        // ! Username

        JLabel theUserName = new JLabel("Name = " + name);
        theUserName.setBounds(600, 200, 300, 45);
        theUserName.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 16));
        theUserName.setForeground(new Color(140, 220, 255));
        add(theUserName);

        // !Total Score

        JLabel totalScore = new JLabel("Total Score = 100");
        totalScore.setBounds(600, 240, 300, 45);
        totalScore.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 16));
        totalScore.setForeground(new Color(140, 220, 255));
        add(totalScore);

        // ! User score

        JLabel yourScore = new JLabel("Your Score = " + score);
        yourScore.setBounds(600, 280, 300, 45);
        yourScore.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 16));
        yourScore.setForeground(new Color(140, 220, 255));
        add(yourScore);

        // ! Final Result

        JLabel finalResult = new JLabel("Final Result : ");
        finalResult.setBounds(600, 320, 300, 45);
        finalResult.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 16));
        finalResult.setForeground(new Color(140, 220, 255));
        add(finalResult);

        // ! Final result note

        JLabel finalResultScore = new JLabel(result);
        finalResultScore.setBounds(650, 350, 300, 45);
        finalResultScore.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 16));
        finalResultScore.setForeground(new Color(140, 220, 255));
        add(finalResultScore);

        // ! Report

        JLabel report = new JLabel("The user " + name + " has got " + score + " numbers from 100 numbers.");
        report.setBounds(600, 390, 700, 45);
        report.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 16));
        report.setForeground(Color.RED);
        add(report);

        // ! Try again button

        playAgain = new JButton("Try Again");
        playAgain.setBounds(675, 550, 100, 30);
        playAgain.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 13));
        playAgain.setBackground(Color.BLACK);
        playAgain.setBorder(BorderFactory.createLineBorder(new Color(236, 80, 227), 1));
        playAgain.setForeground(new Color(140, 220, 255));
        playAgain.addActionListener(this);
        add(playAgain);

        // !Exit Button

        exit = new JButton("Exit");
        exit.setBounds(875, 550, 100, 30);
        exit.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 13));
        exit.setBackground(Color.BLACK);
        exit.setBorder(BorderFactory.createLineBorder(new Color(236, 80, 227), 1));
        exit.setForeground(new Color(140, 220, 255));
        exit.addActionListener(this);
        add(exit);

    }

    // ! Button event handler

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == playAgain) {
            new Login();
            setVisible(false);

        } else if (e.getSource() == exit) {
            setVisible(false);

        }

    }

    public static void main(String[] args) {
        new Result("User", 0);

    }
}
