class Solution {
    public int[] getSneakyNumbers(int[] arr) {
        int res[] = new int[2];
         int a = 0;
       for(int i = 0;i<arr.length;i++){
        int curr= arr[i];
        for(int j = i+1;j<arr.length;j++){
            if(curr==arr[j]){
                res[a] = curr;
                a++;
            }
            if(a==2){
                break;
            }
        }
       }
       return res;
    }
}