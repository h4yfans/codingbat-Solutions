/**
 * Created by KAAN on 18/05/2016.
 * <p>
 * <p>
 * Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
 * <p>
 * close10(8, 13) → 8
 * close10(13, 8) → 8
 * close10(13, 7) → 0
 */
public class amras {
    public static void main(String[] args) {

        System.out.println(close10(8, 13));
        System.out.println(close10(13, 8));
        System.out.println(close10(13, 7));

    }

    public static int close10(int a, int b) {

        if (Math.abs(a - 10) < Math.abs(b - 10))
            return a;
        if (Math.abs(b - 10) < Math.abs(a - 10))
            return b;


        return 0;


    }

}
