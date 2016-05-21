/**
 * Created by KAAN on 21/05/2016.
 *
 * Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
 * lessBy10(1, 7, 11) → true
 * lessBy10(1, 7, 10) → false
 * lessBy10(11, 1, 7) → true
 */
public class lessBy10 {
    public boolean lessBy10(int a, int b, int c) {

        return (Math.abs(a - b) >= 10 ||
                Math.abs(b - c) >= 10 ||
                Math.abs(a - c) >= 10);

    }
}
