package project.restaurant.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "drink")
public class Drink
{

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
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }



    @Column(name = "type")
    private String Type;

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }



    @Column(name = "price")
    private Double Price;

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }



    @Column(name = "composition")
    private String Composition;

    public String getComposition() {
        return Composition;
    }

    public void setComposition(String composition) {
        Composition = composition;
    }



    @Column(name = "volume")
    private String Volume;

    public String getVolume() {
        return Volume;
    }

    public void setVolume(String volume) {
        Volume = volume;
    }



    @Column(name = "active")
    private String Active;

    public String getActive() {
        return Active;
    }

    public void setActive(String active) {
        Active = active;
    }

}
