/**
 * Created by KAAN on 18/05/2016.
 *
 * Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

 mixStart("mix snacks") → true
 mixStart("pix snacks") → true
 mixStart("piz snacks") → false
 */
public class amras {
    public static void main(String[] args){
System.out.println(mixStart("pix snacks"));

    }

    public static boolean mixStart(String str) {

        if (str.length() >= 3)
            return str.substring(1,3).equals("ix");
        else
            return false;

    }

}
