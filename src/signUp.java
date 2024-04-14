import javax.swing.*;

public class signUp {
    public JLabel outputLabel;
    JPanel Email;
    JPanel name;
    JPanel phoneNumber;
    JPanel password;
    JPanel actions;
    JPanel output;
    JTextField firstName;
    private JTextField textField1;
    JTextField LastName;
    JPasswordField passwordField1;
    JPasswordField passwordField2;
    JTextField phone;
    JTextField email;
    JButton signUpButton;
    private JButton clearAllButton;
    JLabel outPut;

    // Constructor
    public signUp() {
        // Initialize outputLabel
        outputLabel = new JLabel();

        // Initialize action listeners
        signUpButton.addActionListener(e -> {
            // Validate sign up when the button is clicked
            SignUpValidator validator = new SignUpValidator(
                    firstName,
                    LastName,
                    phone,
                    email,
                    passwordField1,
                    passwordField2,
                    outputLabel);
            validator.validateSignUp();
        });
    }
}
