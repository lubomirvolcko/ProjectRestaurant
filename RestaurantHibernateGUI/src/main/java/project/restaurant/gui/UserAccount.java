package project.restaurant.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.util.ArrayList;

public class UserAccount {
    private JPanel UserAccount;
    private JPanel bgUserAccount;
    private JPanel pnlUserTop;
    private JLabel lblUserName;
    private JTextField txtSearch;
    private JButton btnSearch;
    private JPanel pnlTopMenu;
    private JButton btnTopMenuMakeOrder;
    private JButton btnTopMenuTables;
    private JButton btnTopMenuTransfer;
    private JButton btnTopMenuBill;
    private JButton btnTopMenuSetDrinks;
    private JButton btnTopMenuSetFoods;
    private JButton btnTopMenuSetEmployee;
    private JButton btnTopMenuLogOut;
    private JButton btnMakeOrder;
    private JButton btnTables;
    private JButton btnTransfer;
    private JButton btnBill;
    private JButton btnSetDrinks;
    private JButton btnSetFoods;
    private JButton btnSetEmployee;
    private JButton btnLogOut;
    private JPanel pnlBasicMenu;
    private JSeparator sprTopMenu;
    private JPanel pnlTables;
    private JButton btnTable1;
    private JButton btnTable2;
    private JButton btnTable3;
    private JButton btnTable4;
    private JButton btnTable5;
    private JButton btnTable6;
    private JButton btnTable7;
    private JButton btnTable8;
    private JPanel pnlOrderedTable1;
    private JButton btnViewOrderTable1;
    private JButton btnAddToOrderTable1;
    private JButton btnPaymentTable1;
    private JButton btnStornoTable1;
    private JPanel pnlOrderedTable2;
    private JPanel pnlOrderedTable3;
    private JPanel pnlOrderedTable5;
    private JPanel pnlOrderedTable6;
    private JPanel pnlOrderedTable8;
    private JPanel pnlOrderedTable7;
    private JPanel pnlOrderedTable4;
    private JLabel lblTotalPriceTable1;
    private JPanel pnlTable1;
    private JPanel pnlTable2;
    private JPanel pnlTable3;
    private JPanel pnlTable4;
    private JButton btnViewOrderTable2;
    private JButton btnAddToOrderTable2;
    private JButton btnPaymentTable2;
    private JButton btnStornoTable2;
    private JLabel lblTotalPriceTable2;
    private JButton btnViewOrderTable3;
    private JButton btnAddToOrderTable3;
    private JButton btnPaymentTable3;
    private JButton btnStornoTable3;
    private JLabel lblTotalPriceTable3;
    private JButton btnViewOrderTable4;
    private JButton btnAddToOrderTable4;
    private JButton btnPaymentTable4;
    private JButton btnStornoTable4;
    private JLabel lblTotalPriceTable4;
    private JPanel pnlTable5;
    private JPanel pnlTable6;
    private JPanel pnlTable7;
    private JPanel pnlTable8;
    private JButton btnViewOrderTable8;
    private JButton btnAddToOrderTable8;
    private JButton btnPaymentTable8;
    private JButton btnStornoTable8;
    private JLabel lblTotalPriceTable8;
    private JButton btnViewOrderTable7;
    private JButton btnAddToOrderTable7;
    private JButton btnPaymentTable7;
    private JButton btnStornoTable7;
    private JLabel lblTotalPriceTable7;
    private JButton btnViewOrderTable6;
    private JButton btnAddToOrderTable6;
    private JButton btnPaymentTable6;
    private JButton btnStornoTable6;
    private JLabel lblTotalPriceTable6;
    private JButton btnViewOrderTable5;
    private JButton btnAddToOrderTable5;
    private JButton btnPaymentTable5;
    private JButton btnStornoTable5;
    private JLabel lblTotalPriceTable5;
    private String username;
    String table;
    ArrayList<Order> orderArray = new ArrayList<Order>();

    public JPanel getPnlOrderedTable1() {
        return pnlOrderedTable1;
    }

    public JPanel getPnlOrderedTable2() {
        return pnlOrderedTable2;
    }

    public JPanel getPnlOrderedTable3() {
        return pnlOrderedTable3;
    }

    public JPanel getPnlOrderedTable4() {
        return pnlOrderedTable4;
    }

    public JPanel getPnlOrderedTable5() {
        return pnlOrderedTable5;
    }

    public JPanel getPnlOrderedTable6() {
        return pnlOrderedTable6;
    }

    public JPanel getPnlOrderedTable7() {
        return pnlOrderedTable7;
    }

    public JPanel getPnlOrderedTable8() {
        return pnlOrderedTable8;
    }


    public JButton getBtnTable1() {
        return btnTable1;
    }

    public JButton getBtnTable2() {
        return btnTable2;
    }

    public JButton getBtnTable3() {
        return btnTable3;
    }

    public JButton getBtnTable4() {
        return btnTable4;
    }

    public JButton getBtnTable5() {
        return btnTable5;
    }

    public JButton getBtnTable6() {
        return btnTable6;
    }

    public JButton getBtnTable7() {
        return btnTable7;
    }

    public JButton getBtnTable8() {
        return btnTable8;
    }

    public void setOrderArray(ArrayList<Order> orderArray) {
        this.orderArray = orderArray;
    }

    public JPanel getUserAccount() {
        return UserAccount;
    }

    //MakeOrder makeOrder = new MakeOrder();

    public void printOrderArray(){
        int size=orderArray.size();
        System.out.println("SIZE : "+size);

        for (int i=0;i<size;i++){
            System.out.println("ARRAY LIST "+i+": "+orderArray.get(i).getNumberOfItem()+" - "+orderArray.get(i).getNameItem()+" - "+
                    +orderArray.get(i).getPrice()+" - " +orderArray.get(i).getTotalPrice()+" - "+orderArray.get(i).getIdTable());

        }
    }


    public void setTable1(){
        pnlOrderedTable1.setVisible(false);
        btnTable1.setVisible(true);

        System.out.println("CHANGE ON TABLE 1");
    }

    public void setTable2(){
        btnTable2.setVisible(false);
        pnlOrderedTable2.setVisible(true);
    }

    public void setTable3(){
        btnTable3.setVisible(false);
        pnlOrderedTable3.setVisible(true);
    }

    public void setTable4(){
        btnTable4.setVisible(false);
        pnlOrderedTable4.setVisible(true);
    }

    public void setTable5(){
        btnTable5.setVisible(false);
        pnlOrderedTable5.setVisible(true);
    }

    public void setTable6(){
        btnTable6.setVisible(false);
        pnlOrderedTable6.setVisible(true);
    }

    public void setTable7(){
        btnTable7.setVisible(false);
        pnlOrderedTable7.setVisible(true);
    }

    public void setTable8(){
        btnTable8.setVisible(false);
        pnlOrderedTable8.setVisible(true);
    }

    public UserAccount() {

        pnlTopMenu.setVisible(false);
        pnlTables.setVisible(false);

        pnlOrderedTable1.setVisible(false);
        pnlOrderedTable2.setVisible(false);
        pnlOrderedTable3.setVisible(false);
        pnlOrderedTable4.setVisible(false);
        pnlOrderedTable5.setVisible(false);
        pnlOrderedTable6.setVisible(false);
        pnlOrderedTable7.setVisible(false);
        pnlOrderedTable8.setVisible(false);

        //btn search
        btnSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Search");
            }
        });
        //btn basic menu MakeOrder
        btnMakeOrder.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pnlBasicMenu.setVisible(false);
                pnlTopMenu.setVisible(true);
                pnlTables.setVisible(true);
                System.out.println("MakeOrder");
            }
        });
        //btn top menu MakeOrder
        btnTopMenuMakeOrder.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pnlBasicMenu.setVisible(false);
            }
        });
        //btn top menu Tables
        btnTopMenuTables.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pnlTables.setVisible(true);
            }
        });
        //btn basic menu Tables
        btnTables.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //setPanels("xx", "xx");
                pnlBasicMenu.setVisible(false);
                pnlTables.setVisible(true);
                pnlTopMenu.setVisible(true);
            }
        });
        //btn basic menu LogOut
        btnLogOut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                logOut(e);
            }
        });

        btnTopMenuLogOut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                logOut(e);
            }
        });
        btnTable1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openMealMeanu(1);
            }
        });
        btnTable2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openMealMeanu(2);
            }
        });
        btnTable3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openMealMeanu(3);
            }
        });
        btnTable4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openMealMeanu(4);
            }
        });
        btnTable5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openMealMeanu(5);
            }
        });
        btnTable6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openMealMeanu(6);
            }
        });
        btnTable7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openMealMeanu(7);
            }
        });
        btnTable8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openMealMeanu(8);
            }
        });
        btnTopMenuSetEmployee.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    openSetEmployee();
                } catch (PrinterException e1) {
                    e1.printStackTrace();
                }
            }
        });
        btnSetEmployee.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    openSetEmployee();
                } catch (PrinterException e1) {
                    e1.printStackTrace();
                }
            }
        });
        btnSetDrinks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetDrinks setDrinks = new SetDrinks();
                setDrinks.createTable();
            }
        });
        btnSetFoods.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetFood setFood = new SetFood();
                setFood.createTable();
            }
        });
        btnTopMenuSetFoods.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetFood setFood = new SetFood();
                setFood.createTable();
            }
        });
        btnTopMenuSetDrinks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetDrinks setDrinks = new SetDrinks();
                setDrinks.createTable();
            }
        });

    }

    public void logOut(ActionEvent e){
        EntryPage page = new EntryPage();
        page.getBrEntryPage();
        JComponent comp = (JComponent) e.getSource();
        Window win = SwingUtilities.getWindowAncestor(comp); //get top window
        win.dispose();
    }

    public JFrame openSetEmployee() throws PrinterException {
        SetEmployee setemployee = new SetEmployee();

        JFrame frameSetEmployee = new JFrame("Set Employee");
        frameSetEmployee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameSetEmployee.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frameSetEmployee.setUndecorated(true);
        frameSetEmployee.setContentPane(setemployee.getPnlSetEmployee());
        frameSetEmployee.setVisible(true);

        return frameSetEmployee;
    }

    public JFrame openMealMeanu(int i) {
        MakeOrder makeorder = new MakeOrder();
        Order order = new Order();

        makeorder.getOrderArray(orderArray);
        //ArrayList<Order> orderArray = new ArrayList<Order>();


        JFrame frameMakeOrder = new JFrame("Make order");
        frameMakeOrder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameMakeOrder.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frameMakeOrder.setUndecorated(true);


        switch (i) {
            case 1:
                makeorder.getLblNameTable().setText("Table 1");
                makeorder.makeOrderIdTable=1;
                setToTable(frameMakeOrder, makeorder);
                break;
            case 2:
                makeorder.getLblNameTable().setText("Table 2");
                makeorder.makeOrderIdTable=2;
                setToTable(frameMakeOrder, makeorder);
                break;
            case 3:
                makeorder.getLblNameTable().setText("Table 3");
                makeorder.makeOrderIdTable=3;
                setToTable(frameMakeOrder, makeorder);
                break;
            case 4:
                makeorder.getLblNameTable().setText("Table 4");
                makeorder.makeOrderIdTable=4;
                setToTable(frameMakeOrder, makeorder);
                break;
            case 5:
                makeorder.getLblNameTable().setText("Table 5");
                makeorder.makeOrderIdTable=5;
                setToTable(frameMakeOrder, makeorder);
                break;
            case 6:
                makeorder.getLblNameTable().setText("Table 6");
                makeorder.makeOrderIdTable=6;
                setToTable(frameMakeOrder, makeorder);
                break;
            case 7:
                makeorder.getLblNameTable().setText("Table 7");
                makeorder.makeOrderIdTable=7;
                setToTable(frameMakeOrder, makeorder);
                break;
            case 8:
                makeorder.getLblNameTable().setText("Table 8");
                makeorder.makeOrderIdTable=8;
                setToTable(frameMakeOrder, makeorder);
                break;
            default:
                System.out.println("Table not exists!");
        }



        frameMakeOrder.setContentPane(makeorder.getPnlMakeOrder());
        frameMakeOrder.setVisible(true);

        return frameMakeOrder;
    }

    public void setToTable(JFrame frameMakeOrder, final MakeOrder makeOrder) {
        int size=orderArray.size();
        if (size>0){
            for (int i=0;i<size;i++){
                makeOrder.totalPrice=0;

                JTextField txtCount = new JTextField("name");
                JLabel lblX = new JLabel("name");
                JLabel lblEuro = new JLabel("name");
                JLabel lblName = new JLabel("name");
                JLabel lblPrice= new JLabel("name");
                JButton btnChoose = new JButton();
                JButton btnUndo = new JButton();

                makeOrder.getPnlItemOnTable().removeAll();
                makeOrder.getPnlItemOnTable().revalidate();
                makeOrder.getPnlItemOnTable().repaint();
                makeOrder.getPnlItemOnTable().setLayout(null);
                makeOrder.orderPositionY=0;

                int sizeArray=orderArray.size();

                for (int x=0;x<sizeArray;x++){



                    if (makeOrder.makeOrderIdTable==orderArray.get(x).getIdTable())
                    {

                        makeOrder.totalPrice=makeOrder.totalPrice+orderArray.get(x).getTotalPrice();
                        makeOrder.totalPrice=Math.round(makeOrder.totalPrice * 100)/100.0;
                        makeOrder.orderPositionY=makeOrder.orderPositionY+32;
                        if (makeOrder.countItem<31)
                        {

                            makeOrder.getLblTotalPrice().setText("Price: "+Double.toString(makeOrder.totalPrice)+" €");

                            makeOrder.getPnlItemOnTable().add(txtCount = new JTextField(""+orderArray.get(x).getNumberOfItem(), FlowLayout.LEFT));
                            txtCount.setFont(new Font("Century Gothic", Font.ITALIC, 25));
                            txtCount.setBounds(10, makeOrder.orderPositionY, 45, 30);

                            makeOrder.getPnlItemOnTable().add(lblX = new JLabel("x", FlowLayout.LEFT));
                            lblX.setFont(new Font("Century Gothic", Font.ITALIC, 25));
                            lblX.setBounds(55, makeOrder.orderPositionY, 20, 30);

                            makeOrder.getPnlItemOnTable().add(lblName = new JLabel(""+orderArray.get(x).getNameItem(), FlowLayout.LEFT));
                            lblName.setFont(new Font("Century Gothic", Font.ITALIC, 25));
                            lblName.setBounds(85, makeOrder.orderPositionY, 200, 30);

                            makeOrder.getPnlItemOnTable().add(lblPrice = new JLabel(""+orderArray.get(x).getTotalPrice(), FlowLayout.LEFT));
                            lblPrice.setFont(new Font("Century Gothic", Font.ITALIC, 25));
                            lblPrice.setBounds(295, makeOrder.orderPositionY, 100, 30);

                            makeOrder.getPnlItemOnTable().add(lblEuro = new JLabel("€", FlowLayout.LEFT));
                            lblEuro.setFont(new Font("Century Gothic", Font.ITALIC, 25));
                            lblEuro.setBounds(405, makeOrder.orderPositionY, 30, 30);

                            makeOrder.getPnlItemOnTable().add(btnChoose = new JButton("DELETE"));
                            btnChoose.setBackground(new Color(254,151,44));
                            btnChoose.setFont(new Font("Century Gothic", Font.BOLD, 17));
                            btnChoose.setForeground(Color.white);
                            btnChoose.setBorderPainted(false);
                            btnChoose.setBounds(450, makeOrder.orderPositionY, 100, 30);

                            makeOrder.getPnlItemOnTable().add(btnUndo = new JButton("UNDO"));
                            btnUndo.setBackground(new Color(133,147,49));
                            btnUndo.setFont(new Font("Century Gothic", Font.BOLD, 17));
                            btnUndo.setForeground(Color.white);
                            btnUndo.setBorderPainted(false);
                            btnUndo.setEnabled(false);
                            btnUndo.setBounds(560, makeOrder.orderPositionY, 100, 30);



                        }else{
                            JOptionPane.showMessageDialog(null, "Max quantity of ordered item in one time can be 30 !");
                            makeOrder.countItem=30;
                        }



                    }


                }







                final  JLabel finalLblPrice = lblPrice;
                final JTextField finalTxtCount1 = txtCount;
                final JLabel finalLblPrice1 = lblPrice;
                txtCount.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyReleased(KeyEvent e) {
                        super.keyReleased(e);

                        if (finalTxtCount1.getText().equals("")){
                            finalTxtCount1.setText("0");
                        }
                        if (Integer.parseInt(finalTxtCount1.getText()) > 50){

                            JOptionPane.showMessageDialog(null, "Max quantity of item can be 50 !");

                            finalTxtCount1.setText("50");
                        }
                        else if (finalTxtCount1.getText().equals("") || finalTxtCount1.getText().equals(" ") || finalTxtCount1.getText().equals("  ")){
                            finalTxtCount1.setText("0");
                        }
                        else if (Integer.parseInt(finalTxtCount1.getText()) <= 50){
                            int countOfItem= Integer.parseInt(finalTxtCount1.getText());
                            double finalPriceOfItem=makeOrder.price*countOfItem;
                            finalLblPrice1.setText(String.valueOf(finalPriceOfItem));
                        }

                    }
                });




                makeOrder.orderPositionY=makeOrder.orderPositionY+32;


                final JTextField finalTxtCount = txtCount;
                final JLabel finalLblName = lblName;
                //final JLabel finalLblPrice = lblPrice;
                final JButton finalBtnChoose = btnChoose;
                final JButton finalBtnUndo = btnUndo;
                final JTextField finalLblCount1 = txtCount;
                final JLabel finalLblX = lblX;
                final JLabel finalLblEuro = lblEuro;
                btnChoose.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int numberOfItem;
                        numberOfItem = Integer.parseInt(finalLblCount1.getText());
                        System.out.println("Number of item is: "+numberOfItem);

                        makeOrder.throwItem(finalTxtCount, finalLblX, finalLblName, finalLblPrice, finalLblEuro, finalBtnChoose, finalBtnUndo);
                    }
                });

                final JButton finalBtnUndo1 = btnUndo;
                final JLabel finalLblX1 = lblX;
                final JLabel finalLblEuro1 = lblEuro;
                btnUndo.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        makeOrder.undoItem(finalTxtCount, finalLblX1, finalLblName, finalLblPrice, finalLblEuro1, finalBtnChoose, finalBtnUndo1);
                    }
                });
            }
        }

    }

    public JPanel getBgUserAccount() {
        return bgUserAccount;
    }

    public JPanel getUserAccount(int i, String username) {
        switch (i) {
            case 1:
                UserAccount waiter = AccountWaiter();
                AccountWaiter();
                lblUserName.setText(username);
                break;
            case 2:
                UserAccount supervisor = AccountSupervisor();
                AccountSupervisor();
                lblUserName.setText(username);
                break;
            case 3:
                UserAccount manager = AccountManager();
                AccountManager();
                lblUserName.setText(username);
                break;
        }
        return UserAccount;
    }

    public UserAccount AccountWaiter() {
        btnTopMenuSetDrinks.setEnabled(false);
        btnSetDrinks.setEnabled(false);
        btnTopMenuSetEmployee.setEnabled(false);
        btnSetEmployee.setEnabled(false);
        btnTopMenuSetFoods.setEnabled(false);
        btnSetFoods.setEnabled(false);
        System.out.println("Account Waiter");
        return null;
    }

    public UserAccount AccountSupervisor() {
        System.out.println("Account Supervisor");
        btnTopMenuSetEmployee.setEnabled(false);
        btnSetEmployee.setEnabled(false);
        return null;
    }

    public UserAccount AccountManager() {
        System.out.println("Account Manager");
        return null;
    }

}