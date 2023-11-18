import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {

    // ! Global variables

    // ! Array
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String userAnswer[][] = new String[10][1];

    // ! Jlable variables
    JLabel questionNumber, question;
    JRadioButton options1, options2, options3, options4;
    JButton sudmit, next, lifeLine;
    ButtonGroup buttonGroup;

    // ! Variables
    String userName;
    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;

    Quiz(String userName) {
        this.userName = userName;
        // ! GUI Edit
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);

        // ! GUI Display
        setVisible(true);
        setSize(1200, 700);
        setLocationRelativeTo(null);

        // !Image
        ImageIcon quiz_image = new ImageIcon(ClassLoader.getSystemResource("images/quiz.jpg"));
        JLabel image = new JLabel(quiz_image);
        image.setBounds(0, 0, 1200, 300);
        add(image);

        // ! Question Number
        questionNumber = new JLabel();
        questionNumber.setBounds(40, 340, 80, 45);
        questionNumber.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 18));
        questionNumber.setForeground(new Color(140, 220, 255));
        add(questionNumber);

        // ! Questions
        question = new JLabel();
        question.setBounds(70, 340, 700, 45);
        question.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 18));
        question.setForeground(new Color(140, 220, 255));
        add(question);

        // ! Questions

        // !<---------------------------------------------------------------------------------------------------------------------------------->

        questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";

        // ! Answers

        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";

        // !<---------------------------------------------------------------------------------------->

        // ! RadioButton 1
        options1 = new JRadioButton();
        options1.setBounds(60, 380, 700, 45);
        options1.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 17));
        options1.setForeground(new Color(236, 80, 227));
        options1.setBackground(Color.BLACK);
        add(options1);

        // ! RadioButton 2
        options2 = new JRadioButton();
        options2.setBounds(60, 420, 700, 45);
        options2.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 17));
        options2.setForeground(new Color(236, 80, 227));
        options2.setBackground(Color.BLACK);
        add(options2);

        // ! RadioButton 3
        options3 = new JRadioButton();
        options3.setBounds(60, 460, 700, 45);
        options3.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 17));
        options3.setForeground(new Color(236, 80, 227));
        options3.setBackground(Color.BLACK);
        add(options3);

        // ! RadioButton 4
        options4 = new JRadioButton();
        options4.setBounds(60, 500, 700, 45);
        options4.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 17));
        options4.setForeground(new Color(236, 80, 227));
        options4.setBackground(Color.BLACK);
        add(options4);

        // ! Button Groups
        buttonGroup = new ButtonGroup();
        buttonGroup.add(options1);
        buttonGroup.add(options2);
        buttonGroup.add(options3);
        buttonGroup.add(options4);

        // ! 50/50 lifeline button
        lifeLine = new JButton("LifeLine");
        lifeLine.setBounds(760, 580, 100, 30);
        lifeLine.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 13));
        lifeLine.setBackground(Color.BLACK);
        lifeLine.setBorder(BorderFactory.createLineBorder(new Color(236, 80, 227), 1));
        lifeLine.setForeground(new Color(140, 220, 255));
        lifeLine.addActionListener(this);
        add(lifeLine);

        // ! Next question button
        next = new JButton("Next");
        next.setBounds(880, 580, 100, 30);
        next.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 13));
        next.setBackground(Color.BLACK);
        next.setBorder(BorderFactory.createLineBorder(new Color(236, 80, 227), 1));
        next.setForeground(new Color(140, 220, 255));
        next.addActionListener(this);
        add(next);

        // ! Sudmit Button
        sudmit = new JButton("Sudmit");
        sudmit.setBounds(1000, 580, 100, 30);
        sudmit.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 13));
        sudmit.setBackground(Color.BLACK);
        sudmit.setBorder(BorderFactory.createLineBorder(new Color(236, 80, 227), 1));
        sudmit.setForeground(new Color(140, 220, 255));
        sudmit.setEnabled(false);
        sudmit.addActionListener(this);
        add(sudmit);

        // ! Calling start function
        start(count);

    }

    // ! button event handler
    public void actionPerformed(ActionEvent ae) {

        // ! Next button
        if (ae.getSource() == next) {
            options1.setEnabled(true);
            options2.setEnabled(true);
            options3.setEnabled(true);
            options4.setEnabled(true);
            repaint();
            ans_given = 1;
            if (buttonGroup.getSelection() == null) {
                userAnswer[count][0] = "";

            } else {
                userAnswer[count][0] = buttonGroup.getSelection().getActionCommand();

            }
            if (count == 8) {
                sudmit.setEnabled(true);
                next.setEnabled(false);

            }
            count++;
            start(count);
            lifeLine.setEnabled(true);

            // ! Sudmit button
        } else if (ae.getSource() == sudmit) {
            ans_given = 1;
            if (buttonGroup.getSelection() == null) {
                userAnswer[count][0] = "";

            } else {
                userAnswer[count][0] = buttonGroup.getSelection().getActionCommand();

            }
            for (int i = 0; i < userAnswer.length; i++) {
                if (userAnswer[i][0].equals(answers[i][1])) {
                    score += 10;

                } else {
                    score += 0;
                }

            }
            setVisible(false);
            new Result(userName, score);

            // ! Lifeline button
        } else if (ae.getSource() == lifeLine) {
            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                options2.setEnabled(false);
                options3.setEnabled(false);

            } else {
                options1.setEnabled(false);
                options4.setEnabled(false);

            }
            lifeLine.setEnabled(false);
        }
    }

    // ! TimeStamps Function
    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
        g.setColor(Color.RED);
        String time = "TimeLeft: " + timer + " seconds";
        if (timer > 0) {
            g.drawString(time, 900, 400);
        } else {
            g.drawString("Times Up!", 1000, 400);

        }
        timer--;
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            options1.setEnabled(true);
            options2.setEnabled(true);
            options3.setEnabled(true);
            options4.setEnabled(true);
            lifeLine.setEnabled(true);
            if (count == 8) {
                sudmit.setEnabled(true);
                next.setEnabled(false);

            }
            if (count == 9) {
                if (buttonGroup.getSelection() == null) {
                    userAnswer[count][0] = "";

                } else {
                    userAnswer[count][0] = buttonGroup.getSelection().getActionCommand();

                }
                for (int i = 0; i < userAnswer.length; i++) {
                    if (userAnswer[i][0].equals(answers[i][1])) {
                        score += 10;

                    } else {
                        score += 0;
                    }

                }
                setVisible(false);
                new Result(userName, score);

            } else {
                if (buttonGroup.getSelection() == null) {
                    userAnswer[count][0] = "";

                } else {
                    userAnswer[count][0] = buttonGroup.getSelection().getActionCommand();

                }
                count++;
                start(count);
            }

        }
    }

    // ! Start Function
    public void start(int count) {

        questionNumber.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
        options1.setText(questions[count][1]);
        options1.setActionCommand(questions[count][1]);
        options2.setText(questions[count][2]);
        options2.setActionCommand(questions[count][2]);
        options3.setText(questions[count][3]);
        options3.setActionCommand(questions[count][3]);
        options4.setText(questions[count][4]);
        options4.setActionCommand(questions[count][4]);
        buttonGroup.clearSelection();

    }

    public static void main(String[] args) {
        new Quiz("User");
    }
}
