class Solution {
    public int sumOfUnique(int[] arr) {
        
        HashMap<Integer , Integer> map = new HashMap<>();
        int i = 0;
        while(i < arr.length){
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i] , 1);
            }
            i++;
        }
        int sum = 0;

for(int key : map.keySet()){
    if(map.get(key) == 1){
        sum += key;
    }
    else{
        continue;
    }
}
return sum;
    }
}