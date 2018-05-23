package project.restaurant.gui;

import java.util.ArrayList;
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

    List<Order> orderArray = new ArrayList<>();

    public void setToArrayList(){
    }


}
