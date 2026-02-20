class Solution {

    public void helper(int[] nums,int idx,List<List<Integer>> ans){
        int n = nums.length;
        if(idx==n-1){
            List <Integer> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                list.add(nums[i]);
            }
            ans.add(list);
            return;
        }

        HashSet<Integer> set = new HashSet<>();
        for(int i=idx;i<n;i++){
            if(set.contains(nums[i])) continue;
            set.add(nums[i]);

            swap(nums,i,idx);
            helper(nums,idx+1,ans);
            swap(nums,i,idx);
        }

    }
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums,0,ans);
        return ans;
        
    }
}