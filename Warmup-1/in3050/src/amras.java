
/**
 * Created by KAAN on 18/05/2016.
 * <p>
 * Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.
 * <p>
 * in3050(30, 31) → true
 * in3050(30, 41) → false
 * in3050(40, 50) → true
 */
public class amras {
    public static void main(String[] args) {

        System.out.println(in3050(30, 31));
        System.out.println(in3050(30, 41));
        System.out.println(in3050(40, 50));
    }

    public static boolean in3050(int a, int b) {
        boolean r1A = (a >= 30 && a <= 40);
        boolean r1B = (b >= 30 && b <= 40);
        boolean r2A = (a >= 40 && a <= 50);
        boolean r2B = (b >= 40 && b <= 50);

        if ((r1A && r1B) || (r2A && r2B))
            return true;


        return false;


    }

}
