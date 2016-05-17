/**
 * Created by KAAN on 17/05/2016.
 * <p>
 * Given a string, return a new string where the first and last chars have been exchanged.
 */
public class amras {
    public static void main(String[] args) {

        System.out.println(frontBack("a"));

    }

    public static String frontBack(String str) {

        if (str.length()>1)
            return str.substring(str.length()-1)+ str.substring(1,str.length()-1) + str.charAt(0);
        else
            return str;
    }


}
