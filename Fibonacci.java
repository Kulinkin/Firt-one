import java.util.Scanner;

/**
 * Created by Артём on 19.02.2017.
 */

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        fibonacci(number);
        System.out.println();
    }
    public static void fibonacci(int number) {
        int currentNumber = 0;
        int nextNumber = 1;
        int step;
        while (nextNumber <= number) {
            System.out.print(nextNumber + " ");
            step = currentNumber;
            currentNumber = nextNumber;
            nextNumber += step;
        }
    }
}