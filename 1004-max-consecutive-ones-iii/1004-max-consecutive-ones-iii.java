class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int maxlen = 0;
        for(int i= 0; i< n; i++){
            if(nums[i] == 0){
                k--;
            }
            while(k < 0){
                if(nums[left] == 0){
                    k++;
                }
                left++;
            }
            maxlen = Math.max(maxlen, i-left+1);
        }
        return maxlen;
    }
}