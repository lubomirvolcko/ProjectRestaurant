package project.restaurant.hibernate;


import javax.persistence.*;

@Entity
@Table(name = "food")
public class Food
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



    @Column(name = "price")
    private Double Price;

    public Double getPrice() {
        return Price;
    }
    public void setPrice(Double price) {
        Price = price;
    }



    @Column(name = "type")
    private String Type;

    public String getType() {
        return Type;
    }
    public void setType(String type) {
        Type = type;
    }



    @Column(name = "volumeweight")
    private String volumeweight;

    public String getVolumeweight() {
        return volumeweight;
    }
    public void setVolumeweight(String volumeweight) {
        this.volumeweight = volumeweight;
    }



    @Column(name = "composition")
    private String composition;

    public String getComposition() {
        return composition;
    }
    public void setComposition(String composition) {
        this.composition = composition;
    }



    @Column(name = "allergens")
    private String allergens;

    public String getAllergens() {
        return allergens;
    }
    public void setAllergens(String allergens) {
        this.allergens = allergens;
    }



    @Column(name = "active")
    private String active;

    public String getActive() {
        return active;
    }
    public void setActive(String active) {
        this.active = active;
    }
}
