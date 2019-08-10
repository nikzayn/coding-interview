import java.util.*;

class OneWay{
    static boolean isOneWay(String first, String second){
        if(first.length() == second.length()){
            return isEditReplace(first, second);
        }
        else if(first.length() + 1 == second.length()){
            return isEditInsert(first, second);
        }
        else if(first.length() - 1 == second.length()){
            return isEditInsert(second, first);
        }
        return false;
    }

    //For replacing with the existing character.
    static boolean isEditReplace(String s1, String s2){
        boolean foundDiff = false;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
            if(foundDiff){
                return false;
                }
                foundDiff = true;
            }
        }
        return true;
    }


    //For inserting and removing the characters
    static boolean isEditInsert(String s1, String s2){
        int index1 = 0;
        int index2 = 0;
        while(index1 < s1.length() && index2 < s2.length()){
            if(s1.charAt(index1) != s2.charAt(index2)){
                if(index1 != index2){
                    return false;
                }
                index2++;
            }
            else{
                index1++;
                index2++;
            }
        }
        return true;
    }


    public static void main(String[] args){
        String first = "pale";
        String second = "ll";
        if(isOneWay(first, second)){
            System.out.println("Changed");
        }
        else{
            System.out.println("Not Changed");
        }
    }
    
}