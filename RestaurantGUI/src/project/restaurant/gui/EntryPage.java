package project.restaurant.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EntryPage {
    private JComboBox txtLogin;
    private JPasswordField txtPassword;
    private JPanel brEntryPage;
    private JButton btnLogin;
    private JButton btnLogIn;

    public EntryPage() {
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txtLogin.getSelectedItem() == "waiter"){
                    openForm(1);
                }else if (txtLogin.getSelectedItem() == "seupervisor"){
                    openForm(2);
                }else if (txtLogin.getSelectedItem() == "manager"){
                    openForm(3);
                }else{
                    System.out.println("Choose a user!");
                }
            }
        });
    }

    private void openForm(int i) {
        JFrame frame1 = new JFrame("LogIn");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(1000,1000);
        frame1.setContentPane(new UserAccount().getUserAccount());
        frame1.setVisible(true);

        switch (i){
            case 1: UserAccount waiter = new UserAccount().AccountWaiter(); break;
            case 2: UserAccount supervisor = new UserAccount().AccountSupervisor(); break;
            case 3: UserAccount manager = new UserAccount().AccountManager(); break;
        }
    }

    public JPanel getBrEntryPage() {
        return brEntryPage;
    }


}
