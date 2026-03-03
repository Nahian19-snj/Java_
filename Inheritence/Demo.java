// ArrayList<Integer> nums= new ArrayList<>();

import java.util.ArrayList;

public class Demo {

    
    public static void main(String[] args) {
        
       Square square = new Square(5);
       System.out.println("area: " +square.getArea());
       System.out.println("perimeter "+ square.getPerimeter());
       square.draw();
       square.fillColor();
       square.getSides();
       System.out.println("area: " +square.getArea());
       System.out.println("");
    }

}