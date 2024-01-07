package lesson_15_d_08_12_poker.my_poker.entity;

import lesson_15_d_08_12_poker.my_poker.entity.Card;

public class Cards {

    private Card[] deck = new Card[52];
    private Card[] deckSchuffle = new Card[52];

    public Card[] getDeck() {
        return deck;
    }

    public void setDeck(Card[] deck) {
        this.deck = deck;
    }

    public Card[] getDeckSchuffle() {
        return deckSchuffle;
    }

    public void setDeckSchuffle(Card[] deckSchuffle) {
        this.deckSchuffle = deckSchuffle;
    }
}
