class Solution {
    public int[][] transpose(int[][] arr) {
        int r = arr.length;
        int c = arr[r - 1].length;
        int res[][] = new int[c][r];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                res[j][i] = arr[i][j];

            }
        }
        return res;
    }
}