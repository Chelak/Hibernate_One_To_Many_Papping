package com.app.dao;

import com.app.domain.Items;

import java.util.List;
import java.util.Set;

/**
 * Created by user on 8/7/2015.
 */
public interface ItemDAO
{
    public List<Items> findAll();
    public Items findByID(Long itemId);
    public void addItem(Items items);
    public void editItem(Items items, Long itemId);
    public  void removeItem(Long itemId);


}
