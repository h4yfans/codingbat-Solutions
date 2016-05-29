/**
 * Created by Kaan Karaca on 29/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * For each multiple of 10 in the given array, change all the values following it to be that multiple of 10,
 * until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
 * tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
 * tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
 * tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
 */
public class tenRun {

    public static void main(String[] args) {

        int[] ssss = {1, 2, 50, 1};

        tenRun(ssss);

    }

    public static int[] tenRun(int[] nums) {

        boolean mark = false;
        int temp = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) 
                mark = true;
                temp = nums[i];

            if (mark && nums[i + 1] % 10 != 0)
                nums[i + 1] = temp;
        }

        return nums;


    }

}
