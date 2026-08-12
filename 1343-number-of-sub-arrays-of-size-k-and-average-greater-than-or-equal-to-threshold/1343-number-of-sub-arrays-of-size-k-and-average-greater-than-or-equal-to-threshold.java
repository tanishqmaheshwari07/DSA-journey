class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
        int n = nums.length;
        int right = k-1;
        int left = 0;
        int sum = 0;
        int count = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        while(right < n){
            int avg = sum / k;

            if(avg >= threshold){
                count++;
            }

            sum -= nums[left];
            left++;
            right++;
            if(right < n){
                sum += nums[right];
            }
        }
        return count;
    }
}