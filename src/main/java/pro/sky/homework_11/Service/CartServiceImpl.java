package pro.sky.homework_11.Service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import pro.sky.homework_11.Cart.Cart;
import pro.sky.homework_11.Interface.CartService;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    private final Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public int cartID() {
        return cart.id();
    }

    @Override
    public void add(List<Integer> productIDs) {
        for (Integer ID : productIDs) {
            cart.add(ID);
        }
    }

    @Override
    public List get() {
        return cart.get();
    }


}
