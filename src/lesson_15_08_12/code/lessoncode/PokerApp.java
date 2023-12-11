package lesson_15_08_12.code.lessoncode;

import lesson_15_08_12.code.lessoncode.service.CardTable;

public class PokerApp {
    public static void main(String[] args) {
        /*
    - подготовительные действия с колодой карт
    - создать колоду (создать массив)   -> создать экземпляр класса Cards
    - наполнить (создать необходимое количество экземпляров класса Card) -> fillDeck()
    - перемешать  -> shuffleDeck()

    - ввод количества игроков -> userInputPlayers()

    - ввести данные игроков -> createPlayer()

    - раздать карты игрокам -> dealCards()

    - вывести информацию о картах у игроков -> printPlayersInfo()

         */

        CardTable table = new CardTable();
        table.game();

    }
}