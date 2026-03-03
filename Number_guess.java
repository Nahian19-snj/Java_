import java.util.Scanner;

public class Topic1_Lab1 {
  public static void main(String[] args) {
  int SECRET_NUMBER = (int) (Math.random() * 100) + 1;
  int guess;
 Scanner scanner = new Scanner(System.in);

   do {
  System.out.println("Enter a number between 1 and 100:");
 guess = scanner.nextInt();
   System.out.println("Your guess is: " + guess);

  if (guess > SECRET_NUMBER) {
  System.out.println("Your guess is too high.");
  } 
  else if (guess < SECRET_NUMBER) {
   System.out.println("Your guess is too low.");
  }
  } while (guess != SECRET_NUMBER);

   System.out.println("Your guess is right! " + guess);
  scanner.close();
   }
}
