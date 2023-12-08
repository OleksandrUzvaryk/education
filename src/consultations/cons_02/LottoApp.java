package consultations.cons_02;

import consultations.cons_02.entity.Cart;
import consultations.cons_02.repository.CartRepository;
import consultations.cons_02.service.CartServices;

import java.util.Arrays;

public class LottoApp {
    public static void main(String[] args) {
        CartServices cartServices = new CartServices();
        CartRepository cartRepository = new CartRepository(5);

        System.out.println(Arrays.toString(cartRepository.getCarts()));

        Cart[] carts = cartRepository.getCarts();

        for (int i = 0; i < carts.length; i++) {
            carts[i] = new Cart(15);
            cartServices.fillNewCard(carts[i], 90);
            System.out.println(Arrays.toString(carts[i].getCartArray()));
        }

        //System.out.println(Arrays.toString(cartRepository.getCarts()));

    }
}
