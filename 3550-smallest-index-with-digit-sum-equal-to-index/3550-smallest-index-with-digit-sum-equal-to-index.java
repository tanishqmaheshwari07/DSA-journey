class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int currsum = sum(nums[i]);
            if(currsum == i){
                return i;
            }
            else{
                continue;
            }
        }
        return -1;
    }

    private int sum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}