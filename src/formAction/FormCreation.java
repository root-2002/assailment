package formAction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormCreation {
    public static JFrame createForm() {
        JFrame frame = new JFrame("Sign Up Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 350);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(9, 2)); // Increased rows to accommodate the Clear button

        panel.add(new JLabel("First Name:"));
        panel.add(new JTextField());

        panel.add(new JLabel("Middle Name:"));
        panel.add(new JTextField());

        panel.add(new JLabel("Last Name:"));
        panel.add(new JTextField());

        panel.add(new JLabel("Email:"));
        panel.add(new JTextField());

        panel.add(new JLabel("Password:"));
        panel.add(new JPasswordField());

        panel.add(new JLabel("Confirm Password:"));
        panel.add(new JPasswordField());

        panel.add(new JLabel("Mobile Number:"));
        panel.add(new JTextField());

        // Button to clear all fields
        JButton clearButton = new JButton("Clear All");
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearAllFields(panel);
            }
        });
        panel.add(clearButton);

        JButton signUpButton = new JButton("Sign Up");
        panel.add(signUpButton);

        frame.add(panel);
        frame.setVisible(true);
        return frame;
    }

    private static void clearAllFields(Container container) {
        Component[] components = container.getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                ((JTextField) component).setText("");
            } else if (component instanceof JPasswordField) {
                ((JPasswordField) component).setText("");
            } else if (component instanceof Container) {
                clearAllFields((Container) component);
            }
        }
    }

    public static void main(String[] args) {
        createForm();
    }
}
