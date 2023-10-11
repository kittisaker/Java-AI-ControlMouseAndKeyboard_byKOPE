import java.awt.MouseInfo;
import java.awt.Point;

public class MousePositionExample {
    public static void main(String[] args) {
        // Get the current mouse cursor's position
        Point mousePosition = MouseInfo.getPointerInfo().getLocation();

        int mouseX = (int) mousePosition.getX();
        int mouseY = (int) mousePosition.getY();

        System.out.println("Mouse X Position : " + mouseX);
        System.out.println("Mouse Y Position : " + mouseY);
    }
}
