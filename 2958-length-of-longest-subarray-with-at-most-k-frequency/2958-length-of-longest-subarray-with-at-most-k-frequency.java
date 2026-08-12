class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int count = 0;
        int j = 0;
        for(int i = 0; i < n; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            } else map.put(nums[i] , 1);

            while(map.get(nums[i]) > k){
                map.put(nums[j] , map.get(nums[j]) - 1);
                j++;
            }
            count = Math.max(count , i - j + 1);
        }
        return count;
    }
}