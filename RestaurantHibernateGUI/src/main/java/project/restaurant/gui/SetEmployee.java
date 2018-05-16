package project.restaurant.gui;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import project.restaurant.hibernate.Authentication;
import project.restaurant.hibernate.HibernateUtil;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
    private JTable tblEmployees;
    private JButton btnDelete;
    private JButton btnUpdate;
    private JPanel pnlUpdateEmployee;
    private JTextField updateTxtLastName;
    private JButton updateBtnConfirm;
    private JTextField updateTxtFirstName;
    private JTextField updateTxtEmail;
    private JTextField updateTxtLogin;
    private JTextField updateTxtIdcard;
    private JComboBox updateJcomboPosition;
    private JPasswordField updatePswPassword;
    public String State;

    public JPanel getPnlSetEmployee() {
        return pnlSetEmployee;
    }

    public void setEmployeeToTable(String fname, String lname, String idcard, String login, String email, String password, String position){


        int employeeNumber=1;

        Object[] columns = {"Id","First Name","Last Name","Id card", "Login", "Password", "E-mail", "position"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);

        Object[] row = new Object[8];
        row[0]= employeeNumber++;
        row[1]= fname;
        row[2]= lname;
        row[3]= idcard;
        row[4]= login;
        row[5]= password;
        row[6]= email;
        row[7]= position;

        model.addRow(row);
        tblEmployees.setModel(model);

        System.out.println(employeeNumber+"  "+fname+"  "+lname+"  "+idcard+"  "+login+"  "+password+"  "+email+"  "+position);
        System.out.println("user added!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    public SetEmployee() {
        pnlAddEmployee.setVisible(false);
        pnlDeleteEmployee.setVisible(false);
        pnlUpdateEmployee.setVisible(false);

        tblEmployees.setBackground(Color.RED);
        tblEmployees.setForeground(Color.black);
        //Font font = new Font("",1,22);
        tblEmployees.setFont(new Font("Century Gothic", Font.ITALIC, 25));
        tblEmployees.setRowHeight(30);



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
                else if (State =="UpdateEmployee"){
                    StateDeleteEmployee();
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
                DefaultTableModel model = new DefaultTableModel();

                StateDeleteEmployee();

                // i = the index of the selected row
                int i = tblEmployees.getSelectedRow();
                if(i >= 0){
                    // remove a row from jtable
                    model.removeRow(i);
                }
                else{
                    System.out.println("Delete Error");
                }

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

                    String FirstName = txtFirstName.getText();
                    String LastnName = txtLastName.getText();
                    String IdCard = idcardnumber.getText();
                    String Login = txtLogin.getText();
                    String Emmail = txtEmail.getText();
                    String Password = pswFirst.getText();

                    setEmployeeToTable(FirstName, LastnName, IdCard, Login, Emmail, Password, position);

                    s.save(newPerson);
                    s.getTransaction().commit();
                    s.close();

                    JOptionPane.showMessageDialog(null, "New user successfully registred!");
                    JComponent comp = (JComponent) e.getSource();
                    Window win = SwingUtilities.getWindowAncestor(comp); //get top window
                    win.dispose();




            }
        });
        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateEmployee();

                tblEmployees.addMouseListener(new MouseAdapter(){

                    @Override
                    public void mouseClicked(MouseEvent e){
                        DefaultTableModel model = new DefaultTableModel();
                        // i = the index of the selected row
                        int i = tblEmployees.getSelectedRow();

                        updateTxtFirstName.setText(model.getValueAt(i, 1).toString());
                        updateTxtLastName.setText(model.getValueAt(i, 2).toString());
                        updateTxtIdcard.setText(model.getValueAt(i, 3).toString());
                        updateTxtLogin.setText(model.getValueAt(i, 4).toString());
                        updatePswPassword.setText(model.getValueAt(i, 5).toString());
                        updateTxtEmail.setText(model.getValueAt(i, 6).toString());
                        String position = model.getValueAt(i, 4).toString();
                        updateJcomboPosition.setSelectedItem(position);
                    }
                });
            }
        });
        updateBtnConfirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String position = (String) cmbPosition.getSelectedItem();

                SessionFactory sf = HibernateUtil.getSessionFactory();
                Session s = sf.openSession();
                s.beginTransaction();
                Authentication newPerson = new Authentication();
                newPerson.setName(updateTxtFirstName.getText());
                newPerson.setSurname(updateTxtLastName.getText());
                newPerson.setIdcard(updateTxtIdcard.getText());
                newPerson.setLogin(updateTxtLogin.getText());
                newPerson.setEmail(updateTxtEmail.getText());
                newPerson.setPassword(updatePswPassword.getText());
                newPerson.setPosition(position);


                String FirstName = updateTxtFirstName.getText();
                String LastnName = updateTxtLastName.getText();
                String IdCard = updateTxtIdcard.getText();
                String Login = updateTxtLogin.getText();
                String Emmail = updateTxtEmail.getText();
                String Password = updatePswPassword.getText();

                setEmployeeToTable(FirstName, LastnName, IdCard, Login, Emmail, Password, position);

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

    public void updateEmployee() {
        StateUpdateEmployee();
    }

    public void StateUpdateEmployee() {
        pnlAddEmployee.setVisible(false);
        pnlHomeSetEmployee.setVisible(false);
        pnlDeleteEmployee.setVisible(false);
        pnlUpdateEmployee.setVisible(true);
        btnBack.setEnabled(true);
        State = "UpdateEmployee";

    }


    public void StateAddEmployee() {
        pnlAddEmployee.setVisible(true);
        pnlUpdateEmployee.setVisible(false);
        pnlHomeSetEmployee.setVisible(false);
        btnBack.setEnabled(true);
        State = "AddEmployee";
    }

    public void StateHome() {
        pnlHomeSetEmployee.setVisible(true);
        pnlUpdateEmployee.setVisible(false);
        pnlAddEmployee.setVisible(false);
        pnlDeleteEmployee.setVisible(false);
        btnBack.setEnabled(false);
        State = "Home";
    }

    public void StateDeleteEmployee() {
        pnlHomeSetEmployee.setVisible(false);
        pnlUpdateEmployee.setVisible(false);
        pnlDeleteEmployee.setVisible(true);
        btnBack.setEnabled(true);
        State = "DeleteEmployee";
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
