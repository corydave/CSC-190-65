public class Square {
    
    private String version = "v1.0.0";
    private int side;
    private String name;
    
    public Square() {
        side = 0;
        name = "";
    }
    
    public Square(int s) {
        side = s;
        name = "";
    }
    
    public Square(int s, String n) {
        side = s;
        name = n;
    }
    
    // Accessor or a Getter
    public String getName() {
        return name;
    }
    
    public int getSide() {
        return side;
    }
    
    // Mutator or a Setter
    public void setName(String newName) {
        name = newName;
    }
    
    public void setSide(int newSide) {
        side = newSide;
    }
    
    public int area() {
        return side * side;
    }
    
    public int perimeter() {
        return 4 * side;
    }
    
    
}
