/**
 * Created by KAAN on 17/05/2016.
 * <p>
 * <p>
 * Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
 * <p>
 * notString("candy") → "not candy"
 * notString("x") → "not x"
 * notString("not bad") → "not bad"
 */
public class amras {
    public static void main(String[] args) {
        String str = " Kaan karac sevde dayidinc";
        String[] s = str.split("\\s+");

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[0]);

        }
    }

    public String notString(String str) { // question says use .equals() method but I didn't because this way more practice for me.

        if (str.startsWith("not"))
            return str;
        else
            return "not " + str;


        /*
         * or you can do this way - using equals
         *
              if (str.length() >= 3 && str.substring(0, 3).equals("not"))
                return str;

             return "not " + str;
         */

    }


}
