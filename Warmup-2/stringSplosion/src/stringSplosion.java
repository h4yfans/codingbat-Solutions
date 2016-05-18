/**
 * Created by KAAN on 19/05/2016.
 *
 * Given a non-empty string like "Code" return a string like "CCoCodCode".

 stringSplosion("Code") → "CCoCodCode"
 stringSplosion("abc") → "aababc"
 stringSplosion("ab") → "aab"
 */
public class stringSplosion {
    public static void main(String[] args){
        System.out.println(stringSplosion("Code"));

    }

    public static String stringSplosion(String str) {
        String newS = "";

        for(int i = 0; i < str.length() ; i++){
            newS = newS + str.substring(0,i+1);
        }
        return newS;


    }

}
