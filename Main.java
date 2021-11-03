import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner temp;
    temp = new Scanner(System.in);
    System.out.println("Enter the temperature in celcius: ");
    double tempInput = temp.nextDouble();
    double sum = (tempInput * 1.8) + 32;
    System.out.print(sum);

    
  }
}