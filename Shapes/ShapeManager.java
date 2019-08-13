import java.util.ArrayList;
import java.util.Scanner;

public class ShapeManager {
    
    public static void main (String[] args) {
        
        String version = "v1.3.0";
        System.out.println("SHAPE MANAGER! " + version);
        
        ArrayList<Circle> circles = new ArrayList<Circle>();
        ArrayList<Square> squares = new ArrayList<Square>();
        
        squares.add(new Square());
        squares.add(new Square(4));
        squares.add(new Square(5, "MySquare"));
        
        Circle circle01 = new Circle();
        Circle circle02 = new Circle(4);
        Circle circle03 = new Circle(5, "MyCircle");
        
        circles.add(circle01);
        circles.add(circle02);
        circles.add(circle03);
        
        System.out.println(squares);
        System.out.println();
        System.out.println(circles);
        
        
        // System.out.println(square01);
        // System.out.println(square02);
        // System.out.println(square03);
        
        // System.out.println();
        
        // System.out.println(circle01);
        // System.out.println(circle02);
        // System.out.println(circle03);
    }
    
}
