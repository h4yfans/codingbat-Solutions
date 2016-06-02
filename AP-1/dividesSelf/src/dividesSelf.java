/**
 * Created by Kaan Karaca on 03/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * We'll say that a positive int divides itself if every digit in the number divides into the number evenly.
 * So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly.
 * We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself.
 * Note: use % to get the rightmost digit, and / to discard the rightmost digit.
 * dividesSelf(128) → true
 * dividesSelf(12) → true
 * dividesSelf(120) → false
 */
public class dividesSelf {
    public boolean dividesSelf(int n) {

        for (int i = n; i != 0; i /= 10) {
            int mod = i % 10;
            if (mod == 0 || n / mod != 0)
                return false;
        }

        return true;

    }

}
