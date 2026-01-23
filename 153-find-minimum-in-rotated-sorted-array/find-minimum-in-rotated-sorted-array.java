class Solution {
    public int findMin(int[] arr) {
        // find pivot : get index of pivot thats the answer
        // small : arr[i-1] > arr[i] < arr[i+1]

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start)/2;
            
        if(arr[mid]>arr[end]){
            start = mid + 1;
        }
            else{
               end = mid;   
                }
        }

        return arr[end];
    }
}