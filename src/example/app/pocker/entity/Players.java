package example.app.pocker.entity;

public class Players {

    private String name;

    Card [] cardsOfPlayer = new Card[5];

    public Players(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card[] getCardsOfPlayer() {
        return cardsOfPlayer;
    }

    public void setCardsOfPlayer(Card[] cardsOfPlayer) {
        this.cardsOfPlayer = cardsOfPlayer;
    }
}
