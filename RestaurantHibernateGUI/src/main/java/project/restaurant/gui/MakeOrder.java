package project.restaurant.gui;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import project.restaurant.hibernate.Drink;
import project.restaurant.hibernate.Food;
import project.restaurant.hibernate.HibernateUtil;

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
    private JPanel pnlAppertizer;
    private JPanel pnlSoup;
    private JPanel pnlMainDish;
    private JPanel pnlSalad;
    private JPanel pnlDessert;
    private JPanel pnlWine;
    private JLabel lblTotalPrice;
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
    double countPrice;
    int countItem=0;
    double totalPrice;


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
        Query qry=se.createQuery("from Drink where type='Smoothies' and active=true");
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
        Query qry=se.createQuery("from Drink where type='HotDrinks' and active=true");
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
        Query qry=se.createQuery("from Drink where type='IceDrinks' and active=true");
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
        Query qry=se.createQuery("from Drink where type='Beer' and active=true");
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
        Query qry=se.createQuery("from Drink where type='Cocktails' and active=true");
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
        Query qry=se.createQuery("from Drink where type='Wine' and active=true");
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
        Query qry=se.createQuery("from Drink where type='Sprites' and active=true");
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

    public void getFoodAppetizer()
    {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
        se.beginTransaction();
        Query qry=se.createQuery("from Food where type='Appetizer' and active=true");
        List<Food> foodAppetizer=(List<Food>)qry.list();
        se.getTransaction().commit();
        se.close();
        for(Food f : foodAppetizer)
        {

            item=f.getId();
            name=f.getName();
            price=f.getPrice();
            getAppertizerButtons(name, price, item);
            //System.out.println(d.getName());
            //System.out.println(d.getPrice());
        }


    }

    public void getFoodSoup()
    {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
        se.beginTransaction();
        Query qry=se.createQuery("from Food where type='Soup' and active=true");
        List<Food> foodSoup=(List<Food>)qry.list();
        se.getTransaction().commit();
        se.close();
        for(Food f : foodSoup)
        {

            item=f.getId();
            name=f.getName();
            price=f.getPrice();
            getSoupButtons(name, price, item);
            //System.out.println(d.getName());
            //System.out.println(d.getPrice());
        }


    }

    public void getFoodSalad()
    {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
        se.beginTransaction();
        Query qry=se.createQuery("from Food where type='Salad' and active=true");
        List<Food> foodSalad=(List<Food>)qry.list();
        se.getTransaction().commit();
        se.close();
        for(Food g : foodSalad)
        {

            item=g.getId();
            name=g.getName();
            price=g.getPrice();
            getSaladButtons(name, price, item);
            //System.out.println(d.getName());
            //System.out.println(d.getPrice());
        }


    }

    public void getFoodDesert()
    {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
        se.beginTransaction();
        Query qry=se.createQuery("from Food where type='Desert' and active=true");
        List<Food> foodDesert=(List<Food>)qry.list();
        se.getTransaction().commit();
        se.close();
        for(Food g : foodDesert)
        {

            item=g.getId();
            name=g.getName();
            price=g.getPrice();
            getDessertButtons(name, price, item);
            //System.out.println(d.getName());
            //System.out.println(d.getPrice());
        }


    }

    public void getFoodMainDish()
    {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
        se.beginTransaction();
        Query qry=se.createQuery("from Food where type='MainDish' and active=true");
        List<Food> foodMainDish=(List<Food>)qry.list();
        se.getTransaction().commit();
        se.close();
        for(Food g : foodMainDish)
        {

            item=g.getId();
            name=g.getName();
            price=g.getPrice();
            getMainDishButtons(name, price, item);
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
                else if (state == "StateAppertizer" || state == "StateSoup" || state == "StateDessert" || state == "StateMainDish" || state == "StateSalad"){
                    StateMeal();
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
        btnAppetizer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Appertizer();
                getFoodAppetizer();
            }
        });
        btnSoup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Soup();
                getFoodSoup();
            }
        });
        btnMainDish.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainDish();
                getFoodMainDish();
            }
        });
        btnSalad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Salad();
                getFoodSalad();
            }
        });
        btnDessert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Dessert();
                getFoodDesert();
            }
        });
        btnConfirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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
        pnlWine.setVisible(false);
        pnlAppertizer.setVisible(false);
        pnlSoup.setVisible(false);
        pnlMainDish.setVisible(false);
        pnlSalad.setVisible(false);
        pnlDessert.setVisible(false);
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
        pnlAppertizer.setVisible(false);
        pnlSoup.setVisible(false);
        pnlMainDish.setVisible(false);
        pnlSalad.setVisible(false);
        pnlDessert.setVisible(false);
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
        pnlWine.setVisible(false);
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
        pnlWine.setVisible(true);
    }

    public void Appertizer(){
        state = "StateAppertizer";
        pnlMealType.setVisible(false);
        pnlMealCategory.setVisible(false);
        pnlAppertizer.setVisible(true);
    }

    public void Soup(){
        state = "StateSoup";
        pnlMealType.setVisible(false);
        pnlMealCategory.setVisible(false);
        pnlSoup.setVisible(true);
    }

    public void MainDish(){
        state = "StateMainDish";
        pnlMealType.setVisible(false);
        pnlMealCategory.setVisible(false);
        pnlMainDish.setVisible(true);
    }

    public void Salad(){
        state = "StateSalad";
        pnlMealType.setVisible(false);
        pnlMealCategory.setVisible(false);
        pnlSalad.setVisible(true);
    }

    public void Dessert(){
        state = "StateDessert";
        pnlMealType.setVisible(false);
        pnlMealCategory.setVisible(false);
        pnlDessert.setVisible(true);
    }

    public void getDessertButtons(String name, Double price, long item){

        try{
            JLabel lblSmootieNumber = new JLabel("name"); //create label
            JButton btnSmootie = new JButton(); //create button
            JTextField txtCount = new JTextField(); //create text field

            pnlDessert.setLayout(null);

            //lblSmoothiesHead.setBounds(150, 0, 300, 40);

            //create label in pnlSmothies for number of item
            pnlDessert.add(lblSmootieNumber = new JLabel(""+item, FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(0, positionY+addPositionY, 30, 30);

            //create label in pnlSmothies for name of item
            pnlDessert.add(lblSmootieNumber = new JLabel(""+name, FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(100, positionY+addPositionY, 200, 30);

            //create label in pnlSmothies for price of item
            pnlDessert.add(lblSmootieNumber = new JLabel(""+price+" €" , FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(350, positionY+addPositionY, 80, 30);

            //create txt field in pnlSmothies for count of item
            pnlDessert.add(txtCount = new JTextField(FlowLayout.LEFT));
            txtCount.setFont(new Font("Century Gothic", Font.BOLD, 25));
            txtCount.setBounds(450, positionY+addPositionY, 60, 30);
            txtCount.setText("1");

            //create button in pnlSmothies for send item to table (for confirm item to order)
            pnlDessert.add(btnSmootie = new JButton("Choose"));
            btnSmootie.setBackground(new Color(133,147,49));
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
                    int countX;
                    count= finalTxtCount.getText();
                    countX = Integer.parseInt(count);
                    System.out.println(countX+" ---POCET");

                    if (countX > 50){
                        JOptionPane.showMessageDialog(null, "Max quantity of item can be 50 !");
                    }else{
                        countItem++;
                        sendToTable(smootieName, SmootiePrice);
                    }

                    finalTxtCount.setText("1");

                }


            });

            System.out.println("smoothie: "+name);
            System.out.println("price: "+price);
            System.out.println("item: "+item);

        }catch (Exception e){
            e.getStackTrace();
        }

    }

    public void getSaladButtons(String name, Double price, long item){

        try{
            JLabel lblSmootieNumber = new JLabel("name"); //create label
            JButton btnSmootie = new JButton(); //create button
            JTextField txtCount = new JTextField(); //create text field

            pnlSalad.setLayout(null);

            //lblSmoothiesHead.setBounds(150, 0, 300, 40);

            //create label in pnlSmothies for number of item
            pnlSalad.add(lblSmootieNumber = new JLabel(""+item, FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(0, positionY+addPositionY, 30, 30);

            //create label in pnlSmothies for name of item
            pnlSalad.add(lblSmootieNumber = new JLabel(""+name, FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(100, positionY+addPositionY, 200, 30);

            //create label in pnlSmothies for price of item
            pnlSalad.add(lblSmootieNumber = new JLabel(""+price+" €" , FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(350, positionY+addPositionY, 80, 30);

            //create txt field in pnlSmothies for count of item
            pnlSalad.add(txtCount = new JTextField(FlowLayout.LEFT));
            txtCount.setFont(new Font("Century Gothic", Font.BOLD, 25));
            txtCount.setBounds(450, positionY+addPositionY, 60, 30);
            txtCount.setText("1");

            //create button in pnlSmothies for send item to table (for confirm item to order)
            pnlSalad.add(btnSmootie = new JButton("Choose"));
            btnSmootie.setBackground(new Color(133,147,49));
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
                    int countX;
                    count= finalTxtCount.getText();
                    countX = Integer.parseInt(count);
                    System.out.println(countX+" ---POCET");

                    if (countX > 50){
                        JOptionPane.showMessageDialog(null, "Max quantity of item can be 50 !");
                    }else{
                        countItem++;
                        sendToTable(smootieName, SmootiePrice);
                    }

                    finalTxtCount.setText("1");

                }


            });

            System.out.println("smoothie: "+name);
            System.out.println("price: "+price);
            System.out.println("item: "+item);

        }catch (Exception e){
            e.getStackTrace();
        }

    }

    public void getMainDishButtons(String name, Double price, long item){

        try{
            JLabel lblSmootieNumber = new JLabel("name"); //create label
            JButton btnSmootie = new JButton(); //create button
            JTextField txtCount = new JTextField(); //create text field

            pnlMainDish.setLayout(null);

            //lblSmoothiesHead.setBounds(150, 0, 300, 40);

            //create label in pnlSmothies for number of item
            pnlMainDish.add(lblSmootieNumber = new JLabel(""+item, FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(0, positionY+addPositionY, 30, 30);

            //create label in pnlSmothies for name of item
            pnlMainDish.add(lblSmootieNumber = new JLabel(""+name, FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(100, positionY+addPositionY, 200, 30);

            //create label in pnlSmothies for price of item
            pnlMainDish.add(lblSmootieNumber = new JLabel(""+price+" €" , FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(350, positionY+addPositionY, 80, 30);

            //create txt field in pnlSmothies for count of item
            pnlMainDish.add(txtCount = new JTextField(FlowLayout.LEFT));
            txtCount.setFont(new Font("Century Gothic", Font.BOLD, 25));
            txtCount.setBounds(450, positionY+addPositionY, 60, 30);
            txtCount.setText("1");

            //create button in pnlSmothies for send item to table (for confirm item to order)
            pnlMainDish.add(btnSmootie = new JButton("Choose"));
            btnSmootie.setBackground(new Color(133,147,49));
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
                    int countX;
                    count= finalTxtCount.getText();
                    countX = Integer.parseInt(count);
                    System.out.println(countX+" ---POCET");

                    if (countX > 50){
                        JOptionPane.showMessageDialog(null, "Max quantity of item can be 50 !");
                    }else{
                        countItem++;
                        sendToTable(smootieName, SmootiePrice);
                    }

                    finalTxtCount.setText("1");
                }


            });

            System.out.println("smoothie: "+name);
            System.out.println("price: "+price);
            System.out.println("item: "+item);

        }catch (Exception e){
            e.getStackTrace();
        }

    }

    public void getSoupButtons(String name, Double price, long item){

        try{
            JLabel lblSmootieNumber = new JLabel("name"); //create label
            JButton btnSmootie = new JButton(); //create button
            JTextField txtCount = new JTextField(); //create text field

            pnlSoup.setLayout(null);

            //lblSmoothiesHead.setBounds(150, 0, 300, 40);

            //create label in pnlSmothies for number of item
            pnlSoup.add(lblSmootieNumber = new JLabel(""+item, FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(0, positionY+addPositionY, 30, 30);

            //create label in pnlSmothies for name of item
            pnlSoup.add(lblSmootieNumber = new JLabel(""+name, FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(100, positionY+addPositionY, 200, 30);

            //create label in pnlSmothies for price of item
            pnlSoup.add(lblSmootieNumber = new JLabel(""+price+" €" , FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(350, positionY+addPositionY, 80, 30);

            //create txt field in pnlSmothies for count of item
            pnlSoup.add(txtCount = new JTextField(FlowLayout.LEFT));
            txtCount.setFont(new Font("Century Gothic", Font.BOLD, 25));
            txtCount.setBounds(450, positionY+addPositionY, 60, 30);
            txtCount.setText("1");

            //create button in pnlSmothies for send item to table (for confirm item to order)
            pnlSoup.add(btnSmootie = new JButton("Choose"));
            btnSmootie.setBackground(new Color(133,147,49));
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
                    int countX;
                    count= finalTxtCount.getText();
                    countX = Integer.parseInt(count);
                    System.out.println(countX+" ---POCET");

                    if (countX > 50){
                        JOptionPane.showMessageDialog(null, "Max quantity of item can be 50 !");
                    }else{
                        countItem++;
                        sendToTable(smootieName, SmootiePrice);
                    }

                    finalTxtCount.setText("1");

                }


            });

            System.out.println("smoothie: "+name);
            System.out.println("price: "+price);
            System.out.println("item: "+item);

        }catch (Exception e){
            e.getStackTrace();
        }

    }

    public void getAppertizerButtons(String name, Double price, long item){

        try{
            JLabel lblSmootieNumber = new JLabel("name"); //create label
            JButton btnSmootie = new JButton(); //create button
            JTextField txtCount = new JTextField(); //create text field

            pnlAppertizer.setLayout(null);

            //lblSmoothiesHead.setBounds(150, 0, 300, 40);

            //create label in pnlSmothies for number of item
            pnlAppertizer.add(lblSmootieNumber = new JLabel(""+item, FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(0, positionY+addPositionY, 30, 30);

            //create label in pnlSmothies for name of item
            pnlAppertizer.add(lblSmootieNumber = new JLabel(""+name, FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(100, positionY+addPositionY, 200, 30);

            //create label in pnlSmothies for price of item
            pnlAppertizer.add(lblSmootieNumber = new JLabel(""+price+" €" , FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(350, positionY+addPositionY, 80, 30);

            //create txt field in pnlSmothies for count of item
            pnlAppertizer.add(txtCount = new JTextField(FlowLayout.LEFT));
            txtCount.setFont(new Font("Century Gothic", Font.BOLD, 25));
            txtCount.setBounds(450, positionY+addPositionY, 60, 30);
            txtCount.setText("1");

            //create button in pnlSmothies for send item to table (for confirm item to order)
            pnlAppertizer.add(btnSmootie = new JButton("Choose"));
            btnSmootie.setBackground(new Color(133,147,49));
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
                    int countX;
                    count= finalTxtCount.getText();
                    countX = Integer.parseInt(count);
                    System.out.println(countX+" ---POCET");

                    if (countX > 50){
                        JOptionPane.showMessageDialog(null, "Max quantity of item can be 50 !");
                    }else{
                        countItem++;
                        sendToTable(smootieName, SmootiePrice);
                    }

                    finalTxtCount.setText("1");

                }


            });

            System.out.println("smoothie: "+name);
            System.out.println("price: "+price);
            System.out.println("item: "+item);

        }catch (Exception e){
            e.getStackTrace();
        }

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
            btnSmootie.setBackground(new Color(133,147,49));
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
                    int countX;
                    count= finalTxtCount.getText();
                    countX = Integer.parseInt(count);
                    System.out.println(countX+" ---POCET");

                    if (countX > 50){
                        JOptionPane.showMessageDialog(null, "Max quantity of item can be 50 !");
                    }else{
                        countItem++;
                        sendToTable(smootieName, SmootiePrice);
                    }

                    finalTxtCount.setText("1");
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

            pnlWine.setLayout(null);

            //lblSmoothiesHead.setBounds(150, 0, 300, 40);

            //create label in pnlSmothies for number of item
            pnlWine.add(lblSmootieNumber = new JLabel(""+item, FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(0, positionY+addPositionY, 30, 30);

            //create label in pnlSmothies for name of item
            pnlWine.add(lblSmootieNumber = new JLabel(""+name, FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(100, positionY+addPositionY, 200, 30);

            //create label in pnlSmothies for price of item
            pnlWine.add(lblSmootieNumber = new JLabel(""+price+" €" , FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(350, positionY+addPositionY, 80, 30);

            //create txt field in pnlSmothies for count of item
            pnlWine.add(txtCount = new JTextField(FlowLayout.LEFT));
            txtCount.setFont(new Font("Century Gothic", Font.BOLD, 25));
            txtCount.setBounds(450, positionY+addPositionY, 60, 30);
            txtCount.setText("1");

            //create button in pnlSmothies for send item to table (for confirm item to order)
            pnlWine.add(btnSmootie = new JButton("Choose"));
            btnSmootie.setBackground(new Color(133,147,49));
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
                    int countX;
                    count= finalTxtCount.getText();
                    countX = Integer.parseInt(count);
                    System.out.println(countX+" ---POCET");

                    if (countX > 50){
                        JOptionPane.showMessageDialog(null, "Max quantity of item can be 50 !");
                    }else{
                        countItem++;
                        sendToTable(smootieName, SmootiePrice);
                    }

                    finalTxtCount.setText("1");
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
            btnSmootie.setBackground(new Color(133,147,49));
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
                    int countX;
                    count= finalTxtCount.getText();
                    countX = Integer.parseInt(count);
                    System.out.println(countX+" ---POCET");

                    if (countX > 50){
                        JOptionPane.showMessageDialog(null, "Max quantity of item can be 50 !");
                    }else{
                        countItem++;
                        sendToTable(smootieName, SmootiePrice);
                    }

                    finalTxtCount.setText("1");
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
            btnSmootie.setBackground(new Color(133,147,49));
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
                    int countX;
                    count= finalTxtCount.getText();
                    countX = Integer.parseInt(count);
                    System.out.println(countX+" ---POCET");

                    if (countX > 50){
                        JOptionPane.showMessageDialog(null, "Max quantity of item can be 50 !");
                    }else{
                        countItem++;
                        sendToTable(smootieName, SmootiePrice);
                    }

                    finalTxtCount.setText("1");

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
            btnSmootie.setBackground(new Color(133,147,49));
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
                    int countX;
                    count= finalTxtCount.getText();
                    countX = Integer.parseInt(count);
                    System.out.println(countX+" ---POCET");

                    if (countX > 50){
                        JOptionPane.showMessageDialog(null, "Max quantity of item can be 50 !");
                    }else{
                        countItem++;
                        sendToTable(smootieName, SmootiePrice);
                    }

                    finalTxtCount.setText("1");
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
            btnSmootie.setBackground(new Color(133,147,49));
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
                    int countX;
                    count= finalTxtCount.getText();
                    countX = Integer.parseInt(count);
                    System.out.println(countX+" ---POCET");

                    if (countX > 50){
                        JOptionPane.showMessageDialog(null, "Max quantity of item can be 50 !");
                    }else{
                        countItem++;
                        sendToTable(smootieName, SmootiePrice);
                    }

                    finalTxtCount.setText("1");

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
            btnSmootie.setBackground(new Color(133,147,49));
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
                    int countX;
                    count= finalTxtCount.getText();
                    countX = Integer.parseInt(count);
                    System.out.println(countX+" ---POCET");

                    if (countX > 50){
                        JOptionPane.showMessageDialog(null, "Max quantity of item can be 50 !");
                    }else{
                        countItem++;
                        sendToTable(smootieName, SmootiePrice);
                    }

                    finalTxtCount.setText("1");
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
    public void sendToTable(final String name, Double price){
        orderPositionY=orderPositionY+32;

        int numberOfItem = Integer.parseInt(count);
        countPrice=numberOfItem*price;
        totalPrice=totalPrice+countPrice;
        System.out.println("TOTAL PRICE IS : "+totalPrice);
        //lblTotalPrice.setPreferredSize(new Dimension(800,80));// Width, Height
        lblTotalPrice.setText("Price: "+Double.toString(totalPrice)+" €");
        JLabel lblCount = new JLabel("name");
        JLabel lblName = new JLabel("name");
        JLabel lblPrice= new JLabel("name");
        JButton btnChoose = new JButton();
        JButton btnUndo = new JButton();

        pnlOrderedItems.setLayout(null);

        if (countItem<31)
        {
            pnlOrderedItems.add(lblCount = new JLabel(count+"x", FlowLayout.LEFT));
            lblCount.setFont(new Font("Century Gothic", Font.ITALIC, 25));
            lblCount.setBounds(10, orderPositionY, 45, 30);

            pnlOrderedItems.add(lblName = new JLabel(""+name, FlowLayout.LEFT));
            lblName.setFont(new Font("Century Gothic", Font.ITALIC, 25));
            lblName.setBounds(65, orderPositionY, 200, 30);

            pnlOrderedItems.add(lblPrice = new JLabel(""+countPrice+" €", FlowLayout.LEFT));
            lblPrice.setFont(new Font("Century Gothic", Font.ITALIC, 25));
            lblPrice.setBounds(280, orderPositionY, 100, 30);

            pnlOrderedItems.add(btnChoose = new JButton("THROW"));
            btnChoose.setBackground(new Color(254,151,44));
            btnChoose.setFont(new Font("Century Gothic", Font.BOLD, 17));
            btnChoose.setForeground(Color.white);
            btnChoose.setBorderPainted(false);
            btnChoose.setBounds(410, orderPositionY, 100, 30);

            pnlOrderedItems.add(btnUndo = new JButton("UNDO"));
            btnUndo.setBackground(new Color(133,147,49));
            btnUndo.setFont(new Font("Century Gothic", Font.BOLD, 17));
            btnUndo.setForeground(Color.white);
            btnUndo.setBorderPainted(false);
            btnUndo.setEnabled(false);
            btnUndo.setBounds(520, orderPositionY, 100, 30);

        }else{
            JOptionPane.showMessageDialog(null, "Max quantity of ordered item in one time can be 30 !");
            countItem=30;
        }


        final JLabel finalLblCount = lblCount;
        final JLabel finalLblName = lblName;
        final JLabel finalLblPrice = lblPrice;
        final JButton finalBtnChoose = btnChoose;
        final JButton finalBtnUndo = btnUndo;
        btnChoose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throwItem(finalLblCount, finalLblName, finalLblPrice, finalBtnChoose, finalBtnUndo);
            }
        });

        final JButton finalBtnUndo1 = btnUndo;
        btnUndo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                undoItem(finalLblCount, finalLblName, finalLblPrice, finalBtnChoose, finalBtnUndo1);
            }
        });
    }

    public void throwItem(JLabel lblCount, JLabel lblName, JLabel lblPrice, JButton btnThrow, JButton btnUndo) {

        totalPrice=totalPrice-countPrice;
        lblTotalPrice.setText("Price: "+String.valueOf(totalPrice)+" €");
        lblCount.setForeground(Color.red);
        lblName.setForeground(Color.red);
        lblPrice.setForeground(Color.red);
        btnThrow.setText("Deleted");
        btnThrow.setEnabled(false);
        btnUndo.setEnabled(true);

    }

    public void undoItem(JLabel lblCount, JLabel lblName, JLabel lblPrice, JButton btnThrow, JButton btnUndo){
        totalPrice=totalPrice+countPrice;
        lblTotalPrice.setText("Price: "+String.valueOf(totalPrice)+" €");
        lblCount.setForeground(Color.black);
        lblName.setForeground(Color.black);
        lblPrice.setForeground(Color.black);
        btnThrow.setText("THROW");
        btnThrow.setEnabled(true);
        btnUndo.setEnabled(false);
    }


}