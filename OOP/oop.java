package java_basics.OOP;


public class oop {
    public final int value = 0;
    public static void main(String[] args){
        Robot robot = new Robot();
        int[] toXArr = {10,-10,3,2};
        int[] toYArr = {1,-3,6,-10};
        for (int i=0; i<toXArr.length; i++) {
            System.out.printf("Test#%d",i);
            moveRobot(robot, toXArr[i], toYArr[i]);
            if (robot.getX() ==  toXArr[i] && robot.getY() == toYArr[i]) {
                System.out.println("Ok");
            } else {
                System.out.println("Error");
            }
        }
    }
    public static void moveRobot(Robot robot, int toX, int toY) {
        System.out.println("moving robot");
        int startX = robot.getX();
        int startY = robot.getY();
        int moveY = Math.abs(toY - startY);
        int moveX = Math.abs(toX - startX);
        Direction curDir = robot.getDirection();
        // turn to y
        if (startY>toY){
            while (robot.getDirection() != Direction.DOWN){
                robot.turnLeft();
            }
        }
        else{
            while (robot.getDirection() != Direction.UP){
                robot.turnLeft();
            }

        }
        //move to curDir by y
        for (int i=0;i<moveY;i++){
            robot.stepForward();
        }
        // turn to x
        if (startX>toX){
            while (robot.getDirection() != Direction.LEFT){
                robot.turnLeft();
            }
        }
        else{
            while (robot.getDirection() != Direction.RIGHT){
                robot.turnLeft();
            }

        }
        //move to curDir by y
        for (int i=0;i<moveX;i++){
            robot.stepForward();
        }

        System.out.printf("Final coords: x=%d, y=%d%n",robot.getX(), robot.getY());


    }
}
