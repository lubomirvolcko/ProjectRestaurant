package project.restaurant.gui;

import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserAccount {
    private JPanel bgUserAccount;
    private JLabel userName;
    private JButton btnMenuTables;
    private JButton btnMenuMakeOrder;
    private JButton logMenuOutButton;
    private JButton btnMenuTransfer;
    private JButton btnMenuBill;
    private JTextField txtSearch;
    private JPanel panelMakeOrder;
    private JButton btnSearch2;
    private JButton btnMenuDiscount;
    private JButton btnMenuAddEmployee;
    private JButton btnMenuStorno;
    private JButton btnMakeOrder;
    private JPanel UserAccount;

    public JPanel getUserAccount() {
        return UserAccount;
    }

    public UserAccount() {

        //Action for button Make Order
        btnMenuMakeOrder.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        //Action for button Tables
        btnMenuTables.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        //Action for button Transfer
        btnMenuTransfer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        //Action for button Bill
        btnMenuBill.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        //Action for button Discount
        btnMenuDiscount.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Discount");
            }
        });
        //Action for button Storno
        btnMenuStorno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Storno");
            }
        });
        //Action for button Add Employee
        btnMenuAddEmployee.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Employee was added");
            }
        });
    }

    public JPanel getBgUserAccount() {
        return bgUserAccount;
    }

    public UserAccount AccountWaiter(){
        btnMenuDiscount.setEnabled(false);
        btnMenuAddEmployee.setEnabled(false);
        btnMenuStorno.setEnabled(false);
        System.out.println("Account Waiter");
        return null;
    }

    public UserAccount AccountSupervisor(){
        System.out.println("Account Supervisor");
        btnMenuAddEmployee.setEnabled(false);
        return null;
    }

    public UserAccount AccountManager(){
        System.out.println("Account Manager");
        return null;
    }


}

