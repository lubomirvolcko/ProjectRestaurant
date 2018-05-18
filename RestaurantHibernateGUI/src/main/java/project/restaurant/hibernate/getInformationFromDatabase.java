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














}
