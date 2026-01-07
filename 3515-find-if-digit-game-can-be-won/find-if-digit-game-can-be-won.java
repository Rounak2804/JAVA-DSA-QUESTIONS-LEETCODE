class Solution {
    public boolean canAliceWin(int[] arr) {
        int alice = 0;
        int bob = 0;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]<=9){
                alice = alice + arr[i];
            }
            else{
                bob = bob +arr[i];
            }
        }
        if(alice==bob){
            return false;
        }
        else{
            return true;
        }
    }
}