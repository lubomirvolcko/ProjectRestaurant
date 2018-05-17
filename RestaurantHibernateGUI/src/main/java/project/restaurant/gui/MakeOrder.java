package project.restaurant.gui;

import project.restaurant.hibernate.Drink;
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
    private JButton btnAppetizer;
    private JButton btnMainDish;
    private JButton btnSalad;
    private JButton btnDessert;
    private JPanel pnlBtnBack;
    private JButton btnBack;
    private JPanel pnlSoftDrinks;
    private JPanel pnlSmoothies;
    private JButton btnSmoothie;
    private JButton btnHotDrinks;
    private JButton btnIceDrinks;
    private JButton btnSoup;
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

                //drink.getDrinksSmoothies();
                Smoothies();
                drink.getDrinksSmoothies();

                getSmootiesButtons(drink.getName(),drink.getPrice(),drink.getItem());

                //getPanel("smootie", 0.00, 1);
                //getPanel("drink", 2.22, 2);
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

    //create labels and button in pnlSmoothies
    public void getSmootiesButtons(String name, Double price, int item){

               getInformationFromDatabase drink = new getInformationFromDatabase();
        try{
            JLabel lblSmootieNumber = new JLabel("name"); //create label
            JButton btnSmootie = new JButton(); //create button

            pnlSmoothies.setLayout(new FlowLayout());

            //create label in pnlSmothies for number of item
            pnlSmoothies.add(lblSmootieNumber = new JLabel(""+item, FlowLayout.RIGHT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.ITALIC, 25));
            //Dimension size = lblSmootieNumber.getPreferredSize();
            //lblSmootieNumber.setBounds(100, 100, size.width, size.height);

            //create label in pnlSmothies for name of item
            pnlSmoothies.add(lblSmootieNumber = new JLabel(""+name, FlowLayout.RIGHT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.ITALIC, 25));
            //Dimension size2 = lblSmootieNumber.getPreferredSize();
            //lblSmootieNumber.setBounds(300, 100, size2.width, size2.height);

            //create label in pnlSmothies for price of item
            pnlSmoothies.add(lblSmootieNumber = new JLabel(""+price , FlowLayout.RIGHT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.ITALIC, 25));
            //Dimension size3 = lblSmootieNumber.getPreferredSize();
            //lblSmootieNumber.setBounds(500, 100, size3.width, size3.height);

            //create button in pnlSmothies for send item to table (for confirm item to order)
            pnlSmoothies.add(btnSmootie = new JButton("OK"));
            btnSmootie.setBackground(Color.getHSBColor(68.56f, 66.67f, 57.65f));
            btnSmootie.setForeground(Color.white);
            //Dimension sizeBtn = btnSmootie.getPreferredSize();
            //btnSmootie.setBounds(700, 100, sizeBtn.width, sizeBtn.height);

            final String smootieName = name;
            final Double SmootiePrice = price;
            btnSmootie.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    sendToTable(smootieName, SmootiePrice);
                }
            });

            System.out.println("smoothie: "+name);
            System.out.println("price: "+price);
            System.out.println("item: "+item);

        }catch (Exception e){
            e.getStackTrace();
        }


    }


    //send item to order on table
    public void sendToTable(String name, Double price){
        JLabel lblSmootie = new JLabel("name");
        JButton btnSmootie = new JButton();

        pnlOrderedItems.setLayout(new FlowLayout());

        pnlOrderedItems.add(lblSmootie = new JLabel(""+name, FlowLayout.LEFT));
        lblSmootie.setFont(new Font("Century Gothic", Font.ITALIC, 25));

        pnlOrderedItems.add(lblSmootie = new JLabel(""+price, FlowLayout.LEFT));
        lblSmootie.setFont(new Font("Century Gothic", Font.ITALIC, 25));

        pnlOrderedItems.add(btnSmootie = new JButton("THROW"));
        btnSmootie.setBackground(Color.getHSBColor(68.56f, 66.67f, 57.65f));
        btnSmootie.setFont(new Font("Century Gothic", Font.ITALIC, 25));
        btnSmootie.setForeground(Color.white);

    }

    public JPanel getPnlSmoothies() {
        return pnlSmoothies;
    }


    }








