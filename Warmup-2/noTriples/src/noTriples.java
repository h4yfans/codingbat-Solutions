/**
 * Created by KAAN on 19/05/2016.
 * <p>
 * Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.
 * <p>
 * noTriples([1, 1, 2, 2, 1]) → true
 * noTriples([1, 1, 2, 2, 2, 1]) → false
 * noTriples([1, 1, 1, 2, 2, 2, 1]) → false
 */
public class noTriples {
    public static void main(String[] args) {

        int[] num1 = {1, 1, 1, 2, 2, 2, 1};
        int[] num2 = {1, 1, 2, 2, 1};
        
        System.out.println(noTriples(num1));
        System.out.println(noTriples(num2));
    }

    public static boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i + 2 < nums.length) {
                if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                    return false;
                }
            }
        }
        return true;
    }

}

/*Second way - quite same
public boolean noTriples(int[] nums) {
  // Iterate < length-2, so can use i+1 and i+2 in the loop.
  // Return false immediately if every seeing a triple.
  for (int i=0; i < (nums.length-2); i++) {
    int first = nums[i];
    if (nums[i+1]==first && nums[i+2]==first) return false;
  }

  // If we get here ... no triples.
  return true;
}}
 */



