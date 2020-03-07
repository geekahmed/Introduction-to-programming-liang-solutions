import java.util.Scanner;
// geekahmed1@gmail.com
// Ahmed Moustafa

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double METERS_PER_FOOT = 0.305;
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();
        double meters = feet * METERS_PER_FOOT;
        System.out.println(feet + " feet is " + meters + " meters");
    }
}
