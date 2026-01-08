class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length-1;
        int d1 = 0;
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[i].length;j++){
                if(i==j || i+j==n){
                    d1 = mat[i][j]+d1;
                }
            }
        }
        return d1;
    }
}