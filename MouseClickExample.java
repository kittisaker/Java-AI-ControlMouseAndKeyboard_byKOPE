import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.InputEvent;

public class MouseClickExample {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();

            Thread.sleep(3000);

            robot.mouseMove(265, 77);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
