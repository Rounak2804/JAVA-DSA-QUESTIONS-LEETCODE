import java.util.Arrays;
class Solution {
    public boolean containsDuplicate(int[] arr) {
     Arrays.sort(arr);
     boolean a = false;
     for(int i = 0;i<arr.length-1;i++){
        if(arr[i]==arr[i+1]){
            a = true;
            break;
        }
     }
     return a;
    }
}
