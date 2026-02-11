class Solution {
    public int[] decrypt(int[] arr, int k) {
        int n = arr.length;
        int res[] = new int[n];
        if(k==0){
            return res;
        }
        else if(k > 0){
            for(int i = 0; i < n; i++){
                int sum = 0;

                for(int j = 1; j <= k; j++){
                    sum += arr[(i + j) % n];
                }

                res[i] = sum;
            }
        }
       

        else if(k<0){
             for(int i = 0; i < n; i++){
                int sum1 = 0;

                for(int j = 1; j <= Math.abs(k); j++){
                    sum1 += arr[(i - j + n) % n];
                }

                res[i] = sum1;
            }
        }
        return res;

        }

    
}
