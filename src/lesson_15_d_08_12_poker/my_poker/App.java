package lesson_15_d_08_12_poker.my_poker;

import lesson_15_d_08_12_poker.my_poker.entity.Card;
import lesson_15_d_08_12_poker.my_poker.entity.Cards;
import lesson_15_d_08_12_poker.my_poker.service.CardTable;
import lesson_15_d_08_12_poker.my_poker.service.DeckService;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        CardTable cardTable = new CardTable();

        cardTable.game();












        /*Cards cards = new Cards();
        DeckService service = new DeckService();
        //System.out.println(Arrays.toString(cards.getDeck()));

        service.fillDeck(cards.getDeck());
        System.out.println(Arrays.toString(cards.getDeck()));
        System.out.println("___________________________________");

        Card[] deckShuffle = service.shuffleDeck(cards.getDeck());
        System.out.println(Arrays.toString((deckShuffle)));

        System.out.println("___________________________________");

        deckShuffle = service.shuffleDeck(deckShuffle);
        System.out.println(Arrays.toString(deckShuffle));
        System.out.println("___________________________________");

        deckShuffle = service.shuffleDeck(deckShuffle);
        System.out.println(Arrays.toString(deckShuffle));*/

    }

}
