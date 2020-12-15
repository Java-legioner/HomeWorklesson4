package com.example;

public class Application {
    public static void main(String[] args) {

        Robot robot = new Robot();
        robot.setName("Robot");
        robot.setSay("я просто працюю");
        robot.work();

        CoffeRobot coffeRobot = new CoffeRobot();
        coffeRobot.setName("CoffeRobot");
        coffeRobot.setSay("я варю каву");
        coffeRobot.work();

        RobotDancer robotDancer = new RobotDancer("RobotDancer", "я просто танцюю");
        robotDancer.work();

        RobotCoocker robotCoocker = new RobotCoocker("RobotCoocker", "я просто готую");
        robotCoocker.work();


        Robot[] robots = new Robot[3];
        robots[0] = new CoffeRobot("RobotDancer", "я просто працюю");
        robots[1] = new RobotDancer("RobotDancer", "я просто танцюю");
        robots[2] = new RobotCoocker("RobotCoocker", "я просто готую");
        for (int i = 0; i < robots.length ; i++) {
            robots[i].work();
        }
    }
}
