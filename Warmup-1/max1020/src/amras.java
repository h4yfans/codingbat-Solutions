import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by KAAN on 18/05/2016.
 * Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.
 * <p>
 * max1020(11, 19) → 19
 * max1020(19, 11) → 19
 * max1020(11, 9) → 11
 */
public class amras {
    public static void main(String[] args) {


    }

    public int max1020(int a, int b) {
        boolean rA = (a >= 10 && a <= 20);
        boolean rB = (b >= 10 && b <= 20);

        List<Integer> list= new ArrayList<Integer>();

        if (rA && rB){
            list.add(a);
            list.add(b);
            return Collections.max(list);}
        else if(rA){
            list.add(a);
            return a;
        }else if(rB){
            list.add(b);
            return b;}

        return 0;
    }

    /* Or of course we have another way to do this, which is;

        public int max1020(int a, int b) {
    // First make it so the bigger value is in a
    if (b > a) {
        int temp = a;
     a = b;
      b = temp;
     }

     // Knowing a is bigger, just check a first
     if (a >= 10 && a <= 20) return a;
     if (b >= 10 && b <= 20) return b;
      return 0;
}
     */





}
