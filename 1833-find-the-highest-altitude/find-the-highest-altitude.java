class Solution {
    public int largestAltitude(int[] gain) {
        int start = 0;
        int highest = 0;
        for (int i = 0; i < gain.length; i++) {
            start = start + gain[i];
            if (start > highest) {
                highest = start;
            }

        }
        return highest;

    }
} // this is the question