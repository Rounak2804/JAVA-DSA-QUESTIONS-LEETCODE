class Solution {
    public int distinctAverages(int[] nums) {
        HashSet<Double> set = new HashSet<>();
        int n = nums.length;
        Arrays.sort(nums);

        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int l = nums[i];
            int h = nums[j];

         double avg = (l + h) / 2.0;
            set.add(avg);

            i++;
            j--;

        }
        int m = set.size();
        return m;

    }
}