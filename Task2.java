import java.util.Scanner;

/**
 * Created by Артём on 16.02.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Сторона a - ");
        int a = scan.nextInt();
        System.out.println("Сторона b - ");
        int b = scan.nextInt();
        System.out.println("Сторона c - ");
        int c = scan.nextInt();
        System.out.println("Сторона d - ");
        int d = scan.nextInt();
        System.out.println("Сторона e - ");
        int e = scan.nextInt();
        System.out.println("Сторона f - ");
        int f = scan.nextInt();
        int longSide1 = a > b ? a : b;//дом 1
        int shortSide1 = a < b ? a : b;
        int longSide2 = c > d ? c : d;//дом 2
        int shortSide2 = c < d ? c : d;
        int longSide3 = e > f ? e : f;//участок
        int shortSide3 = e < f ? e : f;
        int shortestSide = shortSide1 < shortSide2 ? shortSide1 : shortSide2;
        int longestShortSide = shortSide1 > shortSide2 ? shortSide1 : shortSide2;
        int shortestLongSide = longSide1 < longSide2 ? longSide1 : longSide2;
        int longestSide = longSide1 > longSide2 ? longSide1 : longSide2;
        if (((longSide1 + longSide2) <= longSide3) && ((longestShortSide) <= shortSide3)) {
            fit();
        } else if ((longestSide <= longSide3) && ((shortSide1 + shortSide2) <= shortSide3)) {
            fit();
        } else if ((shortestLongSide <= longestShortSide) && ((longestSide + shortestSide) <= longSide3) && ((longestShortSide) <=
                shortSide3)) {
            fit();
        } else {
            System.out.println("Не помещаются");
        }
    }
    public static void fit() {
        String fit = "Помещаются";
        System.out.println(fit);
    }
}
