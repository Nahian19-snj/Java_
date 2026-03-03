public class Circle extends AbsShape{
    // can inherites only one class but in c++ many !! 
    // by making circle as abstract class i don't have to implement the absshape methos 
    private int radius;
    public Circle(int radius,String color, String name) {
            super(color, name);
            this.radius= radius;
            
        }
    
        @Override
    public int getArea() {
       return (int)(Math.PI) * radius* radius;
    }

    @Override
    public int getPerimeter() {
        return (int)(2*radius*Math.PI);
    }

    @Override
    public void draw() {

        System.out.println("Drawing circle with radius:"+ radius);
        
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    
}
