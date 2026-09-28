class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> st = new Stack<>();
        for(int num : asteroids){
            boolean alive = true;
            while(alive && !st.isEmpty() && num < 0 && st.peek() > 0){
                if(st.peek() < -num){
                    st.pop();
                }
                else if(st.peek() == -num){
                    st.pop();
                    alive = false;
                }
                else{
                    alive = false;
                }
            }
            if(alive){
                st.push(num);
            }
        }
        int[] ans = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        return ans;       
    }
}