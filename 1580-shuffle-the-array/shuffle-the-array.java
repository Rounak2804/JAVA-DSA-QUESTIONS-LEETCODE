class Solution {
    public int[] shuffle(int[] arr, int n) {
        int res[] = new int[n*2];
        int a = 0;
        for(int i = 0;i<arr.length/2;i++){
           res[a] = arr[i];
           a = a + 2;
        }
        int b = 1;
        for(int i = n;i<arr.length;i++){
            res[b] = arr[i];
            b = b+2;
        }
        return res;
    }
}