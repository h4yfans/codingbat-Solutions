/**
 * Created by Kaan Karaca on 04/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's make a pair.
 * Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. Recursively compute the number of pairs in the given string.
 * countPairs("AxA") → 1
 * countPairs("AxAx") → 2
 * countPairs("AxbA") → 1
 */
public class countPairs {
    public int countPairs(String str) {

        if (str.length() <= 2) return 0;

        if (str.charAt(0) == str.charAt(2))
            return 1 + countPairs(str.substring(1));

        return countPairs(str.substring(1));

    }

}
