class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        
        int i = 1;
        int container = 0;
        while(i<=n*n){
            int hold = w * i;
            if(hold<=maxWeight){
                container++;
            }
            i++;

        }
        return container;
        

    }
}