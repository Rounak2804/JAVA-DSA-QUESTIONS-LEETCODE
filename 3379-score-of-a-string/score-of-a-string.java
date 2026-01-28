class Solution {
    public int scoreOfString(String s) {
        char arr[] = s.toCharArray();
        int sum = 0;
        for(int i = 0;i<arr.length - 1;i++){
            int first = (int) arr[i];
            int second = (int) arr[i+1];
            int d = Math.abs(first - second);
            sum = d + sum;
        }
        return sum;
    }
}