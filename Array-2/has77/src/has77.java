/**
 * Created by Kaan Karaca on 28/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's separated by one element, such as with {7, 1, 7}.
 * has77([1, 7, 7]) → true
 * has77([1, 7, 1, 7]) → true
 * has77([1, 7, 1, 1, 7]) → false
 */
public class has77 {
    public boolean has77(int[] nums) {


        if (nums.length<2) return false;


        for (int i = 0; i < nums.length-2; i++) {
            if ((nums[i] == 7 && nums[i + 1] == 7) || (nums[i] == 7 && nums[i + 2] == 7)) {
                return true;
            }
        }

        if (nums[nums.length-2]==7 && nums[nums.length-1]==7) return true;
        return false;
    }

}
