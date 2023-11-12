package lesson03.hometasks;

public class Task2Var {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    // реализация через метод без возврата результата
    public void findMidNum1(){
        int result = (a + b + c + d + e + f + g + h + i + j) / 10;
        System.out.println("Result = " + result);
    }
    public void findMidNum2(){
        double result = (double)(a + b + c + d + e + f + g + h + i + j) / 10;
        System.out.println("Real result = " +result);
    }
    // реализация через метод с возвртом результата
   public int findMidNum3(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j){
       int result = (a + b + c + d + e + f + g + h + i + j) / 10;
      return result;
   }
   public double findMidNum4(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j){
       double result = (double)(a + b + c + d + e + f + g + h + i + j) / 10;
       return result;
  }
}

