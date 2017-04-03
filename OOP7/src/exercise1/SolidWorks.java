package exercise1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * SolidWorks GUI to read data from file and display them in different orders.
 */
public final class SolidWorks extends JFrame{

    private static final String FILE_NAME = "soliddata_cubes.txt";

    private Cube[] solids;

    private final JButton bRead = new JButton("Read file '" + FILE_NAME + "'");
    private final JButton bSortv = new JButton("Sort on 'volume'");
    private final JButton bSorts = new JButton("Sort on 'surface'");
    private final JButton bSortd = new JButton("Sort on 'dimension'");
    private final JTextArea outputArea = new JTextArea();

    /**
     * Konstruktor.
     */
    public SolidWorks() {
        super("SolidWorks");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        final JPanel topPanel = new JPanel();
        topPanel.add(bRead);
        add(topPanel, BorderLayout.NORTH);
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);

        final JPanel bottomPanel = new JPanel();
        bottomPanel.add(bSortv);
        bottomPanel.add(bSorts);
        bottomPanel.add(bSortd);
        add(bottomPanel, BorderLayout.SOUTH);
        
        bRead.addChangeListener((ChangeEvent e) -> {
            solids = SolidFileIO.readSolids(FILE_NAME);
            doOutput();
        });
        
        bSortv.addChangeListener((ChangeEvent e) -> {
            Arrays.sort(solids);
            doOutput();
        });
        
        bSorts.addChangeListener((ChangeEvent e) -> {
            Arrays.sort(solids, new SurfaceComparator());
            doOutput();
        });
        
        bSortd.addChangeListener((ChangeEvent e) -> {
            Arrays.sort(solids, new MaxDimensionComparator());
            doOutput();
        });

        // Listener registrieren
        
        setVisible(true);
    }

    /**
     * Gibt die Solids aus.
     */
    private void doOutput() {
        outputArea.setText("");
        for (final Cube solid : solids) {
            outputArea.append(solid.toString());
        }
    }

    /*
     * (non-Javadoc)
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    /*@Override
    public void actionPerformed(final ActionEvent event) {
        if (event.getSource() == bRead) {
            solids = SolidFileIO.readSolids(FILE_NAME);
            doOutput();
        }
        if ((event.getSource() == bSort1) && (solids != null)) {
            // your turn
            doOutput();
        }
        if ((event.getSource() == bSort2) && (solids != null)) {
            // your turn
            doOutput();
        }
        if ((event.getSource() == bSort3) && (solids != null)) {
            // your turn
            doOutput();
        }
    }*/

    /**
     * main-Methode für Start.
     * @param args nicht verwendet.
     */
    public static void main(final String[] args) {
        EventQueue.invokeLater(() -> new SolidWorks());
    }
}
