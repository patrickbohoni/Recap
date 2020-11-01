package algorithms;

public class NumarPrim {

    public static void main(String[] args) {
        int b = 0;
        int counter = 0;

        if (b < 0){
            b = -b;
        }
        if (b == 0 | b == 1) {
            counter = 0;
        } else {
            for (int i = 2; i < b ; i++) {
                if (b % i == 0) {
                    counter++;
                }
            }

        }
        if (counter != 0) {
            System.out.println("nu este numar prim");
        } else System.out.println("este numar prim");
    }
}