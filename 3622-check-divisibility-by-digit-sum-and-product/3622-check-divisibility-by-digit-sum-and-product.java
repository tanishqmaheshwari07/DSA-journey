class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int k = n;
        while(k != 0){
            int rem = k % 10;
            product *= rem;
            sum += rem;
            k /= 10;
        }

        return n % (sum + product) == 0;
    }
}