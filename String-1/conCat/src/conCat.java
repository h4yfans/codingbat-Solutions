/**
 * Created by KAAN on 20/05/2016.
 * <p>
 * <p>
 * Given two strings, append them together (known as "concatenation") and return the result.
 * However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
 * <p>
 * conCat("abc", "cat") → "abcat"
 * conCat("dog", "cat") → "dogcat"
 * conCat("abc", "") → "abc"
 */
public class conCat {
    public static void main(String[] args) {

        System.out.println(conCat("abc", "cat"));
        System.out.println(conCat("dog", "cat"));
        System.out.println(conCat("abc", ""));

    }

    public static String conCat(String a, String b) {

       if (a.length() > 0 && b.length() > 0)
            if (a.substring(a.length()).equals(b.substring(0, 1)))
                return a + b.substring(1, b.length());
        return a + b;
    }

}
