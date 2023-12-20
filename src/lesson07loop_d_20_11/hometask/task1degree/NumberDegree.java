package lesson07loop_d_20_11.hometask.task1degree;

public class NumberDegree {
    public static void main(String[] args) {
        int number = 3;
        int degree = 3;
        //double result = Math.pow(number,degree);
        int degree1 = number;//3
        int degree2 = number*degree1;//9
        int degree3 = number*degree2;//27
        int resultDegree = degree3;
                System.out.println("Number in degree: " + resultDegree);
                double resultMidlAr = (degree1 + degree2 + degree3) / degree;
        System.out.println("Medium arefmatic: " + resultMidlAr);

    }
}
