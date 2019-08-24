import java.util.*;

class SearchRotate{
    public int search(int[] arr, int x){
        return binarySearch(arr, 0, arr.length - 1, x);
    }

    public int binarySearch(int arr[], int left, int right, int x){
        int mid = left + (right - left) / 2;

        //If target value is equal to mid value
        if(x == arr[mid]){
            return mid;
        }

        if(right < left){
            return -1;
        }

        //If left is normally rotated
        if(arr[left] <= arr[mid]){
            if(x >= arr[left] && x < arr[mid]){
                return binarySearch(arr, left, mid - 1, x);
            }
            else{
                return binarySearch(arr, mid + 1, right, x);
            }
        }

        //If right is normally rotated
        else{
            if(x <= arr[right] && x > arr[mid]){
                return binarySearch(arr, mid + 1, right, x);
            }
            else{
                return binarySearch(arr, left, mid - 1, x);
            }
        }
    }

}