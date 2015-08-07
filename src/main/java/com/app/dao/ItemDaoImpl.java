package com.app.dao;

import com.app.domain.Items;
import com.app.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Set;

/**
 * Created by user on 8/7/2015.
 */
public class ItemDaoImpl implements ItemDAO {

    SessionFactory sessionFactory = null;



    public Set<Items> findAll() {
        return null;
    }

    public Items findByID(Long itemId) {
        return null;
    }

    public void addItem(Items items)
    {
        try
        {
            //Get Session
            sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.getCurrentSession();
            System.out.println("Session created");
            //start transaction
            Transaction  tx = session.beginTransaction();

            //Save the Model objects
            session.save(items);
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

    public void editItem(Items items, Long itemId) {

    }

    public void removeItem(Long itemId) {

    }
}
