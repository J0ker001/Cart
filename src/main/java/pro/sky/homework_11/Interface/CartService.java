package pro.sky.homework_11.Interface;

import java.util.List;

public interface CartService {
    int cartID();

    void add(List<Integer> productIDs);

    List get();
}
