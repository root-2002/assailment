import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            signUp signUpForm = new signUp();

            JFrame frame = new JFrame("Sign Up Form");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create a main panel to hold all other panels
            JPanel mainPanel = new JPanel();
            mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));


            mainPanel.add(signUpForm.Email);
            mainPanel.add(signUpForm.name);
            mainPanel.add(signUpForm.phoneNumber);
            mainPanel.add(signUpForm.password);
            mainPanel.add(signUpForm.actions);
            mainPanel.add(signUpForm.output);


            SignUpValidator validator = new SignUpValidator(
                    signUpForm.firstName,
                    signUpForm.LastName,
                    signUpForm.phone,
                    signUpForm.email,
                    signUpForm.passwordField1,
                    signUpForm.passwordField2,
                    signUpForm.outPut);

            // Add action listener to the "Sign Up" button
            signUpForm.signUpButton.addActionListener(e -> {
                validator.validateSignUp();
            });



            frame.add(mainPanel);


            frame.pack();
            frame.setVisible(true);
        });
    }}
