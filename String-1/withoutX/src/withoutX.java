/**
 * Created by KAAN on 20/05/2016.
 * <p>
 * <p>
 * Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
 * <p>
 * withoutX("xHix") → "Hi"
 * withoutX("xHi") → "Hi"
 * withoutX("Hxix") → "Hxi"
 */
public class withoutX {
    public static void main(String[] args) {
        String s = "kaankaraca";
        System.out.println(s.substring(2));
    }


    public String withoutX(String str) {
        int begin = 0;
        int end = str.length();

        if (str.length() > 0 && str.charAt(0) == 'x')
            begin = 1;
        if (str.length() > 1 && str.charAt(str.length() - 1) == 'x')
            end--;

        return str.substring(begin,end);
    }
}
