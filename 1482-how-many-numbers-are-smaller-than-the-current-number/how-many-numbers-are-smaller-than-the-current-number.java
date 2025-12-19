class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
       
        int small[] = new int[n];
        for (int i = 0; i < n; i++) {
            int current = nums[i];
             int count = 0;
            for (int j =0; j < n; j++) {
                if (current > nums[j]) {
                    count++;
                }
                else if(current<nums[i]){
                    
                    continue;
                }

            }
            small[i] = count;
           
        }
        return small;
    }
}