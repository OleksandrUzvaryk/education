package consultations.cons_03_07_12_lotto_game.lotto.repository;

import consultations.cons_03_07_12_lotto_game.lotto.entity.Cart;

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
