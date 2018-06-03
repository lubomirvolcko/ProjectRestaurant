package project.restaurant.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "item")
public class ItemSearch{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }



    @Column(name = "name")
    private String itemName;

    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }




    @Column(name = "price")
    private double itemPrice;

    public double getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

}
