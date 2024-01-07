package consultations.cons_03_lotto_game_d_07_12.lotto;

import consultations.cons_03_lotto_game_d_07_12.lotto.service.LottoGame;

public class LottoApp {
    public static void main(String[] args) {

        LottoGame game = new LottoGame(15, 90);

        game.startGame();
    }
}
