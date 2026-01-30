class Solution {
    public int countSeniors(String[] arr) {
        int res = 0;
            for(int i = 0;i<arr.length;i++){
                String n = arr[i].substring(11,13);
                int a = Integer.parseInt(n);
                if(a>60){
                    res++;
                }
            }
            return res;
    }
}
