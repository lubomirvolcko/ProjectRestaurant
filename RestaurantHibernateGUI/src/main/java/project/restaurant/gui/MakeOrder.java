package project.restaurant.gui;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import project.restaurant.hibernate.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
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
    private String btnChooseHistory="false";
    double finalPrice=0;


    public JLabel getLblTotalPrice() {
        return lblTotalPrice;
    }

    private JLabel lblTotalPrice;

    public JPanel getPnlItemOnTable() {
        return pnlItemOnTable;
    }

    private JPanel pnlItemOnTable;
    private JButton btnPayment;
    private JTextField txtSearch;
    private JPanel pnlSearched;
    private JButton btn;
    private JScrollPane pnlScrollOrderedItems;
    public String state; //use in btnBack for set panels
    String name; //use for name of item
    Double price; //use for price of item
    long item; //use for id of item
    int positionY = 120; //use for position Y for generated labels and buttons for example btnSmootie
    int addPositionY = 50; //use for position Y for generated labels and buttons for example btnSmootie
    int orderPositionY=0; //use for position Y for generated labels and buttons for example btnSmootie
    String count=""; //use for count of items in txtCount
    double countPrice; //use for count total price in order
    int countItem=0; //use for counting added items to order
    double totalPrice; //total price in order
    String orderHistory="false"; //use for seting order history after pressed btnConfirm
    int countX;
    ArrayList<Order> orderArrayList;
    int makeOrderIdTable;
    String historyTable1;
    String historyTable2;
    String historyTable3;
    String historyTable4;
    String historyTable5;
    String historyTable6;
    String historyTable7;
    String historyTable8;
    Double paymentPrice=0.0;
    String userName;

    UserAccount userAccount = new UserAccount();



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


    public ArrayList<Order> getOrderArrayList() {
        return orderArrayList;
    }

    public void getOrderArray(ArrayList<Order> orderArray){
        orderArrayList=orderArray;


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
        }
    }

    public void getFoodAppetizer()
    {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
        se.beginTransaction();
        Query qry=se.createQuery("from Food where type='Appetizer' and active=1");
        List<Food> foodAppetizer=(List<Food>)qry.list();
        se.getTransaction().commit();
        se.close();
        for(Food f : foodAppetizer)
        {
            item=f.getId();
            name=f.getName();
            price=f.getPrice();
            getAppertizerButtons(name, price, item);
        }
    }

    public void getFoodSoup()
    {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
        se.beginTransaction();
        Query qry=se.createQuery("from Food where type='Soup' and active=1");
        List<Food> foodSoup=(List<Food>)qry.list();
        se.getTransaction().commit();
        se.close();
        for(Food f : foodSoup)
        {
            item=f.getId();
            name=f.getName();
            price=f.getPrice();
            getSoupButtons(name, price, item);
        }
    }

    public void getFoodSalad()
    {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
        se.beginTransaction();
        Query qry=se.createQuery("from Food where type='Salad' and active=1");
        List<Food> foodSalad=(List<Food>)qry.list();
        se.getTransaction().commit();
        se.close();
        for(Food g : foodSalad)
        {
            item=g.getId();
            name=g.getName();
            price=g.getPrice();
            getSaladButtons(name, price, item);
        }
    }

    public void getFoodDesert()
    {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
        se.beginTransaction();
        Query qry=se.createQuery("from Food where type='Desert' and active=1");
        List<Food> foodDesert=(List<Food>)qry.list();
        se.getTransaction().commit();
        se.close();
        for(Food g : foodDesert)
        {
            item=g.getId();
            name=g.getName();
            price=g.getPrice();
            getDessertButtons(name, price, item);
        }
    }

    public void getFoodMainDish()
    {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
        se.beginTransaction();
        Query qry=se.createQuery("from Food where type='MainDish' and active=1");
        List<Food> foodMainDish=(List<Food>)qry.list();
        se.getTransaction().commit();
        se.close();
        for(Food g : foodMainDish)
        {
            item=g.getId();
            name=g.getName();
            price=g.getPrice();
            getMainDishButtons(name, price, item);
        }
    }

    public MakeOrder() {
        setPanels();

        pnlMakeOrder.setSize(500, 500);

        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                orderPositionY=0;
                btnChooseHistory="false";
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
                }else if(state == "StateSearch"){
                    StateMakeorder();
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

                orderPositionY=0;
                btnChooseHistory="false";
                setOrderHistory();

                JComponent comp = (JComponent) e.getSource();
                Window win = SwingUtilities.getWindowAncestor(comp); //get top window
                win.dispose();
            }
        });
        btnPayment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openPayment(e);
            }
        });
        /*txtSearch.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                String st = txtSearch.getText().trim();
                System.out.println("KEY LISTENER: "+st);
                StateSearch();
                getSearched(st);

            }
        });*/
    }

    public void getSearched(String st) {
        String itemName;
        Double itemPrice;

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
        se.beginTransaction();
        Query qry=se.createQuery("from item where name like '"+st+"%'");
        List<ItemSearch> itemList=(List<ItemSearch>)qry.list();
        se.getTransaction().commit();
        se.close();
        for(ItemSearch d : itemList)
        {
            System.out.println("FOR: "+d);
            itemName=d.getItemName();
            itemPrice=d.getItemPrice();
            getSearchedItems(itemName, itemPrice);
        }
    }

    public void getSearchedItems(String itemName, Double itemPrice) {
        try{
            System.out.println("GET SEARCHED ITEMS");
            JLabel lblSmootieNumber = new JLabel("name"); //create label
            JButton btnSmootie = new JButton(); //create button
            JTextField txtCount = new JTextField(); //create text field

            pnlSearched.setLayout(null);


            //create label in pnlSmothies for name of item
            pnlSearched.add(lblSmootieNumber = new JLabel(""+itemName, FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(100, positionY+addPositionY, 200, 30);

            //create label in pnlSmothies for price of item
            pnlSearched.add(lblSmootieNumber = new JLabel(""+itemPrice+" €" , FlowLayout.LEFT));
            lblSmootieNumber.setFont(new Font("Century Gothic", Font.BOLD, 25));
            lblSmootieNumber.setBounds(350, positionY+addPositionY, 80, 30);

            //create txt field in pnlSmothies for count of item
            pnlSearched.add(txtCount = new JTextField(FlowLayout.LEFT));
            txtCount.setFont(new Font("Century Gothic", Font.BOLD, 25));
            txtCount.setBounds(450, positionY+addPositionY, 60, 30);
            txtCount.setText("1");

            //create button in pnlSmothies for send item to table (for confirm item to order)
            pnlSearched.add(btnSmootie = new JButton("Choose"));
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
                    count= finalTxtCount.getText();
                    countX = Integer.parseInt(count);

                    if (countX > 50){
                        //JOptionPane.showMessageDialog(null, "Max quantity of item can be 50 !");
                    }else{
                        int numberOfItem;
                        numberOfItem=Integer.parseInt(finalTxtCount.getText());

                        //countItem++;
                        sendToOrder(numberOfItem, SmootiePrice, smootieName, countItem);
                        sendToTable(smootieName, SmootiePrice);
                    }

                    finalTxtCount.setText("1");

                }


            });

        }catch (Exception e){
            e.getStackTrace();
        }
    }


    private JFrame openPayment(ActionEvent e) {
        Payment payment = new Payment(userAccount.userName ,userAccount.getOrderArray(),makeOrderIdTable);

        JFrame paymentFrame = new JFrame();
        paymentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        paymentFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        paymentFrame.setUndecorated(true);
        paymentFrame.setContentPane(payment.getPnlPayment());
        paymentFrame.setVisible(true);

        JLabel lblPaymentCount = new JLabel("name");
        JLabel lblPaymentX = new JLabel("name");
        JLabel lblPaymentName = new JLabel("name");
        JLabel lblPaymentPrice = new JLabel("name");
        JLabel lblPaymentEuro = new JLabel("name");
        Font font = new Font("Century Gothic", Font.BOLD, 26);


        orderPositionY=0;

        int sizeOfArray=userAccount.orderArray.size();
        for (int x=0;x<sizeOfArray;x++) {


                System.out.println("MAKE ORDER "+x+": "+userAccount.orderArray.get(x).getNumberOfItem()+" - "+userAccount.orderArray.get(x).getNameItem()+" - "+
                        +userAccount.orderArray.get(x).getPrice()+" - " +userAccount.orderArray.get(x).getTotalPrice()+" - "+userAccount.orderArray.get(x).getIdTable());


            System.out.println("MAKEORDERID "+makeOrderIdTable+" --------------------------");
            System.out.println("ID TABLE IN ARRAY: "+userAccount.orderArray.get(x).getIdTable());

            if ((userAccount.orderArray.get(x).getNumberOfItem() != 0) /* && (userAccount.orderArray.get(x).getNumberOfItem()==makeOrderIdTable)*/) {
                orderPositionY=orderPositionY+30;
                finalPrice=finalPrice+userAccount.orderArray.get(x).getTotalPrice();
                paymentPrice=finalPrice;

                payment.getPnlPaymentItems().setLayout(null);

                payment.getPnlPaymentItems().add(lblPaymentCount = new JLabel("" + userAccount.orderArray.get(x).getNumberOfItem(), FlowLayout.LEFT));
                lblPaymentCount.setFont(font);
                lblPaymentCount.setBounds(10, orderPositionY, 45, 30);

                payment.getPnlPaymentItems().add(lblPaymentX = new JLabel("x", FlowLayout.LEFT));
                lblPaymentX.setFont(font);
                lblPaymentX.setBounds(55, orderPositionY, 20, 30);

                payment.getPnlPaymentItems().add(lblPaymentName = new JLabel("" + userAccount.orderArray.get(x).getNameItem(), FlowLayout.LEFT));
                lblPaymentName.setFont(font);
                lblPaymentName.setBounds(85, orderPositionY, 200, 30);

                payment.getPnlPaymentItems().add(lblPaymentPrice = new JLabel("" + userAccount.orderArray.get(x).getTotalPrice(), FlowLayout.LEFT));
                lblPaymentPrice.setFont(font);
                lblPaymentPrice.setBounds(295, orderPositionY, 100, 30);

                payment.getPnlPaymentItems().add(lblPaymentEuro = new JLabel("€", FlowLayout.LEFT));
                lblPaymentEuro.setFont(font);
                lblPaymentEuro.setBounds(405, orderPositionY, 30, 30);
            }

            payment.getLblFinalPrice().setText("Final price : "+String.valueOf(finalPrice));


            JComponent comp = (JComponent) e.getSource();
            Window win = SwingUtilities.getWindowAncestor(comp); //get top window
            win.dispose();
        }
        return paymentFrame;
    }


    public void setOrderHistory(){
        switch (makeOrderIdTable){
            case 1: historyTable1="true"; break;
            case 2: historyTable2="true"; break;
            case 3: historyTable3="true"; break;
            case 4: historyTable4="true"; break;
            case 5: historyTable5="true"; break;
            case 6: historyTable6="true"; break;
            case 7: historyTable7="true"; break;
            case 8: historyTable8="true"; break;
        }
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
        pnlSearched.setVisible(false);
    }


    public void StateMakeorder() {
        pnlSoftDrinks.setVisible(false);
        pnlMainCategory.setVisible(true);
        pnlMealType.setVisible(false);
        btnBack.setEnabled(false);
        pnlSearched.setVisible(false);
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
        pnlSearched.setVisible(false);
    }

    public void StateSearch(){
        state = "StateSearch";
        pnlMainCategory.setVisible(false);
        pnlMealType.setVisible(false);
        pnlMealCategory.setVisible(false);
        pnlDrinksCategory.setVisible(false);
        btnBack.setEnabled(true);
        pnlSoftDrinks.setVisible(false);
        pnlAppertizer.setVisible(false);
        pnlSoup.setVisible(false);
        pnlMainDish.setVisible(false);
        pnlSalad.setVisible(false);
        pnlDessert.setVisible(false);
        pnlSearched.setVisible(true);
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
        pnlSearched.setVisible(false);
    }

    public void SoftDrinks(){
        state = "StateSoftDrinks";
        pnlDrinksCategory.setVisible(false);
        pnlMealType.setVisible(false);
        pnlSoftDrinks.setVisible(true);
        pnlSmoothies.setVisible(false);
        pnlHotDrinks.setVisible(false);
        pnlIceDrinks.setVisible(false);
        pnlSearched.setVisible(false);
    }

    public void Smoothies(){
        state = "StateSmoothies";
        pnlSoftDrinks.setVisible(false);
        pnlSmoothies.setVisible(true);
        pnlSearched.setVisible(false);
    }

    public void HotDrinks(){
        state = "StateHotDrinks";
        pnlSoftDrinks.setVisible(false);
        pnlHotDrinks.setVisible(true);
        pnlSearched.setVisible(false);
    }

    public void IceDrinks(){
        state = "StateIceDrinks";
        pnlSoftDrinks.setVisible(false);
        pnlIceDrinks.setVisible(true);
        pnlSearched.setVisible(false);
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
        pnlSearched.setVisible(false);
    }

    public void Beers(){
        state = "StateBeers";
        pnlAlcoholDrinks.setVisible(false);
        pnlBeers.setVisible(true);
        pnlSearched.setVisible(false);
    }

    public void Cocktails(){
        state = "StateCocktails";
        pnlAlcoholDrinks.setVisible(false);
        pnlCocktails.setVisible(true);
        pnlSearched.setVisible(false);
    }

    public void Spirits(){
        state = "StateSpirits";
        pnlAlcoholDrinks.setVisible(false);
        pnlSpirits.setVisible(true);
        pnlSearched.setVisible(false);
    }

    public void Wines(){
        state = "StateWines";
        pnlAlcoholDrinks.setVisible(false);
        pnlWine.setVisible(true);
        pnlSearched.setVisible(false);
    }

    public void Appertizer(){
        state = "StateAppertizer";
        pnlMealType.setVisible(false);
        pnlMealCategory.setVisible(false);
        pnlAppertizer.setVisible(true);
        pnlSearched.setVisible(false);
    }

    public void Soup(){
        state = "StateSoup";
        pnlMealType.setVisible(false);
        pnlMealCategory.setVisible(false);
        pnlSoup.setVisible(true);
        pnlSearched.setVisible(false);
    }

    public void MainDish(){
        state = "StateMainDish";
        pnlMealType.setVisible(false);
        pnlMealCategory.setVisible(false);
        pnlMainDish.setVisible(true);
        pnlSearched.setVisible(false);
    }

    public void Salad(){
        state = "StateSalad";
        pnlMealType.setVisible(false);
        pnlMealCategory.setVisible(false);
        pnlSalad.setVisible(true);
        pnlSearched.setVisible(false);
    }

    public void Dessert(){
        state = "StateDessert";
        pnlMealType.setVisible(false);
        pnlMealCategory.setVisible(false);
        pnlDessert.setVisible(true);
        pnlSearched.setVisible(false);
    }

    public void getDessertButtons(String name, Double price, long item){

        try{
            JLabel lblSmootieNumber = new JLabel("name"); //create label
            JButton btnSmootie = new JButton(); //create button
            JTextField txtCount = new JTextField(); //create text field

            pnlDessert.setLayout(null);

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
                    count= finalTxtCount.getText();
                    countX = Integer.parseInt(count);

                    if (countX > 50){
                        //JOptionPane.showMessageDialog(null, "Max quantity of item can be 50 !");
                    }else{
                        int numberOfItem;
                        numberOfItem=Integer.parseInt(finalTxtCount.getText());

                        sendToOrder(numberOfItem, SmootiePrice, smootieName, countItem);
                        sendToTable(smootieName, SmootiePrice);
                    }

                    finalTxtCount.setText("1");

                }


            });

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
                    count= finalTxtCount.getText();
                    countX = Integer.parseInt(count);

                    if (countX > 50){
                        //JOptionPane.showMessageDialog(null, "Max quantity of item can be 50 !");
                    }else{
                        int numberOfItem;
                        numberOfItem=Integer.parseInt(finalTxtCount.getText());

                        sendToOrder(numberOfItem, SmootiePrice, smootieName, countItem);
                        sendToTable(smootieName, SmootiePrice);
                    }

                    finalTxtCount.setText("1");

                }


            });

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
                    count= finalTxtCount.getText();
                    countX = Integer.parseInt(count);

                    if (countX > 50){
                        //JOptionPane.showMessageDialog(null, "Max quantity of item can be 50 !");
                    }else{
                        int numberOfItem;
                        numberOfItem=Integer.parseInt(finalTxtCount.getText());

                        sendToOrder(numberOfItem, SmootiePrice, smootieName, countItem);
                        sendToTable(smootieName, SmootiePrice);
                    }

                    finalTxtCount.setText("1");
                }


            });

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
                    count= finalTxtCount.getText();
                    countX = Integer.parseInt(count);

                    if (countX > 50){
                        //JOptionPane.showMessageDialog(null, "Max quantity of item can be 50 !");
                    }else{
                        int numberOfItem;
                        numberOfItem=Integer.parseInt(finalTxtCount.getText());

                        sendToOrder(numberOfItem, SmootiePrice, smootieName, countItem);
                        sendToTable(smootieName, SmootiePrice);
                    }

                    finalTxtCount.setText("1");

                }


            });

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
                    count= finalTxtCount.getText();
                    countX = Integer.parseInt(count);

                    if (countX > 50){
                        //JOptionPane.showMessageDialog(null, "Max quantity of item can be 50 !");
                    }else{
                        int numberOfItem;
                        numberOfItem=Integer.parseInt(finalTxtCount.getText());


                        sendToOrder(numberOfItem, SmootiePrice, smootieName, countItem);
                        sendToTable(smootieName, SmootiePrice);
                    }

                    finalTxtCount.setText("1");

                }


            });

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
                    count= finalTxtCount.getText();
                    countX = Integer.parseInt(count);

                    if (countX > 50){
                        //JOptionPane.showMessageDialog(null, "Max quantity of item can be 50 !");
                    }else{
                        int numberOfItem;
                        numberOfItem=Integer.parseInt(finalTxtCount.getText());


                        sendToOrder(numberOfItem, SmootiePrice, smootieName, countItem);
                        sendToTable(smootieName, SmootiePrice);
                    }

                    finalTxtCount.setText("1");
                }


            });

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
                    count= finalTxtCount.getText();
                    countX = Integer.parseInt(count);

                    if (countX > 50){
                        //JOptionPane.showMessageDialog(null, "Max quantity of item can be 50 !");
                    }else{
                        int numberOfItem;
                        numberOfItem=Integer.parseInt(finalTxtCount.getText());


                        sendToOrder(numberOfItem, SmootiePrice, smootieName, countItem);
                        sendToTable(smootieName, SmootiePrice);
                    }

                    finalTxtCount.setText("1");
                }


            });

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
                    count= finalTxtCount.getText();
                    countX = Integer.parseInt(count);

                    if (countX > 50){
                        //JOptionPane.showMessageDialog(null, "Max quantity of item 50 !");
                    }else{
                        int numberOfItem;
                        numberOfItem=Integer.parseInt(finalTxtCount.getText());

                        sendToOrder(numberOfItem, SmootiePrice, smootieName, countItem);
                        sendToTable(smootieName, SmootiePrice);
                    }

                    finalTxtCount.setText("1");
                }


            });

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
                    count= finalTxtCount.getText();
                    countX = Integer.parseInt(count);

                    if (countX > 50){
                        //JOptionPane.showMessageDialog(null, "Max quantity of item can be 50 !");
                    }else{
                        int numberOfItem;
                        numberOfItem=Integer.parseInt(finalTxtCount.getText());

                        sendToOrder(numberOfItem, SmootiePrice, smootieName, countItem);
                        sendToTable(smootieName, SmootiePrice);
                    }

                    finalTxtCount.setText("1");

                }


            });

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
                    count= finalTxtCount.getText();
                    countX = Integer.parseInt(count);

                    if (countX > 50){
                        //JOptionPane.showMessageDialog(null, "Max quantity of item can be 50 !");
                    }else{
                        int numberOfItem;
                        numberOfItem=Integer.parseInt(finalTxtCount.getText());

                        sendToOrder(numberOfItem, SmootiePrice, smootieName, countItem);
                        sendToTable(smootieName, SmootiePrice);
                    }

                    finalTxtCount.setText("1");
                }


            });

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
                    count= finalTxtCount.getText();
                    countX = Integer.parseInt(count);

                    if (countX > 50){
                        //JOptionPane.showMessageDialog(null, "Max quantity of item can be 50 !");
                    }else{
                        int numberOfItem;
                        numberOfItem=Integer.parseInt(finalTxtCount.getText());

                        sendToOrder(numberOfItem, SmootiePrice, smootieName, countItem);
                        sendToTable(smootieName, SmootiePrice);
                    }

                    finalTxtCount.setText("1");
                }


            });

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


                    count= finalTxtCount.getText();
                    countX = Integer.parseInt(count);

                    if (countX > 50){
                        //JOptionPane.showMessageDialog(null, "Max quantity of item can be 50 !");
                    }else{
                        int numberOfItem;
                        numberOfItem=Integer.parseInt(finalTxtCount.getText());



                        sendToOrder(numberOfItem, SmootiePrice, smootieName, countItem);
                        sendToTable(smootieName, SmootiePrice);

                    }

                    finalTxtCount.setText("1");
                }
            });

        }catch (Exception e){
            e.getStackTrace();
        }
    }

    public void checkItemsInArray(){
        int arraySize=userAccount.orderArray.size();
        countItem=0;

        for (int i = 0; i<arraySize; i++){
            if (userAccount.orderArray.get(i).getNumberOfItem()==0){
                userAccount.orderArray.remove(i);
            }
            if (userAccount.orderArray.get(i).getIdTable()==makeOrderIdTable){
                countItem++;
            }
        }
    }


    Order order = new Order();

    private void sendToOrder(int numberOfItem, Double smootiePrice, String smootieName, int itemCount) {
        System.out.println("Send To Order - start");
        btnCancel.setEnabled(false);
        checkItemsInArray();

        double totalPrice;
        totalPrice=numberOfItem*smootiePrice;
        totalPrice=Math.round(totalPrice * 100)/100.0;
        //Payment pay = new Payment();
        int countOfItem=0;
        int countChnages=0;
        int size = orderArrayList.size();
        System.out.println("size of array: "+size);
        if (countItem<31){
            if (size>0){
                System.out.println("Size of array is more than 0");
                for (int i=0; i<size;i++){


                    /*System.out.println("array name: "+userAccount.orderArray.get(i).getNameItem());
                    System.out.println("Item name: "+smootieName);
                    System.out.println("array name: "+userAccount.orderArray.get(i).getIdTable());
                    System.out.println("Item table: "+makeOrderIdTable);
                    if ((userAccount.orderArray.get(i).getNameItem().equals(smootieName)) && (userAccount.orderArray.get(i).getIdTable()==makeOrderIdTable)){
                        userAccount.orderArray.get(i).setNumberOfItem(userAccount.orderArray.get(i).getNumberOfItem()+numberOfItem);
                        userAccount.orderArray.get(i).setTotalPrice(userAccount.orderArray.get(i).getNumberOfItem()*smootiePrice);
                        totalPrice=totalPrice+userAccount.orderArray.get(i).getTotalPrice();

                    }else */
                    System.out.println("for run -- "+i);if (orderArrayList.get(i).getNameItem()==smootieName && orderArrayList.get(i).getIdTable()==makeOrderIdTable){


                        if (orderArrayList.get(i).getNumberOfItem()>=50 && smootieName.equals(orderArrayList.get(i).getNameItem()) && numberOfItem>0){
                            JOptionPane.showMessageDialog(null, "Max quantity of item can be 50 !");
                            orderArrayList.get(i).setNumberOfItem(50);
                        }else{
                            orderArrayList.get(i).setNumberOfItem(orderArrayList.get(i).getNumberOfItem()+numberOfItem);
                            orderArrayList.get(i).setTotalPrice(orderArrayList.get(i).getTotalPrice()+totalPrice);
                        }
                    }else {
                        countChnages++;
                    }
                }

                if (countChnages==size){

                    Order order = new Order();
                    System.out.println("number of item: "+numberOfItem);
                    System.out.println("nuber of item in Order: "+order.getNumberOfItem());
                    order.setNumberOfItem(numberOfItem);
                    System.out.println("order after");
                    if (order.getNumberOfItem()>50){
                        System.out.println("if done");
                        order.setNumberOfItem(50);
                    }
                    order.setPrice(smootiePrice);
                    order.setNameItem(smootieName);
                    order.setTotalPrice(totalPrice);
                    order.setIdTable(makeOrderIdTable);

                    orderArrayList.add(order);
                }

            }else {
                System.out.println("Size of array is empty");
                order.setNumberOfItem(numberOfItem);
                order.setPrice(smootiePrice);
                order.setNameItem(smootieName);
                order.setTotalPrice(totalPrice);
                order.setIdTable(makeOrderIdTable);

                orderArrayList.add(order);
            }


            userAccount.setOrderArray(orderArrayList);
            userAccount.printOrderArray();




        }else {
            System.out.println("Item can't be added to orderArray");
        }

    }

    //send item to order on table
    public void sendToTable(final String name, final Double price){
            totalPrice=0;
            btnChooseHistory="true";


        JLabel lblCount = new JLabel("name");
        JLabel lblX = new JLabel("name");
        JLabel lblEuro = new JLabel("name");
        JLabel lblName = new JLabel("name");
        JLabel lblPrice= new JLabel("name");
        JButton btnDelete = new JButton();
        JButton btnUndo = new JButton();

        pnlItemOnTable.removeAll();
        pnlItemOnTable.revalidate();
        pnlItemOnTable.repaint();
        pnlItemOnTable.setLayout(null);
        orderPositionY=0;

        int sizeArray=userAccount.orderArray.size();

        for (int i=0;i<sizeArray;i++){



            String nameItem=userAccount.orderArray.get(i).getNameItem();
            double priceItem=userAccount.orderArray.get(i).getTotalPrice();
            int countOfItem=userAccount.orderArray.get(i).getNumberOfItem();

            if (countOfItem!=0){

            if (makeOrderIdTable==userAccount.orderArray.get(i).getIdTable())
            {

                totalPrice=totalPrice+userAccount.orderArray.get(i).getTotalPrice();
                orderPositionY=orderPositionY+32;
                if (countItem<31)
                {
                    countPrice=price*countX;
                    countPrice=Math.round(countPrice * 100)/100.0;
                    totalPrice=Math.round(totalPrice * 100)/100.0;

                    lblTotalPrice.setText("Price: "+Double.toString(totalPrice)+" €");

                    pnlItemOnTable.add(lblCount = new JLabel(""+countOfItem, FlowLayout.LEFT));
                    lblCount.setFont(new Font("Century Gothic", Font.ITALIC, 25));
                    lblCount.setBounds(10, orderPositionY, 45, 30);

                    pnlItemOnTable.add(lblX = new JLabel("x", FlowLayout.LEFT));
                    lblX.setFont(new Font("Century Gothic", Font.ITALIC, 25));
                    lblX.setBounds(55, orderPositionY, 20, 30);

                    pnlItemOnTable.add(lblName = new JLabel(""+nameItem, FlowLayout.LEFT));
                    lblName.setFont(new Font("Century Gothic", Font.ITALIC, 25));
                    lblName.setBounds(85, orderPositionY, 200, 30);

                    pnlItemOnTable.add(lblPrice = new JLabel(""+priceItem, FlowLayout.LEFT));
                    lblPrice.setFont(new Font("Century Gothic", Font.ITALIC, 25));
                    lblPrice.setBounds(295, orderPositionY, 100, 30);

                    pnlItemOnTable.add(lblEuro = new JLabel("€", FlowLayout.LEFT));
                    lblEuro.setFont(new Font("Century Gothic", Font.ITALIC, 25));
                    lblEuro.setBounds(405, orderPositionY, 30, 30);

                    pnlItemOnTable.add(btnDelete = new JButton("DELETE"));
                    btnDelete.setBackground(new Color(254,151,44));
                    btnDelete.setFont(new Font("Century Gothic", Font.BOLD, 17));
                    btnDelete.setForeground(Color.white);
                    btnDelete.setBorderPainted(false);
                    btnDelete.setBounds(450, orderPositionY, 100, 30);

                    pnlItemOnTable.add(btnUndo = new JButton("UNDO"));
                    btnUndo.setBackground(new Color(133,147,49));
                    btnUndo.setFont(new Font("Century Gothic", Font.BOLD, 17));
                    btnUndo.setForeground(Color.white);
                    btnUndo.setBorderPainted(false);
                    btnUndo.setEnabled(false);
                    btnUndo.setBounds(560, orderPositionY, 100, 30);


                }else{
                    JOptionPane.showMessageDialog(null, "Max quantity of ordered item in one time can be 30 !");
                    countItem=30;
                }

            }

            }

        }

        orderPositionY=orderPositionY+32;


        final JLabel finalLblName = lblName;
        //final JLabel finalLblPrice = lblPrice;
        final JButton finalBtnDelete = btnDelete;
        final JButton finalBtnUndo = btnUndo;
        final JLabel finalLblX = lblX;
        final JLabel finalLblEuro = lblEuro;
        final JLabel finalLblCount = lblCount;
        final JLabel finalLblCount1 = lblCount;
        final JLabel finalLblPrice = lblPrice;
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numberOfItem;
                numberOfItem = Integer.parseInt(finalLblCount1.getText());
                System.out.println("Number of item is: "+numberOfItem);

                throwItem(finalLblCount, finalLblX, finalLblName, finalLblPrice, finalLblEuro, finalBtnDelete, finalBtnUndo);
            }
        });

        final JButton finalBtnUndo1 = btnUndo;
        final JLabel finalLblX1 = lblX;
        final JLabel finalLblEuro1 = lblEuro;
        final JLabel finalLblCount2 = lblCount;
        btnUndo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                undoItem(finalLblCount, finalLblX1, finalLblName, finalLblPrice, finalLblEuro1, finalBtnDelete, finalBtnUndo1);
            }
        });
    }

    public void throwItem(final JLabel lblCount, final JLabel lblX, final JLabel lblName, final JLabel lblPrice, final JLabel lblEuro, final JButton btnThrow, final JButton btnUndo) {



        JFrame frame2 = new JFrame("Delete Verification");
        frame2.setBackground(new Color(240,232,220));

        Font font = new Font("Century Gothic", 1, 22);
        frame2.setFont(font);

        final JLabel lblPassword = new JLabel();
        final JPasswordField textPassword = new JPasswordField();
        JButton btnOk = new JButton("OK");

        btnOk.setBackground(new Color(133,147,49));
        btnOk.setForeground(Color.white);


        lblPassword.setForeground(new Color(133,147,49));
        lblPassword.setFont(new Font("Century Gothic", 1, 25));
        lblPassword.setText("Password : ");
        btnOk.setFont(font);
        textPassword.setFont(font);


        lblPassword.setBounds(110, 40, 140, 30);
        textPassword.setBounds(120, 90, 100, 30);
        btnOk.setBounds(120, 140, 100, 30);


        frame2.setLayout(null);

        // add JTextFields to the jframe
        frame2.add(lblPassword);
        frame2.add(textPassword);
        frame2.add(btnOk);

        frame2.setBackground(new Color(240,232,220));
        final boolean[] ver = {false};
        textPassword.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    String password=textPassword.getText();

                    System.out.println(password);
                    SessionFactory sf = HibernateUtil.getSessionFactory();
                    Session se = sf.openSession();

                    Transaction transaction = se.beginTransaction();
                    try {
                        String hql = "FROM Authentication where position ='manager' OR position='supervisor'";
                        Query query = se.createQuery(hql);
                        String pass;
                        List<Authentication> checkPassword=(List<Authentication>)query.list();
                        se.getTransaction().commit();

                        for(Authentication g : checkPassword)
                        {
                            pass = g.getPassword();







                            System.out.println(password);
                            if (password.equals(pass)){

                                if (ver[0] =true){


                                    btnCancel.setEnabled(false);
                                    int sizeArray=userAccount.orderArray.size();
                                    for (int x=0;x<sizeArray;x++){
                                        if (userAccount.orderArray.get(x).getNameItem().equals(lblName.getText()) && userAccount.orderArray.get(x).getIdTable()==makeOrderIdTable){
                                            totalPrice=totalPrice-userAccount.orderArray.get(x).getTotalPrice();
                                            userAccount.orderArray.get(x).setTotalPrice(0.0);
                                            userAccount.orderArray.get(x).setNumberOfItem(0);
                                        }

                                    }

                                    lblTotalPrice.setText("Price: "+String.valueOf(totalPrice=Math.round(totalPrice * 100)/100.0)+" €");
                                    lblCount.setForeground(Color.red);
                                    lblX.setForeground(Color.red);
                                    lblName.setForeground(Color.red);
                                    lblPrice.setForeground(Color.red);
                                    lblEuro.setForeground(Color.red);
                                    btnThrow.setText("Deleted");
                                    btnThrow.setEnabled(false);
                                    btnUndo.setEnabled(true);

                                } //if checkPsw


                                JComponent comp = (JComponent) e.getSource();
                                Window win = SwingUtilities.getWindowAncestor(comp); //get top window
                                win.dispose();
                                ver[1] =true;

                            }else {


                            }
                            se.close();
                        }
                    } catch (Throwable t) {
                        transaction.rollback();
                        throw t;
                    }

                }
                }

        });

        btnOk.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String password=textPassword.getText();

                System.out.println(password);
                SessionFactory sf = HibernateUtil.getSessionFactory();
                Session se = sf.openSession();

                Transaction transaction = se.beginTransaction();
                try {
                    String hql = "FROM Authentication where position ='manager' OR position='supervisor'";
                    Query query = se.createQuery(hql);
                    String pass;
                    List<Authentication> checkPassword=(List<Authentication>)query.list();
                    se.getTransaction().commit();

                    for(Authentication g : checkPassword)
                    {
                        pass = g.getPassword();

                        System.out.println(password);
                        if (password.equals(pass)){

                            if (ver[0] =true){


                                btnCancel.setEnabled(false);
                                int sizeArray=userAccount.orderArray.size();
                                for (int x=0;x<sizeArray;x++){
                                    if (userAccount.orderArray.get(x).getNameItem().equals(lblName.getText()) && userAccount.orderArray.get(x).getIdTable()==makeOrderIdTable){
                                        totalPrice=totalPrice-userAccount.orderArray.get(x).getTotalPrice();
                                        userAccount.orderArray.get(x).setTotalPrice(0.0);
                                        userAccount.orderArray.get(x).setNumberOfItem(0);
                                    }

                                }

                                lblTotalPrice.setText("Price: "+String.valueOf(totalPrice=Math.round(totalPrice * 100)/100.0)+" €");
                                lblCount.setForeground(Color.red);
                                lblX.setForeground(Color.red);
                                lblName.setForeground(Color.red);
                                lblPrice.setForeground(Color.red);
                                lblEuro.setForeground(Color.red);
                                btnThrow.setText("Deleted");
                                btnThrow.setEnabled(false);
                                btnUndo.setEnabled(true);

                            } //if checkPsw


                            JComponent comp = (JComponent) e.getSource();
                            Window win = SwingUtilities.getWindowAncestor(comp); //get top window
                            win.dispose();
                            ver[1] =true;

                        }else {




                        }
                        se.close();
                    }
                } catch (Throwable t) {
                    transaction.rollback();
                    throw t;
                }

            }
        });


        frame2.setSize(360,300);
        frame2.setLocationRelativeTo(null);

        frame2.setVisible(true);




    }

    public void undoItem(JLabel lblCount, JLabel lblX, JLabel lblName, JLabel lblPrice, JLabel lblEuro, JButton btnThrow, JButton btnUndo){



        int sizeArray=userAccount.orderArray.size();

        for (int x=0;x<sizeArray;x++){
            if (userAccount.orderArray.get(x).getNameItem().equals(lblName.getText()) && userAccount.orderArray.get(x).getIdTable()==makeOrderIdTable){
                userAccount.orderArray.get(x).setNumberOfItem(Integer.parseInt(lblCount.getText()));
                userAccount.orderArray.get(x).setTotalPrice(Double.parseDouble(lblPrice.getText()));
                totalPrice=totalPrice+userAccount.orderArray.get(x).getTotalPrice();

                if (btnChooseHistory.equals(false)){
                    btnCancel.setEnabled(true);
                }
            }

        }
        lblTotalPrice.setText("Price: "+String.valueOf(totalPrice=Math.round(totalPrice * 100)/100.0)+" €");
        lblCount.setForeground(Color.black);
        lblName.setForeground(Color.black);
        lblPrice.setForeground(Color.black);
        lblX.setForeground(Color.black);
        lblEuro.setForeground(Color.black);
        btnThrow.setText("DELETE");
        btnThrow.setEnabled(true);
        btnUndo.setEnabled(false);

        }

}

