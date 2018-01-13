package HomeWork;

import java.util.Scanner;

/*4) Известны две скорости, одна в километрах в час, другая в метрах в секун-
ду. Какая из них больше?*/
public class _04_TwoSpeeds {
    public static void main(String[] args) {
        float a = (1000/3600f);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter speed km/h: ");
        float kmperhour = sc.nextFloat();
        kmperhour = kmperhour*a;
        System.out.println("Enter speed  m/s: ");
        float mpersec = sc.nextFloat();

        if (kmperhour > 0 & mpersec > 0){
            if (kmperhour> mpersec) {
                System.out.println("Km/h > m/s   "+ kmperhour + " > "+ mpersec);
            } else if (mpersec> kmperhour){
                System.out.println("M/s > km/h   "+ mpersec + " > "+  kmperhour);
            } else {
                System.out.println("km/h = m/s " + kmperhour + " > "+ mpersec);
            }

        } else System.out.println("Speed must be > 0");


    }

}
