/**
 * Created by Kaan Karaca on 28/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.
 * either24([1, 2, 2]) → true
 * either24([4, 4, 1]) → true
 * either24([4, 4, 1, 2, 2]) → false
 */
public class either24 {
    public boolean either24(int[] nums) {

        boolean mark2 = false;
        boolean mark4 = false;


        if (nums.length < 2) return false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2)
                mark2 = true;
            if (nums[i] == 4 && nums[i + 1] == 4)
                mark4 = true;
        }

        if (mark2 && mark4)
            return false;
        else if (!mark2 && !mark4)
            return false;

        return true;

    }

}
