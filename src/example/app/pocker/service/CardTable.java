package example.app.pocker.service;

import example.app.pocker.entity.Cards;
import example.app.pocker.entity.Players;


public class CardTable {

    Cards cards= new Cards(); // 2 empty array

    DeckService deckService = new DeckService();

   PrintService printService = new PrintService();

   CardTableUtil cardTableUtil = new CardTableUtil();

    InputData inputData = new InputData();

    int numberOfPlayers = inputData.enterNumberOfPlayers(); // print number of player

    Players [] players = new Players[numberOfPlayers];

    int numberCardsForOnePlayer = 5;

   public void startGame (){

       deckService.fillDeck(cards.getDeck());
       printService.printDeck(cards.getDeck(), " My new Deck here!");
       cards.setDeckShuffle(deckService.shufleDeck(cards.getDeck()));
       printService.printDeck(cards.getDeckShuffle(), " My shuffle deck here!");
       cardTableUtil.createPlayer(players);
       //printService.printPlayer(players);
       cardTableUtil.dealCards(cards.getDeckShuffle(),numberCardsForOnePlayer,numberOfPlayers,players);
       printService.printPlayer(players);
    }



}
