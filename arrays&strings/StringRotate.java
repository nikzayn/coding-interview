import java.util.*;

class StringRotate{
    static int isRotate(String s1, String s2){
        int len = s1.length();

        //Check if the len is equal to the s2 string length and greater than 0
        if(s2.length() == len && len > 0){
            String stringAdd = s1 + s2; 
            return isSubstring(stringAdd, s2);
        }
    }
    return false;
}