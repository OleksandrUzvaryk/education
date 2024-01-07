package lesson07loop_d_20_11.hometask.onemore.lift;

public class Lift {

    public int numberOfIter(int maxFlor, int stepUp, int stepDown) {

        if (stepUp < stepDown) {
            System.out.println("Lift doesnt work!");
            return -1;
        }

        int currentFlor = 0;
        int counter = 0;

        while (currentFlor < maxFlor) {
            currentFlor = currentFlor + stepUp;
            counter++;

        if (currentFlor >= maxFlor) {
            return counter;
        }
        currentFlor = currentFlor - stepDown;

        } return counter;
    }
}
