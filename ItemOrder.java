public class ItemOrder {
    private Item product; 
    private int numberOf;

    public ItemOrder (Item item, int quantity)
    {
        this.product = item;
        this.numberOf = quantity;
    }

    public double getPrice(String item)
    {
        return product.priceFor(numberOf);
    }

    public Item getItem()
    {
        return product;
    }
}
