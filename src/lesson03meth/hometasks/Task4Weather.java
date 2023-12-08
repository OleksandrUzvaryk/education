package lesson03meth.hometasks;

public class Task4Weather {

    // реализация через метод с возвратом значений
    public double findAverageTemp(int monday, int tuesday, int wednesday, int thursday, int friday, int saturday, int sunday){
        double averageTemperature = (double) (monday + tuesday + wednesday + thursday + friday + saturday + sunday) / 7;
         return averageTemperature;

}

}
