package project.restaurant.gui;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import project.restaurant.hibernate.Authentication;
import project.restaurant.hibernate.HibernateUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Payment extends UserAccount{
    private JPanel pnlPayment;
    private JPanel pnlPaymentItems;
    private JPanel pnlPaymentButtons;
    private JButton btnSplit;
    private JButton btnCash;
    private JButton btnPaymentCancel;
    private JButton btnCreditCard;
    private JLabel lblFinalPrice;

    public ArrayList<Order> getPaymentArray() {
        return paymentArray;
    }

    public void setPaymentArray(ArrayList<Order> paymentArray) {
        this.paymentArray = paymentArray;
    }

    private ArrayList<Order> paymentArray = new ArrayList<Order>();

    public JLabel getLblFinalPrice() {
        return lblFinalPrice;
    }

    public JPanel getPnlPayment() {
        return pnlPayment;
    }

    public JPanel getPnlPaymentItems() {
        return pnlPaymentItems;
    }

    MakeOrder makeOrder = new MakeOrder();
    UserAccount userAccount = new UserAccount();
    //EntryPage entryPage = new EntryPage();
    ArrayList <Order> array;

    /*public void getArray(ArrayList <Order> array)
    {
        int size= array.size();

        System.out.println("TRY:"+array.size());


    }*/






    public Payment(String username, ArrayList orderArray) {

        System.out.println("USERNAME: "+username);
        System.out.println("ARRAY LIST SIZE: "+orderArray.size());

        setPaymentArray(orderArray);

        System.out.println("fucking array: "+getPaymentArray().size());

        int fuckingSize=getPaymentArray().size();
        for (int x=0;x<fuckingSize;x++){
            System.out.println("PAYMENT ARRAY "+x+": "+paymentArray.get(x).getNumberOfItem()+" - "+paymentArray.get(x).getNameItem()+" - "+
                    +paymentArray.get(x).getPrice()+" - " +paymentArray.get(x).getTotalPrice()+" - "+paymentArray.get(x).getIdTable());
        }

        System.out.println("Username: "+userAccount.getLblUserName().getText());
        btnPaymentCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                makeOrder.orderPositionY=0;

                JComponent comp = (JComponent) e.getSource();
                Window win = SwingUtilities.getWindowAncestor(comp); //get top window
                win.dispose();
            }
        });
        btnCash.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                getCashFrame();
            }
        });


    }

    public void getCashFrame(){
        Color green = new Color(133,147,49);
        Color orange = new Color(254,151,44);

        JFrame frame2 = new JFrame("Payment - Cash");
        frame2.setBackground(new Color(240,232,220));

        Font font = new Font("Century Gothic", 1, 26);
        frame2.setFont(font);

        final JLabel lblUser = new JLabel("name");
        final JLabel lblFnllPrice = new JLabel("name");
        final JLabel lblReceivedCash = new JLabel("name");
        final JTextField txtReceivedCash = new JTextField();

        final JLabel lblRelease = new JLabel();
        JButton btnConfirm = new JButton("CONFIRM");
        JButton btnDone= new JButton("Done");

        btnConfirm.setBackground(green);
        btnConfirm.setForeground(Color.white);

        btnDone.setBackground(green);
        btnDone.setForeground(Color.white);

        lblUser.setForeground(green);
        lblUser.setFont(font);
        lblUser.setText("Waiter: "+userAccount.getLblUserName().getText());

        lblFnllPrice.setForeground(Color.black);
        lblFnllPrice.setFont(font);
        lblFnllPrice.setText(String.valueOf(makeOrder.paymentPrice));

        lblReceivedCash.setForeground(green);
        lblReceivedCash.setFont(font);
        lblReceivedCash.setText("Received cash: ");

        txtReceivedCash.setForeground(Color.black);
        txtReceivedCash.setFont(font);


        String sum=txtReceivedCash.getText();


        String[] parts = getLblFinalPrice().getText().split(":");
        String part1 = parts[0]; // 004
        final String part2 = parts[1]; // 034556
        System.out.println(part2);
        lblFnllPrice.setText(part2+" €");
        txtReceivedCash.getText();



        lblUser.setBounds(180, 40, 200, 40);
        lblFnllPrice.setBounds(180, 100, 200, 40);
        lblReceivedCash.setBounds(180, 160, 250, 40);
        txtReceivedCash.setBounds(180, 220, 200, 40);
        btnConfirm.setBounds(180, 280, 200, 40);
        lblRelease.setBounds(180, 340, 200, 40);
        btnDone.setBounds(180, 400, 200, 40);


        frame2.setLayout(null);

        // add JTextFields to the jframe
        frame2.add(lblUser);
        frame2.add(lblFnllPrice);
        frame2.add(lblReceivedCash);
        frame2.add(txtReceivedCash);
        frame2.add(lblRelease);
        frame2.add(btnConfirm);
        frame2.add(btnDone);

        frame2.setBackground(new Color(240,232,220));
        final boolean[] ver = {false};

        btnConfirm.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                lblRelease.setEnabled(true);

                double finalprice = Double.parseDouble(part2);
                double received = Double.parseDouble(txtReceivedCash.getText());
                double release = received - finalprice;
                if(received<finalprice)
                {
                    JOptionPane.showMessageDialog(null, "Missing receive money!");
                }
                else
                    lblRelease.setText(String.valueOf(release));

            }
        });


        btnDone.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                userAccount.chceckDoneOrder=makeOrder.makeOrderIdTable;
                userAccount.doneOrder();
                System.out.println(userAccount.getOrderArray().size());

            }
        });




        frame2.setSize(600,600);
        frame2.setLocationRelativeTo(null);

        frame2.setVisible(true);
    }


}
