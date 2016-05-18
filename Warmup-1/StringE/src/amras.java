/**
 * Created by KAAN on 18/05/2016.

 Return true if the given string contains between 1 and 3 'e' chars.

 stringE("Hello") → true
 stringE("Heelle") → true
 stringE("Heelele") → false
 Go...
 */
public class amras {
    public static void main(String[] args){


    }

    public boolean stringE(String str) {
        int count = 0;
       String[] arr = str.split("");
        for(String i : arr)
            if (i.equals("e"))
                count++;
            if(count >0 && count < 4)
                return true;


        return false;

    }

    /*
    we already have another solution. which is;
    int count = 0;

    for (int i=0; i<str.length(); i++) {
    if (str.charAt(i) == 'e') count++;
    // alternately: str.substring(i, i+1).equals("e")
    }

    return (count >= 1 && count <= 3);
     */


}
