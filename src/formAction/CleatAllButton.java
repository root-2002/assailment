package formAction;

import javax.swing.*;
import java.awt.*;

public class CleatAllButton {

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
}
