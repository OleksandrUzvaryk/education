package example.app.pocker.service;

import example.app.pocker.entity.Card;
import example.app.pocker.entity.Players;
import lesson_15_d_08_12_poker.my_poker.entity.Player;

import java.util.Arrays;

public class PrintService {

    public void printDeck(Card[] deck, String message) {
        System.out.println(message);
        int counterCard = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print(deck[counterCard].getValue() + deck[counterCard].getSuit() + " ,");
                counterCard++;
            }System.out.println();
        }
    }

    public void printPlayer(Players[] players) {

        for (int i = 0; i < players.length; i++) {
            System.out.println("---" + players[i].getName() + "---");
            System.out.println(Arrays.toString(players[i].getCardsOfPlayer()));
            System.out.println();
        }

    }


}
