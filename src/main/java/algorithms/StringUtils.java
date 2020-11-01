package algorithms;

public class StringUtils {

    public boolean areAnagramStrings(String s1, String s2){
        //s1="mare"
        //s2="rame"

        //TODO: 1) implement using 2 iterations using for
        //1. compare length
        //2. compare strings using 2 fors
        //TODO: 2) implement using 2 frequency arrays
        //TODO: 3) implement using 1 frequency array
        //using cod ascii for frequncy array
        // 'a' - 0 = 127
        return false;
    }

    public boolean areCirularPermutedStrings(String s1, String s2){
        //s1 = "mare"
        //s2 = "rema"
        if(s1.length() != s2.length()) {
            return false;
        }
        s2 += s2;
        return s2.contains(s1);
    }


}
