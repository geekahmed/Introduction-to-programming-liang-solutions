import java.util.Scanner;

public class Main {

   private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        System.out.printf("The area is %.3f\n", radius * radius * Math.PI);
        System.out.printf("The volume is %.3f", radius * radius * Math.PI * length);


    }
}
