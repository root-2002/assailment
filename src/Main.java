import formAction.FormCreation;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = FormCreation.createForm();
            frame.setLocationRelativeTo(null);
        });

    }


}