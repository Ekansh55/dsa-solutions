class Solution {
    public boolean isGoodArray(int[] nums) {
        int gcd=nums[0];

        for(int i=1;i<nums.length;i++){
            gcd=findgcd(gcd,nums[i]);

            if(gcd==1) return true;
        }
        return gcd==1;

        
    }

    public int findgcd(int a,int b){
        if(b==0) return a;
        return findgcd(b,a%b);
    }
}