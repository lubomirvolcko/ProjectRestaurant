package project.restaurant.gui;




import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EntryPage {
    private JComboBox txtLogin;
    private JPasswordField txtPassword;
    private JPanel brEntryPage;
    private JButton btnLogin;
    private JButton button1;
    private JButton btnLogIn;
    private String username;
    public JFrame logInPage()
    {
    JFrame frame = new JFrame("LogIn");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    //frame.setSize(500,500);
        frame.setContentPane(getBrEntryPage());
        frame.setVisible(true);
        return frame;
    }

    public String getUsername() {
        return username;
    }

    public EntryPage() {
final JFrame close = logInPage();

        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (txtLogin.getSelectedItem() == "waiter"){
                    username = (String) txtLogin.getSelectedItem();
                    openForm(1, username);
                    close.dispose();
                }else if (txtLogin.getSelectedItem() == "seupervisor"){
                    username = (String) txtLogin.getSelectedItem();
                    openForm(2, username);
                    close.dispose();
                }else if (txtLogin.getSelectedItem() == "manager"){
                    username = (String) txtLogin.getSelectedItem();
                    openForm(3, username);
                    close.dispose();
                }else{
                    System.out.println("Choose a user!");
                }
            }
        });



    }





    public JFrame openForm(int i, String username){
        JFrame frame1 = new JFrame("MainForm");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame1.setUndecorated(true);
        //frame1.setSize(1000,1000);
        frame1.setContentPane(new UserAccount().getUserAccount(i,username));
        frame1.setVisible(true);
        return frame1;
    }

    /*private void closeForm(){
        JFrame frame1 = new JFrame("LogIn");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame1.setUndecorated(true);
        //frame1.setSize(1920,1080);
        frame1.setContentPane(new UserAccount().getUserAccount());
        frame1.setVisible(false);
    }*/

    public JPanel getBrEntryPage() {
        return brEntryPage;
    }


}
