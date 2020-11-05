import java.util.Scanner;
import java.awt.geom.Point2D;

public class MyPoint {
 private double x,y;
 
    public MyPoint() {
        x=0;
        y=0;
        
    }
    public MyPoint(double x, double y) {
     this.x = x;
     this.y = y;
    }
    
    public double returnX () {
        return x;
    }
    
    public double returnY() {
     return y;   
    }
    
    public double[] returnCoordinates() {
        double[] coordinates = new double[2];
        coordinates[0] = x;
        coordinates[1] = y;
        
        return coordinates;
        
    }
    
    public double distance(MyPoint other) {
        double distance = Math.sqrt(((this.x-other.x)*(this.x-other.x)) + ((this.y-other.y)*(this.y-other.y)));
        return distance;
    }
    
    public double distance(double x2, double y2) {
        final double distance = Math.sqrt(((x2-x)*(x2-x))+((y2-y)*(y2-y)));
        return distance;
    }
}

