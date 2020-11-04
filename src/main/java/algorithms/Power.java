package algorithms;

//Rezolvare Tema Aditionala de la Java Fundamentals Recap
public class Power {

    public static void main(String[] args) {

        int base = 2, powerRaised = 5;
        int result = power(base,powerRaised);

        System.out.printf("%d^%d = %d" , base, powerRaised, result);
        //((((2 * 2) * 2) * 2) * 2) = 32
        //(4 * 2 * 2 * 2), (8 * 2 * 2), (16 * 2 = 32)
        //recursivitatea calculeaza ca si mai sus
    }

    public static int power(int base, int powerRaised) {
        if (powerRaised != 0) {
            return (base * power(base, powerRaised -1));
        } else
            return 1;
    }

}
