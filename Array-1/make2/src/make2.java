/**
 * Created by KAAN on 21/05/2016.
 * Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit,
 * the elements from a followed by the elements from b.
 * The arrays may be any length, including 0,
 * but there will be 2 or more elements available between the 2 arrays.
 * <p>
 * make2([4, 5], [1, 2, 3]) → [4, 5]
 * make2([4], [1, 2, 3]) → [4, 1]
 * make2([], [1, 2]) → [1, 2]
 */
public class make2 {
    public int[] make2(int[] a, int[] b) {

        int[] newArr = new int[2];
        int count = 0;

        while (count < a.length && count < newArr.length)
            newArr[count] = a[count];
            count++;

        while (count - a.length < b.length && count < newArr.length)
            newArr[count] = b[count - a.length];
            count++;

        return newArr;
    }

}
