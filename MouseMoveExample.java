import java.awt.Robot;
import java.awt.AWTException;

public class MouseMoveExample {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();

            robot.mouseMove(0, 0);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
