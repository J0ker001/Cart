package pro.sky.homework_11.Cart;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Cart {

    private List<Integer> products = new ArrayList<>();
    private int id;
    private static int counter = 1;

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
        return Collections.unmodifiableList(products);
    }
}
