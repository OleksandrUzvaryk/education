package lesson_15_d_08_12_poker.my_poker.service;

import lesson_15_d_08_12_poker.my_poker.entity.Cards;
import lesson_15_d_08_12_poker.my_poker.entity.Player;

public class CardTable {

    Cards cards = new Cards(); // sozdanie pustoi kolodu
    DeckService deckService = new DeckService(); // создаем докступ к наполнению и перемешиванию колоды

    CardTableUtil cardTableUtil = new CardTableUtil(); // создаем докступ к создание игроков и раздача карт

    PrintServices printServices = new PrintServices(); // создаем докступ к печать колоды и игроков

    InputData inputData = new InputData(); // создаем докступ к количеству игроков

    public int numberOfPlayers = inputData.enterNumberOfPlayers(); // возврат 5 игроков - print

    public Player [] players = new Player[numberOfPlayers]; // sozdanie massiva dly igrokov

    int numberCardsForPlayer = 5;

    public void game (){

       deckService.fillDeck(cards.getDeck()); // zapolnili kolodu
       printServices.printDeck(cards.getDeck(), "Create new Deck!!!"); // pechat kolodu
       cards.setDeckSchuffle(deckService.shuffleDeck(cards.getDeck())); // передача в массив декшафл - результата роботы метода перемешивания
       printServices.printDeck(cards.getDeckSchuffle(), " Dekk after shuffle!");
       cardTableUtil.createPlayers(players); // создание игроков
       cardTableUtil.dealCards(cards.getDeckSchuffle(), numberCardsForPlayer,numberOfPlayers,players); // роздача карт
       printServices.printPlayers(players);


    }


}
