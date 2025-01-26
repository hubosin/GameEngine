package UI;

import javax.swing.*;
import java.io.File;
import java.awt.BorderLayout;
import javax.swing.tree.DefaultMutableTreeNode;

public class FileExplorerPanel extends JPanel {
    public FileExplorerPanel() {
        setLayout(new BorderLayout());
        add(new JLabel("File Explorer"), BorderLayout.NORTH);

        JTree fileTree = new JTree(createFileTree(new File("."))); // Load current directory
        add(new JScrollPane(fileTree), BorderLayout.CENTER);
    }

    private DefaultMutableTreeNode createFileTree(File rootDir) {
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode(rootDir.getName());
        addFileNodes(rootNode, rootDir);
        return rootNode;
    }

    private void addFileNodes(DefaultMutableTreeNode parentNode, File dir) {
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                DefaultMutableTreeNode childNode = new DefaultMutableTreeNode(file.getName());
                parentNode.add(childNode);
                if (file.isDirectory()) {
                    addFileNodes(childNode, file);
                }
            }
        }
    }
}