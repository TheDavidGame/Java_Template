package ex8;

import ex8.Publisher.listener.EmailNotificationListener;
import ex8.Publisher.listener.LogOpenListener;

import ex8.SnapShot.editor.Editor;
import ex8.SnapShot.shapes.Circle;
import ex8.SnapShot.shapes.CompoundShape;
import ex8.SnapShot.shapes.Dot;
import ex8.SnapShot.shapes.Rectangle;

import java.awt.*;

public class Main_8 {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
