class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        for (int num : nums) {
            String s = String.valueOf(num);
            for (char ch : s.toCharArray()) {
                list.add(ch - '0');
            }
        }
        int[] ans = new int[list.size()];
        int i = 0;
        for (int num : list) {
            ans[i] = num;
            i++;
        }
        return ans;
    }
}