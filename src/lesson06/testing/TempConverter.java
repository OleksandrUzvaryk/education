package lesson06.testing;

public class TempConverter {

    public double converterFromCelsiumToFahrenheit(double tempCelsius){
        double tempFahrenheit = tempCelsius * 1.8 + 32;
        return tempFahrenheit;
    }
}
