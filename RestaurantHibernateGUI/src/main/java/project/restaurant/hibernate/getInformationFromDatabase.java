package project.restaurant.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import project.restaurant.gui.MakeOrder;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class getInformationFromDatabase
{

    String name;
    Double price;
    int item=0;


    public void getDrinksSmoothies()
{

    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session se = sf.openSession();
    se.beginTransaction();
    Query qry=se.createQuery("from Drink where type='Smoothies'");
    List<Drink> drinkSmoothies=(List<Drink>)qry.list();
    se.getTransaction().commit();
    se.close();
    int f;
    int i = drinkSmoothies.size();

    MakeOrder smoothie = new MakeOrder();


    for(f=0;f<1;f++)
    {
        name=drinkSmoothies.get(f).getName();
        smoothie.getSmootiesButtons(name, price, item);
    }

    for(Drink d : drinkSmoothies)
    {
        item++;
        name=d.getName();
        price=d.getPrice();







    }
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
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

            System.out.println(d.getName());
            System.out.println(d.getPrice());
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

            System.out.println(d.getName());
            System.out.println(d.getPrice());
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
            System.out.println(d.getName());
            System.out.println(d.getPrice());
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

            System.out.println(d.getName());
            System.out.println(d.getPrice());
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

            System.out.println(d.getName());
            System.out.println(d.getPrice());
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

            System.out.println(d.getName());
            System.out.println(d.getPrice());
        }
    }


    public void getFoodAppetizer()
{
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session se = sf.openSession();
    se.beginTransaction();
    Query qry=se.createQuery("from Food where type='Appetizer'");
    List<Food> foodAppetizer=(List<Food>)qry.list();
    se.getTransaction().commit();
    se.close();
    for(Food f : foodAppetizer)
    {

        System.out.println(f.getName());
        System.out.println(f.getPrice());
    }


}

public void getFoodSoup()
{
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session se = sf.openSession();
    se.beginTransaction();
    Query qry=se.createQuery("from Food where type='Soup'");
    List<Food> foodSoup=(List<Food>)qry.list();
    se.getTransaction().commit();
    se.close();
    for(Food f : foodSoup)
    {

        System.out.println(f.getName());
        System.out.println(f.getPrice());
    }


}

    public void getFoodSalad()
    {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
        se.beginTransaction();
        Query qry=se.createQuery("from Food where type='Salad'");
        List<Food> foodSalad=(List<Food>)qry.list();
        se.getTransaction().commit();
        se.close();
        for(Food g : foodSalad)
        {

            System.out.println(g.getName());
            System.out.println(g.getPrice());
        }


    }

    public void getFoodDesert()
    {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
        se.beginTransaction();
        Query qry=se.createQuery("from Food where type='Desert'");
        List<Food> foodDesert=(List<Food>)qry.list();
        se.getTransaction().commit();
        se.close();
        for(Food g : foodDesert)
        {

            System.out.println(g.getName());
            System.out.println(g.getPrice());
        }


    }

    public void getFoodMainDish()
    {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
        se.beginTransaction();
        Query qry=se.createQuery("from Food where type='Main Dish'");
        List<Food> foodMainDish=(List<Food>)qry.list();
        se.getTransaction().commit();
        se.close();
        for(Food g : foodMainDish)
        {

            System.out.println(g.getName());
            System.out.println(g.getPrice());
        }


    }



}
