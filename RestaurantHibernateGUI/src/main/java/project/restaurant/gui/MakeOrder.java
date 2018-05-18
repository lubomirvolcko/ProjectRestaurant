package project.restaurant.gui;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import project.restaurant.hibernate.Drink;
import project.restaurant.hibernate.HibernateUtil;
import project.restaurant.hibernate.getInformationFromDatabase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MakeOrder {
    private JPanel pnlMakeOrder;
    private JPanel pnlOrderedItems;
    private JPanel pnlMainCategory;
    private JButton btnMeal;
    private JButton btnDrinks;
    private JLabel lblNameTable;
    private JPanel pnlConfirmButtons;
    private JButton btnConfirm;
    private JButton btnCancel;
    private JPanel pnlMealType;
    private JButton btnSoftDrinks;
    private JButton btnAlcoholDrinks;
    private JPanel pnlDrinksCategory;
    private JPanel pnlMealCategory;
    private JButton btnAppetizer;
    private JButton btnMainDish;
    private JButton btnSalad;
    private JButton btnDessert;
    private JPanel pnlBtnBack;
    private JButton btnBack;
    private JPanel pnlSoftDrinks;
    private JPanel pnlSmoothies;
    private JButton btnSmoothie;
    private JButton btnHotDrinks;
    private JButton btnIceDrinks;
    private JButton btnSoup;
    private JLabel lblSmoothiesHead;
    private JPanel pnlHotDrinks;
    private JPanel pnlIceDrinks;
    private JLabel pnnlAlcoholDrinks;
    private JButton btnBeers;
    private JButton btnSpirits;
    private JButton btnWines;
    private JButton btnCocktails;
    private JPanel pnlAlcoholDrinks;
    private JPanel pnlBeers;
    private JPanel pnlCocktails;
    private JPanel pnlSpirits;
    private JPanel pnlWines;
    private JButton btn;
    private JScrollPane pnlScrollOrderedItems;
    public String state;
    String name;
    Double price;
    long item;
    int positionY = 120;
    int addPositionY = 50;
    int orderPositionY=0;
    String count="";

    public JPanel getPnlOrderedItems() {
        return pnlOrderedItems;
    }

    public JPanel getPnlMainCategory() {
        return pnlMainCategory;
    }

    public JButton getBtnMeal() {
        return btnMeal;
    }

    public JButton getBtnDrinks() {
        return btnDrinks;
    }

    public JLabel getLblNameTable() {
        return lblNameTable;
    }

    public JPanel getPnlMakeOrder() {
        return pnlMakeOrder;
    }

    public void getDrinksSmoothies()
    {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
        se.beginTransaction();
        Query qry=se.createQuery("from Drink where type='Smoothies'");
        java.util.List<Drink> drinkSmoothies=(List<Drink>)qry.list();
        se.getTransaction().commit();
        se.close();
        int f;
        int i = drinkSmoothies.size();

        //MakeOrder smoothie = new MakeOrder();


        /*for(f=0;f<1;f++)
        {
            name=drinkSmoothies.get(f).getName();
            smoothie.getSmootiesButtons(name, price, item);
        }*/

        for(Drink d : drinkSmoothies)
        {
            item=d.getId();
            name=d.getName();
            price=d.getPrice();
            getSmootiesButtons(name,price,item);


        }
    }

    public void getHotDrinks()
    {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
        se.beginTransaction();
        Query qry=se.createQuery("from Drink where type='Hot Drinks'");
        List<Drink> drinkHotDrinks=(List<Drink>)qry.list();
        se.getTransaction().commit();
        se.close();
        for(Drink d : drinkHotDrinks)
        {

            item=d.getId();
            name=d.getName();
            price=d.getPrice();
            getHotDrinksButtons(name, price, item);
            //System.out.println(d.getName());
            //System.out.println(d.getPrice());
        }
    }

    public void getIceDrinks()
    {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
        se.beginTransaction();
        Query qry=se.createQuery("from Drink where type='Ice Drinks'");
        List<Drink> drinkIceDrinks=(List<Drink>)qry.list();
        se.getTransaction().commit();
        se.close();
        for(Drink d : drinkIceDrinks)
        {

            item=d.getId();
            name=d.getName();
            price=d.getPrice();
            getIceDrinksButtons(name, price, item);
            //System.out.println(d.getName());
            //System.out.println(d.getPrice());
        }
    }

    public void getBeer()
    {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
        se.beginTransaction();
        Query qry=se.createQuery("from Drink where type='Beer'");
        List<Drink> drinkBeer=(List<Drink>)qry.list();
        se.getTransaction().commit();
        se.close();
        for(Drink d : drinkBeer)
        {
            item=d.getId();
            name=d.getName();
            price=d.getPrice();
            getBeerButtons(name, price, item);
            //System.out.println(d.getName());
            //System.out.println(d.getPrice());
        }
    }

    public void getCocktailsDrinks()
    {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
        se.beginTransaction();
        Query qry=se.createQuery("from Drink where type='Cocktails'");
        List<Drink> drinkCocktails=(List<Drink>)qry.list();
        se.getTransaction().commit();
        se.close();
        for(Drink d : drinkCocktails)
        {
            item=d.getId();
            name=d.getName();
            price=d.getPrice();
            getCocktailsButtons(name, price, item);
            //System.out.println(d.getName());
            //System.out.println(d.getPrice());
        }
    }

    public void getWine()
    {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
        se.beginTransaction();
        Query qry=se.createQuery("from Drink where type='Wine'");
        List<Drink> drinkWine=(List<Drink>)qry.list();
        se.getTransaction().commit();
        se.close();
        for(Drink d : drinkWine)
        {

            item=d.getId();
            name=d.getName();
            price=d.getPrice();
            getWineButtons(name, price, item);
            //System.out.println(d.getName());
            //System.out.println(d.getPrice());
        }
    }

    public void getSprites()
    {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
        se.beginTransaction();
        Query qry=se.createQuery("from Drink where type='Sprites'");
        List<Drink> drinkSprites =  (List<Drink>)qry.list();
        se.getTransaction().commit();
        se.close();
        for(Drink d : drinkSprites)
        {

            item=d.getId();
            name=d.getName();
            price=d.getPrice();
            getSpiritesButtons(name, price, item);
            //System.out.println(d.getName());
            //System.out.println(d.getPrice());
        }
    }


    /*public void scrollPanel(){
        pnlOrderedItems.setLayout(null);
        JScrollPane scrollPane = new JScrollPane();

        pnlSmoothies.add(scrollPane = new JScrollPane());
        scrollPane.setBounds(0,0, 700, 900);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setBackground(Color.gray);
        scrollPane.setLayout(null);
    }*/

    public MakeOrder() {
        setPanels();




        pnlMakeOrder.setSize(500, 500);

        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComponent comp = (JComponent) e.getSource();
                Window win = SwingUtilities.getWindowAncestor(comp); //get top window
                win.dispose();
            }
        });

        btnDrinks.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StateDrinks();
            }
        });

        btnMeal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StateMeal();
            }
        });

        //action on btn back
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (state == "StateDrinks" || state == "StateMeal") {
                    StateMakeorder();
                }
                else if(state == "StateSoftDrinks" || state == "StateAlcoholDrinks"){
                    StateDrinks();
                }
                else if(state == "StateSmoothies" || state == "StateHotDrinks" || state == "StateIceDrinks"){
                    SoftDrinks();
                    positionY=120;
                }
                else if (state == "StateBeers" || state == "StateCocktails" || state == "StateSpirits" || state == "StateWines"){
                    AlcoholDrinks();
                    positionY=120;
                }
            }
        });
        btnSoftDrinks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SoftDrinks();
            }
        });
        btnSmoothie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //drink.getDrinksSmoothies();
                Smoothies();
                getDrinksSmoothies();

            }
        });
        btnHotDrinks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                HotDrinks();
                getHotDrinks();
            }
        });
        btnIceDrinks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                IceDrinks();
                getIceDrinks();
            }
        });
        btnAlcoholDrinks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AlcoholDrinks();
            }
        });
        btnBeers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Beers();
                getBeer();
            }
        });
        btnCocktails.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cocktails();
                getCocktailsDrinks();
            }
        });
        btnSpirits.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Spirits();
                getSprites();
            }
        });
        btnWines.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Wines();
                getWine();
            }
        });
    }

    private void setPanels() {
        pnlMealType.setVisible(false);
        btnBack.setEnabled(false);
        pnlSoftDrinks.setVisible(false);
        pnlSmoothies.setVisible(false);
        pnlHotDrinks.setVisible(false);
        pnlIceDrinks.setVisible(false);
        pnlAlcoholDrinks.setVisible(false);
        pnlBeers.setVisible(false);
        pnlCocktails.setVisible(false);
        pnlSpirits.setVisible(false);
        pnlWines.setVisible(false);
    }


    public void StateMakeorder() {
        pnlSoftDrinks.setVisible(false);
        pnlMainCategory.setVisible(true);
        pnlMealType.setVisible(false);
        btnBack.setEnabled(false);
    }

    public void StateMeal() {
        state = "StateMeal";
        pnlMainCategory.setVisible(false);
        pnlMealType.setVisible(true);
        pnlMealCategory.setVisible(true);
        pnlDrinksCategory.setVisible(false);
        btnBack.setEnabled(true);
        pnlSoftDrinks.setVisible(false);
    }

    public void StateDrinks() {
        state = "StateDrinks";
        pnlMainCategory.setVisible(false);
        pnlMealType.setVisible(true);
        pnlMealCategory.setVisible(false);
        pnlDrinksCategory.setVisible(true);
        btnBack.setEnabled(true);
        pnlSoftDrinks.setVisible(false);
        pnlAlcoholDrinks.setVisible(false);
    }

    public void SoftDrinks(){
        state = "StateSoftDrinks";
        pnlDrinksCategory.setVisible(false);
        pnlMealType.setVisible(false);
        pnlSoftDrinks.setVisible(true);
        pnlSmoothies.setVisible(false);
        pnlHotDrinks.setVisible(false);
        pnlIceDrinks.setVisible(false);
    }

    public void Smoothies(){
        state = "StateSmoothies";
        pnlSoftDrinks.setVisible(false);
        pnlSmoothies.setVisible(true);
    }

    public void HotDrinks(){
        state = "StateHotDrinks";
        pnlSoftDrinks.setVisible(false);
        pnlHotDrinks.setVisible(true);
    }

    public void IceDrinks(){
        state = "StateIceDrinks";
        pnlSoftDrinks.setVisible(false);
        pnlIceDrinks.setVisible(true);
    }

    public void AlcoholDrinks(){
        state = "StateAlcoholDrinks";
        pnlDrinksCategory.setVisible(false);
        pnlMealType.setVisible(false);
        pnlAlcoholDrinks.setVisible(true);
        pnlBeers.setVisible(false);
        pnlCocktails.setVisible(false);
        pnlSpirits.setVisible(false);
        pnlWines.setVisible(false);
    }

    public void Beers(){
        state = "StateBeers";
        pnlAlcoholDrinks.setVisible(false);
        pnlBeers.setVisible(true);
    }

    public void Cocktails(){
        state = "StateCocktails";
        pnlAlcoholDrinks.setVisible(false);
        pnlCocktails.setVisible(true);
    }

    public void Spirits(){
        state = "StateSpirits";
        pnlAlcoholDrinks.setVisible(false);
        pnlSpirits.setVisible(true);
    }

    public void Wines(){
        state = "StateWines";
        pnlAlcoholDrinks.setVisible(false);
        pnlWines.setVisible(true);
    }

    public void getSpiritesButtons(String name, Double price, long item){

        try{
            JLabel lblSmootieNumber = new JLabel("name"); //create label
            JButton btnSmootie = new JButton(); //create button
            JTextField txtCount = new JTextField(); //create text field

            pnlSpirits.setLayout(null);

            //lblSmoothiesHead.setBounds(150, 0, 300, 40);

            //create label in pnlSmothies for number of item
            pnlSpirits.add(lblSmootieNumber = new JLabel(""+item, FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(0, positionY+addPositionY, 30, 30);

            //create label in pnlSmothies for name of item
            pnlSpirits.add(lblSmootieNumber = new JLabel(""+name, FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(100, positionY+addPositionY, 200, 30);

            //create label in pnlSmothies for price of item
            pnlSpirits.add(lblSmootieNumber = new JLabel(""+price+" €" , FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(350, positionY+addPositionY, 80, 30);

            //create txt field in pnlSmothies for count of item
            pnlSpirits.add(txtCount = new JTextField(FlowLayout.LEFT));
            txtCount.setFont(new Font("Century Gothic", Font.BOLD, 25));
            txtCount.setBounds(450, positionY+addPositionY, 60, 30);
            txtCount.setText("1");

            //create button in pnlSmothies for send item to table (for confirm item to order)
            pnlSpirits.add(btnSmootie = new JButton("Choose"));
            btnSmootie.setBackground(Color.green);
            btnSmootie.setForeground(Color.white);
            btnSmootie.setFont(new Font("Century Gothic", Font.BOLD, 20));
            btnSmootie.setBounds(520, positionY+addPositionY, 200, 30);
            btnSmootie.setBorderPainted(false);

            positionY=positionY+addPositionY;


            final JTextField finalTxtCount = txtCount;
            final String smootieName = name;
            final Double SmootiePrice = price;
            btnSmootie.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    count= finalTxtCount.getText();
                    finalTxtCount.setText("1");
                    sendToTable(smootieName, SmootiePrice);

                }


            });

            System.out.println("smoothie: "+name);
            System.out.println("price: "+price);
            System.out.println("item: "+item);

        }catch (Exception e){
            e.getStackTrace();
        }

    }

    public void getWineButtons(String name, Double price, long item){

        try{
            JLabel lblSmootieNumber = new JLabel("name"); //create label
            JButton btnSmootie = new JButton(); //create button
            JTextField txtCount = new JTextField(); //create text field

            pnlWines.setLayout(null);

            //lblSmoothiesHead.setBounds(150, 0, 300, 40);

            //create label in pnlSmothies for number of item
            pnlWines.add(lblSmootieNumber = new JLabel(""+item, FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(0, positionY+addPositionY, 30, 30);

            //create label in pnlSmothies for name of item
            pnlWines.add(lblSmootieNumber = new JLabel(""+name, FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(100, positionY+addPositionY, 200, 30);

            //create label in pnlSmothies for price of item
            pnlWines.add(lblSmootieNumber = new JLabel(""+price+" €" , FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(350, positionY+addPositionY, 80, 30);

            //create txt field in pnlSmothies for count of item
            pnlWines.add(txtCount = new JTextField(FlowLayout.LEFT));
            txtCount.setFont(new Font("Century Gothic", Font.BOLD, 25));
            txtCount.setBounds(450, positionY+addPositionY, 60, 30);
            txtCount.setText("1");

            //create button in pnlSmothies for send item to table (for confirm item to order)
            pnlWines.add(btnSmootie = new JButton("Choose"));
            btnSmootie.setBackground(Color.green);
            btnSmootie.setForeground(Color.white);
            btnSmootie.setFont(new Font("Century Gothic", Font.BOLD, 20));
            btnSmootie.setBounds(520, positionY+addPositionY, 200, 30);
            btnSmootie.setBorderPainted(false);

            positionY=positionY+addPositionY;


            final JTextField finalTxtCount = txtCount;
            final String smootieName = name;
            final Double SmootiePrice = price;
            btnSmootie.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    count= finalTxtCount.getText();
                    finalTxtCount.setText("1");
                    sendToTable(smootieName, SmootiePrice);

                }


            });

            System.out.println("smoothie: "+name);
            System.out.println("price: "+price);
            System.out.println("item: "+item);

        }catch (Exception e){
            e.getStackTrace();
        }

    }

    public void getCocktailsButtons(String name, Double price, long item){

        try{
            JLabel lblSmootieNumber = new JLabel("name"); //create label
            JButton btnSmootie = new JButton(); //create button
            JTextField txtCount = new JTextField(); //create text field

            pnlCocktails.setLayout(null);

            //lblSmoothiesHead.setBounds(150, 0, 300, 40);

            //create label in pnlSmothies for number of item
            pnlCocktails.add(lblSmootieNumber = new JLabel(""+item, FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(0, positionY+addPositionY, 30, 30);

            //create label in pnlSmothies for name of item
            pnlCocktails.add(lblSmootieNumber = new JLabel(""+name, FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(100, positionY+addPositionY, 200, 30);

            //create label in pnlSmothies for price of item
            pnlCocktails.add(lblSmootieNumber = new JLabel(""+price+" €" , FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(350, positionY+addPositionY, 80, 30);

            //create txt field in pnlSmothies for count of item
            pnlCocktails.add(txtCount = new JTextField(FlowLayout.LEFT));
            txtCount.setFont(new Font("Century Gothic", Font.BOLD, 25));
            txtCount.setBounds(450, positionY+addPositionY, 60, 30);
            txtCount.setText("1");

            //create button in pnlSmothies for send item to table (for confirm item to order)
            pnlCocktails.add(btnSmootie = new JButton("Choose"));
            btnSmootie.setBackground(Color.green);
            btnSmootie.setForeground(Color.white);
            btnSmootie.setFont(new Font("Century Gothic", Font.BOLD, 20));
            btnSmootie.setBounds(520, positionY+addPositionY, 200, 30);
            btnSmootie.setBorderPainted(false);

            positionY=positionY+addPositionY;


            final JTextField finalTxtCount = txtCount;
            final String smootieName = name;
            final Double SmootiePrice = price;
            btnSmootie.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    count= finalTxtCount.getText();
                    finalTxtCount.setText("1");
                    sendToTable(smootieName, SmootiePrice);

                }


            });

            System.out.println("smoothie: "+name);
            System.out.println("price: "+price);
            System.out.println("item: "+item);

        }catch (Exception e){
            e.getStackTrace();
        }

    }

    public void getBeerButtons(String name, Double price, long item){

        try{
            JLabel lblSmootieNumber = new JLabel("name"); //create label
            JButton btnSmootie = new JButton(); //create button
            JTextField txtCount = new JTextField(); //create text field

            pnlBeers.setLayout(null);

            //lblSmoothiesHead.setBounds(150, 0, 300, 40);

            //create label in pnlSmothies for number of item
            pnlBeers.add(lblSmootieNumber = new JLabel(""+item, FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(0, positionY+addPositionY, 30, 30);

            //create label in pnlSmothies for name of item
            pnlBeers.add(lblSmootieNumber = new JLabel(""+name, FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(100, positionY+addPositionY, 200, 30);

            //create label in pnlSmothies for price of item
            pnlBeers.add(lblSmootieNumber = new JLabel(""+price+" €" , FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(350, positionY+addPositionY, 80, 30);

            //create txt field in pnlSmothies for count of item
            pnlBeers.add(txtCount = new JTextField(FlowLayout.LEFT));
            txtCount.setFont(new Font("Century Gothic", Font.BOLD, 25));
            txtCount.setBounds(450, positionY+addPositionY, 60, 30);
            txtCount.setText("1");

            //create button in pnlSmothies for send item to table (for confirm item to order)
            pnlBeers.add(btnSmootie = new JButton("Choose"));
            btnSmootie.setBackground(Color.green);
            btnSmootie.setForeground(Color.white);
            btnSmootie.setFont(new Font("Century Gothic", Font.BOLD, 20));
            btnSmootie.setBounds(520, positionY+addPositionY, 200, 30);
            btnSmootie.setBorderPainted(false);

            positionY=positionY+addPositionY;


            final JTextField finalTxtCount = txtCount;
            final String smootieName = name;
            final Double SmootiePrice = price;
            btnSmootie.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    count= finalTxtCount.getText();
                    finalTxtCount.setText("1");
                    sendToTable(smootieName, SmootiePrice);

                }


            });

            System.out.println("smoothie: "+name);
            System.out.println("price: "+price);
            System.out.println("item: "+item);

        }catch (Exception e){
            e.getStackTrace();
        }

    }

    public void getHotDrinksButtons(String name, Double price, long item){

        try{
            JLabel lblSmootieNumber = new JLabel("name"); //create label
            JButton btnSmootie = new JButton(); //create button
            JTextField txtCount = new JTextField(); //create text field

            pnlHotDrinks.setLayout(null);

            //lblSmoothiesHead.setBounds(150, 0, 300, 40);

            //create label in pnlSmothies for number of item
            pnlHotDrinks.add(lblSmootieNumber = new JLabel(""+item, FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(0, positionY+addPositionY, 30, 30);

            //create label in pnlSmothies for name of item
            pnlHotDrinks.add(lblSmootieNumber = new JLabel(""+name, FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(100, positionY+addPositionY, 200, 30);

            //create label in pnlSmothies for price of item
            pnlHotDrinks.add(lblSmootieNumber = new JLabel(""+price+" €" , FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(350, positionY+addPositionY, 80, 30);

            //create txt field in pnlSmothies for count of item
            pnlHotDrinks.add(txtCount = new JTextField(FlowLayout.LEFT));
            txtCount.setFont(new Font("Century Gothic", Font.BOLD, 25));
            txtCount.setBounds(450, positionY+addPositionY, 60, 30);
            txtCount.setText("1");

            //create button in pnlSmothies for send item to table (for confirm item to order)
            pnlHotDrinks.add(btnSmootie = new JButton("Choose"));
            btnSmootie.setBackground(Color.green);
            btnSmootie.setForeground(Color.white);
            btnSmootie.setFont(new Font("Century Gothic", Font.BOLD, 20));
            btnSmootie.setBounds(520, positionY+addPositionY, 200, 30);
            btnSmootie.setBorderPainted(false);

            positionY=positionY+addPositionY;


            final JTextField finalTxtCount = txtCount;
            final String smootieName = name;
            final Double SmootiePrice = price;
            btnSmootie.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    count= finalTxtCount.getText();
                    finalTxtCount.setText("1");
                    sendToTable(smootieName, SmootiePrice);

                }


            });

            System.out.println("smoothie: "+name);
            System.out.println("price: "+price);
            System.out.println("item: "+item);

        }catch (Exception e){
            e.getStackTrace();
        }

    }

    public void getIceDrinksButtons(String name, Double price, long item){

        try{
            JLabel lblSmootieNumber = new JLabel("name"); //create label
            JButton btnSmootie = new JButton(); //create button
            JTextField txtCount = new JTextField(); //create text field

            pnlIceDrinks.setLayout(null);

            //lblSmoothiesHead.setBounds(150, 0, 300, 40);

            //create label in pnlSmothies for number of item
            pnlIceDrinks.add(lblSmootieNumber = new JLabel(""+item, FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(0, positionY+addPositionY, 30, 30);

            //create label in pnlSmothies for name of item
            pnlIceDrinks.add(lblSmootieNumber = new JLabel(""+name, FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(100, positionY+addPositionY, 200, 30);

            //create label in pnlSmothies for price of item
            pnlIceDrinks.add(lblSmootieNumber = new JLabel(""+price+" €" , FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(350, positionY+addPositionY, 80, 30);

            //create txt field in pnlSmothies for count of item
            pnlIceDrinks.add(txtCount = new JTextField(FlowLayout.LEFT));
            txtCount.setFont(new Font("Century Gothic", Font.BOLD, 25));
            txtCount.setBounds(450, positionY+addPositionY, 60, 30);
            txtCount.setText("1");

            //create button in pnlSmothies for send item to table (for confirm item to order)
            pnlIceDrinks.add(btnSmootie = new JButton("Choose"));
            btnSmootie.setBackground(Color.green);
            btnSmootie.setForeground(Color.white);
            btnSmootie.setFont(new Font("Century Gothic", Font.BOLD, 20));
            btnSmootie.setBounds(520, positionY+addPositionY, 200, 30);
            btnSmootie.setBorderPainted(false);

            positionY=positionY+addPositionY;


            final JTextField finalTxtCount = txtCount;
            final String smootieName = name;
            final Double SmootiePrice = price;
            btnSmootie.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    count= finalTxtCount.getText();
                    finalTxtCount.setText("1");
                    sendToTable(smootieName, SmootiePrice);

                }


            });

            System.out.println("smoothie: "+name);
            System.out.println("price: "+price);
            System.out.println("item: "+item);

        }catch (Exception e){
            e.getStackTrace();
        }

    }

    //create labels and button in pnlSmoothies
    public void getSmootiesButtons(String name, Double price, long item){

        try{
            JLabel lblSmootieNumber = new JLabel("name"); //create label
            JButton btnSmootie = new JButton(); //create button
            JTextField txtCount = new JTextField(); //create text field

            pnlSmoothies.setLayout(null);

            //lblSmoothiesHead.setBounds(150, 0, 300, 40);

            //create label in pnlSmothies for number of item
            pnlSmoothies.add(lblSmootieNumber = new JLabel(""+item, FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(0, positionY+addPositionY, 30, 30);

            //create label in pnlSmothies for name of item
            pnlSmoothies.add(lblSmootieNumber = new JLabel(""+name, FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(100, positionY+addPositionY, 200, 30);

            //create label in pnlSmothies for price of item
            pnlSmoothies.add(lblSmootieNumber = new JLabel(""+price+" €" , FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(350, positionY+addPositionY, 80, 30);

            //create txt field in pnlSmothies for count of item
            pnlSmoothies.add(txtCount = new JTextField(FlowLayout.LEFT));
            txtCount.setFont(new Font("Century Gothic", Font.BOLD, 25));
            txtCount.setBounds(450, positionY+addPositionY, 60, 30);
            txtCount.setText("1");

            //create button in pnlSmothies for send item to table (for confirm item to order)
            pnlSmoothies.add(btnSmootie = new JButton("Choose"));
            btnSmootie.setBackground(Color.green);
            btnSmootie.setForeground(Color.white);
            btnSmootie.setFont(new Font("Century Gothic", Font.BOLD, 20));
            btnSmootie.setBounds(520, positionY+addPositionY, 200, 30);
            btnSmootie.setBorderPainted(false);

            positionY=positionY+addPositionY;


            final JTextField finalTxtCount = txtCount;
            final String smootieName = name;
            final Double SmootiePrice = price;
            btnSmootie.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    count= finalTxtCount.getText();
                    finalTxtCount.setText("1");
                    sendToTable(smootieName, SmootiePrice);

                }


            });

            System.out.println("smoothie: "+name);
            System.out.println("price: "+price);
            System.out.println("item: "+item);

        }catch (Exception e){
            e.getStackTrace();
        }


    }


    //send item to order on table
    public void sendToTable(String name, Double price){
        orderPositionY=orderPositionY+32;


        JLabel lblSmootie = new JLabel("name");
        JButton btnSmootie = new JButton();

        pnlOrderedItems.setLayout(null);


        pnlOrderedItems.add(lblSmootie = new JLabel(count+"x", FlowLayout.LEFT));
        lblSmootie.setFont(new Font("Century Gothic", Font.ITALIC, 25));
        lblSmootie.setBounds(0, orderPositionY, 45, 30);

        pnlOrderedItems.add(lblSmootie = new JLabel(""+name, FlowLayout.LEFT));
        lblSmootie.setFont(new Font("Century Gothic", Font.ITALIC, 25));
        lblSmootie.setBounds(65, orderPositionY, 200, 30);

        pnlOrderedItems.add(lblSmootie = new JLabel(""+price+" €", FlowLayout.LEFT));
        lblSmootie.setFont(new Font("Century Gothic", Font.ITALIC, 25));
        lblSmootie.setBounds(280, orderPositionY, 80, 30);

        pnlOrderedItems.add(btnSmootie = new JButton("THROW"));
        btnSmootie.setBackground(Color.red);
        btnSmootie.setFont(new Font("Century Gothic", Font.BOLD, 20));
        btnSmootie.setForeground(Color.white);
        btnSmootie.setBounds(410, orderPositionY, 200, 30);
        btnSmootie.setBorderPainted(false);

        final JButton finalBtnSmootie = btnSmootie;
        final JLabel finalLblSmootie = lblSmootie;
        btnSmootie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }

    public JPanel getPnlSmoothies() {
        return pnlSmoothies;
    }

    }








