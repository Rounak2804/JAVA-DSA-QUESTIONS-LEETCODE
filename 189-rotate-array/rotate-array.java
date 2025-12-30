class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        int res[] = new int[k];
        int a = 0;
        for(int i = n - k;i<n;i++){
            res[a] = arr[i];
            arr[i] = 0;
            a++;
        }
        for(int i = n - 1;i>=k;i--){
            arr[i] = arr[i-k];
       }
       for(int i = 0;i<k;i++){
        arr[i] = res[i];
       }
       



    



    }
}