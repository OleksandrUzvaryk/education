package lesson03meth.calculator2;

public class CalculatorNewModel {

    public int sum(int x, int y){
        int result = x + y;
        return result;
    }

    public int sub(int x, int y){
        int result = x - y;
        return result;
    }

    public int multipl(int x, int y){
        int result = x * y;
        return result;
    }

    public double div(int x, int y){
        //double result = (double)x / y;
        //return result;
        return (double) x / y;
        }

}
