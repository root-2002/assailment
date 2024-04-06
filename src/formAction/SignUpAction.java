package formAction;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpAction {
    public static void signUpAction(JFrame frame) {
        JButton signUpButton = getSignUpButton(frame);
        signUpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JTextField firstNameField = getTextField(frame, 1);
                JTextField middleNameField = getTextField(frame, 3);
                JTextField lastNameField = getTextField(frame, 5);
                JTextField emailField = getTextField(frame, 7);
                JPasswordField passwordField = getPasswordField(frame, 9);
                JPasswordField confirmPasswordField = getPasswordField(frame, 11);
                JTextField mobileNumberField = getTextField(frame, 13);

                String firstName = firstNameField.getText();
                String middleName = middleNameField.getText();
                String lastName = lastNameField.getText();
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());
                String confirmPassword = new String(confirmPasswordField.getPassword());
                String mobileNumber = mobileNumberField.getText();

                if (FormValidation.validateFirstName(firstName) && FormValidation.validateLastName(lastName) && FormValidation.validateMobileNumber(mobileNumber) && FormValidation.validateEmail(email) && FormValidation.validatePassword(password, confirmPassword)) {
                    System.out.println("Registration Information:");
                    System.out.println("First Name: " + firstName);
                    System.out.println("Middle Name: " + middleName);
                    System.out.println("Last Name: " + lastName);
                    System.out.println("Mobile Number: " + mobileNumber);
                    System.out.println("Email Address: " + email);
                    System.out.println("Password: " + password);
                }
            }
        });
    }

    private static JButton getSignUpButton(JFrame frame) {
        JPanel panel = (JPanel) frame.getContentPane().getComponent(0);
        return (JButton) panel.getComponent(panel.getComponentCount() - 1);
    }

    private static JTextField getTextField(JFrame frame, int index) {
        JPanel panel = (JPanel) frame.getContentPane().getComponent(0);
        return (JTextField) panel.getComponent(index);
    }

    private static JPasswordField getPasswordField(JFrame frame, int index) {
        JPanel panel = (JPanel) frame.getContentPane().getComponent(0);
        return (JPasswordField) panel.getComponent(index);
    }
}
