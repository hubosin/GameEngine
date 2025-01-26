package UI;


import javax.swing.*;
import java.awt.*;

public class ConsolePanel extends JPanel {
    public ConsolePanel() {
        setLayout(new BorderLayout());
        add(new JLabel("Console"), BorderLayout.NORTH);
        JTextArea console = new JTextArea();
        console.setEditable(false);
        add(new JScrollPane(console), BorderLayout.CENTER);
    }
}
