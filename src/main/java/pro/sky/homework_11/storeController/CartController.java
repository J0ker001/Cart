package pro.sky.homework_11.storeController;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.homework_11.Interface.CartService;

import java.util.List;


@RestController
@RequestMapping("/order")
public class CartController {

    private final CartService cartService;

    public CartController(@Qualifier("regularCart") CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public String add(@RequestParam("id") List<Integer> productIDs) {
        cartService.add(productIDs);
        return "Добавлено в корзину " + productIDs + " в корзину  " + cartService.cartID();
    }

    @GetMapping("/get")
    public List get() {
        return cartService.get();
    }

}
