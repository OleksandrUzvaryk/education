package example.search;

public class LinearSearch {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6,7,8};
        int searchNumber = 8;
        int serachIndex = -1;

        for (int i = 0; i < array.length ; i++) {
            if (array[i] == searchNumber){
                serachIndex = i;
            }
        }
        if (serachIndex>=0){
            System.out.println("My number is - " + searchNumber + " has index " + serachIndex);
        }else {
            System.out.println("Number is not in array");
        }



    }
}
