import java.util.Scanner;

// geekahmed1@gmail.com
// Ahmed Moustafa
public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a degree in Celsius: ");
        double celsius  = input.nextDouble();
        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.print(celsius + " Celsius is "+ fahrenheit + " Fahrenheit");

    }
}
