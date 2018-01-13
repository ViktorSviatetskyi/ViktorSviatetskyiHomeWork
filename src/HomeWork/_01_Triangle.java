package HomeWork;
import java.util.Scanner;
/*1) Ввести с клавиатуры значения трех сторон треугольника a, b и c и опреде-
лить, является ли он прямоугольным. Ответ вывести в виде сообщения.*/

public class _01_Triangle {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
                System.out.println("Введіть сторону А");
            double a = sc.nextDouble();
            a = a*a;
                System.out.println("Введіть сторону B");
            double b = sc.nextDouble();
            b = b*b;
                System.out.println("Введіть сторону C");
            double c = sc.nextDouble();
            c = c*c;

                if (a==b+c | b==a+c | c == a+b){
                System.out.println("Трикутник прямокутний");
            } else {
                System.out.println("Нот прямокутн");
            }
                System.out.println(a +"   " + b +"   " +c);
    }
}
