public class Square implements Shape{

    private int sides;
    

    public Square(int sides) {
        this.sides = sides;
    }
    public int getSides() {
        return sides;
    }
    public void setSides(int sides) {
        this.sides = sides;
    }
    
    @Override
    public int getArea() {
       return sides* sides;
    }
    @Override
    public int getPerimeter() {
       return 4*sides;
    
    }
    @Override
    public void draw() {
    System.out.println("Drawing the square with " + sides+ ":");
       
    }
    
}
