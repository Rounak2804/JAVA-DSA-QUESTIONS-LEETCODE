class Solution {
    public int removeElement(int[] arr, int val) {

       int i  = 0;
       int j = arr.length - 1;

       while(i<=j){
                    if(arr[i]==val && arr[j]!=val){
                        arr[i] = arr[j];
                        i++;
                        j--;
                    }
                    else if(arr[i]==val && arr[j]==val){
                        arr[i] = arr[j];
                        j--;
                    }
                    else if(arr[i]!=val){
                        i++;
                    } 
                  


       }
       return i;

    }

}