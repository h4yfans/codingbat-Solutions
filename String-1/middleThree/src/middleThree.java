/**
 * Created by KAAN on 20/05/2016.
 * <p>
 * Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.
 * <p>
 * middleThree("Candy") → "and"
 * middleThree("and") → "and"
 * middleThree("solving") → "lvi"
 */
public class middleThree {
    public static void main(String[] args) {
        System.out.println(middleThree("Candy"));
        System.out.println(middleThree("and"));
        System.out.println(middleThree("solving"));

    }

    public static String middleThree(String str) {

        if (str.length() > 3) {
            return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
        }
        return str;
    }

}
