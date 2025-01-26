package menu;

import javax.swing.*;

public class MenuBar extends JMenuBar {
    public MenuBar() {
        JMenu fileMenu = new JMenu("File");
        fileMenu.add(new JMenuItem("New"));
        fileMenu.add(new JMenuItem("Open"));
        fileMenu.add(new JMenuItem("Save"));
        this.add(fileMenu);
    }
}
