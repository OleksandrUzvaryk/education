package example.app.pocker.entity;

public class Cards {

    private Card [] deck = new Card[52];
    private Card [] deckShuffle = new Card[52];


    public Card[] getDeck() {
        return deck;
    }

    public void setDeck(Card[] deck) {
        this.deck = deck;
    }

    public Card[] getDeckShuffle() {
        return deckShuffle;
    }

    public void setDeckShuffle(Card[] deckShuffle) {
        this.deckShuffle = deckShuffle;
    }
}
