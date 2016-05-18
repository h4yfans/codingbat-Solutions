/**
 * Created by KAAN on 18/05/2016.
 * <p>
 * Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
 * <p>
 * everyNth("Miracle", 2) → "Mrce"
 * everyNth("abcdefg", 2) → "aceg"
 * everyNth("abcdefg", 3) → "adg"
 */
public class amras {
    public static void main(String[] args) {

        System.out.println(everyNth("Miracle", 2));
        System.out.println(everyNth("abcdefg", 2));
        System.out.println(everyNth("abcdefg", 3));

    }

    public static String everyNth(String str, int n) {

        String s= "";

        if (!str.isEmpty()) {
            for(int i = 0; i < str.length() ; i+=n){
                s = s + str.charAt(i);
            }

            return s;
        }
        return str;
    }

}
