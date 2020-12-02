import java.util.*;
public class ShoppingCart {
    private ArrayList<ItemOrder> cart = new ArrayList<ItemOrder>();
    private boolean discount;
    public ShoppingCart() {
        return;
    }
    public void add(ItemOrder order) {
        cart.add(order);
    }

    public void setDiscount(boolean d) {
        discount = d;
    }

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
