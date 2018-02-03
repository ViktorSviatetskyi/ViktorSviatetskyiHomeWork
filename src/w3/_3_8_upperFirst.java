package w3;

import utils.ArrayUtils;

import java.util.Scanner;

public class _3_8_upperFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть слова: ");
        String words = sc.nextLine();
        ArrayUtils.printArray(changeFirstLetterToUpp(words));
    }

    public static String [] changeFirstLetterToUpp(String sentence){
      String[] wordsArr = sentence.split(" ");
        for (int i = 0; i < wordsArr.length; i++) {
            if (wordsArr[i].length() <2) {
                wordsArr[i] = wordsArr[i].toUpperCase();
            } else
          wordsArr[i] = wordsArr[i].substring(0,1).toUpperCase() +
                    wordsArr[i].substring(1,wordsArr[i].length());

        } return wordsArr;
    }
}
