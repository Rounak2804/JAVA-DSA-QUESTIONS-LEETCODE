class Solution {
    public int[] getSneakyNumbers(int[] arr) {
        Arrays.sort(arr);
        int res[] = new int[2];
        int a = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==arr[i+1]){
                res[a] = arr[i];
                a++;
            }
            if(a==2){
                break;
            }
        }
        return res;
    }
}