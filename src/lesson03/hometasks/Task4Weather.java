package lesson03.hometasks;

public class Task4Weather {

    public double findAverageTemp(int monday, int tuesday, int wednesday, int thursday, int friday, int saturday, int sunday){
        double averageTemperature = (int)(monday + tuesday + wednesday + thursday + friday + saturday + sunday) / 7;
         return averageTemperature;

}

}
