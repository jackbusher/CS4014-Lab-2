import java.util.Scanner;
import java.awt.geom.Point2D;

public class TestMyPoint {
    public static void main() {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(1,1);
        
        System.out.println("The distance between point 1 and point 2 is " + point1.distance(point2));
        System.out.println("The distance between point 1 and point 2 is " +point1.distance(5,5));
        
        
        
        
    }
}