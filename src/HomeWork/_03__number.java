package HomeWork;
/*
3) Дано трехзначное число. Определить: а) верно ли, что все его цифры
одинаковые; б) есть ли среди его цифр одинаковые.
 */
import java.util.Scanner;

public class _03__number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть трьохзначне число");
        int a = sc.nextInt();
        byte frst = (byte) (a/100);
        byte scnd = (byte) ((a%100)/10);
        byte thrd = (byte) (a%10);

        if (Math.abs(a) > 99 & Math.abs(a) < 1000) {
            if (frst == scnd & scnd ==thrd ){
                System.out.println("Всі числа однакові");
            }
            else {
                if (frst == scnd) {
                    System.out.println("Не всі числа однакові");
                    System.out.println("Перше і друге однакові");
                }else if (scnd == thrd) {
                    System.out.println("Не всі числа однакові");
                    System.out.println("Друге і третє однакові");
                }else if (frst ==thrd) {
                    System.out.println("Не всі числа однакові");
                    System.out.println("Перше і третє однакові");
                } else {
                    System.out.println("Однакових немає");
                }
            }
        } else {
            System.out.println("Введіть ТРЬОХЗНАЧНЕ число!!!");
        }



//
    }
}
