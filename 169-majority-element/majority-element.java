class Solution {
    public int majorityElement(int[] arr) {
         int n = arr.length;
        
                //value   frequency
         HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < arr.length; i++) {
                if (map.containsKey(arr[i])) {
                    map.put(arr[i], map.get(arr[i]) + 1); 
                }
                 else {
                    map.put(arr[i], 1);
                }

            }
                int maj = 0;
            for(int i = 0;i<arr.length;i++){
                if(map.get(arr[i]) > n/2){
                   maj = arr[i];
                }
            }
return maj;
    }
}