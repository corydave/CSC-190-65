public class ShapeManager {
    
    public static void main (String[] args) {
        
        String version = "v1.2.0";
        System.out.println("SHAPE MANAGER! " + version);
        
        Square square01 = new Square();
        Square square02 = new Square(4);
        Square square03 = new Square(5, "MySquare");
        
        // System.out.println("The area of the square is " + square01.area());
        // System.out.println("The area of the square is " + square02.area());
        // // square03.name = "OVERRIDE";
        // System.out.println("The area of the square is " + square03.area() + " and the name is " + square03.getName());
        // square03.setName("OVERRIDE2");
        // square03.setSide(-1);
        // System.out.println("The area of the square is " + square03.area() + " and the name is " + square03.getName());
        
        System.out.println(square01);
        System.out.println(square02);
        System.out.println(square03);
    }
    
}
