package project.restaurant.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.util.ArrayList;

public class UserAccount {
    private JPanel UserAccount;
    private JPanel bgUserAccount;
    private JPanel pnlUserTop;

    public JLabel getLblUserName() {
        return lblUserName;
    }

    private JLabel lblUserName;
    private JTextField txtSearch;
    private JButton btnSearch;
    private JPanel pnlTopMenu;
    private JButton btnTopMenuDelivery;
    private JButton btnTopMenuTables;
    private JButton btnTopMenuTransfer;
    private JButton btnTopMenuBill;
    private JButton btnTopMenuSetDrinks;
    private JButton btnTopMenuSetFoods;
    private JButton btnTopMenuSetEmployee;
    private JButton btnTopMenuLogOut;
    private JButton btnDelivery;
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
    private JPanel pnlOrderedTable2;
    private JPanel pnlOrderedTable3;
    private JPanel pnlOrderedTable5;
    private JPanel pnlOrderedTable6;
    private JPanel pnlOrderedTable8;
    private JPanel pnlOrderedTable7;
    private JPanel pnlOrderedTable4;
    private JPanel pnlTable1;
    private JPanel pnlTable2;
    private JPanel pnlTable3;
    private JPanel pnlTable4;
    private JPanel pnlTable5;
    private JPanel pnlTable6;
    private JPanel pnlTable7;
    private JPanel pnlTable8;
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

    public UserAccount() {

        pnlTopMenu.setVisible(false);
        pnlTables.setVisible(false);

        //btn search
        btnSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Search");
            }
        });
        //btn basic menu MakeOrder
        btnDelivery.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                /*pnlBasicMenu.setVisible(false);
                pnlTopMenu.setVisible(true);
                pnlTables.setVisible(true);
                System.out.println("MakeOrder");*/
            }
        });
        //btn top menu MakeOrder
        btnTopMenuDelivery.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //pnlBasicMenu.setVisible(false);
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

                JLabel lblCount = new JLabel("name");
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



                    if (orderArray.get(x).getNumberOfItem()!=0 && makeOrder.makeOrderIdTable==orderArray.get(x).getIdTable())
                    {

                        makeOrder.totalPrice=makeOrder.totalPrice+orderArray.get(x).getTotalPrice();
                        makeOrder.totalPrice=Math.round(makeOrder.totalPrice * 100)/100.0;
                        makeOrder.orderPositionY=makeOrder.orderPositionY+32;
                        if (makeOrder.countItem<31)
                        {

                            makeOrder.getLblTotalPrice().setText("Price: "+Double.toString(makeOrder.totalPrice)+" €");

                            makeOrder.getPnlItemOnTable().add(lblCount = new JLabel(""+orderArray.get(x).getNumberOfItem(), FlowLayout.LEFT));
                            lblCount.setFont(new Font("Century Gothic", Font.ITALIC, 25));
                            lblCount.setBounds(10, makeOrder.orderPositionY, 45, 30);

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


                            makeOrder.checkForPayment=1;
                            makeOrder.setBtnPayment();
                        }else{
                            JOptionPane.showMessageDialog(null, "Max quantity of ordered item in one time can be 30 !");
                            makeOrder.countItem=30;
                        }



                    }


                }

                final  JLabel finalLblPrice = lblPrice;

                makeOrder.orderPositionY=makeOrder.orderPositionY+32;


                final JLabel finalTxtCount = lblCount;
                final JLabel finalLblName = lblName;
                //final JLabel finalLblPrice = lblPrice;
                final JButton finalBtnChoose = btnChoose;
                final JButton finalBtnUndo = btnUndo;
                final JLabel finalLblX = lblX;
                final JLabel finalLblEuro = lblEuro;
                final JLabel finalLblCount = lblCount;
                btnChoose.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int numberOfItem;
                        numberOfItem = Integer.parseInt(finalLblCount.getText());
                        System.out.println("Number of item is: "+numberOfItem);

                        makeOrder.throwItem(finalLblCount, finalLblX, finalLblName, finalLblPrice, finalLblEuro, finalBtnChoose, finalBtnUndo);
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

        return null;
    }

}