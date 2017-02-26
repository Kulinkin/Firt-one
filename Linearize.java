package lesson4;

import java.util.Arrays;

/**
 * Created by Артём on 25.02.2017.
 */
public class Linearize {
        public static void main(String[] args) {
            int [][] array = new int[][] {{1, 2, 3, 4, 5}, {6, 7, 8, 9}};

            Arrays.stream(linearize(array)).forEach(System.out::print);
        }

        public static int[] linearize(int[][] array) {
            int index = 0;
            for (int[] i : array) {
                index += i.length;
            }

            int[] result = new int[index];
            int counter = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    result[counter] = array[i][j];
                    counter++;
                }
            }
            return result;
        }
}
