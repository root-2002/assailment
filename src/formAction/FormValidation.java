package formAction;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormValidation {
    public static boolean validateFirstName(String firstName) {
        if (firstName == null || firstName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: First name cannot be empty.");
            return false;
        }
        return true;
    }

    public static boolean validateLastName(String lastName) {
        if (lastName == null || lastName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: Last name cannot be empty.");
            return false;
        }
        return true;
    }

    public static boolean validateMobileNumber(String mobileNumber) {
        if (mobileNumber == null || mobileNumber.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: Mobile number cannot be empty.");
            return false;
        }
        return true;
    }

    public static boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        Matcher matcher = pattern.matcher(email);
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(null, "Error: Invalid email format.");
            return false;
        }
        return true;
    }

    public static boolean validatePassword(String password, String confirmPassword) {
        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(null, "Error: Passwords do not match.");
            return false;
        }
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$");
        Matcher matcher = pattern.matcher(password);
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(null, "Error: Password must have at least one capital letter, one small letter, one digit, one special character, and be at least 8 characters long.");
            return false;
        }
        return true;
    }
}
