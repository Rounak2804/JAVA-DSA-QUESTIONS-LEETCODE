class Solution {
    public int countPairs(List<Integer> l, int t) {
        
             int count = 0;
        for (int i = 0; i < l.size(); i++) {
            int curr = l.get(i);
            for (int j = i + 1; j < l.size(); j++) {
                int sum = curr + l.get(j);
                if (sum < t) {
                    count++;
                }
            }
        }

        return count;
        
    }
}