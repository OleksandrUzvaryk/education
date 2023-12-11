package consultations.cons_03_07_12_lotto_game.lotto;

import consultations.cons_03_07_12_lotto_game.lotto.service.LottoGame;

public class LottoApp {
    public static void main(String[] args) {

        LottoGame game = new LottoGame(15, 90);

        game.startGame();
    }
}
