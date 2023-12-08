package lesson07loop.hometask.add_loop;

public class Task2DivSeven {

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
