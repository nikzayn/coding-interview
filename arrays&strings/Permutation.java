import java.util.*;

class Permutation{
    //Approach - 1
    //Sorting and comparing 
    //time complexity = O(nlogn)

    // static boolean isPermutation(String str1, String str2){
        
    //     int n1 = str1.length();
    //     int n2 = str2.length();

    //     //Convert strings to character array
    //     if(n1 != n2){
    //         return false;
    //     }
    //     char[] ch1 = str1.toCharArray();
    //     char[] ch2 = str2.toCharArray();

    //     //Sorting the arrays
    //     Arrays.sort(ch1);
    //     Arrays.sort(ch2);

    //     //Iterating and comparing the arrays
    //     for(int i = 0; i < n1; i++){
    //         if(ch1[i] != ch2[i]){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    //Approach - 2   
    //1. Count the characters
    //2. Iterate thorugh every characters and inc. the count
    //3.  Compare arrays and check for if it same then return otherwise return false
    //Time Complexity = O(n)
    
    static int no_of_chars = 256;
     static boolean isPermutation(char str1[], char str2[]){
        
        int count1[] = new int [no_of_chars];
         Arrays.fill(count1, 0);
        int count2[] = new int [no_of_chars];
         Arrays.fill(count2, 0);

        for(int i = 0; i < str1.length && i < str2.length; i++){
            count1[str1[i]]++;
            count2[str2[i]]++;
        }

        if(str1.length != str2.length){
            return false;
        }

        for(int i = 0; i < no_of_chars; i++){
            if(count1[i] != count2[i]){
                return false;
            }
        }
        return true;
    }




    public static void main(String[] args){
        char[] str1 = ("geeky").toCharArray();
        char[] str2 = ("eekyg").toCharArray();

        if(isPermutation(str1, str2)){
            System.out.println("Strings are in permutation");
        }
        else{
            System.out.println("Strings are not permutation");
        }
    }
}