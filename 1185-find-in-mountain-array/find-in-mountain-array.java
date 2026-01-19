/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
        int peak = Peak(arr);
        // check peak
        if (arr.get(peak) == target) return peak;

       
        int start = 0;
        int end = peak - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            int val = arr.get(mid);

            if (val == target) return mid;
            else if (val < target) start = mid + 1;
            else end = mid - 1;
        }

        
        start = peak + 1;
        end = arr.length() - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            int val = arr.get(mid);

            if (val == target) return mid;
            else if (val < target) end = mid - 1;   // reversed
            else start = mid + 1;                    // reversed
        }

        return -1;

        }


    public int Peak(MountainArray arr) {
        int start = 0;
        int end = arr.length() - 1;
       

        while (start < end) {
            int mid = (start + end) / 2;
            if (arr.get(mid) > arr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }
        return start;
    }

}
