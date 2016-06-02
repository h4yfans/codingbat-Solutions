/**
 * Created by Kaan Karaca on 31/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).
 * squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
 * squareUp(2) → [0, 1, 2, 1]
 * squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
 */
public class squareUp {

    public static void main(String[] args){

        System.out.println(25%4);

    }
    public int[] squareUp(int n) {

        int[] newArr = new int[n * n];

        if (n == 1) return new int[]{1};

        for (int i = n * n - 1; i > 0; i--) {
            for (int j = i; j >= n * (n * n - i - 1); j -= n) {
                newArr[j] = n * n - i;
            }
        }

        return newArr;
    }

}


