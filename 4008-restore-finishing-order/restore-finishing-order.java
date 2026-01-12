class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n = friends.length;
        int res[] = new int[n];
        int a = 0;
        for (int i = 0; i < order.length; i++) {
            int curr = order[i];
            
            for (int j = 0; j < friends.length; j++) {
                if (curr == friends[j]) {
                    res[a] = order[i];
                    a++;
                }
               
            }
        }
        return res;

    }
}