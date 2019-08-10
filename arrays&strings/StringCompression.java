import java.util.*;

class StringCompression{
  static String checkRepeat(String str){
        String compressedString = "";
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            count++;
            if(i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)){
                compressedString += "" + str.charAt(i) + count;
                count = 0;
            } 
        }
        return compressedString.length() < str.length() ? compressedString : str; 
    }
}