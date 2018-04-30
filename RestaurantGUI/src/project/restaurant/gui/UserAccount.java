package project.restaurant.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserAccount {
    private JPanel bgUserAccount;
    private JLabel userName;
    private JPanel MenuPanel;
    private JButton btnTables;
    private JButton btnMakeOrder;
    private JButton logOutButton;
    private JButton btnTransfer;
    private JButton btnBill;
    private JTextField txtSearch;
    private JPanel panelMakeOrder;
    private JButton btnSearch2;
    private JButton btnDiscount;
    private JButton btnAddEmployee;
    private JButton btnStorno;

    public UserAccount() {

        //Action for button Make Order
        btnMakeOrder.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        //Action for button Tables
        btnTables.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        //Action for button Transfer
        btnTransfer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        //Action for button Bill
        btnBill.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        //Action for button Discount
        btnDiscount.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Discount");
            }
        });
        //Action for button Storno
        btnStorno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Storno");
            }
        });
        //Action for button Add Employee
        btnAddEmployee.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Employee was added");
            }
        });
        //Action for button Log Out
        logOutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public JPanel getBgUserAccount() {
        return bgUserAccount;
    }

    public UserAccount AccountWaiter(){
        btnDiscount.setEnabled(false);
        btnAddEmployee.setEnabled(false);
        btnStorno.setEnabled(false);
        System.out.println("Account Waiter");
        return null;
    }

    public UserAccount AccountSupervisor(){
        System.out.println("Account Supervisor");
        btnAddEmployee.setEnabled(false);
        return null;
    }

    public UserAccount AccountManager(){
        System.out.println("Account Manager");
        return null;
    }


}

