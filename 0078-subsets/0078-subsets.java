import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, 0, new ArrayList<>(), ans);
        return ans;
    }

    void helper(int[] nums, int i, List<Integer> curr,
                List<List<Integer>> ans) {

        if (i == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        // Take
        curr.add(nums[i]);
        helper(nums, i + 1, curr, ans);

        // Not take
        curr.remove(curr.size() - 1);
        helper(nums, i + 1, curr, ans);
    }
}