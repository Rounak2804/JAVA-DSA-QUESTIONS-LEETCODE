class Solution {
    public int numOfSubarrays(int[] arr, int k, int thres) {
        // 1] find initial 3 sum with a for loop
        int sum1 = 0;
        int i = 0;
        int j = 0;
        for (j = 0; j < k; j++) {
            sum1 += arr[j];
        }

        int max = 0;
        
        if (sum1/k >= thres) {
            max += 1;
        }

        // now j is at 3 postion 
        // and i is at i=0 position 

        while (j < arr.length) {
            sum1 = sum1 + arr[j]; // add next element
            sum1 = sum1 - arr[i]; // delete previous elememnt

            
            if (sum1/k >= thres) {
                max++;
            }

            i++;
            j++;

        }
        return max;

    }
}