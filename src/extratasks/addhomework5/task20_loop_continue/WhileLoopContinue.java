package extratasks.addhomework5.task20_loop_continue;

public class WhileLoopContinue {

    public static void main(String[] args) {

       int x =1;
       while (x < 10){
           x++;
           if(x%2 == 0)
           {continue;}
           System.out.println("i = " + x);


        }
    }
}
