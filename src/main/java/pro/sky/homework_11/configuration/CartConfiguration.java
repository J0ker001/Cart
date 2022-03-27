package pro.sky.homework_11.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pro.sky.homework_11.Cart.Cart;
import pro.sky.homework_11.Interface.CartService;
import pro.sky.homework_11.Service.CartServiceImpl;
import pro.sky.homework_11.Service.ServiceVIP;

@Configuration
public class CartConfiguration {

    private final Cart cart;

    public CartConfiguration(Cart cart) {
        this.cart = cart;
    }

    @Bean
    CartService regularCart() {
        return new CartServiceImpl(cart);
    }

    @Bean
    CartService vipCart() {
        return new ServiceVIP();
    }
}
