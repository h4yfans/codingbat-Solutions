/**
 * Created by Kaan Karaca on 31/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer.
 * The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.
 * linearIn([1, 2, 4, 6], [2, 4]) → true
 * linearIn([1, 2, 4, 6], [2, 3, 4]) → false
 * linearIn([1, 2, 4, 4, 6], [2, 4]) → true
 */
public class linearIn {
    public boolean linearIn(int[] outer, int[] inner) {

        int temp = 0;
        int count = 0;

        for (int i = 0; i < inner.length; i++) {
            temp = inner[i];
            for (int j = 0; j < outer.length; j++) {
                if (outer[j]==temp)
                    count++;
            }
        }

        if (count==inner.length) return true;

        return false;
}

}
