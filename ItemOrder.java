public class ItemOrder {
    private Item product; 
    private int numberOf;

    //constructor given item and quantity
    public ItemOrder (Item item, int quantity)
    {
        this.product = item;
        this.numberOf = quantity;
    }

    //return cost of said item 
    public double getPrice()
    {
        return product.priceFor(numberOf);
    }

    //return reference to item
    public Item getItem()
    {
        return product;
    }
}
