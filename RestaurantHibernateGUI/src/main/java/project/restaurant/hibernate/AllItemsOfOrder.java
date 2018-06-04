package project.restaurant.hibernate;


import javax.persistence.*;

@Entity
@Table(name = "itemsinorder")
public class AllItemsOfOrder


{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "ordernumber")
    private int ordernumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(int ordernumber) {
        this.ordernumber = ordernumber;
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

    public int getTabllle() {
        return tabllle;
    }

    public void setTabllle(int tabllle) {
        this.tabllle = tabllle;
    }

    @Column(name = "name")

    private String name;

    @Column(name = "price")
    private Double price;

    @Column(name = "tabllle")
    private int tabllle;








}
