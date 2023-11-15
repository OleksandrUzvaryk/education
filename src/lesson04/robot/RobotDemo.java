package lesson04.robot;

import lesson04.robot.Robot;

public class RobotDemo {
    public static void main(String[] args) {

        Robot myRobot = new Robot("O2");
        System.out.println(myRobot.model);
        myRobot.speakHello();

        Robot myRobot2 = new Robot("M2");
        System.out.println(myRobot2.model);
        myRobot2.speakHello();

        double result = myRobot.makeChange(600,0.92);
        System.out.println("Получите свои " + result + "Euro");

    }

}
