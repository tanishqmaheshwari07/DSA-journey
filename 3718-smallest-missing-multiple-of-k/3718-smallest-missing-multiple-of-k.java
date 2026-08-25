class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            set.add(nums[i]);
        }
        int ans = k;
        while(set.contains(ans)){
            ans += k;
        }
        return ans;
    }
}