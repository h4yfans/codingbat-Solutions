/**
 * Created by KAAN on 19/05/2016.
 * <p>
 * Given an array of ints, return true if .. 1, 2, 3, .. appears in the array somewhere.
 * <p>
 * array123([1, 1, 2, 3, 1]) → true
 * array123([1, 1, 2, 4, 1]) → false
 * array123([1, 1, 2, 1, 2, 3]) → true
 */
public class array123 {
    public static void main(String[] args) {
        int[] s = {1, 1, 2, 3, 1};
        System.out.println(array123(s));

    }

    public static boolean array123(int[] nums) {
        if (nums.length > 2)
            for (int i = 0; i < nums.length - 1; i++)
                if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3)
                    return true;


        return false;
    }


    /*
    Second way

    public boolean array123(int[] nums) {
  // Note: iterate < length-2, so can use i+1 and i+2 in the loop
  for (int i=0; i < (nums.length-2); i++) {
    if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) return true;
  }
  return false;
}
     */

}
