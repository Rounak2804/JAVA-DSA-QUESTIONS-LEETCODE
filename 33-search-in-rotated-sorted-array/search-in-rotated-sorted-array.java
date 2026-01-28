class Solution {
    public int search(int[] arr, int target) {
        // when we find a mid check arr[mid] < arr[mid+1] : we are in sorted part 
        // Pivot : how can we find the smallest element 

        int min  = Smallest(arr);
        int f = First(arr , target , min);
        
        
        if(target == arr[min]){
            return min;
        }
        else if(f==-1){
            return Second(arr , target , min);
        }
        else{
            return f;
        }
      

    }
    public int  Smallest(int arr[]){
        int l = 0;
        int r = arr.length - 1;

        while (l < r) {

            int mid = l + (r - l) / 2;
            if (arr[mid] < arr[r]) {
                r = mid;
                // minimum will be behind the mid
            } else if (arr[mid] > arr[r]) {
                l = mid + 1;
                // min will be forward to mid
            }
        }
        return r;
      
    }

    public int First(int arr[] , int target , int min){
            int l = 0;
            int r = min;

            while(l<=r){
                int mid = (l + r)/2;
                if(arr[mid]==target){
                    return mid;
                }
                else if(arr[mid]<target){
                    l = mid + 1;
                }
                else{
                    r = mid - 1;
                }
               
            }
             return -1;
    }

    public int Second(int arr[] , int target , int min){
            int l = min+1;
            int r = arr.length -1;

            while(l<=r){
                int mid = (l + r)/2;
                if(arr[mid]==target){
                    return mid;
                }
                else if(arr[mid]<target){
                    l = mid + 1;
                }
                else{
                    r = mid - 1;
                }
                
            }
            return -1;
    }


}