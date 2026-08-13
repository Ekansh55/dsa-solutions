class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
            int curr = (i == n) ? 0 : heights[i];

            while (!st.isEmpty() && heights[st.peek()] > curr) {
                int h = heights[st.pop()];

                int left = st.isEmpty() ? -1 : st.peek();
                int width = i - left - 1;

                int area = h * width;
                maxArea = Math.max(maxArea, area);
            }

            st.push(i);
        }

        return maxArea;
    }
}