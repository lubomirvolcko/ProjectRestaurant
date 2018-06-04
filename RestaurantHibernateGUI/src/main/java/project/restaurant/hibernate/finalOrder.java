package project.restaurant.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class finalOrder
{



        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        @Column(name = "id")
        private int id;





        @Column(name = "tablle")
        private int tablle;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTablle() {
        return tablle;
    }

    public void setTablle(int tablle) {
        this.tablle = tablle;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public Double getFinalprice() {
        return finalprice;
    }

    public void setFinalprice(Double finalprice) {
        this.finalprice = finalprice;
    }

    @Column(name = "orderid")
        private int orderid;





        @Column(name = "finalprice")
        private Double finalprice;










}
