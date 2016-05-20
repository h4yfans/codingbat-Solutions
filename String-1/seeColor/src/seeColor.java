/**
 * Created by KAAN on 20/05/2016.
 * <p>
 * <p>
 * Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
 * <p>
 * seeColor("redxx") → "red"
 * seeColor("xxred") → ""
 * seeColor("blueTimes") → "blue"
 */
public class seeColor {
    public static void main(String[] args) {
        System.out.println(seeColor("redxx"));
        System.out.println(seeColor("xxred"));
        System.out.println(seeColor("blueTimes"));
    }

    public static String seeColor(String str) {

        if (str.startsWith("blue")) {
            return "blue";
        } else if (str.startsWith("red")) {
            return "red";
        }
        return "";
    }

}
