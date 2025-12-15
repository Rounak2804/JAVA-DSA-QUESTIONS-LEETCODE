import java.util.Arrays;
class Solution {
    public int singleNumber(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            count = count ^ arr[i];
        }
        return count;
      
    }
}