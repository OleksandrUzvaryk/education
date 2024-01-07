package example.app.pocker.service;


import example.app.pocker.entity.Card;
import example.app.pocker.entity.Players;

public class CardTableUtil {

    public void createPlayer(Players[] players) {

        for (int i = 0; i < players.length; i++) {
            players[i] = new Players("Player " + (i + 1));
        }
    }

    public void dealCards(Card[] deckShuffle, int numberOfCards, int numberOfPlayers, Players[] players) {
        int cardCounter = 0;

        for (int i = 0; i < numberOfCards; i++) {
            for (int j = 0; j < numberOfPlayers; j++) {
                players[j].getCardsOfPlayer()[i] = deckShuffle[cardCounter];
                cardCounter++;
            }
        }


    }


}
