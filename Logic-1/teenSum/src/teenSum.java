/**
 * Created by KAAN on 21/05/2016.
 * Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky. So if either value is a teen, just return 19.
 * teenSum(3, 4) → 7
 * teenSum(10, 13) → 19
 * teenSum(13, 2) → 19
 */
public class teenSum {
    public int teenSum(int a, int b) {

        if (a>=13 && a<=19 || b>=13 && b<=19)
            return 19;

        return a+b;

    }

    public static int teenSumSECONDWAY( int a, int b )
    {
        return isTeen( a ) || isTeen( b ) ? 19 : a + b;
    }

    private static boolean isTeen( int n )
    {
        return 13 <= n && n <= 19;
    }

}
