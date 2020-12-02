import java.util.*;
//TJ
//12/2/20
//The class uses the ArrayList datastructure to store a list of ItemOrders. 
//It may add new ItemOrders without erroneously duplicating them and calculate the price of the orders.
public class ShoppingCart {
    private ArrayList<ItemOrder> cart = new ArrayList<ItemOrder>();
    private boolean discount;
    //Default constructor
    public ShoppingCart() {
        return;
    }
    //Adds an order to the cart or overrides an existing order for the same product
    public void add(ItemOrder order) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).getItem().toString().equals(order.getItem().toString())) {
                cart.set(i, order);
                return;
            }
            
        }
        cart.add(order);
        

    }
    //Sets whether there is a discount
    public void setDiscount(boolean d) {
        discount = d;
    }
    //Returns the total cost of the cart
    public double getTotal() {
        double price = 0;
        for (int i = 0; i < cart.size(); i++) {
            price += (double)(cart.get(i).getPrice());
        }
        if (discount) {
            price *= 0.9;
        }
        return price;
    }
}
