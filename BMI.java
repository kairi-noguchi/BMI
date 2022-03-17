import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int i=0;
    double height = stdIn.nextDouble();
    double weight = stdIn.nextDouble();
    while( i <= 1 ) {
    double bmi = weight / Math.pow(height, 2);
    System.out.println( bmi );
    i = i + 1;
    }
  }
}