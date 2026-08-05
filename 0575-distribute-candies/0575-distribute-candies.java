class Solution {
    public int distributeCandies(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(nums[i]);
        }

        if(set.size() == n / 2){
            return set.size();
        }
        if(set.size() == 1){
            return 1;
        }
        if((n / 2) > set.size()){
            return set.size();
        }
        return n / 2;
    }
}