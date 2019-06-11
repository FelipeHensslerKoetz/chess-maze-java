package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Table {

    private final JFrame gameframe;
    private final Dimension OUTER_FRAME_DIMENSION = new Dimension(600,600);


    public Table(){
        this.gameframe = new JFrame("ChessMaze");
        final JMenuBar tableMenuBar = new JMenuBar();
        populateMenuBar(tableMenuBar);
        this.gameframe.setJMenuBar(tableMenuBar);
        this.gameframe.setVisible(true);
        this.gameframe.setSize(OUTER_FRAME_DIMENSION);
    }

    private void populateMenuBar(JMenuBar tableMenuBar) {
        tableMenuBar.add(createFileMenu());
    }

    private JMenu createFileMenu() {
        final JMenu fileMenu = new JMenu("File");
        final JMenuItem openPGN = new JMenuItem("Load PGN file");
        openPGN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Abir pgn");
            }
        });
        fileMenu.add(openPGN);
        return fileMenu;
    }

}
