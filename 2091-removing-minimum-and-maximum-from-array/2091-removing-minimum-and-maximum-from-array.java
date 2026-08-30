class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return 1;
        }

        int minInd = 0;
        int maxInd = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[minInd]) {
                minInd = i;
            }
            if (nums[i] > nums[maxInd]) {
                maxInd = i;
            }
        }

        int left = Math.min(minInd, maxInd);
        int right = Math.max(minInd, maxInd);

        int front = right + 1;
        int rear = n-left;

        int both = (left+1) + (n-right);

        int single = Math.min(front, rear);
        
        return Math.min(single, both);

    }
}