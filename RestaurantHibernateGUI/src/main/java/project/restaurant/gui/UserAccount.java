package project.restaurant.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;

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
    private JButton btnTopMenuDiscount;
    private JButton btnTopMenuStorno;
    private JButton btnTopMenuSetEmployee;
    private JButton btnTopMenuLogOut;
    private JButton btnMakeOrder;
    private JButton btnTables;
    private JButton btnTransfer;
    private JButton btnBill;
    private JButton btnDiscount;
    private JButton btnStorno;
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
    private String username;

    public JPanel getUserAccount() {
        return UserAccount;
    }


    public UserAccount() {

        //hide top menu
        pnlTopMenu.setVisible(false);
        pnlTables.setVisible(false);

        //hide pnl ordered
        //pnlOrderedTable1.setVisible(false);

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
                pnlBasicMenu.setVisible(false);
                pnlTables.setVisible(true);
                pnlTopMenu.setVisible(true);
            }
        });
        //btn basic menu LogOut
        btnLogOut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EntryPage page = new EntryPage();
                page.getBrEntryPage();
                JComponent comp = (JComponent) e.getSource();
                Window win = SwingUtilities.getWindowAncestor(comp); //get top window
                win.dispose();


            }
        });

        btnTopMenuLogOut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EntryPage page = new EntryPage();
                page.getBrEntryPage();
                JComponent comp = (JComponent) e.getSource();
                Window win = SwingUtilities.getWindowAncestor(comp); //get top window
                win.dispose();
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
    }

    public JFrame openSetEmployee() throws PrinterException {
        SetEmployee setemployee = new SetEmployee();

        JFrame frameSetEmployee = new JFrame("Set Employee");
        frameSetEmployee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameSetEmployee.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frameSetEmployee.setUndecorated(true);
        //frame.setSize(500,500);
        frameSetEmployee.setContentPane(setemployee.getPnlSetEmployee());
        frameSetEmployee.setVisible(true);

        return frameSetEmployee;
    }

    public JFrame openMealMeanu(int i) {
        MakeOrder makeorder = new MakeOrder();

        JFrame frameMakeOrder = new JFrame("Make order");
        frameMakeOrder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameMakeOrder.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frameMakeOrder.setUndecorated(true);
        //frame.setSize(500,500);
        frameMakeOrder.setContentPane(makeorder.getPnlMakeOrder());
        frameMakeOrder.setVisible(true);

        switch (i) {
            case 1:
                makeorder.getLblNameTable().setText("Table 1");
                break;
            case 2:
                makeorder.getLblNameTable().setText("Table 2");
                break;
            case 3:
                makeorder.getLblNameTable().setText("Table 3");
                break;
            case 4:
                makeorder.getLblNameTable().setText("Table 4");
                break;
            case 5:
                makeorder.getLblNameTable().setText("Table 5");
                break;
            case 6:
                makeorder.getLblNameTable().setText("Table 6");
                break;
            case 7:
                makeorder.getLblNameTable().setText("Table 7");
                break;
            case 8:
                makeorder.getLblNameTable().setText("Table 8");
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
        btnTopMenuDiscount.setEnabled(false);
        btnDiscount.setEnabled(false);
        btnTopMenuSetEmployee.setEnabled(false);
        btnSetEmployee.setEnabled(false);
        btnTopMenuStorno.setEnabled(false);
        btnStorno.setEnabled(false);
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


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

}