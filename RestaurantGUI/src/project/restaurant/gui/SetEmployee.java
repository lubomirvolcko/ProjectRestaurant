package project.restaurant.gui;

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
    private JFormattedTextField txtFirstName;
    private JFormattedTextField txtLastName;
    private JFormattedTextField txtLogin;
    private JFormattedTextField txtEmail;
    private JPanel pnlAddEmployee;
    private JButton btnBack;
    private JPanel pnlDeleteEmployee;
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
                if (State=="AddEmployee" || State=="DeleteEmployee"){
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
    }

    public void StateAddEmployee(){
        pnlAddEmployee.setVisible(true);
        pnlHomeSetEmployee.setVisible(false);
        btnBack.setEnabled(true);
        State = "AddEmployee";
    }

    public void StateHome(){
        pnlHomeSetEmployee.setVisible(true);
        pnlAddEmployee.setVisible(false);
        pnlDeleteEmployee.setVisible(false);
        btnBack.setEnabled(false);
        State = "Home";
    }

    public void StateDeleteEmployee(){
        pnlHomeSetEmployee.setVisible(false);
        pnlDeleteEmployee.setVisible(true);
        btnBack.setEnabled(true);
        State = "DeleteEmployee";
    }



}
