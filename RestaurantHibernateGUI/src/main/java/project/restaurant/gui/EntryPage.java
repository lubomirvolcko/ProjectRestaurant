package project.restaurant.gui;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import project.restaurant.hibernate.Authentication;
import project.restaurant.hibernate.HibernateUtil;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;

import static org.apache.log4j.helpers.Loader.getResource;


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
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


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
        txtPassword.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    clickedOnBtnLogin=1;
                    getAuthenticationInfo();
                }
            }
        });
        logInArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    clickedOnBtnLogin=1;
                    getAuthenticationInfo();
                }
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



            if(logInArea.getText().equals(d.getLogin())&&txtPassword.getText().equals(d.getPassword())&&d.getPosition().equals("manager")) {
                openForm(3, d.getLogin());
                setUsername(d.getLogin());
                close.dispose();
                clickedOnBtnLogin=0;
                System.out.println("Login: "+d.getLogin());
                System.out.println("Password: "+d.getPassword());
            }
            else if(logInArea.getText().equals(d.getLogin())&&txtPassword.getText().equals(d.getPassword())&&d.getPosition().equals("waiter")) {
                openForm(1, d.getLogin());
                setUsername(d.getLogin());
                close.dispose();
                clickedOnBtnLogin=0;
                System.out.println("Login: "+d.getLogin());
                System.out.println("Password: "+d.getPassword());
            }
            else if(logInArea.getText().equals(d.getLogin())&&txtPassword.getText().equals(d.getPassword())&&d.getPosition().equals("supervisor")) {
                openForm(2, d.getLogin());
                setUsername(d.getLogin());
                close.dispose();
                clickedOnBtnLogin=0;
                System.out.println("Login: "+d.getLogin());
                System.out.println("Password: "+d.getPassword());
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