/**
 * Created by KAAN on 17/05/2016.
 * Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
 * <p>
 * diff21(19) → 2
 * diff21(10) → 11
 * diff21(21) → 0
 */
public class amras {
    public static void main(String[] args) {

        System.out.println(diff21(19));
        System.out.println(diff21(10));
        System.out.println(diff21(21));

    }

    public static int diff21(int n) {

        if (n <= 21)
            return 21 - n;
        else
            return (n - 21) * 2;
    }

}
