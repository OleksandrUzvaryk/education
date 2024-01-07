package lesson08arrays_d_22_11.hometask.onemore.task4;

public class Demo {
    public static void main(String[] args) {

        int [] workingArray = {12,48,7,85,145,2,47,6934};

        Task4 service = new Task4();

        int maximum = service.findMax(workingArray);

        int minimum = service.findMin(workingArray);

        int difference = service.diferenceMaxMin(maximum,minimum);

        System.out.println("Max is " + maximum + "\nMin is " + minimum + "\nDiference is " + difference);


    }
}
