import java.util.Scanner;

/**
 * Created by Артём on 19.02.2017.
 */
public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int charNumber = sc.nextInt();
        int result = 0;
        while (charNumber>0){
            result += charNumber%10;
            charNumber /= 10;
        }
        System.out.println("Сумма цифр числа: "+result);
    }
}
