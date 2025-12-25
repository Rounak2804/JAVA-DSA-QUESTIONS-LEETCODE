class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n = happiness.length-1;
        int picked  = 0;
        long hvalue = 0;
       for(int i = n;i>=0 && k>0;i--){
        int effective = happiness[i] - picked;
        
            if (effective <= 0) {
                break;
            }
         hvalue += effective;
            picked++;
            k--;
       }
return hvalue;
    }
}