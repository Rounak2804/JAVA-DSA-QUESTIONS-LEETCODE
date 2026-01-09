class Solution {
    public int maximumWealth(int[][] arr) {
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
                int c = 0;
            for(int j = 0;j<arr[i].length;j++){
                c += arr[i][j];
            }
            if(c>=sum){
                sum = c;
            }
        }
        return sum;
    }
}