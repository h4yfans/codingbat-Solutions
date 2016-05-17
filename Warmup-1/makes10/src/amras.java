/**
 * Created by KAAN on 17/05/2016.
 * <p>
 * Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
 * <p>
 * makes10(9, 10) → true
 * makes10(9, 9) → false
 * makes10(1, 9) → true
 */
public class amras {
    public static void main(String[] args) {

        System.out.println(makes10(9, 10));
        System.out.println(makes10(9, 9));
        System.out.println(makes10(1, 9));

    }

    public static boolean makes10(int a, int b) {

        return (a == 10 || b == 10) || (a + b == 10);

    }

}
