/**
 * Created by Kaan Karaca on 29/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Return true if the group of N numbers at the start and end of the array are the same.
 * For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3.
 * You may assume that n is in the range 0..nums.length inclusive.
 * sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
 * sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true
 * sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false
 */
public class sameEnds {
    public boolean sameEnds(int[] nums, int len) {

        boolean mark = true;
        for (int i = 0; i < len; i++) {
            if (nums[i] == nums[nums.length - len + i]) {
                mark = true
            } else {
                mark = false;
            }
        }

        return mark;
    }

}
