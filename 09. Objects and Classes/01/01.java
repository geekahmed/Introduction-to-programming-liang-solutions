/*
  By: Ahmed Moustafa
  E-mail: geekahmed1@gmail.com
 */
import java.util.Scanner;
public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4 , 40);
        Rectangle rect2 = new Rectangle(3.5 , 35.9);

        System.out.println("====First Rectangle Data====");
        System.out.println("\tWidth = " + rect1.getWidth());
        System.out.println("\tHeight = " + rect1.getHeight());
        System.out.println("\tArea = " + rect1.getArea());
        System.out.println("\tPerimeter = " + rect1.getPerimeter());

        System.out.println("====Second Rectangle Data====");
        System.out.println("\tWidth = " + rect2.getWidth());
        System.out.println("\tHeight = " + rect2.getHeight());
        System.out.println("\tArea = " + rect2.getArea());
        System.out.println("\tPerimeter = " + rect2.getPerimeter());

    }
}

