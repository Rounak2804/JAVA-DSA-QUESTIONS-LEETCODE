class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int extra) {
        ArrayList<Boolean> l = new ArrayList<>();
        int largest = -1;
       for(int i = 0;i<arr.length;i++){
                if(arr[i]>largest){
                    largest = arr[i];
                }
       }
      for(int j = 0;j<arr.length;j++){
        int sum = arr[j]+extra;
        if(sum>=largest){
            l.add(true);
        }
        else{
            l.add(false);
        }
      }
       return l;
    

    }
}