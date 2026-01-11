class Solution {
    public int smallestIndex(int[] arr) {
       
        int ans = -1;
        for(int i = 0;i<arr.length;i++){
            int o = arr[i];
            int sum = 0;
            while(o != 0){
                int last = o % 10;
                sum = sum + last;
                o /= 10;
            }
              if(sum==i){
                ans = i;
                break;
              }  
            
        }
        return ans ;
    }
}