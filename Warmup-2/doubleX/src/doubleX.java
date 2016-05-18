/**
 * Created by KAAN on 18/05/2016.
 * <p>
 * Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
 * <p>
 * doubleX("axxbb") → true
 * doubleX("axaxax") → false
 * doubleX("xxxxx") → true
 */
public class doubleX {
    public static void main(String[] args) {
        System.out.println(doubleX("aaaax"));

    }

    static boolean doubleX(String str) {
        for (int i = 0; i < str.length()-1; i++) {
            int where = str.indexOf("x");
            if (str.lastIndexOf("x")==where){
                break;
            }
            if (str.substring(where+1, where + 2).equals("x")) {
                return true;
            }
        }
        return false;
    }

    /* second way - this way more particle ^^

    boolean doubleX(String str) {
      int i = str.indexOf("x");
     if (i == -1) return false; // no "x" at all

      // Is char at i+1 also an "x"?
      if (i+1 >= str.length()) return false; // check i+1 in bounds?
      return str.substring(i+1, i+2).equals("x");

     // Another approach -- .startsWith() simplifies the logic
     // String x = str.substring(i);
      // return x.startsWith("xx");
}
     */
}
