/*
  By: Ahmed Moustafa
  E-mail: geekahmed1@gmail.com
 */
import java.util.Scanner;
public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Stock stc1 = new Stock("ORCL", "Oracle Corporation");
        stc1.setPreviousClosingPrice(34.5);
        stc1.setCurrentPrice(34.35);
        System.out.println("Stock name: " + stc1.getName());
        System.out.println("Stock symbol: " + stc1.getSymbol());
        System.out.printf("Price-change percentage: %.2f%%\n",stc1.getChangePercent());
    }
}

