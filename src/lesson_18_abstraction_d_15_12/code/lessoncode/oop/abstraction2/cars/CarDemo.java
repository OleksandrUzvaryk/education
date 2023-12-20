package lesson_18_abstraction_d_15_12.code.lessoncode.oop.abstraction2.cars;

public class CarDemo {

    public static void main(String[] args) {


        Sedan sedan1= new Sedan("Volvo", 50);
        Sedan sedan2= new Sedan("Bmw", 80);

        SportCar sportCar1 = new SportCar("Ferrary", 120);

        Truck truck = new Truck("Man", 40);

        Car [] cars = {sedan1, sedan2,sportCar1, truck};

        for (int i = 0; i <cars.length ; i++) {
            cars[i].speedUp();
        }











        }
    }

