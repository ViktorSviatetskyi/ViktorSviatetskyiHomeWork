package HomeWork;

/*2) Ввести с клавиатуры три числа, положительные возвести в куб, а отрица-
тельные заменить на 0.*/

import java.util.Scanner;

public class _02_ThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Num:");
        int a = sc.nextInt();
        if (a > 0) {
            a = a*a*a;
        } else if (a < 0){
            a = 0;
        } else {
            System.out.println("По умовах 0 не вводити");
        }

        System.out.println("Enter Second Num:");
        int b = sc.nextInt();
        if (b > 0) {
            b = b*b*b;
        } else if (b < 0){
            b = 0;
        } else {
            System.out.println("По умовах 0 не вводити");
        }
        System.out.println("Enter Third Num:");
        int c = sc.nextInt();
        if (c > 0) {
            c = c*c*c;
        } else if (c < 0){
            c = 0;
        } else {
            System.out.println("По умовах 0 не вводити");
        }
        System.out.println(a+ "  " + b + "  " + c);
    }
}
