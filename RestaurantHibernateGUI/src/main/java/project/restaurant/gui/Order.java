package project.restaurant.gui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {

    private int numberOfItem;
    private String nameItem;
    private Double price;
    private Double totalPrice;

    public Order(int numberOfItem, String nameItem, Double price, Double totalPrice) {
        this.numberOfItem = numberOfItem;
        this.nameItem = nameItem;
        this.price = price;
        this.totalPrice = totalPrice;
    }

    public void setNumberOfItem(int numberOfItem) {
        this.numberOfItem = numberOfItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getNumberOfItem() {
        return numberOfItem;
    }

    public String getNameItem() {
        return nameItem;
    }

    public Double getPrice() {
        return price;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }


    ArrayList<Order> orderArray = new ArrayList<Order>();


    public void setToArrayList(Order order){



        System.out.println("Name of item: "+getNameItem());
        System.out.println("Number of item: "+getNumberOfItem());
        System.out.println("Price of item: "+getPrice());
        System.out.println("Total price of item: "+totalPrice);

        orderArray.add(order);

        //System.out.println(order.getNameItem());
        //System.out.println("ARRAY LIST 0: "+orderArray.get(0).getNumberOfItem()+" - "+orderArray.get(0).getNameItem()+" - "+orderArray.get(0).getPrice()+" - "+orderArray.get(0).getTotalPrice());
        //System.out.println("ARRAY LIST 1: "+orderArray.get(1).getNumberOfItem()+" - "+orderArray.get(1).getNameItem()+" - "+orderArray.get(1).getPrice()+" - "+orderArray.get(1).getTotalPrice());
    }



}
