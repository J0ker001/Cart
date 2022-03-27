package pro.sky.homework_11.Service;

import org.springframework.stereotype.Service;
import pro.sky.homework_11.Interface.CartService;

import java.util.List;

@Service
public class ServiceVIP implements CartService {

    @Override
    public int cartID() {
        return 777;
    }

    @Override
    public void add(List<Integer> productIDs) {

    }

    @Override
    public List get() {
        return null;
    }
}
