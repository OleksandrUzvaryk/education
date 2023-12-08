package extratasks.addhomework3.task_2;

public class CircleDemo {
    public static void main(String[] args) {

        Circle ui = new Circle();
        int putSquare = ui.userInput("Please enter radius of you circle in sm: "); // запросить ввод слов через созданный метод
        int result = (int) ui.calculateArea(putSquare);
        ui.printResult(result);  //System.out.println("Square of your circle are: " + result + " sm");



    }
}
