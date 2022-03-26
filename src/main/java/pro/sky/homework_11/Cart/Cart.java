package pro.sky.homework_11.Cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Integer> products = new ArrayList<>();
    int id;
    static int counter = 1;

    public Cart() {
        this.id = counter++;
    }

    public int id() {
        return id;
    }

    public void add(int productID) {
        products.add(productID);
    }

    public List get() {
        return products;
    }
}
