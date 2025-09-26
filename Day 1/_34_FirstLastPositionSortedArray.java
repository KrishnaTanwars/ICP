public class _34_FirstLastPositionSortedArray {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{findIndex(nums, target, true), findIndex(nums, target, false)};
    }

    private int findIndex(int[] nums, int target, boolean first) {
        int left = 0, right = nums.length - 1, index = -1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                index = mid;
                if(first) right = mid - 1;
                else left = mid + 1;
            } else if(nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return index;
    }
}

