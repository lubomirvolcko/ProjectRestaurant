package project.restaurant.gui;

import project.restaurant.hibernate.getInformationFromDatabase;

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
    private JButton btnMeat;
    private JButton btnSalad;
    private JButton btnSoup;
    private JButton btnDessert;
    private JPanel pnlBtnBack;
    private JButton btnBack;
    private JPanel pnlSoftDrinks;
    private JPanel pnlSmoothies;
    private JButton btnSmoothie;
    private JButton btnHotDrinks;
    private JButton btnIceDrinks;
    private JButton btnPasta;
    public String state;

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

    public MakeOrder() {
        pnlMealType.setVisible(false);
        btnBack.setEnabled(false);
        pnlSoftDrinks.setVisible(false);
        pnlSmoothies.setVisible(false);

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
                StateDrinks();
            }
        });

        btnMeal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StateMeal();
            }
        });

        //action on btn back
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (state == "StateDrinks" || state == "StateMeal") {
                    StateMakeorder();
                }
                else if(state == "StateSoftDrinks"){
                    StateDrinks();
                }
                else if(state == "StateSmoothies"){
                    SoftDrinks();
                }
            }
        });
        btnSoftDrinks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SoftDrinks();
            }
        });
        btnSmoothie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                getInformationFromDatabase drink = new getInformationFromDatabase();
                drink.getDrinksSmoothies();
                Smoothies();
                //getSmootiesButtons("smootie", 0.00, 0);
            }
        });
    }

    public void StateMakeorder() {
        pnlSoftDrinks.setVisible(false);
        pnlMainCategory.setVisible(true);
        pnlMealType.setVisible(false);
        btnBack.setEnabled(false);
    }

    public void StateMeal() {
        state = "StateMeal";
        pnlMainCategory.setVisible(false);
        pnlMealType.setVisible(true);
        pnlMealCategory.setVisible(true);
        pnlDrinksCategory.setVisible(false);
        btnBack.setEnabled(true);
        pnlSoftDrinks.setVisible(false);
    }

    public void StateDrinks() {
        state = "StateDrinks";
        pnlMainCategory.setVisible(false);
        pnlMealType.setVisible(true);
        pnlMealCategory.setVisible(false);
        pnlDrinksCategory.setVisible(true);
        btnBack.setEnabled(true);
        pnlSoftDrinks.setVisible(false);
    }

    public void SoftDrinks(){
        state = "StateSoftDrinks";
        pnlDrinksCategory.setVisible(false);
        pnlMealType.setVisible(false);
        pnlSoftDrinks.setVisible(true);
        pnlSmoothies.setVisible(false);
    }

    public void Smoothies(){
        state = "StateSmoothies";
        pnlSoftDrinks.setVisible(false);
        pnlSmoothies.setVisible(true);
    }

    public void getSmootiesButtons(String name, Double price, int item){
        /*JButton btnSmootie = new JButton();
        btnSmootie.setName("btnSmootie");
        btnSmootie.setText(name);
        btnSmootie.setPreferredSize(new Dimension(100, 100));
        pnlSmoothies.add(btnSmootie, 1, 1);
        //pnlSmoothies.revalidate();
        //pnlSmoothies.repaint();*/
        JLabel lblSmootieNumber = new JLabel("ahoj");
        lblSmootieNumber.setVisible(true);
        pnlSmoothies.setLayout(null);
        lblSmootieNumber.setLocation(453, 20);
        lblSmootieNumber.setSize(86, 14);
        pnlSmoothies.add(lblSmootieNumber);
        /*JLabel lblSmootieName = new JLabel(""+name);
        lblSmootieName.setText(name);
        JLabel lblSmootiePrice = new JLabel(""+ price.toString());
        lblSmootiePrice.setText(price.toString());
        //pnlSmoothies.add(lblSmootieNumber);
        pnlSmoothies.add(lblSmootieName);
        //pnlSmoothies.add(lblSmootiePrice);*/

        System.out.println("smoothie: "+name);
        System.out.println("price: "+price);
        System.out.println("item: "+item);

    }

    }








