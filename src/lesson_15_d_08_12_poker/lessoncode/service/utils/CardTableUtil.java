package lesson_15_d_08_12_poker.lessoncode.service.utils;

import lesson_15_d_08_12_poker.lessoncode.entity.Card;
import lesson_15_d_08_12_poker.lessoncode.entity.Player;

public class CardTableUtil {

    public void createPlayers(Player[] players){  // принимаем массив, проходимся по нему и автоматически в каждый елемент присваиваем значение i+1
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player("Players # " + (i+1));
        }
    }


    public void dealCards(Card[] deck, int numberCardsForEachPlayers, int numberOfPayers, Player[] players){ // раздача карт игрокам ,
        // принимаем масив и раздаем каждому по 1 карте в 5 итераций (i - по 1 карте, каждому j игроку, в 5 итераций )
        int counter = 0 ;
        for (int i = 0; i < numberCardsForEachPlayers; i++) {
            for (int j = 0; j < numberOfPayers; j++) {
                players[j].getPlayerCards()[i] = deck[counter];
               counter++;
            }

        }
    }


}
