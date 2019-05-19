package view;


import controller.Controller;
import model.BrewData;
import model.Ingredient;
import model.RecipeIngredient;
import model.StorageIngredient;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class IngredientDetailPage extends JFrame {
    private Controller controller;

    public IngredientDetailPage(StorageIngredient ingredient) {
        JFrame frame = new JFrame("Brew Day!");

        Container container = getContentPane();

        /* ---------- Title Panel ---------- */
        JPanel titlePanel = new JPanel(new BorderLayout());
        titlePanel.setPreferredSize(new Dimension(600, 100));
        JLabel pageTitle = new JLabel(ingredient.GetName(), SwingConstants.CENTER);
        titlePanel.add(pageTitle);

        /* ---------- blank Panel ---------- */
        JPanel blankPanelL = new JPanel(new BorderLayout());
        blankPanelL.setPreferredSize(new Dimension(100, 100));
        JPanel blankPanelR = new JPanel(new BorderLayout());
        blankPanelR.setPreferredSize(new Dimension(100, 100));

        /* ---------- motion Panel ---------- */
        JPanel motionPanel = new JPanel(new GridLayout(3, 7));
        motionPanel.setPreferredSize(new Dimension(100, 100));

        JButton saveBtn = new JButton("Save");
        saveBtn.setPreferredSize(new Dimension(100, 50));

        JButton deleteBtn = new JButton("Delete");
        deleteBtn.setPreferredSize(new Dimension(100, 50));
        deleteBtn.addActionListener(e -> {
            int choice = JOptionPane.showConfirmDialog(frame, "Are you sure to delete?",
                    "Confirm Deletion", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (choice == JOptionPane.YES_OPTION) {
                BrewData brewData = new BrewData();
                ArrayList<StorageIngredient> ingredientList = brewData.getStorageIngredientList();
                ingredientList.remove(ingredient);
                brewData.setStorageIngredientList(ingredientList);
            }
        });

        JButton backBtn = new JButton("Back");
        backBtn.setPreferredSize(new Dimension(100, 50));
        backBtn.addActionListener(e -> {
            controller = Controller.GetInstance();
            controller.getRecipeListPage(frame);
        });

        motionPanel.add(new JLabel());
        motionPanel.add(new JLabel());
        motionPanel.add(new JLabel());
        motionPanel.add(new JLabel());
        motionPanel.add(new JLabel());
        motionPanel.add(new JLabel());
        motionPanel.add(new JLabel());

        motionPanel.add(saveBtn);
        motionPanel.add(new JLabel());
        motionPanel.add(deleteBtn);
        motionPanel.add(new JLabel());
        motionPanel.add(backBtn);

        motionPanel.add(new JLabel());
        motionPanel.add(new JLabel());
        motionPanel.add(new JLabel());
        motionPanel.add(new JLabel());
        motionPanel.add(new JLabel());
        motionPanel.add(new JLabel());
        motionPanel.add(new JLabel());


        /* ---------- Content Panel ---------- */
        JPanel ingredientPanel = new JPanel(new FlowLayout());
        ingredientPanel.setPreferredSize(new Dimension(200, 600));
        //ingredientPanel.setBackground(java.awt.Color.blue);

        JTextField nameField = new JTextField();
        JTextField amountField = new JTextField();
        JTextField unitField = new JTextField();

        //JPanel ingredientPanel = new JPanel(new FlowLayout());

        JScrollPane listScrollPane = new JScrollPane(ingredientPanel);

        ingredientPanel.add(nameField);
        ingredientPanel.add(amountField);
        ingredientPanel.add(unitField);

        container.add(listScrollPane, BorderLayout.CENTER);
        container.add(titlePanel, BorderLayout.NORTH);
        container.add(blankPanelR, BorderLayout.EAST);
        container.add(blankPanelL, BorderLayout.WEST);
        container.add(motionPanel, BorderLayout.SOUTH);

        frame.add(container);
        frame.setResizable(false);
        frame.setSize(new Dimension(600, 800));
        frame.setLocation(150, 150);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
