class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            int target = nums1[i];
            int j;

            for(j=0;j<nums2.length;j++){
                if(nums2[j]==target) break;
            }

            int next = -1;
            for(int k=j+1;k<nums2.length;k++){
                if(nums2[k]>target){
                    next = nums2[k];
                    break;
                }
            }
            ans[i] = next;
        }
        return ans;
    }
}