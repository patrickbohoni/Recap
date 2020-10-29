package algorithms;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] e1 = { 1, 2, 5, 5, 2, 1};
        int[] e2 = { 2, 1, 1, 3, 2, 1};
        int[] e3 = { 1, 3, 5, 3, 1};
        int[] e4 = { 4, 8, 7};
        int[] e5 = { 10, 20, 20, 30, 40, 50, 50};

        System.out.println(ArrayUtils.isPalindrome(e1));
        System.out.println(ArrayUtils.isPalindrome(e2));
        System.out.println(ArrayUtils.isPalindrome(e3));
        System.out.println(ArrayUtils.isPalindrome(e4));


        //aplicat exercitiul 1
        ArrayUtils.reverseArray(e4, e4.length);
        System.out.println(" " + " ");


        //aplicat exercitiul 2
        ArrayUtils.selectionSort(e1);
        System.out.println("The sorted elements are: ");
        for (int i:e1) {
            System.out.println(i + "");
        }

        //aplicat exercitiul 3
        System.out.println(" \n");
        System.out.println(ArrayUtils.isPrime(73));
        System.out.println(ArrayUtils.isPrime(21));

        //aplicat exercitiul 4 -- nota: array-ul trebuie sortat, altfel nu se exclud duplicatele
        System.out.println(" \n");
        Arrays.sort(e2);
        int length = e2.length;
        length = ArrayUtils.removeDuplicateElements(e2, length);
        for (int i = 0; i < length ; i++) {
            System.out.println(e2[i] + " ");
        }








    }

}
