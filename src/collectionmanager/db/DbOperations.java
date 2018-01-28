/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionmanager.db;


import collectionmanager.entity.CollectionItem;
import collectionmanager.util.HibernateUtil;
import java.util.Date;
import java.util.List;
import java.util.Iterator;
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.Query;

/**
 *
 * @author michalrudzki
 */
public class DbOperations
{
    private static SessionFactory factory;
    
    static
    {
        try
        {
            factory = HibernateUtil.getSessionFactory();
        }
        catch (Throwable ex)
        {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    /**
     * Adds a collection item to the database.
     * @param name item's name
     * @param purchaseDate item's purchase date
     * @param location item's location
     * @return Returns item's ID.
     */
    public static Integer addItem(String name, Date purchaseDate, int location)
    {
        Session session = factory.openSession();
        Transaction tx = null;
        Integer itemID = null;
        
        try
        {
            tx = session.beginTransaction();
            CollectionItem item = new CollectionItem(name, purchaseDate, location);
            itemID = (Integer) session.save(item);
            tx.commit();
        }
        catch (HibernateException e)
        {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        }
        finally
        {
            session.close();
        }
        
        return itemID;
    }
    
    /**
     * Returns a list of all collection items.
     * @return List of all collection items.
     */
    public static List readCollection()
    {
        Session session = factory.openSession();
        Transaction tx = null;
        List collection = null;
        
        try
        {
            tx = session.beginTransaction();
            Query query = session.createQuery("from COLLECTION");
            collection = query.list();
            tx.commit();
        }
        catch (HibernateException e)
        {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        }
        finally
        {
            session.close();
        }
        
        return collection;
    }
    
    /**
     * Deletes an item from the collection.
     * @param itemID ID of the item to be deleted
     */
    public static void deleteItem(Integer itemID)
    {
        Session session = factory.openSession();
        Transaction tx = null;
        
        try
        {
            tx = session.beginTransaction();
            CollectionItem item = (CollectionItem) session.get(CollectionItem.class, itemID);
            session.delete(item);
            tx.commit();
        }
        catch (HibernateException e)
        {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        }
        finally
        {
            session.close();
        }
    }
}
