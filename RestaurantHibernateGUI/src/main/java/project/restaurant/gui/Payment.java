package project.restaurant.gui;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.query.Query;
import project.restaurant.hibernate.AllItemsOfOrder;
import project.restaurant.hibernate.Authentication;
import project.restaurant.hibernate.HibernateUtil;
import project.restaurant.hibernate.finalOrder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
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

    JFrame paymment;
    int orderPositionY;
    Double finalPrice=0.0;
    Double paymentPrice;


    public ArrayList<Order> getPaymentArray() {
        return paymentArray;
    }

    public void setPaymentArray(ArrayList<Order> paymentArray) {
        this.paymentArray = paymentArray;
    }

    private ArrayList<Order> paymentArray = new ArrayList<Order>();
    private int idtable;

    public int getIdtable() {
        return idtable;
    }

    public void setIdtable(int idtable) {
        this.idtable = idtable;
    }

    public JLabel getLblFinalPrice() {
        return lblFinalPrice;
    }

    public JPanel getPnlPayment(JFrame paymentFrame) {
        paymment=paymentFrame;
        return pnlPayment;
    }

    public JPanel getPnlPaymentItems() {
        return pnlPaymentItems;
    }

    MakeOrder makeOrder = new MakeOrder();
    UserAccount userAccount = new UserAccount();
    //EntryPage entryPage = new EntryPage();
    ArrayList <Order> array;


    public Payment(String username, ArrayList orderArray, int IdTable) {


        setPaymentArray(orderArray);
        setIdtable(IdTable);


        int fuckingSize=getPaymentArray().size();
        for (int x=0;x<fuckingSize;x++){
            System.out.println("PAYMENT ARRAY "+x+": "+paymentArray.get(x).getNumberOfItem()+" - "+paymentArray.get(x).getNameItem()+" - "+
                    +paymentArray.get(x).getPrice()+" - " +paymentArray.get(x).getTotalPrice()+" - "+paymentArray.get(x).getIdTable());
        }

        setOrder(idtable);
        btnPaymentCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                makeOrder.orderPositionY=0;


                closePayment(e);

            }
        });
        btnCash.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                getCashFrame();
            }
        });


    }

    public void closePayment(ActionEvent e) {
        JComponent comp = (JComponent) e.getSource();
        Window win = SwingUtilities.getWindowAncestor(comp); //get top window
        win.dispose();
    }

    public void getCashFrame(){
        Color green = new Color(133,147,49);
        Color orange = new Color(254,151,44);

        final JFrame frame2 = new JFrame("Payment - Cash");
        frame2.setBackground(new Color(240,232,220));

        Font font = new Font("Century Gothic", 1, 26);
        frame2.setFont(font);

        final JLabel lblUser = new JLabel("name");
        final JLabel lblFnllPrice = new JLabel("name");
        final JLabel lblReceivedCash = new JLabel("name");
        final JTextField txtReceivedCash = new JTextField();
        final JTextArea bill = new JTextArea();

        final JLabel lblRelease = new JLabel();
        JButton btnConfirm = new JButton("CONFIRM");
        final JButton btnDone= new JButton("Done");

        btnConfirm.setBackground(green);
        btnConfirm.setFont(font);
        btnConfirm.setForeground(Color.white);

        btnDone.setBackground(green);
        btnDone.setForeground(Color.white);
        btnDone.setFont(font);
        btnDone.setEnabled(false);

        lblUser.setForeground(green);
        lblUser.setFont(font);
        lblUser.setText("Waiter: admin"/*+userAccount.getLblUserName().getText()*/);

        lblFnllPrice.setForeground(Color.black);
        lblFnllPrice.setFont(font);
        lblFnllPrice.setText("Price: ");

        lblReceivedCash.setForeground(green);
        lblReceivedCash.setFont(font);
        lblReceivedCash.setText("Received Cash: ");

        txtReceivedCash.setForeground(Color.black);
        txtReceivedCash.setFont(font);

        lblRelease.setForeground(orange);
        lblRelease.setFont(font);


        String sum=txtReceivedCash.getText();


        String[] parts = getLblFinalPrice().getText().split(":");
        String part1 = parts[0];
        final String part2 = parts[1];
        lblFnllPrice.setText("Price: "+part2+" €");
        txtReceivedCash.getText();



        lblUser.setBounds(180, 40, 200, 40);
        lblFnllPrice.setBounds(180, 100, 200, 40);
        lblReceivedCash.setBounds(180, 160, 250, 40);
        txtReceivedCash.setBounds(180, 220, 200, 40);
        btnConfirm.setBounds(180, 280, 200, 40);
        lblRelease.setBounds(180, 340, 200, 40);
        btnDone.setBounds(180, 400, 200, 40);
        bill.setBounds(180, 460, 200, 40);



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
                release = Math.round(release*100)/100.0;
                if(received<finalprice)
                {
                    JOptionPane.showMessageDialog(null, "Missing receive money!");
                }
                else
                    lblRelease.setText("Difference: "+String.valueOf(release));
                    btnDone.setEnabled(true);


            }
        });


        btnDone.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("RLY"+getPaymentArray().size());

                AllItemsOfOrder allitems = new AllItemsOfOrder();
                SessionFactory sff = HibernateUtil.getSessionFactory();
                Session ss = sff.openSession();
                ss.beginTransaction();

                Criteria criteria = ss
                        .createCriteria(AllItemsOfOrder.class)
                        .setProjection(Projections.max("ordernumber"));
                Integer maxNumber = (Integer)criteria.uniqueResult();
                maxNumber++;

                for(int p = 0;p<getPaymentArray().size();p++) {

                    SessionFactory sf = HibernateUtil.getSessionFactory();
                    Session s = sf.openSession();
                    s.beginTransaction();

                    allitems.setName(getPaymentArray().get(p).getNameItem());
                    allitems.setPrice(getPaymentArray().get(p).getPrice());
                    allitems.setTabllle(getPaymentArray().get(p).getIdTable());
                    allitems.setOrdernumber(maxNumber);
                    s.getTransaction().commit();

                    s.save(allitems);
                    s.close();

                }

                finalOrder finalorder = new finalOrder();
                SessionFactory sf = HibernateUtil.getSessionFactory();
                Session s = sf.openSession();
                s.beginTransaction();
                String[] parts = getLblFinalPrice().getText().split(":");
                String part1 = parts[0]; // 004
                final String part2 = parts[1]; // 034556
                System.out.println(part2);




                finalorder.setOrderid(maxNumber);
                finalorder.setTablle(allitems.getTabllle());
                finalorder.setFinalprice(Double.parseDouble(part2));

                s.save(finalorder);
                s.close();












                getPaymentArray().clear();
                frame2.dispose();


                ActionEvent x = null;
                x.setSource(btnPaymentCancel);
                closePayment(x);

                JComponent comp = (JComponent) x.getSource();
                Window win = SwingUtilities.getWindowAncestor(comp); //get top window
                win.dispose();

                closePayment(e);



            }
        });




        frame2.setSize(600,600);
        frame2.setLocationRelativeTo(null);

        frame2.setVisible(true);
    }



    public void setOrder(int idTable){

        JLabel lblPaymentCount = new JLabel("name");
        JLabel lblPaymentX = new JLabel("name");
        JLabel lblPaymentName = new JLabel("name");
        JLabel lblPaymentPrice = new JLabel("name");
        JLabel lblPaymentEuro = new JLabel("name");
        Font font = new Font("Century Gothic", Font.BOLD, 26);


        orderPositionY=0;

        int sizeOfArray=paymentArray.size();
        for (int x=0;x<sizeOfArray;x++) {


            System.out.println("PAYMENT ARRAY "+x+": "+paymentArray.get(x).getNumberOfItem()+" - "+paymentArray.get(x).getNameItem()+" - "+
                    +paymentArray.get(x).getPrice()+" - " +paymentArray.get(x).getTotalPrice()+" - "+paymentArray.get(x).getIdTable());


            if (paymentArray.get(x).getNumberOfItem() != 0 && (paymentArray.get(x).getIdTable()==idTable)) {

                orderPositionY=orderPositionY+30;
                finalPrice=finalPrice+paymentArray.get(x).getTotalPrice();
                paymentPrice=finalPrice;


                getPnlPaymentItems().setLayout(null);

                getPnlPaymentItems().add(lblPaymentCount = new JLabel("" + paymentArray.get(x).getNumberOfItem(), FlowLayout.LEFT));
                lblPaymentCount.setFont(font);
                lblPaymentCount.setBounds(10, orderPositionY, 45, 30);

                getPnlPaymentItems().add(lblPaymentX = new JLabel("x", FlowLayout.LEFT));
                lblPaymentX.setFont(font);
                lblPaymentX.setBounds(55, orderPositionY, 20, 30);

                getPnlPaymentItems().add(lblPaymentName = new JLabel("" + paymentArray.get(x).getNameItem(), FlowLayout.LEFT));
                lblPaymentName.setFont(font);
                lblPaymentName.setBounds(85, orderPositionY, 200, 30);

                getPnlPaymentItems().add(lblPaymentPrice = new JLabel("" + paymentArray.get(x).getTotalPrice(), FlowLayout.LEFT));
                lblPaymentPrice.setFont(font);
                lblPaymentPrice.setBounds(295, orderPositionY, 100, 30);

                getPnlPaymentItems().add(lblPaymentEuro = new JLabel("€", FlowLayout.LEFT));
                lblPaymentEuro.setFont(font);
                lblPaymentEuro.setBounds(405, orderPositionY, 30, 30);
            }

            getLblFinalPrice().setText("Final price : "+String.valueOf(finalPrice));
        }
    }


}
