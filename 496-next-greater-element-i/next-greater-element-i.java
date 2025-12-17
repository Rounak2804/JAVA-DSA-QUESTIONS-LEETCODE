class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int res[] = new int[n];
        
       for(int i = 0;i<nums1.length;i++){
        for(int j = 0;j<nums2.length;j++){
            if(nums1[i]==nums2[j]){
                for(int k = j;k<nums2.length;k++){
                    if(nums1[i]<nums2[k]){
                        res[i] = nums2[k];
                        break;

                    }
                    else{
                        res[i] = -1;
                    }
                }
            }
        }
       }
return res;


    }
}