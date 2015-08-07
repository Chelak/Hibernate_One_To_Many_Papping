package com.app.main;

import com.app.dao.CartDao;
import com.app.dao.CartDaoImpl;
import com.app.dao.ItemDAO;
import com.app.dao.ItemDaoImpl;
import com.app.domain.Cart;
import com.app.domain.Items;
import com.app.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import java.util.HashSet;
import java.util.Set;

/**
 * Created by user on 8/7/2015.
 */
public class TestMain1
{
    public static void main(String[] args)
    {

        Cart cart = new Cart();
        cart.setName("PCart");
        cart.setId(2);
        Items item1 = new Items("Apple", 10, 2,cart);
        Items item2 = new Items("Banana", 12, 3,cart);
        Items item3 = new Items("Juice", 10, 2,cart);
        Items item4 = new Items("Meat", 10, 2,cart);
        Items item5 = new Items("potatoes", 10, 2,cart);

        Set<Items> items = new HashSet<Items>();
        items.add(item1);
        items.add(item2);



        cart.setItems(items);
        cart.setTotal(10 * 2 + 12 * 3 + 10 * 2 + 10 * 2 + 10 * 2);

        CartDaoImpl cartDao = new CartDaoImpl();
        ItemDaoImpl itemDao = new ItemDaoImpl();

        itemDao.addItem(item3);
        itemDao.addItem(item4);
       // cartDao.addCart(cart);





    }


}
