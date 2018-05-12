package project.restaurant.gui;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import project.restaurant.hibernate.Authentication;
import project.restaurant.hibernate.Drink;
import project.restaurant.hibernate.HibernateUtil;
import project.restaurant.hibernate.getInformationFromDatabase;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


public class EntryPage {
    private JComboBox txtLogin;
    private JPasswordField txtPassword;
    private JPanel brEntryPage;
    private JButton btnLogin;
    private JButton logo;
    private JTextField logInArea;
    private JButton btnLogIn;
    private String position;
    final JFrame close = logInPage();
    public JFrame logInPage() {
        JFrame frame = new JFrame("LogIn");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //frame.setSize(500,500);
        frame.setContentPane(getBrEntryPage());
        frame.setVisible(true);







        return frame;
    }

    public String getUsername() {
        return position;
    }

    public EntryPage() {
        getAuthenticationInfo();

        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
getAuthenticationInfo();

            }
        });


        logo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               getInformationFromDatabase getdrinks = new getInformationFromDatabase();
               getdrinks.getCocktailsDrinks();

            }
        });
    }


    public JFrame openForm(int i, String username) {
        JFrame frame1 = new JFrame("MainForm");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame1.setUndecorated(true);
        //frame1.setSize(1000,1000);
        frame1.setContentPane(new UserAccount().getUserAccount(i, position));
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

            System.out.println(d.getLogin());
            System.out.println(d.getPassword());

            if(logInArea.getText().equals(d.getLogin())&&txtPassword.getText().equals(d.getPassword())&&d.getPosition().equals("manager")) {
                openForm(3, d.getPosition());
                close.dispose();
            }
            else if(logInArea.getText().equals(d.getLogin())&&txtPassword.getText().equals(d.getPassword())&&d.getPosition().equals("waiter")) {
                openForm(1, d.getPosition());
                close.dispose();
            }
            else if(logInArea.getText().equals(d.getLogin())&&txtPassword.getText().equals(d.getPassword())&&d.getPosition().equals("supervisor")) {
                openForm(2, d.getPosition());
                close.dispose();
            }
            else
            {
                System.out.println("Bad Login or Password");
            }
        }


    }


}
