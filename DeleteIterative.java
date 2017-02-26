package lesson4;

/**
 * Created by Артём on 25.02.2017.
 */
public class DeleteIterative {
    public static void main(String[] args) {
        int [] array = new int []{23,5,23,77,8,77,9,3,23,5};
        int [] finalArray = new int [array.length];
        boolean unEqual;
        int counter = 0;
        for (int i:array){
            unEqual = true;
            for (int f = 0; f < counter;f++){
                if (array[i] == finalArray[f]) {
                    unEqual = false;
                }
            }
            if (unEqual){
                finalArray[counter] = array[i];
                counter++;
            }
        }
        for (int i:finalArray){
            System.out.println(finalArray[i]);
        }
    }

}
//не могу понять почему не запускает
