package project.restaurant.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MakeOrder {
    private JPanel pnlMakeOrder;
    private JPanel pnlOrderedItems;
    private JPanel pnlMainCategory;
    private JButton btnMeal;
    private JButton btnDrinks;
    private JLabel lblNameTable;
    private JPanel pnlConfirmButtons;
    private JButton btnConfirm;
    private JButton btnCancel;
    private JPanel pnlMealType;
    private JButton btnSoftDrinks;
    private JButton btnAlcoholDrinks;
    private JPanel pnlDrinksCategory;
    private JPanel pnlMealCategory;
    private JButton btnPizza;
    private JButton btnPasta;
    private JButton btnMeat;
    private JButton btnSalad;
    private JButton btnSoup;
    private JButton btnDessert;

    public JPanel getPnlOrderedItems() {
        return pnlOrderedItems;
    }

    public JPanel getPnlMainCategory() {
        return pnlMainCategory;
    }

    public JButton getBtnMeal() {
        return btnMeal;
    }

    public JButton getBtnDrinks() {
        return btnDrinks;
    }

    public JLabel getLblNameTable() {
        return lblNameTable;
    }

    public JPanel getPnlMakeOrder() {
        return pnlMakeOrder;
    }

    public MakeOrder(){
        pnlMealType.setVisible(false);

        pnlMakeOrder.setSize(500, 500);

        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComponent comp = (JComponent) e.getSource();
                Window win = SwingUtilities.getWindowAncestor(comp); //get top window
                win.dispose();
            }
        });


        btnDrinks.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pnlMainCategory.setVisible(false);
                pnlMealType.setVisible(true);
                pnlMealCategory.setVisible(false);
                pnlDrinksCategory.setVisible(true);
            }
        });
        btnMeal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pnlMainCategory.setVisible(false);
                pnlMealType.setVisible(true);
                pnlMealCategory.setVisible(true);
                pnlDrinksCategory.setVisible(false);
            }
        });
    }
}




