package lesson07loop_d_20_11.hometask.onemore.addloop;

public class Task2 {


    public void prinrDSev(int start, int end) {

        int counter = 0;
        while (start < end  && counter<7) {
            if (start % 5 == 0 ) {
                System.out.println(start);
                counter++;
            }
            start++;
        }

    }
}

