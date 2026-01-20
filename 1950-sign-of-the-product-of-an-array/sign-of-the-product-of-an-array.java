
class Solution {
    public int arraySign(int[] nums) {
      
        int n = 0;
        int p = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            } else if (nums[i] < 0) {
                n--;
            } else {
                p++;
            }

        }
         if(n%2==0) return 1;
        else return -1;

       

    }
}