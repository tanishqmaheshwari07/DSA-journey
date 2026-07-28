class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(ch);
            }
            else {
                if(!st.isEmpty() && ch == ')'){
                    st.pop();
                }else{
                    count++;
                }
            }
        }
        return st.size() + count;
    }
}