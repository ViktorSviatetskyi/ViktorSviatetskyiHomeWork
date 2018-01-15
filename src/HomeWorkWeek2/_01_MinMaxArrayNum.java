package HomeWorkWeek2;

import utils.ArrayUtils;

import java.util.Scanner;

public class _01_MinMaxArrayNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть довжину масиву: ");
        int size = sc.nextInt();
        int [] numbers = ArrayUtils.createAndFillRandomArray(size);
        int min = ArrayUtils.findMin(numbers);
        int max = ArrayUtils.findMax(numbers);

        System.out.print("Числа в масиві: ");
        ArrayUtils.printArray(numbers);
        System.out.println();
        System.out.print("Мінімальне число масиву: ");
        System.out.println(min);
        System.out.print("Максимальне число масиву: ");
        System.out.println(max);
    }
}
