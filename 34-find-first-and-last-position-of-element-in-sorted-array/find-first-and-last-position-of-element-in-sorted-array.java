 class Solution {
    public int[] searchRange(int[] arr, int t) {
        int[] res = new int[2];
        res[0] = findFirst(arr, t);
        res[1] = findLast(arr, t);
        return res;
    }
    int findLast(int[] arr, int t){
    int s = 0, e = arr.length - 1;
    int ans = -1;

    while(s <= e){
        int mid = (s + e) / 2;

        if(arr[mid] == t){
            ans = mid;
            s = mid + 1;   // go RIGHT
        }
        else if(arr[mid] < t){
            s = mid + 1;
        }
        else{
            e = mid - 1;
        }
    }
    return ans;
}
int findFirst(int[] arr, int t){
    int s = 0, e = arr.length - 1;
    int ans = -1;

    while(s <= e){
        int mid = (s + e) / 2;

        if(arr[mid] == t){
            ans = mid;
            e = mid - 1;   // go LEFT
        }
        else if(arr[mid] < t){
            s = mid + 1;
        }
        else{
            e = mid - 1;
        }
    }
    return ans;
}

}

