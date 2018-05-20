package project.restaurant.gui;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import project.restaurant.hibernate.Authentication;
import project.restaurant.hibernate.Food;
import project.restaurant.hibernate.HibernateUtil;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.List;

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
    private JLabel lblError;
    public String State;
    JFrame f = new JFrame("Table Example");


    public JPanel getPnlSetEmployee() {
        return pnlSetEmployee;
    }


    public SetEmployee() {
        pnlAddEmployee.setVisible(false);
        pnlDeleteEmployee.setVisible(false);
        pnlUpdateEmployee.setVisible(false);
        lblError.setVisible(false);
        txtLogin.setText("");
        pswFirst.setText("");




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
createTable();

            }
        });

        btnConfirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (txtLogin.getText().equals("") || pswFirst.getText().equals("")||txtFirstName.getText().equals("") || txtLastName.getText().equals("")||idcardnumber.getText().equals("")||txtEmail.getText().equals(""))
                {
                    lblError.setVisible(true);
                    System.out.println("ERROR! Please fill each field!");
                }else {
                    lblError.setVisible(false);
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



                    s.save(newPerson);
                    s.getTransaction().commit();
                    s.close();

                    JOptionPane.showMessageDialog(null, "New user successfully registred!");
                    JComponent comp = (JComponent) e.getSource();
                    Window win = SwingUtilities.getWindowAncestor(comp); //get top window
                    win.dispose();
                }



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

    public void createTable()
    {
        JFrame frame2 = new JFrame();
        final JTable table = new JTable();

        Object[] columns = {"Id","First Name","Last Name","Id card","Login","Password","Email","Position"};
        final DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);

        table.setModel(model);


        table.setBackground(Color.LIGHT_GRAY);
        table.setForeground(Color.black);
        Font font = new Font("",1,22);
        table.setFont(font);
        table.setRowHeight(30);

        final JTextField textId = new JTextField();
        final JTextField textFname = new JTextField();
        final JTextField textLname = new JTextField();
        final JTextField textAge = new JTextField();

        JButton btnAdd = new JButton("Add");
        JButton btnDelete = new JButton("Delete");
        JButton btnUpdate = new JButton("Update");


        textId.setBounds(20, 220, 100, 25);
        textFname.setBounds(20, 250, 100, 25);
        textLname.setBounds(20, 280, 100, 25);
        textAge.setBounds(20, 310, 100, 25);

        btnAdd.setBounds(150, 220, 100, 25);
        btnUpdate.setBounds(150, 265, 100, 25);
        btnDelete.setBounds(150, 310, 100, 25);

        // create JScrollPane
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0, 0, 880, 200);

        frame2.setLayout(null);

        frame2.add(pane);

        // add JTextFields to the jframe
        frame2.add(textId);
        frame2.add(textFname);
        frame2.add(textLname);
        frame2.add(textAge);

        // add JButtons to the jframe
        frame2.add(btnAdd);
        frame2.add(btnDelete);
        frame2 .add(btnUpdate);

        // create an array of objects to set the row data
        final Object[] row = new Object[8];
        long id = 0;
        String firstname = null;
        String lastname = null;
        String idcard = null;
        String login = null;
        String password = null;
        String email= null;
        String position = null;


        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
        se.beginTransaction();
        Query qry=se.createQuery("from Authentication");
        java.util.List<Authentication> usersInfo=(List<Authentication>)qry.list();
        se.getTransaction().commit();
        se.close();
        for(Authentication g : usersInfo)
        {

            id=g.getId();
            firstname=g.getName();
            lastname=g.getSurname();
            idcard=g.getIdcard();
            login=g.getLogin();
            password=g.getPassword();
            email=g.getEmail();
            position=g.getPosition();



            //System.out.println(d.getName());
            //System.out.println(d.getPrice());













                row[0] = id;
                row[1] = firstname;
                row[2] = lastname;
                row[3] =idcard;
                row[4] = login;
                row[5] = password;
                row[6] = email;
                row[7] = position;
                // add row to the model
                model.addRow(row);


        }

        btnDelete.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                // i = the index of the selected row
                int i = table.getSelectedRow();
                if(i >= 0){
                    // remove a row from jtable
                    model.removeRow(i);
                }
                else{
                    System.out.println("Delete Error");
                }
            }
        });


        table.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e){

                // i = the index of the selected row
                int i = table.getSelectedRow();

                textId.setText(model.getValueAt(i, 0).toString());
                textFname.setText(model.getValueAt(i, 1).toString());
                textLname.setText(model.getValueAt(i, 2).toString());
                textAge.setText(model.getValueAt(i, 3).toString());
            }
        });

        btnUpdate.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                // i = the index of the selected row
                int i = table.getSelectedRow();

                if(i >= 0)
                {
                    model.setValueAt(textId.getText(), i, 0);
                    model.setValueAt(textFname.getText(), i, 1);
                    model.setValueAt(textLname.getText(), i, 2);
                    model.setValueAt(textAge.getText(), i, 3);
                }
                else{
                    System.out.println("Update Error");
                }
            }
        });

        frame2.setSize(900,400);
        frame2.setLocationRelativeTo(null);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);



    }












}
