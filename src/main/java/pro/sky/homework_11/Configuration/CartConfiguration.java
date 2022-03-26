package pro.sky.homework_11.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pro.sky.homework_11.Cart.Cart;

@Configuration
public class CartConfiguration {

    @Bean
    @Scope("session")
    public Cart cart() {
        return new Cart();
    }
}
