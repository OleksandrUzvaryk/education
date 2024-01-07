package lesson_15_d_08_12_poker.my_poker.entity;

import lesson_15_d_08_12_poker.my_poker.entity.Card;

public class Player {
    private String name;

    private Card[] playerCards = new Card[5];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public Card[] getPlayerCards() {
        return playerCards;
    }

    public void setPlayerCards(Card[] playerCards) {
        this.playerCards = playerCards;
    }
}
