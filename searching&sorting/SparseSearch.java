

class SparseSearch{
    static int search(String arr[], int low, int high, String str){
        if(low > high){
            return -1;
        }
        
        //Pivot point
        int mid = (low + high) / 2;

        if(arr[mid] == ""){
            int left = mid - 1;
            int right = mid + 1;

            while(true){
                if(left < low && right > high){
                    return -1;
                }
                else if(left >= low && arr[left] != ""){
                    mid = left;
                    break;
                }
                else if(right <= high && arr[right] != ""){
                    mid = right;
                    break;
                }
                left--;
                right++;
            }
            
        }

        if(arr[mid] == str){
            return mid;
        }
        else if(str.compareTo(arr[mid]) < 0){
            return search(arr, low, mid - 1, str);
        }
        else{
            return search(arr, mid + 1, high, str);
        }

    }

    static int sparsed(String arr[], String str, int n){
        return search(arr, 0, n - 1, str);
    }

    public static void main(String[] args){
        String arr[] = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
        String str = "ball";
        int n = str.length();
        int index = sparsed(arr, str, n);
        
        if(index != -1){
            System.out.println(str+ " found at index "+index); 
        }
        else{
            System.out.println(str+" not found"); 
        }
    }

}