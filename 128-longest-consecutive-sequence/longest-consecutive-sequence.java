class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();

        for(int num:nums){
            set.add(num);
        }

        int count = 0;
        int current = 0;
        int longest = 0;

        for(int num:set){

            if(!set.contains(num-1)){
                current=num;
                count=1;
            

                while(set.contains(current+1)){
                    current++;
                    count++;
                }
                longest=Math.max(longest,count);
            }

        }
        return longest;
    }
}