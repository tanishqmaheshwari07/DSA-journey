class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;

        int[] arr = new int[n];
        arr[0] = gain[0];

        int higain = arr[0];

        for(int i = 1; i < n; i++){
            arr[i] = gain[i] + arr[i - 1];

            higain = Math.max(higain, arr[i]);
        }

        return Math.max(0, higain);
    }
}