class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List <Integer> ans = new ArrayList<>();
        int[] freq = new int[nums.length+1];
        for(int x:nums){
            freq[x]++;
            if(freq[x]>1){
                ans.add(x);
            }
        }
        return ans;
    }
}