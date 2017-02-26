package lesson5;

/**
 * Created by Артём on 25.02.2017.
 */
public class IsPalindrome {
    public static void main(String[] args) {
        String string = "ifkasfi";
        if (checkPalindrome(string)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a palindrome");
        }
    }

    public static boolean checkPalindrome(String random) {
        StringBuilder string1 = new StringBuilder(random);
        StringBuilder string2 = new StringBuilder(random);
        return string2.toString().equals(string1.reverse().toString());
    }
}
