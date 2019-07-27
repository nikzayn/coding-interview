import java.util.*;

class Unique{
    //By using brute force or naive way
    //Time complexity = O(n^2)
    // boolean isUnique(String str){
    //     for(int i = 0; i < str.length(); i++){
    //         for(int j = i + 1; j < str.length(); j++){
    //             if(str.charAt(i) == str.charAt(j)){
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
    // }

    //Searching, iterating and comparing 
    //Time Complexity = O(nlogn)
    // boolean isUnique(String str){
    //     char[] chArray = str.toCharArray();

    //     Arrays.sort(chArray);

    //     for(int i = 0; i < chArray.length - 1; i++){
    //         if(chArray[i] != chArray[i + 1]){
    //             continue;
    //         }
    //         else {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    //By using data structure
    //Time complexity = O(n)
    // boolean isUnique(String str){
    //     if(str.length() > 128){
    //         return false;
    //     }

    //     boolean[] char_str = new boolean[128];
    //     for(int i = 0; i < str.length(); i++){
    //          int val = str.charAt(i);
    //          if(char_str[val]){
    //              return false;
    //          }
    //          else {
    //              char_str[val] = true;
    //          }
    //     }
    //     return true;
    // }

    //Without Data Structure
    //Time Complexity: O(n)
    boolean isUnique(String str){
        int checker = 0;
        for(int i = 0; i < str.length(); i++){
            
            int val = str.charAt(i) - 'a';
            if((checker & (1 << val)) > 0){
                return false;   
            }
            checker = checker | (1 << val);
        }
        return true;
    }

public static void main(String args[]){
    Unique obj = new Unique();
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    
    if(obj.isUnique(input)){
        System.out.println("String has unique characters");
    }
    else {
        System.out.println("String has duplicates characters");
        }
        sc.close();
    }
}
