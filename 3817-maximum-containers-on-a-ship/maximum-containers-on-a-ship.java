class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
       int c = 0;
       if(n*n*w<=maxWeight){
        c = n*n;
       }
       else{
        c = maxWeight/w;
       }
       return c;
    }
}