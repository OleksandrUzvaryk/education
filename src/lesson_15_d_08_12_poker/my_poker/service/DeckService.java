package lesson_15_d_08_12_poker.my_poker.service;

import lesson_15_d_08_12_poker.my_poker.entity.Card;

public class DeckService {

    public void fillDeck(Card[]deck) {
        String[] cardValue = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] cardSuit = {"♠️", "♣️", "♦️", "♥️"};
        int counter = 0;
        for (int i = 0; i < cardValue.length; i++) {
            for (int j = 0; j < cardSuit.length; j++) {
                deck[counter] = new Card(cardValue[i], cardSuit[j]);
                counter++;
            }
        }
    }

    public Card[] shuffleDeck(Card[] deck) {
        Card[] shuffleDeck = deck.clone();

        for (int i = shuffleDeck.length - 1; i > 1; i--) {
            int indexRandom = (int) (Math.random() * i);

            Card tempCard = shuffleDeck[i];
            shuffleDeck[i] = shuffleDeck[indexRandom];
            shuffleDeck[indexRandom] = tempCard;
        }
        return shuffleDeck;

    }

}
