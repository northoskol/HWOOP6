// В классе Order:
package task02;

import java.util.ArrayList;
import java.util.List;

public class Order {
    // Была удалена переменная orderCounter, так как она больше не используется.
    // Метод setListProd был переименован в addProduct.


    private final int orderNumber;
    private final List<String> productList;

    public Order(int orderNumber) {
        this.orderNumber = orderNumber;
        this.productList = new ArrayList<>();
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public List<String> getProductList() {
        return productList;
    }

    public void addProduct(String productName) {
        productList.add(productName);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", productList=" + productList +
                '}';
    }

    public void setListProd(String штаны) {
    }
}
