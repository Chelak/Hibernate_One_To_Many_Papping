package com.app.domain;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by user on 8/7/2015.
 */
@Entity
@Table(name="Items")
public class Items implements Serializable
{
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "item_id")
    private String itemId;
    @Column(name = "item_total")
    private double itemTotal;
    @Column(name = "quantity")
    private int quantity;
  /*
    @ManyToOne
    @JoinColumn(name = "cart_id")'

    private Cart cart;
*/
    //Hibernate requires no-args constructor
    public Items(){}

    public Items(String itemId, double total, int qty, Cart c){
        this.itemId=itemId;
        this.itemTotal=total;
        this.quantity=qty;
        //this.cart=c;
    }
    public String getItemId() {
        return itemId;
    }
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
    public double getItemTotal() {
        return itemTotal;
    }
    public void setItemTotal(double itemTotal) {
        this.itemTotal = itemTotal;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

   /* public Cart getCart() {
        return cart;
    }
    public void setCart(Cart cart) {
        this.cart = cart;
    }
    */
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Items{" +
                "itemTotal=" + itemTotal +
                ", quantity=" + quantity +
                ", itemId='" + itemId + '\'' +

                '}';
    }
}
