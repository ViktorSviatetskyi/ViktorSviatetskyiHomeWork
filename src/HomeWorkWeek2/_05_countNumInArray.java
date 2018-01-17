package HomeWorkWeek2;

import utils.ArrayUtils;

import java.util.Scanner;

public class _05_countNumInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть довжину масиву: ");
        int size = sc.nextInt();
        int [] arr = ArrayUtils.createAndFillRandomArray(size);
        System.out.println("Ваш масив: ");
        ArrayUtils.printArray(arr);
        System.out.println();
        System.out.println("Введіть число для пошуку його кількості в масиві: ");
        int num = sc.nextInt();

        System.out.println ("Число " + num + " зустрічається в масиві "
                            + ArrayUtils.countNumsInArr(arr,num)+ " раз(и).");
    }
}
