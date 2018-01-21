/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionmanager.entity;

import java.util.Date;

/**
 *
 * @author michalrudzki
 */
public class CollectionItem
{
    private int id;
    private String name;
    private Date purchaseDate;
    private int location;
    private boolean isLent;

    public CollectionItem()
    {
    }

    public CollectionItem(String name, Date purchaseDate, int location)
    {
        this.name = name;
        this.purchaseDate = purchaseDate;
        this.location = location;
        this.isLent = false;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Date getPurchaseDate()
    {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate)
    {
        this.purchaseDate = purchaseDate;
    }

    public int getLocation()
    {
        return location;
    }

    public void setLocation(int location)
    {
        this.location = location;
    }

    public boolean isIsLent()
    {
        return isLent;
    }

    public void setIsLent(boolean isLent)
    {
        this.isLent = isLent;
    }
}
