package UI;

import javax.swing.*;
import java.awt.*;

public class InspectorPanel extends JPanel {
    public InspectorPanel() {
        setLayout(new BorderLayout());
        add(new JLabel("Inspector"), BorderLayout.NORTH);
        JTextField propertyField = new JTextField("Property");
        add(propertyField, BorderLayout.CENTER);
    }
}