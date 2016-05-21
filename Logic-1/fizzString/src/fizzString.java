/**
 * Created by KAAN on 21/05/2016.
 * <p>
 * Given a string str, if the string starts with "f" return "Fizz".
 * If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz".
 * In all other cases, return the string unchanged.
 * <p>
 * fizzString("fig") → "Fizz"
 * fizzString("dib") → "Buzz"
 * fizzString("fib") → "FizzBuzz"
 */
public class fizzString {
    public String fizzString(String str) {

        String newS = "";
        boolean first= str.charAt(0) == 'f';
        boolean end = str.substring(str.length() - 1, str.length()).equals("b");

        if (first || end){
            if (first) newS+="Fizz";
            if (end) newS+="Buzz";
            return newS;}

        return str;

    }


}
