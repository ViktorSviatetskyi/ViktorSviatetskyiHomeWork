package HomeWorkWeek2;

import utils.ArrayUtils;

import java.util.Scanner;

public class _03_swapNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        int [] arr = ArrayUtils.createAndFillRandomArray(size);
        System.out.print("Array nums:      ");
        ArrayUtils.printArray(arr);
        int [] arrAfterSwap = ArrayUtils.arrSwap(arr);
        System.out.println();
        System.out.print("Nums after swap: ");
        ArrayUtils.printArray(arrAfterSwap);



    }
}
