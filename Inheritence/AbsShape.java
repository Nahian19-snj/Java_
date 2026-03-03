public abstract class AbsShape {
    

   private  String color;
   private  String name;

public AbsShape(String color, String name) {
    this.color = color;
    this.name = name;
}

public String getColor() {
    return color;
}

public void setColor(String color) {
    this.color = color;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

 public abstract int getArea();
 public abstract int getPerimeter();
 public abstract void draw();
 public void fillColor(){
    System.out.println("filling color with:"+ color);
 }

@Override
public String toString() {
    return "AbsShape [color=" + color + ", name=" + name + "]";
}
  
  

   
}
