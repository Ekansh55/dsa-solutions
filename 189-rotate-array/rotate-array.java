class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[(i+k)%n] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = ans[i];
        }
    }
}