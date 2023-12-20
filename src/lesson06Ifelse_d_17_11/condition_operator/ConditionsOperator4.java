package lesson06Ifelse_d_17_11.condition_operator;

public class ConditionsOperator4 {

    public static void main(String[] args) {
                // идем на уличу при условии солнца и без дождя
        boolean isRain = true;
        boolean isSun = true;

        if (isSun && !isRain){
            System.out.println("Go for a walk!!!");
        }else{
            System.out.println("Stay at home!!!");
        }
    }
}
