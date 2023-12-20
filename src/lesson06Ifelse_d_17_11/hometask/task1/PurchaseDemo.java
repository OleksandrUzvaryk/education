package lesson06Ifelse_d_17_11.hometask.task1;

public class PurchaseDemo {
    public static void main(String[] args) {

       Purchase result = new Purchase();
       boolean answer = result.canBuy(true,false);
       System.out.println("I can buy food, this is " + answer);

    }
}
   /* Создайте две переменные  dekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
        Реализует логический метод canBuy, возвращающий true
        ** Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
        Отобразите строку «Я могу купить еду, это ……» и значение.*/