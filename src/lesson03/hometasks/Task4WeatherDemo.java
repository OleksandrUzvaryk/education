package lesson03.hometasks;

public class Task4WeatherDemo {
    public static void main(String[] args) {

    Task4Weather averageTemp = new Task4Weather();
    double result = averageTemp.findAverageTemp(7,11,9,10,14,8,9);
        System.out.println("Средня температура за прошедшую неделю составила : " + result);
    }
}


