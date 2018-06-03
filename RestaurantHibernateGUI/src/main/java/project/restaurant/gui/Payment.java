package project.restaurant.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Payment {
    private JPanel pnlPayment;
    private JPanel pnlPaymentItems;
    private JPanel pnlPaymentButtons;
    private JButton btnSplit;
    private JButton btnCash;
    private JButton btnPaymentCancel;
    private JButton btnCreditCard;

    public JPanel getPnlPayment() {
        return pnlPayment;
    }

    public JPanel getPnlPaymentItems() {
        return pnlPaymentItems;
    }

    public Payment() {
        btnPaymentCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComponent comp = (JComponent) e.getSource();
                Window win = SwingUtilities.getWindowAncestor(comp); //get top window
                win.dispose();
            }
        });
    }


}
