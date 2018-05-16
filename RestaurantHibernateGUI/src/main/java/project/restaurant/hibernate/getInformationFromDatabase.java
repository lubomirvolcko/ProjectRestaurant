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

public void getDrinksSmoothies()
{

    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session se = sf.openSession();
    se.beginTransaction();
    Query qry=se.createQuery("from Drink where type='Smoothies'");
    List<Drink> drinkSmoothies=(List<Drink>)qry.list();
    se.getTransaction().commit();
    se.close();
    String name;
    Double price;
    int item=0;
    MakeOrder smoothie = new MakeOrder();
    for(Drink d : drinkSmoothies)
    {
        item++;
        name=d.getName();
        price=d.getPrice();
        smoothie.getSmootiesButtons(name, price, item);
        //System.out.println(name);
        //System.out.println(price);
        System.out.println(name+"hotovo!!   "+item);
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
