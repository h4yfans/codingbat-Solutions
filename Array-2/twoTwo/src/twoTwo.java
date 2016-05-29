/**
 * Created by Kaan Karaca on 29/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Given an array of ints, return true if every 2 that appears in the array is next to another 2.
 * twoTwo([4, 2, 2, 3]) → true
 * twoTwo([2, 2, 4]) → true
 * twoTwo([2, 2, 4, 2]) → false
 */
public class twoTwo {

    public static void main(String[] args){

        int[] a = {2,2,2,2,5,6,2,2};

        System.out.println(twoTwo(a));

    }
    public static boolean twoTwo(int[] nums) {

        boolean mark = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                if (nums.length > 1 && i < nums.length-1 && nums[i+1] == 2)
                    mark = true;
                else if (nums.length > 1 && i > 0 && nums[i-1] == 2)
                    mark = true;
                else
                    return false;
            }
        }
        return true;

    }

}
