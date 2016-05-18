/**
 * Created by KAAN on 18/05/2016.
 *
 * Given a string and a non-negative int n, return a larger string that is n copies of the original string.

 stringTimes("Hi", 2) → "HiHi"
 stringTimes("Hi", 3) → "HiHiHi"
 stringTimes("Hi", 1) → "Hi"
 */
public class amras {
    public static void main(String[] args){



    }
    public String stringTimes(String str, int n) {
        String s = "";
        if (n >= 0) {
            for (int i = 0; i < n; i++) {
                s = s + str;
            }
            return s;
        }
        return str;


    }

}
