class Solution {
    public int countPairs(List<Integer> l, int t) {
        int n = l.size();
        int arr[] = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = l.get(i);
        }

        int count = 0;

        for(int i = 0;i<arr.length;i++){
           
            int cur = arr[i];

            for(int j = i+1;j<arr.length;j++){
                
                int sum = cur + arr[j];
                if(sum<t){
                    count++;
                }
            }
        }
          return count;  
    }
}