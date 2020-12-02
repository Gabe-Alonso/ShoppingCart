//Written by Yash Mehta
//December 2, 2020
//ItemOrder Class
//This class stores information about certain item as well as the quantity ordered.
//Its methods aid other processes and return the price as well as a reference to the item ordered. 


public class ItemOrder {
    private Item product; 
    private int numberOf;

    //constructor given item and quantity
    public ItemOrder (Item item, int quantity)
    {
        this.product = item;
        this.numberOf = quantity;
    }

    //return cost of said item, looks to Item class for price
    public double getPrice()
    {
        return product.priceFor(numberOf);
    }

    //return reference to item ordered
    public Item getItem()
    {
        return product;
    }
}