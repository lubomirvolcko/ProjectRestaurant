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
    private String username;

    public String getUsername() {
        return username;
    }

    public EntryPage() {
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (txtLogin.getSelectedItem() == "waiter"){
                    username = (String) txtLogin.getSelectedItem();
                    openForm(1, username);
                }else if (txtLogin.getSelectedItem() == "seupervisor"){
                    username = (String) txtLogin.getSelectedItem();
                    openForm(2, username);
                }else if (txtLogin.getSelectedItem() == "manager"){
                    username = (String) txtLogin.getSelectedItem();
                    openForm(3, username);
                }else{
                    System.out.println("Choose a user!");
                }
            }
        });

    }

    private void openForm(int i, String username) {
        JFrame frame1 = new JFrame("LogIn");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(1920,1080);
        frame1.setContentPane(new UserAccount().getUserAccount(i, username));
        frame1.setVisible(true);
    }

    public JPanel getBrEntryPage() {
        return brEntryPage;
    }


}
