class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums, 0, new ArrayList<>(), ans);
        return ans;
    }

    public void solve(int[] nums, int index,List<Integer> list, List<List<Integer>> ans) {

        ans.add(new ArrayList<>(list));

        for (int i = index; i < nums.length; i++) {
            list.add(nums[i]);
            solve(nums, i + 1, list, ans);
            list.remove(list.size() - 1);
        }
    }
}
