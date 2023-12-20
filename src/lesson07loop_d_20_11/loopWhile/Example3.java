package lesson07loop_d_20_11.loopWhile;

import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {

        boolean condition = true;
        Cat cat;
        while(condition){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter cat name!!!");
            String inputCatName = scanner.toString();
            System.out.println("Please enter cat name!!!");
            String inputCatBreed = scanner.toString();

            if ((inputCatName.equals(""))&&(inputCatBreed.equals(""))){
                condition = false;
            } else{
                    cat = new Cat(inputCatName, inputCatBreed);
                    System.out.println(cat);

                }
            }
        }
    }

