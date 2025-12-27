import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    JTextField display;
    JButton add, sub, mul, div;
    int num1 = 0, num2 = 0;
    char operator;

    public Calculator() {

        // Window
        setTitle("Simple Calculator");
        setSize(300, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // Display
        display = new JTextField();
        display.setBounds(30, 30, 220, 40);
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 18));
        add(display);

        // Buttons
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");

        add.setBounds(30, 90, 100, 40);
        sub.setBounds(150, 90, 100, 40);
        mul.setBounds(30, 150, 100, 40);
        div.setBounds(150, 150, 100, 40);

        // Colors
        add.setBackground(Color.YELLOW);
        sub.setBackground(Color.CYAN);
        mul.setBackground(Color.PINK);
        div.setBackground(Color.ORANGE);

        // Add to frame
        add(add);
        add(sub);
        add(mul);
        add(div);

        // Actions
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String input = JOptionPane.showInputDialog(this, "Enter number:");

        if (input == null) return;

        num2 = Integer.parseInt(input);

        if (operator == 0) {
            num1 = num2;
            operator = e.getActionCommand().charAt(0);
            display.setText(num1 + " " + operator);
        } else {
            int result = 0;

            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
            }

            display.setText("Result = " + result);
            operator = 0;
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
