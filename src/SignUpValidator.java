import javax.swing.*;
import java.util.regex.Pattern;

public class SignUpValidator {
    private JTextField firstName;
    private JTextField lastName;
    private JTextField phone;
    private JTextField email;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JLabel outputLabel;

    public SignUpValidator(JTextField firstName, JTextField lastName, JTextField phone,
                           JTextField email, JPasswordField passwordField1,
                           JPasswordField passwordField2, JLabel outputLabel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.passwordField1 = passwordField1;
        this.passwordField2 = passwordField2;
        this.outputLabel = outputLabel;
    }

    public void validateSignUp() {
        String fName = firstName.getText();
        String lName = lastName.getText();
        String phoneNumber = phone.getText();
        String userEmail = email.getText();
        char[] password1 = passwordField1.getPassword();
        char[] password2 = passwordField2.getPassword();

        // Check if first name, last name, and mobile number are not empty
        if (fName.isEmpty() || lName.isEmpty() || phoneNumber.isEmpty()) {
            outputLabel.setText("First name, last name, and mobile number cannot be empty.");
            return;
        }

        // Check if passwords match and meet criteria
        String password = new String(password1);
        String confirmPassword = new String(password2);
        if (!password.equals(confirmPassword)) {
            outputLabel.setText("Passwords do not match.");
            return;
        }
        if (password.length() < 8 || !isValidPassword(password)) {
            outputLabel.setText("Password must have at least 8 characters, including a capital letter, a small letter, a digit, and a special character.");
            return;
        }

        // Check email format
        if (!isValidEmail(userEmail)) {
            outputLabel.setText("Invalid email format. Please use String@String.(edu or com)");
            return;
        }

        // If all checks pass, print registration information
        outputLabel.setText("Registration information:\n" +
                "First Name: " + fName + "\n" +
                "Last Name: " + lName + "\n" +
                "Mobile Number: " + phoneNumber + "\n" +
                "Email Address: " + userEmail + "\n" +
                "Password: ********"); // Mask password for security
    }

    private boolean isValidPassword(String password) {
        // Password criteria: at least one capital letter, one small letter, one digit, and one special character
        String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&*!])[A-Za-z\\d@#$%^&*!]{8,}$";
        return Pattern.matches(pattern, password);
    }

    private boolean isValidEmail(String email) {
        // Email format: String@String.(edu or com)
        String emailPattern = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.(edu|com)$";
        return Pattern.matches(emailPattern, email);
    }
}
