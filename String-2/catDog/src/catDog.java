/**
 * Created by KAAN on 22/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 *
 * Return true if the string "cat" and "dog" appear the same number of times in the given string.
 * catDog("catdog") → true
 * catDog("catcat") → false
 * catDog("1cat1cadodog") → true
 */
public class catDog {
    public boolean catDog(String str) {

        int countDog=0;
        int countCat=0;

        for(int i = 0; i < str.length()-1 ; i++){
            if (str.substring(i,i+3).equals("dog"))
                countDog++;
            if (str.substring(i,i+3).equals("cat"))
                countCat++;
        }
        return countCat == countDog;
    }
}
