package project.restaurant.gui;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import project.restaurant.hibernate.Authentication;
import project.restaurant.hibernate.Drink;
import project.restaurant.hibernate.HibernateUtil;
import project.restaurant.hibernate.getInformationFromDatabase;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;




public class EntryPage {
    private JComboBox txtLogin;
    private JPasswordField txtPassword;
    private JPanel brEntryPage;
    private JButton btnLogin;
    private JButton logo;
    private JTextField logInArea;
    private JButton btnLogIn;
    private int clickedOnBtnLogin;
    final JFrame close = logInPage();


    public JFrame logInPage()  {
        JFrame frame = new JFrame("LogIn");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setContentPane(getBrEntryPage());
        frame.setVisible(true);




        return frame;
    }


    public EntryPage() {
        getAuthenticationInfo();


        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clickedOnBtnLogin=1;
                getAuthenticationInfo();
            }
        });




        logo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
    }


    public JFrame openForm(int i, String username) {
        JFrame frame1 = new JFrame("MainForm");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame1.setUndecorated(true);
        //frame1.setSize(1000,1000);
        frame1.setContentPane(new UserAccount().getUserAccount(i, username));
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

    public void getAuthenticationInfo()
    {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
        se.beginTransaction();
        Query qry=se.createQuery("from Authentication");
        List<Authentication> auth=(List<Authentication>)qry.list();
        se.getTransaction().commit();
        se.close();
        for(Authentication d : auth)
        {

            System.out.println("Login: "+d.getLogin());
            System.out.println("Password: "+d.getPassword());

            if(logInArea.getText().equals(d.getLogin())&&txtPassword.getText().equals(d.getPassword())&&d.getPosition().equals("manager")) {
                openForm(3, d.getLogin());
                close.dispose();
                clickedOnBtnLogin=0;
            }
            else if(logInArea.getText().equals(d.getLogin())&&txtPassword.getText().equals(d.getPassword())&&d.getPosition().equals("waiter")) {
                openForm(1, d.getLogin());
                close.dispose();
                clickedOnBtnLogin=0;
            }
            else if(logInArea.getText().equals(d.getLogin())&&txtPassword.getText().equals(d.getPassword())&&d.getPosition().equals("supervisor")) {
                openForm(2, d.getLogin());
                close.dispose();
                clickedOnBtnLogin=0;
            }
            else
            {
                if (clickedOnBtnLogin==1){
                    JOptionPane.showMessageDialog(null, "Wrong Login or Password ! Try it Again please !");
                    System.out.println("Bad Login or Password");
                    clickedOnBtnLogin=0;
                }

            }
        }


    }


}