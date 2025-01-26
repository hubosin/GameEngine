package UI;

import javax.swing.*;
import java.awt.BorderLayout;
import javax.swing.tree.DefaultMutableTreeNode;

public class HierarchyPanel extends JPanel {
    public HierarchyPanel() {
        setLayout(new BorderLayout());
        add(new JLabel("Hierarchy"), BorderLayout.NORTH);
        JTree hierarchy = new JTree(); // Default root
        add(new JScrollPane(hierarchy), BorderLayout.CENTER);
    }
}
