package pro.sky.homework_11.storeController;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.homework_11.Cart.Cart;

import java.util.List;

@Scope("session")
@RestController
@RequestMapping("/order")
public class CartController {

    public final Cart cart;

    public CartController(Cart cart) {
        this.cart = cart;
    }


    @GetMapping("/hello")
    public int hello() {
        return cart.id();
    }

    @GetMapping("/add")
    public String add(@RequestParam("id") String productIDs) {
        for (var id : productIDs.split(",")) {
            cart.add(Integer.parseInt(id));
        }
        return "Добывлено в корзину " + productIDs + " в корзину  " + cart.id();
    }

    @GetMapping("/get")
    public List get() {
        return cart.get();
    }
}
