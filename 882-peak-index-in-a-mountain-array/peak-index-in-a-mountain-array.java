class Solution {
    public int peakIndexInMountainArray(int[] arr) {
     int start = 0;
        int end = arr.length - 1;
       
        while (start < end) {   // why not equal to because it will run for last element too which we dont want /
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
            // if(start==end){
            //     break;
            // }
        }
        return start;

    }
}