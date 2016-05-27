/**
 * Created by KAAN on 27/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * Given a string, return the sum of the numbers appearing in the string,
 * ignoring all other characters. A number is a series of 1 or more digit chars in a row.
 * (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
 * sumNumbers("abc123xyz") → 123
 * sumNumbers("aa11b33") → 44
 * sumNumbers("7 11") → 18
 */
public class sumNumbers {
    public int sumNumbers(String str) {

        int sum = 0;
        int length = 0;
        if (str.length()==0) return 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                length++;
            else if (length > 0 || i==str.length()-1) {
                sum += Integer.parseInt(str.substring(i - length, i));
                length = 0;
            }
        }

       if (length>0){
           sum+= Integer.parseInt(str.substring(str.length()-length,str.length()));
       }
        return sum;


    }

}
