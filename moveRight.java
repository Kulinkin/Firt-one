package lesson4;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Артём on 21.02.2017.
 */
public class moveRight {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
        int lastIndex = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = lastIndex;
        for (int name :array){
            System.out.print(name+" ");
        }
    }
}
