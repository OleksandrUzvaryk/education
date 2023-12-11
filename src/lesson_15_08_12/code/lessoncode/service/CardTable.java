package lesson_15_08_12.code.lessoncode.service;

import lesson_15_08_12.code.lessoncode.entity.Cards;
import lesson_15_08_12.code.lessoncode.entity.Player;
import lesson_15_08_12.code.lessoncode.service.utils.CardTableUtil;
import lesson_15_08_12.code.lessoncode.service.utils.DeckService;
import lesson_15_08_12.code.lessoncode.service.utils.InputData;
import lesson_15_08_12.code.lessoncode.service.utils.PrintServices;

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

    deckService.fillDeck(cards.getDeck());
    printServices.printDeck(cards.getDeck(), "----------- Create New Deck -----------");

    cards.setDeckShuffle(deckService.deckShuffle(cards.getDeck()));

    printServices.printDeck(cards.getDeckShuffle(), "--------- Deck after shuffle --------");

    cardTableUtil.createPlayers(players);
    cardTableUtil.dealCards(cards.getDeckShuffle(), numberCardsForEachPlayer, numberOfPayers, players);
    printServices.printPlayers(players);



}


}
