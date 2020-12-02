import java.text.*; 

public class Item {
    private String name;
    private double price;
    private int bulkQuantity;
    private double bulkPrice;
    
    
    Item(String nameIn, double priceIn){
        if(priceIn < 0){
            throw new IllegalArgumentException();
        }
        name = nameIn;
        price = priceIn;
        bulkQuantity = 0;
        bulkPrice = 0;
    }

    Item(String nameIn, double priceIn, int bulkQuantityIn, double bulkPriceIn){
        if(priceIn < 0 || bulkQuantityIn < 0 || bulkPriceIn < 0){
            throw new IllegalArgumentException();
        }
        name = nameIn;
        price = priceIn;
        bulkQuantity = bulkQuantityIn;
        bulkPrice = bulkPriceIn;
    }

    public double priceFor(int quantity){
        if(quantity < 0){
            throw new IllegalArgumentException();
        }
        double toReturn = 0;
        if(bulkQuantity != 0){
            int bulkmultiplier = quantity / bulkQuantity;
            toReturn = toReturn + bulkmultiplier * bulkPrice;
            toReturn = toReturn + price * (quantity % bulkQuantity);

        }
        else{
            toReturn = toReturn + price * quantity;
        }
        return toReturn;
    }

    public String toString(){
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        if(bulkPrice == 0){
            return name + ", " + nf.format(price);
        }
        return name + ", " + nf.format(price) + " Bulk deal: " + bulkQuantity + " for " + bulkPrice;
    }
}
