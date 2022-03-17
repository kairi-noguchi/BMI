import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    double height = stdIn.nextDouble();
    double weight = stdIn.nextDouble();
    double bmi = weight / Math.pow(height, 2);
    System.out.println( bmi );

  }
}