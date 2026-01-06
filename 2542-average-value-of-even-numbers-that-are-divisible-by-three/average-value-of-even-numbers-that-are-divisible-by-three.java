class Solution {
    public int averageValue(int[] arr) {
        int x = 0;
        int avg = 0;
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2==0 && arr[i]%3==0){
                avg = avg + arr[i];
                count++;
            }
        }
        if(count==0){
            x = 0;
        }
        else{
            x = avg/count;
        }
        return x;
        
    }
}