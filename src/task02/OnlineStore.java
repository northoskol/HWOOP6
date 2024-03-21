// В классе OnlineStore:
package task02;

import java.util.ArrayList;
import java.util.List;

public class OnlineStore {
    // Была удалена переменная orderCounter, так как она больше не используется.
    private final List<Product> products;
    private final List<Order> orders;

    public OnlineStore() {
        products = new ArrayList<>();
        orders = new ArrayList<>();
    }

    void createOrder(Order order) {
        orders.add(order);
    }

    @Override
    public String toString() {
        return "OnlineStore{" +
                "orders=" + orders +
                '}';
    }

    public void addProd(Product штаны) {
    }
}
