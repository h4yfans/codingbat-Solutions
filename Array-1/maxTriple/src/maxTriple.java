import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by KAAN on 20/05/2016.
 *
 * Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.
 * maxTriple([1, 2, 3]) → 3
 * maxTriple([1, 5, 3]) → 5
 * maxTriple([5, 2, 3]) → 5
 */
public class maxTriple {
    public int maxTriple(int[] nums) {

        int first = nums[0];
        int middle =  nums[nums.length/2];
        int last = nums[nums.length-1];

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(first);
        arr.add(middle);
        arr.add(last);

        return Collections.max(arr);

    }

    public class maxTripleSECONWAY {
        public int maxTriple(int[] nums){
            int largest = nums[0];
            if(nums[nums.length/2] > largest) largest = nums[nums.length/2];
            if(nums[nums.length-1] > largest) largest = nums[nums.length-1];
            return largest;
        }
    }

}
