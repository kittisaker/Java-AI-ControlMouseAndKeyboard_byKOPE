# Advance Mouse and Keyboard Control : Chapter-1 The Screen and Mouse Position

## Screen Size
```java
import java.awt.Dimension;
import java.awt.Toolkit;

public class ScreenSizeExample {
    public static void main(String[] args) {
        // Get the default toolkit
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        // Get the screen size
        Dimension screenSize = toolkit.getScreenSize();

        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        System.out.println("Screen Width: " + screenWidth);
        System.out.println("Screen Height: " + screenHeight);
    }
}
```

<details>
<summary>Output : </summary>

```
Screen Width: 1280
Screen Height: 720
```

</details>

## Mouse Position
```java
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
```

<details>
<summary>Output : </summary>

```
Mouse X Position : 0
Mouse Y Position : 0

...

Mouse X Position : 1245
Mouse Y Position : 697
```

</details>

## Mouse Move
```java
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
```

## Mouse Click
```java
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
```

---
