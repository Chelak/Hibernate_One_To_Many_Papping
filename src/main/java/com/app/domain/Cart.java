package com.app.domain;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by user on 8/7/2015.
 */
public class Cart implements Serializable
{
    private long id;
    private double total;
    private String name;
    private Set<Items> items;

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
    public Set<Items> getItems() {
        return items;
    }
    public void setItems(Set<Items> items) {
        this.items = items;
    }
}
