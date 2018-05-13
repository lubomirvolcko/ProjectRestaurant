package project.restaurant.gui;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import project.restaurant.hibernate.Authentication;
import project.restaurant.hibernate.HibernateUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetEmployee {
    private JPanel pnlSetEmployee;
    private JPanel pnlHomeSetEmployee;
    private JButton addEmployeeButton;
    private JButton deleteEmployeeButton1;
    private JButton btnCancel;
    private JPasswordField pswSecond;
    private JPasswordField pswFirst;
    private JComboBox cmbPosition;
    private JPanel pnlAddEmployee;
    private JButton btnBack;
    private JPanel pnlDeleteEmployee;
    private JButton btnConfirm;
    private JTextField txtLogin;
    private JTextField txtFirstName;
    private JTextField txtLastName;
    private JTextField txtEmail;
    private JTextField idcardnumber;
    public String State;

    public JPanel getPnlSetEmployee() {
        return pnlSetEmployee;
    }

    public SetEmployee() {
        pnlAddEmployee.setVisible(false);
        pnlDeleteEmployee.setVisible(false);

        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComponent comp = (JComponent) e.getSource();
                Window win = SwingUtilities.getWindowAncestor(comp); //get top window
                win.dispose();
            }
        });
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (State == "AddEmployee" || State == "DeleteEmployee") {
                    StateHome();
                }
            }
        });
        addEmployeeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StateAddEmployee();
            }
        });
        deleteEmployeeButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StateDeleteEmployee();
            }
        });
        btnConfirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    String position = (String) cmbPosition.getSelectedItem();

                    SessionFactory sf = HibernateUtil.getSessionFactory();
                    Session s = sf.openSession();
                    s.beginTransaction();
                    Authentication newPerson = new Authentication();
                    newPerson.setName(txtFirstName.getText());
                    newPerson.setSurname(txtLastName.getText());
                    newPerson.setIdcard(idcardnumber.getText());
                    newPerson.setLogin(txtLogin.getText());
                    newPerson.setEmail(txtEmail.getText());
                    newPerson.setPassword(pswFirst.getText());
                    newPerson.setPosition(position);



                    s.save(newPerson);
                    s.getTransaction().commit();
                    s.close();

                    JOptionPane.showMessageDialog(null, "New user successfully registred!");
                    JComponent comp = (JComponent) e.getSource();
                    Window win = SwingUtilities.getWindowAncestor(comp); //get top window
                    win.dispose();




            }
        });
    }

    public void StateAddEmployee() {
        pnlAddEmployee.setVisible(true);
        pnlHomeSetEmployee.setVisible(false);
        btnBack.setEnabled(true);
        State = "AddEmployee";
    }

    public void StateHome() {
        pnlHomeSetEmployee.setVisible(true);
        pnlAddEmployee.setVisible(false);
        pnlDeleteEmployee.setVisible(false);
        btnBack.setEnabled(false);
        State = "Home";
    }

    public void StateDeleteEmployee() {
        pnlHomeSetEmployee.setVisible(false);
        pnlDeleteEmployee.setVisible(true);
        btnBack.setEnabled(true);
        State = "DeleteEmployee";
    }


}
