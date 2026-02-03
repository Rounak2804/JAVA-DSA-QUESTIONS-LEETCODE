class Solution {
    public int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int res[] = new int[n];

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