class Solution {
    public List<Integer> findPeaks(int[] arr) {
        ArrayList l = new ArrayList<>();
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                l.add(i);
            }

        }
        return l;
    }
}