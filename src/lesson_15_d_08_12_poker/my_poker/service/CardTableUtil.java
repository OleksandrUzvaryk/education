package lesson_15_d_08_12_poker.my_poker.service;

import lesson_15_d_08_12_poker.my_poker.entity.Card;
import lesson_15_d_08_12_poker.my_poker.entity.Player;

public class CardTableUtil {

    public void createPlayers(Player [] players){
        for (int i = 0; i < players.length ; i++) {
            players[i] = new Player("Player " + (i +1));
        }
    }

    public void dealCards (Card [] deck, int numberCardsForPlayer, int numberOfPlayer, Player [] players){
        int counter = 0;
        for (int i = 0; i <numberCardsForPlayer ; i++) {
            for (int j = 0; j <numberOfPlayer ; j++) {
                players[j].getPlayerCards()[i] = deck[counter];
                counter++;
            }
        }
    }

}
