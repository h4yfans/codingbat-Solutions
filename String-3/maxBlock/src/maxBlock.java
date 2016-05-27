/**
 * Created by KAAN on 27/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.
 * maxBlock("hoopla") → 2
 * maxBlock("abbCCCddBBBxx") → 3
 * maxBlock("") → 0
 */
public class maxBlock {
    public int maxBlock(String str) {

        int count = 1;
        int max = 0;
        if (str.length() == 0) return 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (i + 2 <= str.length() && str.substring(i, i + 1).equals(str.substring(i + 1, i + 2))) {
                count++;
            } else {
                if (count >= max) {
                    max = count;
                }
                count = 1;
            }
        }
        return max;
    }

    public class maxBlockSeconWay {
        public int maxBlock(String str) {
            if (str.length() == 0) return 0;
            int block = 1;
            char lastChar = str.charAt(0);
            int temp = 1;

            for (int count = 1; count < str.length(); count++) {
                if (lastChar == str.charAt(count)) {
                    temp++;
                } else {
                    temp = 1;
                    lastChar = str.charAt(count);
                }
                block = Math.max(temp, block);
            }
            return block;
        }
    }

}
