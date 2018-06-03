package project.restaurant.gui;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import project.restaurant.hibernate.Authentication;
import project.restaurant.hibernate.Drink;
import project.restaurant.hibernate.Food;
import project.restaurant.hibernate.HibernateUtil;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class SetDrinks {


    Drink drink = new Drink();

    public void createTable(){
        Color green =new Color(133, 147, 49);
        Color orange =new Color(254,151,44);
        Color beige = new Color(240,232,220);

        JFrame frame2 = new JFrame();
        frame2.setBackground(beige);

        final JTable table = new JTable();

        Object[] columns = {"Id","Name","Composition","Price","Volume","Type","Active"};
        final DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);

        table.setModel(model);


        table.setBackground(beige);
        table.setForeground(green);
        Font font = new Font("Century Gothic", 1, 22);
        table.setFont(font);
        table.setRowHeight(30);

        final JLabel lblName = new JLabel();
        final JTextField textName = new JTextField();
        final JLabel lblComposition= new JLabel();
        final JTextField textComposition = new JTextField();
        final JLabel lblPrice= new JLabel();
        final JTextField textPrice = new JTextField();
        final JLabel lblVolume = new JLabel();
        final JTextField textVolume = new JTextField();
        final JLabel lblType = new JLabel();
        String[] types = { "Beer", "Wine", "Sprites", "Cocktail", "Ice Drink", "Hot Drink", "Smoothie" };
        final JComboBox textType = new JComboBox(types);
        final JLabel lblActive = new JLabel();
        String[] active = { "1", "0"};
        final JComboBox textActive = new JComboBox(active);

        JButton btnAdd = new JButton("Add");
        JButton btnDelete = new JButton("Delete");
        JButton btnUpdate = new JButton("Update");

        btnAdd.setBackground(green);
        btnAdd.setForeground(Color.white);

        btnUpdate.setBackground(green);
        btnUpdate.setForeground(Color.white);

        btnDelete.setBackground(orange);
        btnDelete.setForeground(Color.white);

        lblName.setForeground(green);
        lblComposition.setForeground(green);
        lblPrice.setForeground(green);
        lblVolume.setForeground(green);
        lblActive.setForeground(green);
        lblType.setForeground(green);

        lblName.setText("Name : ");
        lblComposition.setText("Composition : ");
        lblPrice.setText("Price : ");
        lblVolume.setText("Volume : ");
        lblActive.setText("Active : ");
        lblType.setText("Type : ");


        lblName.setBounds(20, 220, 80, 25);
        textName.setBounds(120, 220, 170, 25);

        lblComposition.setBounds(20, 250, 80, 25);
        textComposition.setBounds(120, 250, 170, 25);

        lblPrice.setBounds(310, 220, 80, 25);
        textPrice.setBounds(370, 220, 60, 25);

        lblVolume.setBounds(310, 250, 80, 25);
        textVolume.setBounds(370, 250, 60, 25);

        lblActive.setBounds(480, 220, 80, 25);
        textActive.setBounds(560, 220, 100, 25);

        lblType.setBounds(480, 250, 80, 25);
        textType.setBounds(560, 250, 100, 25);

        btnAdd.setBounds(700, 220, 100, 25);
        btnUpdate.setBounds(700, 250, 100, 25);
        btnDelete.setBounds(700, 280, 100, 25);

        // create JScrollPane
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0, 0, 880, 200);
        pane.setBackground(beige);

        frame2.setLayout(null);

        frame2.add(pane);

        // add JTextFields to the jframe
        frame2.add(lblName);
        frame2.add(lblActive);
        frame2.add(lblComposition);
        frame2.add(lblPrice);
        frame2.add(lblType);
        frame2.add(lblVolume);

        frame2.add(textName);
        frame2.add(textActive);
        frame2.add(textComposition);
        frame2.add(textPrice);
        frame2.add(textType);
        frame2.add(textVolume);



        frame2.add(btnAdd);
        frame2.add(btnDelete);
        frame2.add(btnUpdate);

        frame2.setBackground(beige);


        final Object[] row = new Object[7];
        long id = 0;
        String name = null;
        String composition = null;
        String price = null;
        String volume = null;
        String type = null;
        String activeItem = null;


        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
        se.beginTransaction();
        Query qry=se.createQuery("from Drink");
        java.util.List<Drink> drinkInfo=(List<Drink>)qry.list();
        se.getTransaction().commit();
        se.close();
        for(Drink  d: drinkInfo)
        {

            id = d.getId();
            name = d.getName();
            composition = d.getComposition();
            price = String.valueOf(d.getPrice());
            volume = d.getVolume();
            type = d.getType();
            activeItem = String.valueOf(d.getActive());



            row[0] = id;
            row[1] = name;
            row[2] = composition;
            row[3] = price;
            row[4] = volume;
            row[5] = type;
            row[6] = activeItem;
            // add row to the model
            model.addRow(row);


        }


        btnDelete.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {


                SessionFactory sf = HibernateUtil.getSessionFactory();
                Session se = sf.openSession();
                System.out.println(table.getSelectedColumn());

                Transaction transaction = se.beginTransaction();
                try {

                    String hql = "delete from Drink where id= :id";
                    Query query = se.createQuery(hql);

                    query.setParameter("id", table.getModel().getValueAt(table.getSelectedRow(), 0));

                    System.out.println(query.executeUpdate());


                    transaction.commit();

                    JOptionPane.showMessageDialog(null, "Item "+textName.getText()+" successfully deleted!");
                    JComponent comp = (JComponent) e.getSource();
                    Window win = SwingUtilities.getWindowAncestor(comp); //get top window
                    win.dispose();
                    createTable();

                } catch (Throwable t) {
                    transaction.rollback();
                    throw t;
                }





            }
        });


        table.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e){

                // i = the index of the selected row
                int i = table.getSelectedRow();

                textName.setText(model.getValueAt(i, 1).toString());
                textComposition.setText(model.getValueAt(i, 2).toString());
                textPrice.setText(model.getValueAt(i, 3).toString());
                textVolume.setText(model.getValueAt(i, 4).toString());
                textType.setSelectedItem(model.getValueAt(i, 5).toString());
                textActive.setSelectedItem(model.getValueAt(i, 6));
            }
        });

        btnUpdate.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {

                SessionFactory sf = HibernateUtil.getSessionFactory();
                Session se = sf.openSession();


                Transaction transaction = se.beginTransaction();
                try {


                    String hql = "update Drink set name= :name,composition= :composition,price= :price,volume= :volume,type= :type,active= :active where id= :id";
                    Query query = se.createQuery(hql);
                    query.setParameter("name", textName.getText());
                    query.setParameter("composition", textComposition.getText());
                    query.setParameter("price", textPrice.getText());
                    query.setParameter("volume", textVolume.getText());
                    query.setParameter("type", textType.getSelectedItem());
                    query.setParameter("active", textActive.getSelectedItem());
                    query.setParameter("id", table.getModel().getValueAt(table.getSelectedRow(), 0));



                    int rowCount = query.executeUpdate();
                    System.out.println("Rows affected: " + rowCount);


                    transaction.commit();
                } catch (Throwable t) {
                    transaction.rollback();
                    throw t;
                }



                int i = table.getSelectedRow();

                if(i >= 0)
                {
                    model.setValueAt(textName.getText(), i, 1);
                    model.setValueAt(textComposition.getText(), i, 2);
                    model.setValueAt(textPrice.getText(), i, 3);
                    model.setValueAt(textVolume.getText(), i, 4);
                    model.setValueAt(textType.getSelectedItem(), i, 5);
                    model.setValueAt(textActive.getSelectedItem(), i, 6);

                    JOptionPane.showMessageDialog(null, "Item "+textName.getText()+" successfully updaded!");
                }
                else{
                    System.out.println("Update Error");
                }
            }
        });

        frame2.setSize(900,400);
        frame2.setLocationRelativeTo(null);

        frame2.setVisible(true);



        btnAdd.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                SessionFactory sf = HibernateUtil.getSessionFactory();
                Session s = sf.openSession();
                s.beginTransaction();
                Drink newDrink = new Drink();
                newDrink.setName(textName.getText());
                newDrink.setComposition(textComposition.getText());
                newDrink.setPrice(Double.parseDouble( textPrice.getText()));
                newDrink.setVolume(textVolume.getText());
                newDrink.setType(String.valueOf(textType.getSelectedItem()));
                newDrink.setActive(String.valueOf(textActive.getSelectedItem()));


                s.save(newDrink);
                s.getTransaction().commit();
                s.close();

                JOptionPane.showMessageDialog(null, "Item "+textName.getText()+" successfully added!");
                JComponent comp = (JComponent) e.getSource();
                Window win = SwingUtilities.getWindowAncestor(comp); //get top window
                win.dispose();
                createTable();

            }

        });


    }
}
