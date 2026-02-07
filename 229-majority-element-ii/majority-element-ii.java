class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> l = new ArrayList<>();
        //value   frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }

        }
            // Using Entry Set
        Set<Map.Entry<Integer , Integer>> entries = map.entrySet();
        for(Map.Entry<Integer , Integer> entry : entries){
            if(entry.getValue() > n/3){
                l.add(entry.getKey());
            }
        }
        return l;
    }
}