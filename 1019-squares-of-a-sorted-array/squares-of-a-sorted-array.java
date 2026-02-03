class Solution {
    public int[] sortedSquares(int[] arr) {
        
        int res[] = new int[arr.length];

        int i = 0;
        int j = arr.length - 1;
        while(i<=j){
            res[i] = arr[i] * arr[i];
            res[j] = arr[j] * arr[j];
            i++;
            j--;
        }
        Arrays.sort(res);
        return res;
    }
}