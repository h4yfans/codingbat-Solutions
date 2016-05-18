/**
 * Created by KAAN on 19/05/2016.
 * <p>
 * <p>
 * Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
 * <p>
 * arrayFront9([1, 2, 9, 3, 4]) → true
 * arrayFront9([1, 2, 3, 4, 9]) → false
 * arrayFront9([1, 2, 3, 4, 5]) → false
 */
public class arrayFront9 {
    public static void main(String[] args) {

        int[] a1 = {1, 2, 9, 3, 4};
        int[] a2 = {1, 2, 3, 4, 9, 9, 9, 9};

        System.out.println(arrayFront9(a1));
        System.out.println(arrayFront9(a2));

    }

    public static boolean arrayFront9(int[] nums) {

        if (nums.length > 3) {
            for (int i = 0; i < 4; i++) {
                if (nums[i] == 9)
                    return true;
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 9)
                    return true;
            }
        }
        return false;
    }


    // second way
    /*
    public boolean arrayFront9(int[] nums) {
    // First figure the end for the loop
     int end = nums.length;
      if (end > 4) end = 4;

     for (int i=0; i<end; i++) {
        if (nums[i] == 9) return true;
      }

     return false;
}
     */
}
