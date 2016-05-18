/**
 * Created by KAAN on 18/05/2016.
 * Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
 * <p>
 * lastDigit(7, 17) → true
 * lastDigit(6, 17) → false
 * lastDigit(3, 113) → true
 */
public class amras {
    public static void main(String[] args) {

        System.out.println(lastDigit(7, 17));
        System.out.println(lastDigit(6, 17));
        System.out.println(lastDigit(3, 113));
    }

    public static boolean lastDigit(int a, int b) {
        if (a >= 0 && b >= 0)
            return a % 10 == b % 10;

        return false;

    }

}
