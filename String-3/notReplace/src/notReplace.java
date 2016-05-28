/**
 * Created by KAAN on 28/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not".
 * The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count.
 * (Note: Character.isLetter(char) tests if a char is a letter.)
 * notReplace("is test") → "is not test"
 * notReplace("is-is") → "is not-is not"
 * notReplace("This is right") → "This is not right"
 */
public class notReplace {
    public static void main(String[] args) {

        System.out.println(Character.isLetter(' '));

    }

    public String notReplace(String str) {

        if (str.length() < 2) return str;
        if (str.equals("is")) return "is not";

        for (int i = 2; i < str.length()-3; i++) {
            if (!Character.isLetter(str.charAt(i)) && str.substring(i+1,i+3).equals("is")
                    && !Character.isLetter(str.charAt(i+3))){
                str = str.substring(0,i) + " is not" + str.substring(i+3);
                i=+6;
            }
        }

        if(str.length() == 2){
            if(str.substring(0,2).equals("is")) return "is not";
            else return str;
        }
        if(str.substring(0,2).equals("is")
                && !Character.isLetter(str.charAt(2)))
            str = "is not" + str.substring(2);
        if(!Character.isLetter(str.charAt(str.length()-3))
                && str.substring(str.length()-2).equals("is")) str+=" not";
        return str;


    }
}
