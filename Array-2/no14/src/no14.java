/**
 * Created by Kaan Karaca on 28/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Given an array of ints, return true if it contains no 1's or it contains no 4's.
 * no14([1, 2, 3]) → true
 * no14([1, 2, 3, 4]) → false
 * no14([2, 3, 4]) → true
 */
public class no14 {
    public boolean no14(int[] nums) {

        boolean mark1 = false;
        boolean mark4 = false;

        for (int i = 0; i < nums.length; i++) {


            if (nums[i] == 1)
                mark1 = true;
            if (nums[i] == 4)
                mark4 = true;

        }
        if (mark1 && mark4)
            return false;

        return true;

    }

}
