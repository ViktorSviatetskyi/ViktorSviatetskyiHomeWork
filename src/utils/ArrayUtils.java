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

    public static int findMin (int [] array){
        int [] mas = array;
        int min = mas[0];

        for (int i = 0; i < mas.length; i++) {
            if (mas[i]< min){
                min = mas[i];
            }
        }
        return min;
    }
    public static int findMax (int [] array){
        int [] mas = array;
        int max = mas[0];

        for (int i = 0; i < mas.length; i++) {
            if (mas[i]> max){
                max = mas[i];
            }
        }
        return max;
    }
    public static double arrAverage (int [] arrey){
        int [] mas = arrey;
        double sum=0;
        for (int i = 0; i< mas.length; i++){
            sum = sum + mas[i];
        }
        double average = sum/mas.length;
        return average;
    }
}

