import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) throws NegativeException{ // throwing here will erase the error in line 13

        Calculator calculator = new Calculator();
        int a =10;
        int b=0;
        File file = new File("Snj.txt");
        Scanner scanner;
        System.out.println("addition:" +calculator.add(a, b));
        System.out.println("sub:"+ calculator.subtract(a, b));
        System.out.println("multiply:"+calculator.multiply(a, b));

       // Integer result = calculator.devision(a, b);

       try{
         scanner = new Scanner(file);
        System.out.println("division:"+calculator.devision(a, b));
        scanner.close();
       }
       catch (ArithmeticException e){
        System.out.println("Exception:"+e.getMessage());
       }
       catch(FileNotFoundException e){
        System.out.println("Exception:"+ e.getMessage());
       }
       catch(Exception e){
        System.out.println("Error");
       }


       // System.out.println("division:"+calculator.devision(a, b)); // will show the error here if throws exception is shown in calculator class.
        System.out.println("The calculation is done");

    }
    
}
