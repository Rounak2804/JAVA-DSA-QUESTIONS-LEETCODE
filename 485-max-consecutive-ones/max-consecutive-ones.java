class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int count = 0;
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count += 1;
            } else {
                count = 0;
            }
        
            if (count > result) {
                result = count;
            }
        }
        return result;

    }
}