import java.util.*;

class URLify{
     public int isURL(char[] str, int strLength){
         int spaceCount = 0, index, i;
         
         //1. To count the number of spaces.
         for(i = 0; i < strLength; i++){
            if(str[i] == ' '){
                spaceCount++;
            }
         }

         //2. Replacing the %20 with the empty spaces.
        index = strLength + spaceCount * 2;
        
        if(strLength < str.length){
            str[strLength] = '\0';
         }

         for(i = strLength - 1; i >= 0; i--){
             if(str[i] == ' '){
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            }
            else {
                str[index - 1] = str[i];
                index--;
            }
         }
         return index;
     }

     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();
         
         str = str.trim();

         str = str.replaceAll("\\s", "%20");

         System.out.println(str);
     }
}