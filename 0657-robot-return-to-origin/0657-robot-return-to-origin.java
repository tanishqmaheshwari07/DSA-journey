class Solution {
    public boolean judgeCircle(String moves) {
        int n = moves.length();
        int ver = 0;
        int hor = 0;
        for(int i = 0; i < n; i++) {
            char ch = moves.charAt(i);
            if (ch == 'U') {
                ver++;
            } else if (ch == 'D') {
                ver--;
            } else if (ch == 'R') {
                hor++;
            } else if (ch == 'L') {
                hor--;
            }
        }
        return ver == 0 && hor == 0;
    }
}