class Solution {
    public int searchInsert(int[] nums, int target) {
        
        
            // condition hai ki mujhe apne target waha put karna hai 
            // jaha woo uss pahle wale se bada hai and usse aage wale se chota hai wo index 

                // 1] usse badi wali value mile too wwoo dedo unleess usse choti vali value+1 return kardo


                int s = 0;
                int e = nums.length;
                while(s<e){
                    int mid = (s + e)/2;
                    if(nums[mid]<target){
                        s = mid + 1;
                    }
                    else{
                        e = mid;
                    }
                }
                return e;
        
        
    }
    }

    // /public int Bs(int nums[], int target) {
    //     int start = 0;
    //     int end = nums.length - 1;
    //     int s = -1;
    //     while (start <= end) {
    //         int mid = (start + end) / 2;
    //         if (nums[mid] == target) {
    //             s = mid;
    //         }
    //         if (nums[mid] < target) {
    //             start = mid + 1;
    //         } else {
    //             end = mid - 1;
    //         }

    //     }
    //     return s;
    // }

