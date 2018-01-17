package utils;

import java.util.Arrays;

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
    public static double arrAverage (int [] array){
        int [] mas = array;
        double sum=0;
        for (int i = 0; i< mas.length; i++){
            sum = sum + mas[i];
        }
        double average = sum/mas.length;
        return average;
    }
    public static int[] arrSwap (int[] array)  {
    int [] mas = array;
        int min = ArrayUtils.findMin(mas);
        int max = ArrayUtils.findMax(mas);
    for (int i = 0; i< mas.length; i++) {
        if (mas[i] == min) {
            mas[i] = max;
        }
        else if (mas[i] == max) {
            mas[i] = min;
        }
     }
     return mas;
    }

    public static int countNumInNum(int number1, int numberFind) {
        int num = number1;
        int count = 0;
        while (num > 0) {
            if ((num % 10) == numberFind)
                count++;
            num = num / 10;
        }
        return count;
    }

    public static int countNumsInArr(int[] array, int number){
        int [] mas = array;
        int num = number;
        int resalt = 0;
        for (int i = 0; i < mas.length; i++) {
            resalt += ArrayUtils.countNumInNum(mas[i], number);
            }
     return resalt;
    }

    public static int[] arrSumm (int[] array1, int[] array2){

        int[] mas1 = array1;
        int[] mas2 = array2;
        int[] masRes= new int [mas1.length];
        for (int i = 0; i <mas1.length ; i++) {
            for (int j = 0; j < mas2.length; j++) {
                    masRes[i] = mas1[i]+mas2[i];
            }

        }
        return masRes;
    }

}

