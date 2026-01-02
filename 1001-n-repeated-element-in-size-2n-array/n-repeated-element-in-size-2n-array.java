class Solution {
    public int repeatedNTimes(int[] arr) {
        Arrays.sort(arr);
        int r = 0;
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                r = arr[i];
            }
        }
        return r;
    }
}