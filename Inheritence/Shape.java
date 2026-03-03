public interface Shape {
    //interface can extends another interface
    //interface can not have atributes 
    public int getArea();
    public abstract int getPerimeter();
    public void draw();
   default public void fillColor(){
    System.out.println("filling color");
   }
}
/* super /sub
 * parent / child
 * base / derived 
 */
