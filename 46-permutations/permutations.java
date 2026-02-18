class Solution {
    private void helper(int nums[],boolean used[],List<List<Integer>>ans,List<Integer>curr){
        if(curr.size()==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
            curr.add(nums[i]);
            used[i]=true;
            helper(nums,used,ans,curr);
            curr.remove(curr.size()-1);
            used[i]=false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        boolean used[]=new boolean[nums.length];
        helper(nums,used,ans,new ArrayList<>());
        return ans;
        
    }
}