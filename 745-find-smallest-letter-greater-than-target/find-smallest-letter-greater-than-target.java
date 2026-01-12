class Solution {
    public char nextGreatestLetter(char[] arr, char target) {
        int start = 0;
        char res = ' ';
        int end = arr.length - 1;

        while(start<=end){
            int mid = (start+end)/2;
            if (arr[mid] > target) {
                res = arr[mid];
                end = mid - 1;
            } else { 
                
                start = mid + 1;
            }
            
        }
        if(res==' '){
            res = arr[0];
        }
        return res;
    }
}