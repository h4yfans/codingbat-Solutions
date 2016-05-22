/**
 * Created by KAAN on 22/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Given three ints, a b c, one of them is small, one is medium and one is large.
 * Return true if the three values are evenly spaced, so the difference between
 * small and medium is the same as the difference between medium and large.
 * evenlySpaced(2, 4, 6) → true
 * evenlySpaced(4, 6, 2) → true
 * evenlySpaced(4, 6, 3) → false
 */
public class evenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {

        int small = Math.min(a, Math.min(b, c));
        int large = Math.max(a, Math.max(b, c));
        int medium = 0;

        if (a == small) {
            medium = Math.min(b, c);
            return Math.abs(medium - small) == Math.abs(large - medium);
        } else if (b == small) {
            medium = Math.min(a, c);
            return Math.abs(medium - small) == Math.abs(large - medium);
        } else {
            medium = Math.min(a, b);
            return Math.abs(medium - small) == Math.abs(large - medium);
        }
    }

    public boolean evenlySpacedSECONDWAY(int a, int b, int c) { 
        int small = Math.min(Math.min(a, b), c);
        int large = Math.max(Math.max(a, b), c);
        int medium = 0;
        if (a == small) {
            if (b == large) medium = c;
            if (c == large) medium = b;
        }
        if (b == small) {
            if (a == large) medium = c;
            if (c == large) medium = a;
        }
        if (c == small) {
            if (a == large) medium = b;
            if (b == large) medium = a;
        }


        return (large - medium == medium - small);
    }
}
