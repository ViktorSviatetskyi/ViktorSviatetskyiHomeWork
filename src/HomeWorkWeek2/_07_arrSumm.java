package HomeWorkWeek2;

import utils.ArrayUtils;

import java.util.Scanner;

public class _07_arrSumm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть розмір масивів: ");
        int size = sc.nextInt();
        int[] mas1 = ArrayUtils.createAndFillRandomArray(size);
        System.out.print("Ваш перший масив:               ");
        ArrayUtils.printArray(mas1);
        System.out.println();
        int[] mas2 = ArrayUtils.createAndFillRandomArray(size);
        System.out.print("Ваш другий масив:               ");
        ArrayUtils.printArray(mas2);
        System.out.println();
        int[] masResalt = ArrayUtils.arrSumm(mas1, mas2);
        System.out.print("Результат додавання масивів =   ");
        ArrayUtils.printArray(masResalt);


    }
}
