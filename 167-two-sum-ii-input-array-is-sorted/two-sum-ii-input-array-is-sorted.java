class Solution {
    public int[] twoSum(int[] arr, int target) {
        int res[] = new int[2];

        for (int i = 0; i < arr.length; i++) {
            int rem = target - arr[i];
            int rem1 = Binary(arr, rem, i);

            if (arr[i] + arr[rem1] == target) {
                res[0] = i;
                res[1] = rem1;
                break;
            }

        }
        res[0] += 1;
        res[1] += 1;

        return res;

    }

    public int Binary(int arr[], int rem, int i) {
        int s = i + 1;
        int e = arr.length - 1;

        while (s < e) {
            int mid = (s + e) / 2;
            if (arr[mid] == rem) {
                return mid;
            } else if (arr[mid] < rem) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return e;
    }

}