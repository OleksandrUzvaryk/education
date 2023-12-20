package example.methods;

public class Find_Divider_In_Range {


    // Распечатать все числа от 1 до 100, делящиеся на 5 без остатка. Использовать цикл do-while.

    public void divByFive (int myNumber){
        int i = 1;
        do {
            if (i % 5 == 0){System.out.println(i);}
            i++;}
        while (i <= 100);
    }

    // Распечатать только первые 7 чисел от 1 до 100, делящиеся на 5 без остатка. Использовать цикл while.
    public int[] firstSeven(){
        int[] result = new int[7];
        int i = 1;
        int count = 0;
        while (i <= 100 && count < 7) {
            if (i % 5 == 0){
                result[count] = i;
                count++;
            }
            i++;
        }

        return result;
    }



}
