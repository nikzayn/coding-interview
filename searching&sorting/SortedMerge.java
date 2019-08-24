import java.io.*;

class SortedMerge{
    static int NA =-1;
    static void SortAB(int[] a, int[] b, int lastA, int lastB){
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

    static void printArray(int arr[], int n)  
    { 
        System.out.println ( "Array A after merging B in sorted order : " ) ; 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] +" "); 
    } 

    public static void main(String[] args){
        int a[] = {10, 20, 14, 44, 22, NA, NA, NA, NA, NA};
        int lastA = 5;
        int size = 10;
        
        int b[] = {15, 16, 17, 19, 20};
        int lastB = 5;
        SortAB(a, b, lastA, lastB);
        printArray(a, size);
    }
}