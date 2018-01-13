package HomeWork;

/*5.2. Вычислить факториал числа.*/
import java.util.Scanner;

public class _5_2_Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть ціле число більше 0:");
        int a = sc.nextInt();

        if (a > 0) {
            long res = 1;
            for (int n = 2; n<=a; n++)
                 res*=n;
               // res=res *n;
            System.out.println("Факторіал числа "+ a + " = "+ res);
        } else {System.out.println("Wrong number");}

    }
}