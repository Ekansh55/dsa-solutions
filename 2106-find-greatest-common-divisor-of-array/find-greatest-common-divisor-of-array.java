class Solution {
    public int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
    public int findGCD(int[] nums) {
        int max=nums[0];
        int min=nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i]<min) min=nums[i];
            if(nums[i]>max) max=nums[i];
        }

        return gcd(min,max);
    }
}