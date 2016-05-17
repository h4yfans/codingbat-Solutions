import java.util.*;

/**
 * Created by KAAN on 18/05/2016.
 * <p>
 * Given three int values, a b c, return the largest.
 * <p>
 * intMax(1, 2, 3) → 3
 * intMax(1, 3, 2) → 3
 * intMax(3, 2, 1) → 3
 */
public class amras {
    public static void main(String[] args) {


    }

    public int intMax(int a, int b, int c) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(a);
        list.add(b);
        list.add(c);

        return Collections.max(list);
    }


    /* or you can do this way

     int max;

    // First check between a and b
    if (a > b) {
       max = a;
          } else {
        max = b;
      }

      // Now check between max and c
      if (c > max) {
        max = c;
      }

     return max;

      // Could use the built in Math.max(x, y) function which selects the larger
     // of two values.
      */

}
