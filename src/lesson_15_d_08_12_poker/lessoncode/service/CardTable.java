package lesson_15_d_08_12_poker.lessoncode.service;

import lesson_15_d_08_12_poker.lessoncode.entity.Cards;
import lesson_15_d_08_12_poker.lessoncode.entity.Player;
import lesson_15_d_08_12_poker.lessoncode.service.utils.CardTableUtil;
import lesson_15_d_08_12_poker.lessoncode.service.utils.DeckService;
import lesson_15_d_08_12_poker.lessoncode.service.utils.InputData;
import lesson_15_d_08_12_poker.lessoncode.service.utils.PrintServices;

public class CardTable {
   Cards cards = new Cards();

   DeckService deckService = new DeckService();
   CardTableUtil cardTableUtil= new CardTableUtil();
   PrintServices printServices = new PrintServices();

    InputData iData = new InputData();
    public int numberOfPayers = iData.enterNumberOfPlayers();
    public Player[] players = new Player[numberOfPayers];

    int numberCardsForEachPlayer = 5;

public void game(){

    deckService.fillDeck(cards.getDeck()); // заполнение колоды карт
    printServices.printDeck(cards.getDeck(), "----------- Create New Deck -----------"); // вывод на печать заполненой колоды

    cards.setDeckShuffle(deckService.deckShuffle(cards.getDeck())); // перетасовывание колоды карт

    printServices.printDeck(cards.getDeckShuffle(), "--------- Deck after shuffle --------"); // вывод на печать еретасованой колоды

    cardTableUtil.createPlayers(players);  // создание игроков
    cardTableUtil.dealCards(cards.getDeckShuffle(), numberCardsForEachPlayer, numberOfPayers, players); // раздача карт игрокам
    printServices.printPlayers(players); // распечатка игроков



}


}
