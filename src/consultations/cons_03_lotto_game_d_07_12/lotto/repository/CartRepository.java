package consultations.cons_03_lotto_game_d_07_12.lotto.repository;

import consultations.cons_03_lotto_game_d_07_12.lotto.entity.Cart;

public class CartRepository {

    Cart[] carts;

    public CartRepository(int numberOfCart) {
        this.carts = new Cart[numberOfCart];
    }

    public Cart[] getCarts() {
        return carts;
    }

    public void setCarts(Cart[] carts) {
        this.carts = carts;
    }
}
