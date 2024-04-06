import javax.swing.*;
import java.awt.*;

public class sign_up extends JDialog {
    private JPanel name;
    private JTextField textField1;
    private JTextField textField2;
    private JFormattedTextField formattedTextField1;
    private JFormattedTextField formattedTextField5;
    private JPanel Email_address;
    private JFormattedTextField formattedTextField2;
    private JPasswordField passwordField2;
    private JPasswordField passwordField1;
    private JPanel signUp;
    private JPanel PassWord;
    private JPanel MobileNumber;
    private JPanel test;

    public sign_up(JFrame parent) {
        super(parent);
        setTitle("Sign up");
        initializeComponents(); // Initialize components
        setContentPane(signUp);
        setModal(true);
        setMaximumSize(new Dimension(450, 470));
        setLocationRelativeTo(parent);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void initializeComponents() {
        // Initialize signUp JPanel
        signUp = new JPanel();
        signUp.setLayout(new GridLayout(0, 2)); // Adjust layout as needed

        // Initialize components
        textField1 = new JTextField();
        textField2 = new JTextField();
        formattedTextField1 = new JFormattedTextField();
        formattedTextField5 = new JFormattedTextField();
        formattedTextField2 = new JFormattedTextField();
        passwordField1 = new JPasswordField();
        passwordField2 = new JPasswordField();
        name = new JPanel();
        Email_address = new JPanel();
        PassWord = new JPanel();
        MobileNumber = new JPanel();
        test = new JPanel();

        // Add components to signUp panel
        signUp.add(new JLabel("First Name:"));
        signUp.add(textField1);
        signUp.add(new JLabel("Last Name:"));
        signUp.add(textField2);
        signUp.add(new JLabel("Formatted Field 1:"));
        signUp.add(formattedTextField1);
        signUp.add(new JLabel("Formatted Field 5:"));
        signUp.add(formattedTextField5);
        signUp.add(new JLabel("Email Address:"));
        signUp.add(Email_address);
        signUp.add(new JLabel("Formatted Field 2:"));
        signUp.add(formattedTextField2);
        signUp.add(new JLabel("Password:"));
        signUp.add(passwordField1);
        signUp.add(new JLabel("Confirm Password:"));
        signUp.add(passwordField2);
        signUp.add(new JLabel("Name:"));
        signUp.add(name);
        signUp.add(new JLabel("Password Panel:"));
        signUp.add(PassWord);
        signUp.add(new JLabel("Mobile Number Panel:"));
        signUp.add(MobileNumber);
        signUp.add(new JLabel("Test Panel:"));
        signUp.add(test);
    }

    public static void main(String[] args) {
        sign_up sign = new sign_up(null);
    }
}
