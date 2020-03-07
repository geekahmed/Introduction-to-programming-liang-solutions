public class Main {

    public static void main(String[] args) {
        double a = 3.4, b = 50.2, c = 2.1, d = 0.55 , e = 44.5, f = 5.9;

        double x = ( (double)((e * d) - (b * f)) )/ ((a * d) - (b * c));
        double y = ( (double)((a * f) - (e * c)) )/ ((a * d) - (b * c));

        System.out.println("The Solution is, x = " + x + " , y = " + y);
    }
}
