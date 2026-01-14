class Solution {
    public int[] searchRange(int[] arr, int target) {
        int res[] = new int[2];
        res[0] = First(arr, target);
        res[1] = Second(arr, target);

        return res;
    }

    public int First(int arr[], int target) {
        int s = 0;
        int e = arr.length - 1;
        int F = -1;

        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == target) {
                F = mid;
                e = mid - 1;
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return F;
    }

    public int Second(int arr[], int target) {
        int s = 0;
        int e = arr.length - 1;
        int Second = -1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == target) {
                Second = mid;
                s = mid + 1;
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return Second;
    }
}