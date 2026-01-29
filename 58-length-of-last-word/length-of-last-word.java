class Solution {
    public int lengthOfLastWord(String s) {
        String r = s.trim();
        char[] arr = r.toCharArray();
        int n = arr.length - 1;
        int count = 0;
        for(int i = n;i>=0;i--){
            if(arr[i] == ' '){
                break;
            }
            else{
                count++;
            }
        }
        return count;

    }
}