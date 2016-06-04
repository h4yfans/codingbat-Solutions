/**
 * Created by Kaan Karaca on 04/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.
 * changeXY("codex") → "codey"
 * changeXY("xxhixx") → "yyhiyy"
 * changeXY("xhixhix") → "yhiyhiy"
 */
public class changeXY {
    public String changeXY(String str) {

        if (str.length() == 0) return str;

        if (str.charAt(0) == 'x')
            return "y" + changeXY(str.substring(1));

        return str.charAt(0) + changeXY(str.substring(1));
    }

}
