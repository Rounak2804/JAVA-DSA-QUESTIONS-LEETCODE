import java.util.*;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
       Arrays.sort(arr);

        List<List<Integer>> result = new ArrayList<>();
        int abs = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            int d = arr[i + 1] - arr[i];

            if (d < abs) {
                abs = d;
                result.clear();                 // reset
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i + 1]);
                result.add(pair);
            } 
            else if (d == abs) {
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i + 1]);
                result.add(pair);
            }
        }

        return result;
    }

}