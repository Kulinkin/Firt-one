package lesson4;

import java.util.Arrays;

/**
 * Created by Артём on 25.02.2017.
 */
public class ArrayConnection {
    public static void main(String[] args) {
        int [] array1 = new int[] {1, 2, 3, 4, 5};
        int [] array2 = new int[] {10, 20, 30, 40, 50};
        int [] resultArray = new int [array1.length+array2.length];
        int index = 0;
        int maxIndex = array1.length > array2.length ? array1.length : array2.length;

        for (int i = 0; i < maxIndex; i++) {
           if (i<=array1.length) {
               resultArray[index] = array1[i];
               index++;
               resultArray[index]=array2[i];
               index++;//
           }else if (i<array2.length) {
               resultArray[index]=array2[i];
               index++;
               resultArray[index] = array1[i];
               index++;
           }//не работает при разной длине массивов, не могу догнать как это сделать
        }
        Arrays.stream(resultArray).forEach(System.out::println);
        }
    }
