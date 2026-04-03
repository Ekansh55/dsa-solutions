class Solution {
    public void helper(int[] nums, List<Integer> curr, List<List<Integer>> ans) {
        
        // Base case
        if(curr.size() == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            
            // skip if already used in current list
            if(curr.contains(nums[i])) continue;

            // choose
            curr.add(nums[i]);

            // explore
            helper(nums, curr, ans);

            // backtrack
            curr.remove(curr.size() - 1);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, new ArrayList<>(), ans);
        return ans;
    }
}