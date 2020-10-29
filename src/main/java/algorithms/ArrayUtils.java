package algorithms;

public class ArrayUtils {

  public static boolean isPalindrome(int[] n) {
//      boolean isPalindrome = false;
//      //palindrom: int[] n = { 1, 2, 5, 5, 2, 1};
//     // i :n[0], n[1], n[2], n[3], n[4], n[5]
//      //j: n[5], n[4], n[3], n[2], n[1], n[0]
//      // i: 0, 1 ,2
//      //j: 2, 1, 0
//      for (int i = 0 , j = n.length - 1; i <= j ; i++, j--) {
//          if(n[i] != n[j]) {
//              isPalindrome = false;
//              break;
//          } else {
//              isPalindrome = true;
//          }
//      }
//      return isPalindrome;
//  }     //asta e exercitiul facut la curs - it works

      for (int i = 0, j = n.length -1 ; i <= j ; i++, j--) {
          if(n[i] != n[j]){
              return false;
          }
      }
          return true;
      }

      //exercitiul 1
    public static void reverseArray(int[] a, int arrLength) {
      int[] revArray = new int[arrLength];
      int j = arrLength;
        for (int i = 0; i < arrLength ; i++) {
            revArray[j -1] = a[i];
            j = j - 1;
        }

        System.out.println("Elementele inversate sunt: \n");
        for (int k = 0; k < arrLength; k++) {
            System.out.println(revArray[k]);
        }
    }

    //exercitiul 2 - array-ul se sorteaza aducand cel mai mic numar la index cu fiecare repetare a celor
    // doua for loop-uri, nu e cel mai eficient mod de a sorta, dar a fost cel dat in exemplu
    public static void selectionSort(int[] selectedArray) {
        for (int i = 0; i < selectedArray.length ; i++) {
            int index = i;
            for (int j = i + 1; j < selectedArray.length ; j++) {
                if(selectedArray[j] < selectedArray[index]) {
                    index = j;
                }
            }
            int smallerNumber = selectedArray[index];
            selectedArray[index] = selectedArray[i];
            selectedArray[i] = smallerNumber;
        }
    }

    //exercitiul 3
    public static boolean isPrime(int n) {
      //verificam cazurile extreme ca n sa nu fie 1 sau 2
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        //aici verificam ca numarul sa fie de forma 6k+-1, toate primele cu exceptia lui 2 sau 3 au
        //acest lucru in comun.
        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    //exercitiul 4
    public static int removeDuplicateElements(int array[], int n) {
      int j = 0;
        for (int i = 0; i < n -1; i++) {
            if (array[i] != array[i+1]) {
                array[j++] = array[i];
            }
        }
        array[j++] = array[n -1];
        return j;
    }








}
