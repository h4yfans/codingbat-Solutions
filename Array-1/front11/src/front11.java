/**
 * Created by KAAN on 21/05/2016.
 *
 * Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.
 * front11([1, 2, 3], [7, 9, 8]) → [1, 7]
 * front11([1], [2]) → [1, 2]
 * front11([1, 7], []) → [1]
 */
public class front11 {
    public int[] front11(int[] a, int[] b) {


            if(a.length == 0 && b.length == 0) return new int[] {};
            if(a.length == 0 || b.length == 0){
                if(a.length == 0) return new int[] {b[0]};
                if(b.length == 0) return new int[] {a[0]};
            }
            return new int[] {a[0], b[0]};






    }

}
