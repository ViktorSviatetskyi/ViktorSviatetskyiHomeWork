package HomeWorkWeek2;

import utils.ArrayUtils;

import java.util.Scanner;

public class _02_arrAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int [] mas = ArrayUtils.createAndFillRandomArray(size);
        System.out.println("Array nums: ");
        ArrayUtils.printArray(mas);
        System.out.println();
        System.out.print(" Array average is: ");
        System.out.println( ArrayUtils.arrAverage(mas));



    }

}
