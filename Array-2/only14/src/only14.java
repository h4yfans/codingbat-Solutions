/**
 * Created by Kaan Karaca on 28/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Given an array of ints, return true if every element is a 1 or a 4.
 * only14([1, 4, 1, 4]) → true
 * only14([1, 4, 2, 4]) → false
 * only14([1, 1]) → true
 */
public class only14 {

    public boolean only14(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4)
                return false;
        }

        return true;
    }

}
