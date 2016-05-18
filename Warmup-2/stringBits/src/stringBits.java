/**
 * Created by KAAN on 19/05/2016.
 * <p>
 * Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
 * <p>
 * stringBits("Hello") → "Hlo"
 * stringBits("Hi") → "H"
 * stringBits("Heeololeo") → "Hello"
 */
public class stringBits {
    public static void main(String[] args) {


        System.out.println(stringBits("Hello"));
        System.out.println(stringBits("Hi"));
        System.out.println(stringBits("hxaxpxpxy"));
    }

    public static String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result = result + str.substring(i, i + 1);
        }
        return result;
    }

}
