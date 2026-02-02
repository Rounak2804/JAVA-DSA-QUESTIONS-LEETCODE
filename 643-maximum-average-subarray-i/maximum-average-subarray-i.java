class Solution {
    public double findMaxAverage(int[] arr, int k) {

        int j = 0;
        int i = 0;
        int sum = 0;

        while (j < k) {
            sum += arr[j];
            j++;
        }
        double max = sum;
        // double avg = 0;

        while (j < arr.length) {
            sum = sum + arr[j];
            sum = sum - arr[i];

            if (sum > max) {
                max = sum;

            }
            i++;
            j++;

        }

        return max / k;

    }
}