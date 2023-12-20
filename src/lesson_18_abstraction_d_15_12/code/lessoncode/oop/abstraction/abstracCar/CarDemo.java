package lesson_18_abstraction_d_15_12.code.lessoncode.oop.abstraction.abstracCar;

public class CarDemo {

    public static void main(String[] args) {

        SportCar sportCar1 = new SportCar("Hurracan");
        SportCar sportCar2 = new SportCar("Diablo");

        Sedan sedan1 = new Sedan("Korolla");
        Sedan sedan2 = new Sedan("Polo");

        Truck truck1 = new Truck("S460");
        Truck truck2 = new Truck("L325");



        Car [] car = {sportCar1, sportCar2, sedan1, sedan2, truck1, truck2};
        for (int i = 0; i < car.length; i++){
            System.out.println(car[i].getType());
            car[i].acceleration();
        }

        }
    }

