package HomeWorkWeek2;

import utils.ArrayUtils;



public class LOTERY {
    public static void main(String[] args) {
        ArrayUtils.enterSixNum();
        int[] randArr = ArrayUtils.genSixRandNum();
        randArr = ArrayUtils.sortArr(randArr);
        System.out.println("Крутиться барабан... і видає нам шість чисел");
        ArrayUtils.printArray(randArr);

    }
}
