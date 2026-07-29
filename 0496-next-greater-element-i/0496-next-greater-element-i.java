class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums2){
            while(!st.isEmpty() && st.peek() < num){
                map.put(st.pop(), num);
            }
            st.push(num);
        }
        while(!st.isEmpty()){
            map.put(st.pop(), -1);
        }
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}