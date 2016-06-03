import java.util.Arrays;

/**
 * Created by Kaan Karaca on 03/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates.
 * Return a new array containing the first N elements from the two arrays. The result array should be in alphabetical order and without duplicates.
 * A and B will both have a length which is N or more. The best "linear" solution makes a single pass over A and B,
 * taking advantage of the fact that they are in alphabetical order, copying elements directly to the new array.
 * <p>
 * mergeTwo(["a", "c", "z"], ["b", "f", "z"], 3) → ["a", "b", "c"]
 * mergeTwo(["a", "c", "z"], ["c", "f", "z"], 3) → ["a", "c", "f"]
 * mergeTwo(["f", "g", "z"], ["c", "f", "g"], 3) → ["c", "f", "g"]
 */
public class mergeTwo {
    public String[] mergeTwo(String[] a, String[] b, int n) {

        String[] newArr = new String[n];
        int aPos = 0;
        int bPos = 0;

        for (int i = 0; i < n; i++) {
            if (a[aPos].compareTo(b[bPos]) < 0) {
                newArr[i] = a[aPos];
                aPos++;
            } else if (a[aPos].compareTo(b[bPos]) > 0) {
                newArr[i] = b[bPos];
                bPos++;
            } else {
                newArr[i] = a[aPos];
                aPos++;
                bPos++;
            }
        }
        return newArr;
    }

}
