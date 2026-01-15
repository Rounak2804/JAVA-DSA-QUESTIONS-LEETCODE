class Solution {
    public int peakIndexInMountainArray(int[] arr) {
       int s = 0;
       int e = arr.length - 1;
    int p1 = 0;
    int p2 = 0;
       while(s<=e){
        int mid = (s+e)/2;
        if(arr[mid]<arr[mid+1]){
            p1 = mid + 1;
            s = mid + 1;
        }
        else if(arr[mid]>arr[mid+1]){
            p2 = mid;
            e = mid -1;
        }
       }

return p1;

    }
}