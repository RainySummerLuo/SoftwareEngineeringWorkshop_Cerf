package view;

import controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NotePage extends JFrame {
    private Controller controller;

    public NotePage() {
        JFrame frame = new JFrame("Brew Day !");

        Container container = getContentPane();

        /* ---------- Title Panel ---------- */
        JPanel titlePanel = new JPanel(new BorderLayout());
        titlePanel.setPreferredSize(new Dimension(600, 100));
        JLabel pageTitle = new JLabel("Notes:", SwingConstants.CENTER);
        titlePanel.add(pageTitle);


        /* ---------- blank Panel ---------- */
        JPanel blankPanelL = new JPanel(new BorderLayout());
        blankPanelL.setPreferredSize(new Dimension(100, 100));
        JPanel blankPanelR = new JPanel(new BorderLayout());
        blankPanelR.setPreferredSize(new Dimension(100, 100));

        /* ---------- motion Panel ---------- */
        JPanel motionPanel = new JPanel(new GridLayout(3, 5));
        motionPanel.setPreferredSize(new Dimension(100, 100));

        JButton backBtn = new JButton("Back");
        backBtn.setPreferredSize(new Dimension(100, 50));
        backBtn.addActionListener(e -> {
            controller = Controller.GetInstance();
            controller.getMainPage(frame);
        });

        motionPanel.add(new JLabel());
        motionPanel.add(new JLabel());
        motionPanel.add(new JLabel());
        motionPanel.add(new JLabel());
        motionPanel.add(new JLabel());
        motionPanel.add(new JLabel());
        motionPanel.add(new JLabel());
        motionPanel.add(backBtn);
        motionPanel.add(new JLabel());
        motionPanel.add(new JLabel());
        motionPanel.add(new JLabel());
        motionPanel.add(new JLabel());
        motionPanel.add(new JLabel());
        motionPanel.add(new JLabel());

        /* ---------- Content Panel ---------- */
        JPanel notePanel = new JPanel(new BorderLayout());
        notePanel.setPreferredSize(new Dimension(200, 600));

        JList<String> jList = new JList<>();

        DefaultListModel<String> listModel = new DefaultListModel<>();

        listModel.addElement("dddd");

        jList.setModel(listModel);

        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        jList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    String noteContent = jList.getSelectedValue();
                    NoteDetailPage noteDetailPage = new NoteDetailPage();
                    noteDetailPage.setNoteContent(noteContent);
                }
            }
        });

        JScrollPane listScrollPane = new JScrollPane(jList);
        notePanel.add(listScrollPane, BorderLayout.CENTER);

        container.add(notePanel, BorderLayout.CENTER);
        container.add(titlePanel, BorderLayout.NORTH);
        container.add(blankPanelR, BorderLayout.EAST);
        container.add(blankPanelL, BorderLayout.WEST);
        container.add(motionPanel, BorderLayout.SOUTH);

        frame.add(container);
        frame.setResizable(false);
        frame.setSize(new Dimension(600, 800));
        frame.setLocation(150, 150);
        //frame.setAlwaysOnTop(true);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
