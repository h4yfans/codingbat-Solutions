/**
 * Created by KAAN on 17/05/2016.
 *
 Given a non-empty string and an int n, return a new string where the char at index n has been removed.
 The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

 missingChar("kitten", 1) → "ktten"
 missingChar("kitten", 0) → "itten"
 missingChar("kitten", 4) → "kittn"
 */
public class amras {
    public static void main(String[] args){

      System.out.println(missingChar("kitten", 1));
      System.out.println(missingChar("kitten", 0));
      System.out.println(missingChar("kitten", 4));

    }

    public static String missingChar(String str, int n) {
        if (!str.isEmpty())
            return str.substring(0,n) + str.substring(n+1);
        else
            return str;
    }

    /* Second Way
     String front = str.substring(0, n);

    // Start this substring at n+1 to omit the char.
    // Can also be shortened to just str.substring(n+1)
    // which goes through the end of the string.,

    String back = str.substring(n+1, str.length());

    return front + back;
        }

     */

    // If still you have a problem with substring. I think you have to look here - > http://www.tutorialspoint.com/javaexamples/string_removing_char.htm

}
