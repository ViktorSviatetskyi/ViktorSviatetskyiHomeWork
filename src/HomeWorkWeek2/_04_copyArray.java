package HomeWorkWeek2;

import utils.ArrayUtils;

import java.util.Scanner;

public class _04_copyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        int [] mas1 = ArrayUtils.createAndFillRandomArray(size);
        System.out.print("First array is:  ");
        ArrayUtils.printArray(mas1);
        System.out.println();
        int [] mas2 = ArrayUtils.createAndFillRandomArray(size);
        System.out.print("Second array is: ");
        ArrayUtils.printArray(mas2);
        mas2=mas1;
        System.out.println();
        System.out.println("After some magic...");
        System.out.print("First array is:  ");
        ArrayUtils.printArray(mas1);
        System.out.println();
        System.out.print("Second array is: ");
        ArrayUtils.printArray(mas2);
    }
}
