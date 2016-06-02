/**
 * Created by Kaan Karaca on 02/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Given an array of scores sorted in increasing order, return true if the array contains 3 adjacent scores that differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.
 * scoresClump([3, 4, 5]) → true
 * scoresClump([3, 4, 6]) → false
 * scoresClump([1, 3, 5, 5]) → true
 */
public class scoresClump {
    public boolean scoresClump(int[] scores) {

        for (int i = 0; i < scores.length; i++) {

            if (scores[i+1]-scores[i]<=2)
                if (scores[i+2]-scores[i+1]<=2)
                    return true;

        }
        return false;
    }


}
