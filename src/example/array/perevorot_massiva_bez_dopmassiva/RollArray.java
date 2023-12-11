package example.array.perevorot_massiva_bez_dopmassiva;

public class RollArray {

    public static void main(String[] args){

       int [] myArray = {1,2,3,4,5,6,7,8,9,10};

        int length = myArray.length;
        int temp;

        for (int i = 0; i < length/2; i++) {
            temp = myArray[length-i-1];
            myArray[length-i-1] = myArray[i];
            myArray[i] = temp;
        }

        for (int i=0; i<myArray.length; i++){
            System.out.print(myArray[i]);
        }
    }

}
