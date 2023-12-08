package consultations.cons_03.lotto;

import consultations.cons_03.lotto.entity.Cart;
import consultations.cons_03.lotto.service.LottoGame;
import consultations.cons_03.lotto.repository.CartRepository;
import consultations.cons_03.lotto.service.CartServices;

import java.util.Arrays;

public class LottoApp {
    public static void main(String[] args) {

        LottoGame game = new LottoGame(15, 90);

        game.startGame();
    }
}
