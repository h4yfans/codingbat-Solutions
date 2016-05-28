/**
 * Created by Kaan Karaca on 29/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.
 * has12([1, 3, 2]) → true
 * has12([3, 1, 2]) → true
 * has12([3, 1, 4, 5, 2]) → true
 */
public class has12 {
    public boolean has12(int[] nums) {


        boolean mark = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                mark = true;
            if (nums[i] == 2 && mark) {
                return true;
            }
        }
        return false;
    }

}
