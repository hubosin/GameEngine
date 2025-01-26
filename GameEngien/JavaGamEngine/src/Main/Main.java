package Main;

import javax.swing.*;
import menu.MenuBar; // Add the correct import for MenuBar
import UI.HierarchyPanel; // Add the correct import for HierarchyPanel
import UI.FileExplorerPanel; // Add the correct import for FileExplorerPanel
import UI.InspectorPanel; // Add the correct import for InspectorPanel
import UI.ConsolePanel; // Add the correct import for ConsolePanel
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Game Engine GUI");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1200, 800);

            // Create the menu bar
            frame.setJMenuBar(new MenuBar());

            // Create panels for left, right, and center sections
            JPanel leftPanel = new HierarchyPanel();
            JPanel fileExplorerPanel = new FileExplorerPanel();
            JSplitPane leftSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, leftPanel, fileExplorerPanel);
            leftSplitPane.setDividerLocation(300);

            JPanel rightPanel = new InspectorPanel();
            JPanel sceneViewPanel = new JPanel(); // You can create a custom scene view panel later
            JPanel consolePanel = new ConsolePanel();
            JSplitPane centerSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, sceneViewPanel, consolePanel);
            centerSplitPane.setDividerLocation(600);

            JSplitPane mainSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftSplitPane, centerSplitPane);
            mainSplitPane.setDividerLocation(300);
            
            
            

            frame.add(mainSplitPane, BorderLayout.CENTER);
            frame.setVisible(true);
        });
    }
}
