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
        frameMakeOrder.setContentPane(makeorder.getPnlMakeOrder());
        frameMakeOrder.setVisible(true);

        switch (i) {
            case 1:
                makeorder.getLblNameTable().setText("Table 1");
                makeorder.makeOrderIdTable=1;
                break;
            case 2:
                makeorder.getLblNameTable().setText("Table 2");
                makeorder.makeOrderIdTable=2;
                break;
            case 3:
                makeorder.getLblNameTable().setText("Table 3");
                makeorder.makeOrderIdTable=3;
                break;
            case 4:
                makeorder.getLblNameTable().setText("Table 4");
                makeorder.makeOrderIdTable=4;
                break;
            case 5:
                makeorder.getLblNameTable().setText("Table 5");
                makeorder.makeOrderIdTable=5;
                break;
            case 6:
                makeorder.getLblNameTable().setText("Table 6");
                makeorder.makeOrderIdTable=6;
                break;
            case 7:
                makeorder.getLblNameTable().setText("Table 7");
                makeorder.makeOrderIdTable=7;
                break;
            case 8:
                makeorder.getLblNameTable().setText("Table 8");
                makeorder.makeOrderIdTable=8;
                break;
            case 99: return frameMakeOrder;
            default:
                System.out.println("Table not exists!");
        }
        return frameMakeOrder;
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