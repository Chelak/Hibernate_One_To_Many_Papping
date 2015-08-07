package com.app.dao;

import com.app.domain.Cart;
import com.app.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import java.util.Set;

/**
 * Created by user on 8/7/2015.
 */
public class CartDaoImpl implements CartDao
{

    SessionFactory sessionFactory = null;

    public Set<Cart> findAll() {
        return null;
    }

    public Cart findById(Long cartId) {
        return null;
    }

    public void addCart(Cart cart)
    {
        try
        {
            //Get Session
            sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.getCurrentSession();
            System.out.println("Session created");
            //start transaction
            Transaction tx = session.beginTransaction();

            //Save the Model objects
            session.save(cart);
            //Commit transaction
             tx.commit();
        }catch (Exception e)
        {
            System.out.println("Exception occured. "+e.getMessage());
            e.printStackTrace();
        }
        finally {
            if(!sessionFactory.isClosed())
            {
                System.out.println("Closing SessionFactory");
                sessionFactory.close();
            }
        }
    }

    public void editCart(Cart cart, Long cartId) {

    }

    public void removeCart(Long cartId) {

    }
}
