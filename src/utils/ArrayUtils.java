package utils;

public class ArrayUtils {

    public static int [] createAndFillArray (int size) {

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
          array[i] = i;
        }
    return array;
    }

    public static void printArray (int[] array) {
        for (int i = 0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void printArray (String[] array) {
        for (int i = 0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static int [] createAndFillRandomArray (int size) {
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);
        }
    return array;
    }
}
