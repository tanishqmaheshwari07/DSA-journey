class Solution {
    public void reverseString(char[] s) {
        reverse(s, 0, s.length - 1);
    }

    private char[] reverse(char[] arr, int left, int right) {
        if (left >= right) {
            return arr;
        }

        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        return reverse(arr, left + 1, right - 1);
    }
}