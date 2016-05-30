/**
 * Created by Kaan Karaca on 30/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 *
 * Consider the leftmost and righmost appearances of some value in an array.
 * We'll say that the "span" is the number of elements between the two inclusive.
 * A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)
 * maxSpan([1, 2, 1, 1, 3]) → 4
 * maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
 * maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
 */
public class maxSpan {
    public int maxSpan(int[] nums) {
        int span = 0;
        int tmp = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    tmp = j-i+1;
                    span = Math.max(tmp,span);
                }
            }
        }
        return span;}


}
