class Solution {
    public int removeElement(int[] arr, int val) {

       ArrayList<Integer> l = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                l.add(arr[i]);
            }
        }

        
        for (int i = 0; i < l.size(); i++) {
            arr[i] = l.get(i);
        }

        return l.size();

    }

}