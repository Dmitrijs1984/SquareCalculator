package SquareCalc;
import java.util.Scanner;

public class SquareCalculatorDemo {
    public static void main(String[] args) {
        System.out.println("Please input integer number: ");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        SquareCalculator sqcalc = new SquareCalculator();
        long squaredNumber = sqcalc.calculateSquare(userNumber);
        System.out.println(squaredNumber);
    }
}
