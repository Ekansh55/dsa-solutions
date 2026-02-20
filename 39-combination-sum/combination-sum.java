class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    public void solve(int[] arr, int target, int index,
                      List<Integer> list, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            if (arr[i] > target) continue;

            list.add(arr[i]);
            solve(arr, target - arr[i], i, list, ans);
            list.remove(list.size() - 1);
        }
    }
}
