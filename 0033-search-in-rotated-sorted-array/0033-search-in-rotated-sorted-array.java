class Solution {
    public int search(int[] nums, int target) {
        return rotatedBinarySearch(nums, target, 0, nums.length-1);
    }
    private int rotatedBinarySearch(int[] nums, int target, int start, int end) {
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(nums[mid] == target){
            return mid;
        }

        if(nums[start] <= nums[mid]){
            if(target >= nums[start] && target < nums[mid]){
                return rotatedBinarySearch(nums, target, start, mid - 1);
            }
            else return rotatedBinarySearch(nums, target, mid + 1, end);
        }
        else{
            if (target > nums[mid] && target <= nums[end]) {
                    return rotatedBinarySearch(nums, target, mid + 1, end);
                } else {
                    return rotatedBinarySearch(nums, target, start, mid - 1);
                }
            }
        }
}