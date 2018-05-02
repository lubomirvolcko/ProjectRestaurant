package project.restaurant.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JButton btnTopMenuAddEmployee;
    private JButton btnTopMenuLogOut;
    private JButton btnMakeOrder;
    private JButton btnTables;
    private JButton btnTransfer;
    private JButton btnBill;
    private JButton btnDiscount;
    private JButton btnStorno;
    private JButton btnAddEmployee;
    private JButton btnLogOut;
    private JPanel pnlBasicMenu;
    private String username;

    public JPanel getUserAccount() {
        return UserAccount;
    }

    public UserAccount() {
        //hide top menu
        pnlTopMenu.setVisible(false);

        btnSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Search");
            }
        });
    }

    public JPanel getBgUserAccount() {
        return bgUserAccount;
    }

    public JPanel getUserAccount(int i, String username) {
        switch (i){
            case 1: UserAccount waiter = new UserAccount().AccountWaiter();
                AccountWaiter();
                lblUserName.setText(username);
                break;
            case 2: UserAccount supervisor = new UserAccount().AccountSupervisor();
                AccountSupervisor();
                lblUserName.setText(username);
                break;
            case 3: UserAccount manager = new UserAccount().AccountManager();
                AccountManager();
                lblUserName.setText(username);
                break;
        }
        return UserAccount;
    }

    public UserAccount AccountWaiter(){
        btnTopMenuDiscount.setEnabled(false);
        btnTopMenuAddEmployee.setEnabled(false);
        btnTopMenuStorno.setEnabled(false);
        System.out.println("Account Waiter");
        return null;
    }

    public UserAccount AccountSupervisor(){
        System.out.println("Account Supervisor");
        btnTopMenuAddEmployee.setEnabled(false);
        return null;
    }

    public UserAccount AccountManager(){
        System.out.println("Account Manager");
        return null;
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

