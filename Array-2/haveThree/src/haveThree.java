/**
 * Created by Kaan Karaca on 29/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.
 * haveThree([3, 1, 3, 1, 3]) → true
 * haveThree([3, 1, 3, 3]) → false
 * haveThree([3, 4, 3, 3, 4]) → false
 */
public class haveThree {
    public boolean haveThree(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length - 3; i++) {
            if (nums[i] == 3) {
                count++;
                i += 1;
            }
        }
        if (count==3) return true;
        return false;
    }

}
