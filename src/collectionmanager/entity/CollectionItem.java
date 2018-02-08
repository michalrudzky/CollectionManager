/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionmanager.entity;

import java.util.Date;

/**
 * Class representing a collection item.
 * @author michalrudzki
 */
public class CollectionItem
{
    private int id;
    private String name;
    private Date purchaseDate;
    private int location;
    private boolean isLent;

    /**
     * Creates a collection item with no data.
     */
    public CollectionItem()
    {
    }

    /**
     * Creates a collection item with specified data.
     * @param name item's name
     * @param purchaseDate item's purchase date
     * @param location item's location
     */
    public CollectionItem(String name, Date purchaseDate, int location)
    {
        this.name = name;
        this.purchaseDate = purchaseDate;
        this.location = location;
        this.isLent = false;
    }

    /**
     * Returns the item's ID.
     * @return item's ID
     */
    public int getId()
    {
        return id;
    }

    /**
     * Sets the item's ID.
     * @param id ID to be set
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * Returns item's name.
     * @return item's name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets item's name.
     * @param name name to be set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Returns the item's purchase date.
     * @return item's purchase date
     */
    public Date getPurchaseDate()
    {
        return purchaseDate;
    }

    /**
     * Sets the item's purchase date.
     * @param purchaseDate date to be set
     */
    public void setPurchaseDate(Date purchaseDate)
    {
        this.purchaseDate = purchaseDate;
    }

    /**
     * Returns item's location.
     * @return item's location
     */
    public int getLocation()
    {
        return location;
    }

    /**
     * Sets item's location.
     * @param location location to be set
     */
    public void setLocation(int location)
    {
        this.location = location;
    }

    /**
     * Checks if the item is lent.
     * @return true if the item is lent, false otherwise
     */
    public boolean isIsLent()
    {
        return isLent;
    }

    /**
     * Sets the item's loan state.
     * @param isLent boolean value expressing if item is lent
     */
    public void setIsLent(boolean isLent)
    {
        this.isLent = isLent;
    }
}
