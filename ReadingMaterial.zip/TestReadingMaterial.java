/******************************************
 *  Author : Nahian Karim   
 *  Created On : Sun Mar 09 2025
 *  File : Test.java
 *******************************************/
public class TestReadingMaterial {

    public static void main(String[] args) {
        
        ReadingMaterial rm = new ReadingMaterial("digital");
        Newspaper np = new Newspaper("print", 0);
        Book bk = new Book("audio", 300, "hardcover");

        printReadingMaterial(rm);
        printReadingMaterial(np);
        printReadingMaterial(bk);
    }

    public static void printReadingMaterial(ReadingMaterial rm) {
        System.out.println(rm.toString());
    
    }
    
}
