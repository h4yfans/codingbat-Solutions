/**
 * Created by KAAN on 20/05/2016.
 * <p>
 * Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.
 * <p>
 * hasBad("badxx") → true
 * hasBad("xbadxx") → true
 * hasBad("xxbadxx") → false
 */
public class hasBad {
    public void main(String[] args) {
        System.out.println(hasBad("xbadxx"));
        System.out.println(hasBad("xxbadxx"));
        System.out.println(hasBad("badxx"));

    }

    public boolean hasBad(String str) {

        if (str.length() > 3)
            if (str.substring(0, 3).equals("bad"))
                return true;
        if (str.length() > 3)
            if (str.substring(1, 4).equals("bad"))
                return true;

        return false;

    }


    /*
    cleaner ways - same solution but more understandable
public boolean hasBad(String str) {
  if (str.length()>=3 && str.substring(0, 3).equals("bad")) {
    return true;
  }
  if (str.length()>=4 && str.substring(1, 4).equals("bad")) {
    return true;
  }
  return false;

  // Solution notes: basically want to call substring(0, 3) and
  // substring(1, 4) and check if that equals "bad". Need to check
  // the length first so as to not go off the end of the string.
  // Alternately one could use indexOf() -- that code is short
  // but it runs much slower, since it needlessly checks over the whole
  // string.
}

     */

}
