package com.app.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by user on 8/7/2015.
 */

@Entity
@Table(name="Cart")
public class Cart implements Serializable
{
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "cart_id")
    private long id;
    @Column(name = "total")
    private double total;
    @Column(name = "name")
    private String name;
  //  @OneToMany(mappedBy = "Cart", cascade=CascadeType.ALL,orphanRemoval=true)
   // private Set<Items> items;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
   /* public Set<Items> getItems() {
        return items;
    }
    public void setItems(Set<Items> items) {
        this.items = items;
    }
*/
    @Override
    public String toString() {
        return "Cart{" +
                "total=" + total +
                ", name='" + name + '\'' +
                '}';
    }
}
