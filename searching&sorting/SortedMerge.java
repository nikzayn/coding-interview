import java.util.*;

class SortedMerge{
    public static int SortAB(int[] a, int[] b, int lastA, int lastB){
        int indexA = lastA - 1;
        int indexB = lastB - 1;
        int mergedIndex = lastA + lastB - 1;

        //Merge the array a and b, starting from the last
        while(indexB >= 0){
            //If a is greater than end of b
            if(indexA >=0 && a[indexA] > b[indexB]){
                a[mergedIndex] = a[indexA];
                indexA--;
            }
            else{
                a[mergedIndex] = b[indexB];
                indexB--;
            }
            mergedIndex--;
        }
    }

    pub
}