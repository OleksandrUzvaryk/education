package example.app.pocker.service;

import example.app.pocker.entity.Card;

public class DeckService {


    public void fillDeck (Card [] deck){
        String[] cardValue = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] cardSuit = {"♠️", "♣️", "♦️","♥️"};

        int cardCounter =0;

        for (int i = 0; i <cardValue.length ; i++) {
            for (int j = 0; j <cardSuit.length ; j++) {
                deck[cardCounter] = new Card(cardValue[i], cardSuit[j]);
                cardCounter++;
            }
        }

    }

    public Card [] shufleDeck (Card [] deck){
        Card [] deckShuffle = deck.clone();

        for (int i = deckShuffle.length-1 ; i >1 ; i--) {
            int indexRandom = (int) (Math.random()*i);

            Card temporaryCard = deckShuffle[i];
            deckShuffle[i] = deckShuffle[indexRandom];
            deckShuffle[indexRandom] = temporaryCard;

        }
        return deckShuffle;
    }






}
